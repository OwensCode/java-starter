organization := "monme"
name := "java-starter"
version := "1.0"

autoScalaLibrary := false
crossPaths := false

javacOptions ++= Seq("-source", "11", "-target", "11")

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.13.2" % Test,
    "com.novocode" % "junit-interface" % "0.11" % Test
)
