FROM openjdk:11
ARG JAR_FILE=exchange-bootcoin-service/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]