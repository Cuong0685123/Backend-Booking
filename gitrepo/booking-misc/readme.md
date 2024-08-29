# Projects setup

## Java maven sub projects

### Model sub project
mvn archetype:generate -DgroupId=com.tc.booking -DartifactId=booking-model -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

### Data access sub project
mvn archetype:generate -DgroupId=com.tc.booking -DartifactId=booking-dao -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

### Rest API sub project

Use Spring Initializr tool to initialize API project
https://start.spring.io/

### BOM (build of materials) sub project 

Create this BOM sub project to managed java libraries used in other sub-projects.

### Front end sub project

This front end project privides end-user interface.
Used technologies: ReactJS, NextJS

