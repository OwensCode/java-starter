organization := "monme"
name := "java-starter"
version := "1.0"

autoScalaLibrary := false
crossPaths := false

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12" % Test,
    "com.novocode" % "junit-interface" % "0.11" % Test
)
