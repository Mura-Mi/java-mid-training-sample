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