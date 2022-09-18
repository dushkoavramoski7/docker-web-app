FROM adoptopenjdk:11-jre-hotspot
WORKDIR /usr/src/app
COPY target/dockerWebApp-0.0.1-SNAPSHOT.jar dockerWebApp.jar
CMD ["java", "-jar", "dockerWebApp.jar"]