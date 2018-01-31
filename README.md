# java-starter

Java starter project for coding exercise setup. This is mainly to prove that the development
environment is setup correctly to compile and test code. Namely:

* Java 1.8 JDK is installed and working
* Either Maven or Gradle is installed and working. Either is fine, although Gradle does seem a
  little simpler.
* Gradle/Maven is able to download any necessary libraries
* You have a working IDE (if you are used to using one). IntelliJ IDEA or Eclipse are typical for
  this kind of development.
  
## Working from the command line

### Gradle

The following will build the code and run the unit tests, and (optionally) run the main function
code as well.

    $ gradle clean build
    $ java -cp build/libs/java-starter.jar monme.HelloWorld
    Hello, World!

### Maven

The following will also build the code and run the unit tests, and (optionally) run the main
function code.

    $ mvn clean package
    $ java -cp target/java-starter-1.0.jar monme.HelloWorld
    Hello, World!

## Working with an IDE

Choose whichever one you're most comfortable working with. Make sure you can import the project and
run the unit test and have it pass successfully.

### IntelliJ IDEA

The Community Edition of IDEA is fine.

You should be able to simply "import" the project using the build.gradle file or the pom.xml file,
although (again) the Gradle import seems a little simpler.

### Eclipse

The JEE edition is recommended as you'll get a lot of useful plugins automatically, although we
shouldn't be working with any JEE specific code.

You should be able to import the project using a Gradle plugin, but Eclipse seems to have better
built-in support for Maven. The "import" is pretty simple and you should be up and running very
quickly.
