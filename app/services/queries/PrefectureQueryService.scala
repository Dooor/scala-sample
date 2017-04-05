package services.queries

import javax.inject._

/**
  * Created by shota-toguchi on 2017/04/05.
  */

trait PrefectureQueryService {
  def perform(): Map[String, String]
}

@Singleton
class PrefectureQueryServiceImpl extends PrefectureQueryService {
  override def perform(): Map[String, String] = {
    Map("status" -> "OK", "method" -> "get")
  }
}
