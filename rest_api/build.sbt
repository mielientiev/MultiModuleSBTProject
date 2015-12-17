
AppBuild.moduleSettings("rest_api") ++: Seq(
  routesGenerator := InjectedRoutesGenerator
)

libraryDependencies ++= Seq(
  cache,
  ws,
  specs2 % Test
)

