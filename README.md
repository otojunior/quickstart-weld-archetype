<!-- 
   Copyright 2013 Oto Soares Coelho Junior

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 -->
Quickstart Weld Java Project Archetype
======================================

[![Build Status](https://travis-ci.org/otojunior/quickstart-weld-archetype.svg?branch=master)](https://travis-ci.org/otojunior/quickstart-weld-archetype)
[![Coverage Status](https://coveralls.io/repos/github/otojunior/quickstart-weld-archetype/badge.svg?branch=master)](https://coveralls.io/github/otojunior/quickstart-weld-archetype?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/cf98ef90188f463080b8c9c5cb879967)](https://www.codacy.com/app/otojunior/quickstart-weld-archetype?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=otojunior/quickstart-weld-archetype&amp;utm_campaign=Badge_Grade)

1. Archetype Instalation and Use
--------------------------------

**Pre-Requisites:**
- JDK 6+
- Maven (3.x+)
- Git

**Install Steps:**

1. Download the archetype.
2. Install the archetype: mvn clean install

**Use Steps:**

1. Command: mvn archetype:generate -DarchetypeGroupId=org.otojunior.archetype -DarchetypeArtifactId=quickstart-weld-archetype -DarchetypeVersion=<archetype version>  -DgroupId=<your company domain> -DartifactId=<your project> -Dversion=<your project verson> -Dpackage=<your project package> -Dmaven.test.skip=true -B

Parameters:
* archetypeGroupId: MUST BE org.otojunior.archetype
* archetypeArtifactId: MUST BE quickstart-weld-archetype
* archetypeVersion: Archetype version to use to creation.
* groupId: Your company domain in Iava convention. Ex.: com.acme
* artifactId: Your project name. Ex.: sampleproject
* version: Your first project version. Recommendation: 1.0-SNAPSHOT
package: Default package of your application.

Obs.: In root archetype folder, there is a script to help this creation. Edit the script and put it into another folder. Ex.: the your root projects folder.

2. Logs Framework Configuration
-------------------------------

Log Framework: SLF4J (API) and Logback (Implementation). Supports many log appenders (destiny of messages): console, file, databases, etc. For logs in databases (DBAppender), the tables must be created first by scripts in:
* [Logback Scripts](https://github.com/qos-ch/logback/tree/v_1.1.1/logback-classic/src/main/java/ch/qos/logback/classic/db/script)

The JDBC drivers can be found in:
* [Maven Repository](https://search.maven.org)

3. Coveralls and Codacy Integration
-----------------------------------

```xml
<plugin>
	<groupId>org.eluder.coveralls</groupId>
	<artifactId>coveralls-maven-plugin</artifactId>
	<version>4.3.0</version>
</plugin>

<plugin>
	<groupId>com.gavinmogan</groupId>
    <artifactId>codacy-maven-plugin</artifactId>
    <version>1.0.3</version>
    <executions>
    	<execution>
    		<goals>
    			<goal>coverage</goal>
    		</goals>
    		<configuration>
		    	<coverageReportFile>target/site/jacoco/jacoco.xml</coverageReportFile>
		    	<projectToken>4f56fb080b83441494c31f1180164d25</projectToken>
		    	<apiToken>4f56fb080b83441494c31f1180164d25</apiToken>
    		</configuration>
    	</execution>
    </executions>
</plugin>

```
**projectToken** e **apiToken** got from Codacy project.

Add follow lines in **.travis.yml**:

```
install: true
script:  mvn clean test jacoco:report
after_success:
  - mvn coveralls:report
```