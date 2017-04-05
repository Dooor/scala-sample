package controllers

import javax.inject._

import play.api.libs.json.Json
import play.api.mvc._

import services.queries.PrefectureQueryService

/**
  * Created by shota-toguchi on 2017/04/05.
  */
@Singleton
class PrefectureController @Inject() (prefectureQueryService: PrefectureQueryService) extends Controller {

  def index = Action {
    val result = prefectureQueryService.all()
    Ok(Json.toJson(result))
  }

}

