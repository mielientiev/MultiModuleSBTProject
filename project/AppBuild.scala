import sbt.Keys._
import sbt._

object AppBuild extends Build {

  //Here should be common dependencies
  val commonDependencies = Seq()

  // Settings for the the root project
  def appSettings(messagesFilesFrom: Seq[String]) = settings(appName) ++: Seq(
    //    javaOptions += s"-Dconfig.resource=application.conf"
  )

  def appName = "MultiModuleSBTProject"

  // Settings for the the modules project
  def moduleSettings(module: String) = settings(module) ++: Seq(
    //javaOptions += s"-Dconfig.resource=$module.conf"
  )

  // Common settings for every project
  def settings(theName: String) = Seq(
    name := theName,
    organization := "com.multiproject",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.7",
    scalacOptions ++= Seq(
      "-deprecation", // Emit warning and location for usages of deprecated APIs.
      "-feature", // Emit warning and location for usages of features that should be imported explicitly.
      "-unchecked", // Enable additional warnings where generated code depends on assumptions.
      "-Xfatal-warnings", // Fail the compilation if there are any warnings.
      "-Xlint", // Enable recommended additional warnings.
      "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver.
      "-Ywarn-dead-code", // Warn when dead code is identified.
      "-Ywarn-inaccessible", // Warn about inaccessible types in method signatures.
      "-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo.
      "-Ywarn-numeric-widen", // Warn when numerics are widened.
      "-Xexperimental" // Add experimental scala feature
    ),
    resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
    resolvers := ("Atlassian Releases" at "https://maven.atlassian.com/public/") +: resolvers.value,
    resolvers += Resolver.sonatypeRepo("snapshots")
  )


}
