FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/Oracle-1.0-SNAPSHOT.jar /app/Oracle-1.0-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "Oracle-1.0-SNAPSHOT.jar", "server"]