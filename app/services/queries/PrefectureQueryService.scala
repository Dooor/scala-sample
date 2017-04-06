package services.queries

import javax.inject._

import domains.prefecture.{PrefectureEntity, PrefectureRepository}

import scala.concurrent.Future

/**
  * Created by shota-toguchi on 2017/04/05.
  */

trait PrefectureQueryService {
  def all(): Future[Seq[PrefectureEntity]]
}

@Singleton
class PrefectureQueryServiceImpl @Inject() (prefectureRepository: PrefectureRepository) extends PrefectureQueryService {
  override def all(): Future[Seq[PrefectureEntity]] = {
    prefectureRepository.all()
  }
}
