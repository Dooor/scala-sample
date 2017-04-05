package services.queries

import javax.inject._

import domains.prefecture.PrefectureAdapter

/**
  * Created by shota-toguchi on 2017/04/05.
  */

trait PrefectureQueryService {
  def perform(): Map[String, List[String]]
}

@Singleton
class PrefectureQueryServiceImpl @Inject() (prefectureAdapter: PrefectureAdapter) extends PrefectureQueryService {
  override def perform(): Map[String, List[String]] = {
    val result = prefectureAdapter.all()
    Map("result" -> result)
  }
}
