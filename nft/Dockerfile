FROM openjdk:11-jre-slim-buster
RUN addgroup --system gatling && adduser --system gatling --ingroup gatling
USER gatling:gatling
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} nft.jar
ENTRYPOINT ["java","-jar","/nft.jar"]