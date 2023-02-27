scalaVersion := "2.13.10"

crossScalaVersions += "3.2.2"

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc" % "4.0.0",
  "org.mindrot" % "jbcrypt" % "0.4",
  "org.scalatest" %% "scalatest-wordspec" % "3.2.15" % "test"
)
