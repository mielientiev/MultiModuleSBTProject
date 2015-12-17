
AppBuild.moduleSettings("rest_api") ++: Seq(
  routesGenerator := InjectedRoutesGenerator
)

libraryDependencies ++= AppBuild.commonDependencies ++: Seq(
  cache,
  ws,
  specs2 % Test
)

