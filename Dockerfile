FROM eclipse-temurin:11-jre-alpine
EXPOSE 8082
ADD /build/libs/DockerTest-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar","DockerTest-0.0.1-SNAPSHOT.jar"]