FROM openjdk:8
ADD target/CoreJava-0.0.1-SNAPSHOT.jar CoreJava-0.0.1-SNAPSHOT.jar
EXPOSE 8004
ENTRYPOINT ["java"," -jar "," CoreJava-0.0.1-SNAPSHOT.jar"]