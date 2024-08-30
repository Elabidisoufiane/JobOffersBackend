FROM openjdk:17
COPY target/JobOfferManagement-0.0.1-SNAPSHOT.jar  JobOfferManagement-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", " JobOfferManagement-0.0.1-SNAPSHOT.jar"]