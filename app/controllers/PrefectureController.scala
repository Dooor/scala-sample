package controllers

import javax.inject._

import play.api.libs.json.Json
import play.api.mvc._

/**
  * Created by shota-toguchi on 2017/04/05.
  */
@Singleton
class PrefectureController @Inject() extends Controller {

  def index = Action {
    Ok(Json.toJson(Map("status" -> "OK", "method" -> "get")))
  }

}

