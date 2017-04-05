// Playバージョン
// 2.5.10

// ビルドシステム
// https://playframework.com/documentation/ja/2.4.x/Build

// プロジェクト名
name := """scala-sample"""

// アプリケーションのバージョン
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Scalaのバージョン
scalaVersion := "2.11.7"

// ライブラリ依存性の管理
libraryDependencies ++= Seq(
  // データベース接続用のライブラリ
  // http://scalikejdbc.org/
  jdbc,

  // キャッシュ管理
  // https://www.playframework.com/documentation/2.5.x/JavaCache
  cache,

  // 非同期HTTP通信
  // https://www.playframework.com/documentation/ja/2.4.x/ScalaWS
  ws,

  // Playの標準テストライブラリ
  // https://github.com/playframework/scalatestplus-play
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)
