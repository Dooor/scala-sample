package services.queries

import javax.inject._

import domains.prefecture.PrefectureRepository

/**
  * Created by shota-toguchi on 2017/04/05.
  */

trait PrefectureQueryService {
  def all(): Map[String, List[String]]
}

@Singleton
class PrefectureQueryServiceImpl @Inject() (prefectureRepository: PrefectureRepository) extends PrefectureQueryService {
  override def all(): Map[String, List[String]] = {
    val result = prefectureRepository.all()
    Map("result" -> result)
  }
}
