FROM  openjdk:8
EXPOSE 8089
ADD /target/testtech-1.0.jar testtech.jar
ENTRYPOINT ["java", "-jar", "testtech.jar"]