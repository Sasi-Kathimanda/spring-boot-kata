FROM openjdk:11-jre-slim-buster
RUN addgroup --system spring && adduser --system spring --ingroup spring
USER spring:spring
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]