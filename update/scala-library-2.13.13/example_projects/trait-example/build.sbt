scalaVersion := "2.13.13"

crossScalaVersions += "3.3.1"

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc" % "4.2.1",
  "org.mindrot"     %  "jbcrypt"     % "0.4"
)
