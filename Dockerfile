
FROM openjdk:17
COPY target/mysql-boot-demo-0.0.1-SNAPSHOT.jar /usr/src
WORKDIR /usr/src
expose 8080
CMD ["java","-jar","mysql-boot-demo-0.0.1-SNAPSHOT.jar"]
