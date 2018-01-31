# java-starter

Java starter project for coding exercise setup. This is mainly to prove that the development
environment is setup correctly to compile and test code. Namely:

* Java 1.8 JDK is installed and working.
* Gradle, Maven or SBT is installed and working. Any of them is fine (if you have them installed,
  otherwise go with Gradle).
* Gradle/Maven/SBT is able to download any necessary libraries.
* You have a working IDE (if you are used to using one). IntelliJ IDEA or Eclipse are typical.
  Whatever you prefer.
  
If you're starting from scratch and unsure how to proceed, go with the Oracle Java JDK, Gradle and
IntelliJ IDEA CE.  A good starting point if you need some help installing the JDK and Gradle:
http://exercism.io/languages/java/installation.
  
## Working from the command line

The following will build the code and run the unit tests, and (if you want to) run the main function
code as well.

### Gradle

    $ gradle clean build
    $ java -cp build/libs/java-starter.jar monme.HelloWorld
    Hello, World!

### Maven

    $ mvn clean package
    $ java -cp target/java-starter-1.0.jar monme.HelloWorld
    Hello, World!
    
### SBT

    $ sbt clean test package
    $ java -cp target/java-starter-1.0.jar monme.HelloWorld
    Hello, World!

## Working with an IDE

Choose whichever one you're most comfortable working with. Make sure you can import the project,
browse the classes, and run the unit test and have it pass successfully.

### IntelliJ IDEA

The Community Edition of IDEA is fine.

You should be able to simply "import" the project using the build.gradle file, the pom.xml file, or
the build.sbt file.

### Eclipse

The JEE edition is recommended as you'll get a lot of useful plugins automatically, although we
shouldn't be working with any JEE specific code.

You should be able to import the project using a Gradle/SBT plugin, but Eclipse seems to have better
built-in support for Maven. The "import" is pretty simple and you should be up and running very
quickly.
