package infrastructures.prefecture

import javax.inject.Inject

import domains.prefecture.{PrefectureEntity, PrefectureRepository}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile

import scala.concurrent.Future

class PrefectureRepositoryImpl @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends HasDatabaseConfigProvider[JdbcProfile] with PrefectureRepository {
  import profile.api._

  private val Prefectures = TableQuery[PrefecturesTabale]

  override def all(): Future[Seq[PrefectureEntity]] = db.run(Prefectures.result)

  private class PrefecturesTabale(tag: Tag) extends Table[PrefectureEntity](tag, "prefectures") {
    def id = column[Int]("id", O.PrimaryKey)
    def name = column[String]("name")

    def * = (id.?, name) <> (PrefectureEntity.tupled, PrefectureEntity.unapply _)
  }
}
