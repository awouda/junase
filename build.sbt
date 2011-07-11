seq(WebPlugin.webSettings :_*)

scalaVersion := "2.9.0"


libraryDependencies ++= Seq(
	"net.liftweb" %% "lift-webkit" % "2.4-M1" % "compile",
	"net.liftweb" %% "lift-mapper" % "2.4-M1" % "compile",
	"org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty,test",
	"ch.qos.logback" % "logback-classic" % "0.9.26",
	"junit" % "junit" % "4.5" % "test",
  	 "org.scala-tools.testing" %% "scalacheck" % "1.9" % "test",
	"com.h2database" % "h2" % "1.2.138"
)

unmanagedClasspath in Test <+= (scalaInstance) map { (scala) => Attributed.blank(scala.compilerJar) }
