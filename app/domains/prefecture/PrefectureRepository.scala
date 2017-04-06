package domains.prefecture

import scala.concurrent.Future

trait PrefectureRepository {
  def all(): Future[Seq[PrefectureEntity]]
}
