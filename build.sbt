val scala3Version = "3.4.0"

enablePlugins(PackPlugin)

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-structured-logging-exercise",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-jdk-platform-logging" % "2.0.12", // bridge for Logback
      "ch.qos.logback" % "logback-classic" % "1.5.3"
    )
  )
