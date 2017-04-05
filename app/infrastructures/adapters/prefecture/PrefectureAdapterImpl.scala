package infrastructures.adapters.prefecture

import javax.inject.Singleton

import domains.prefecture.PrefectureAdapter

/**
  * Created by shota-toguchi on 2017/04/05.
  */
@Singleton
class PrefectureAdapterImpl extends PrefectureAdapter {
  override def all(): List[String] = {
    List("東京都", "埼玉県", "神奈川県")
  }
}
