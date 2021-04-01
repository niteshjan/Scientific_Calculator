FROM openjdk:8
COPY ./target/springLearning-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "springLearning-0.0.1-SNAPSHOT.jar"]
