seq(webSettings :_*)

scalaVersion := "2.9.1"


libraryDependencies ++= {
val liftVersion="2.4-M5"
        Seq(
	"net.liftweb" %% "lift-webkit" % liftVersion % "compile",
	"net.liftweb" %% "lift-mapper" % liftVersion % "compile",
	"org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
	"ch.qos.logback" % "logback-classic" % "0.9.26",
	"junit" % "junit" % "4.5" % "test",
  	 "org.scala-tools.testing" %% "scalacheck" % "1.9" % "test",
	"com.h2database" % "h2" % "1.2.138"
        )
}

