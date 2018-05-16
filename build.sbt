name := "volleynator-entities"

version := "0.4.1-SNAPSHOT"

organization := "com.github.eddykaya"

scalaVersion := "2.12.3"

publishMavenStyle := true

pomIncludeRepository := { _ => false }

isSnapshot := version.value endsWith "SNAPSHOT"


libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.5.6"

credentials += Credentials("Sonatype Nexus Repository Manager",
                           "oss.sonatype.org",
                          System.getenv().get("SONATYPE_USERNAME"),
                          System.getenv().get("SONATYPE_PASSWORD"))

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
homepage := Some(url("https://github.com/eddykaya/volleynator-entities"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/eddykaya/volleynator-entities.git"),
    "scm:git@github.com:eddykaya/volleynator-entities.git"
  ))

developers := List(
  Developer(
    id="eddykaya99",
    name="Eddykaya",
    email="info@volleynator.de",
    url=url("https://www.volleynator.de")
  ))
