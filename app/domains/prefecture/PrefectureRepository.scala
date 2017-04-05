package domains.prefecture

trait PrefectureRepository {
  def all(): List[String]
}
