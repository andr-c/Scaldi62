
name := "Scaldi62"

version := "1.0"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq("org.reactivemongo" %% "play2-reactivemongo" % "0.11.7.play24",
  "org.scaldi" %% "scaldi-play" % "0.5.10")
