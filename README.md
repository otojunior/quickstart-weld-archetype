Quickstart Java project archetype
=================================

1. Archetype instalation and use.
--------------------------------

Pre-Requisites
- JDK 6+
- Maven (3.x+)
- Git

Install Steps:
1. Download the archetype.
2. Install the archetype: mvn clean install

Use Steps:
1. Command: mvn archetype:generate -DarchetypeGroupId=org.otojunior.archetype -DarchetypeArtifactId=quickstart-weld-archetype -DarchetypeVersion=<archetype version>  -DgroupId=<your company domain> -DartifactId=<your project> -Dversion=<your project verson> -Dpackage=<your project package> -Dmaven.test.skip=true -B

Parameters:
archetypeGroupId: MUST BE org.otojunior.archetype
archetypeArtifactId: MUST BE quickstart-weld-archetype
archetypeVersion: Archetype version to use to creation.
groupId: Your company domain in Iava convention. Ex.: com.acme
artifactId: Your project name. Ex.: sampleproject
version: Your first project version. Recommendation: 1.0-SNAPSHOT
package: Default package of your application.

Obs.: In root archetype folder, there is a script to help this creation. Edit the script and put it into another folder. Ex.: the your root projects folder.

===============================================

2. Logs framework configuration.

Log Framework: SLF4J (API) and Logback (Implementation). Supports many log appenders (destiny of messages): console, file, databases, etc. For logs in databases (DBAppender), the tables must be created first by scripts in: 
https://github.com/qos-ch/logback/tree/v_1.1.1/logback-classic/src/main/java/ch/qos/logback/classic/db/script

The JDBC drivers can be found in search.maven.org
