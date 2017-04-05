package infrastructures.prefecture

import javax.inject.Singleton

import domains.prefecture.PrefectureRepository

@Singleton
class PrefectureRepositoryImpl extends PrefectureRepository {

  override def all(): List[String] = {
    return List("東京都", "埼玉県", "神奈川県")
  }

}
