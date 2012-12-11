name := "play20.auth"

version := "0.4-SNAPSHOT"

scalaVersion := "2.10.0-RC1"

crossVersion <<= scalaVersion { sv => if (sv contains "-") CrossVersion.full else CrossVersion.binary }

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "play" %% "play" % "2.1-RC1"
)

organization := "jp.t2v"

publishTo := sys.env.get("LOCAL_MAVEN_REPO").map { dir =>
  Resolver.file("maven-repo", file(dir))(Patterns(true, Resolver.mavenStyleBasePattern))
}

