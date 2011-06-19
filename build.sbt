seq(WebPlugin.webSettings :_*)

scalaVersion := "2.8.1"

libraryDependencies ++= Seq(
	"net.liftweb" %% "lift-webkit" % "2.3" % "compile",
	"net.liftweb" %% "lift-mapper" % "2.3" % "compile",
	"org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty,test",
	"ch.qos.logback" % "logback-classic" % "0.9.26",
	"junit" % "junit" % "4.5" % "test",
  "org.scala-tools.testing" %% "specs" % "1.6.6" % "test",
	"com.h2database" % "h2" % "1.2.138"
)

unmanagedClasspath in Test <+= (scalaInstance) map { (scala) => Attributed.blank(scala.compilerJar) }
