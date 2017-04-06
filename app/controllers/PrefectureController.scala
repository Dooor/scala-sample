package controllers

import javax.inject._

import domains.prefecture.PrefectureEntity
import play.api.libs.json.Json
import play.api.mvc._
import services.queries.PrefectureQueryService

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by shota-toguchi on 2017/04/05.
  */
@Singleton
class PrefectureController @Inject() (prefectureQueryService: PrefectureQueryService) extends Controller {

  def index = Action.async {
    implicit val prefectureFormat = Json.format[PrefectureEntity]
    val future = prefectureQueryService.all()
    future.map {
      prefectureEntities => {
        for (prefectureEntity <- prefectureEntities) {
          println("prefecture: " + prefectureEntity.name)
        }

        Ok(Json.toJson(prefectureEntities))

      }
    }
  }

}

