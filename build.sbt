name := "BOATest"
lazy val root = Project("BOATest", file(".")).settings(
  scalaVersion := "2.13.8",
  version := "0.1",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % Test
)