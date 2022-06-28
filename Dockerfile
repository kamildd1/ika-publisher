FROM openjdk:11
VOLUME tmp
COPY target/*.jar publisher-1.0.1.jar
VOLUME 8085:8085
ENTRYPOINT ["java","-jar","/publisher-1.0.1.jar"]