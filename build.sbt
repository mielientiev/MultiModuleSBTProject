

AppBuild.appSettings(messagesFilesFrom = Seq("common", "rest_api"))

lazy val common = (project in file("common"))

lazy val rest_api = (project in file("rest_api")).enablePlugins(PlayScala).dependsOn(common)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .aggregate(common, rest_api)
  .dependsOn(common, rest_api)


libraryDependencies ++= AppBuild.commonDependencies

