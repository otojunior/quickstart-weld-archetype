#!/bin/bash
# Shell script to help project creation with Maven.
# Author: Oto Junior
# Date: 31/12/2013
#
# OBS: MOVE THIS SCRIPT TO ROOT PROJECTS FOLDER.
#
mvn archetype:generate -DarchetypeGroupId=org.otojunior.archetype \
-DarchetypeArtifactId=quickstart-weld-archetype \
-DarchetypeVersion=1.1 \
-DgroupId=org.otojunior \
-DartifactId=$1 \
-Dversion=1.0-SNAPSHOT \
-Dpackage=org.otojunior.$1 \
-Dmaven.test.skip=true \
-B $2
