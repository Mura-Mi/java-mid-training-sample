# java-mid-training-sample
A sample training course for mid-level Java developers.

## Contents

### Prerequisites

* Installed Java JDK 8 or higher

### Gradle

* Install Gradle
  * Follow the instructions at [Gradle](https://gradle.org/install)
* Check gradle is available
  * Run `gradle :help` in the root of this project
* Read [Lecture note on Gradle](./lectures/01_gradle.md)
* Initialize the project
  * Run `gradle init`
  * Follow the instructions (Following the instructions is optional)
    * Type of Project: choose `application`
    * Implementation Language: choose `Java`
    * Split functionality across multiple subprojects: choose `no`
    * Select build script DSL: choose `Groovy`
* Try to run the initialized sample project
  * Mac/Unix/Linux user: Run `./gradlew run` in terminal
  * Windows user: Run `./gradlew.bat run` in command prompt
  * Optional: You can also run gradle project from IntelliJ IDEA

### Open-Source Libraries

* Read [Lecture note on Open-Source Libraries](./lectures/02_open-source-libraries.md)
* Introduce [Apache Commons Math3](https://commons.apache.org/proper/commons-math/)
  * Visit [Maven Central for commons-math3](https://mvnrepository.com/artifact/org.apache.commons/commons-math3)
  * Visit page for latest version of commons-math3 (as of Aug 2022, [3.6.1](https://mvnrepository.com/artifact/org.apache.commons/commons-math3/3.6.1))
  * Copy dependency declaration
    * For Groovy Gradle script, `implementation group: 'org.apache.commons', name: 'commons-math3', version: '3.6.1'`
  * Paste the declaration into the `build.gradle` file
  * Check that `build.gradle` file is correct.
    * Run `./gradlew dependencies` in terminal
  * Let's build an application to calculate the inverse of given matrix.
    * The program asks for the matrix size and then asks for the matrix elements.
    * Then the program shows the inverse of the matrix.
    * Visit [Linear Algebra page](https://commons.apache.org/proper/commons-math/userguide/linear.html)

  ### Minimum web server development
* Read [Lecture note on Minimum web server development](./lectures/03_minimum-web-server-development.md)
* Introduce [SparkJava](https://sparkjava.com/)
  * Visit [Maven Central for spark-core](https://mvnrepository.com/artifact/com.sparkjava/spark-core) page.
  * Introduce the latest of spark-core to your project.
* Let's build sample web server.
  * Create new class with name `WebServer`. Implement `public static void main(String[] args)` method.
  * Add routing to show "Hello World" with url "http://localhost:4567/hello"
    * You can see sample code in [Sparkjava top page](https://sparkjava.com/)
    * Next step: add routing to show "Hello, (Your Name)" with url "http://localhost:4567/hello/(any name)".
      * When you access `/hello/Hideki`, the page will show "Hello, Hideki".
      * Hint: [https://sparkjava.com/documentation#routes](https://sparkjava.com/documentation#routes)