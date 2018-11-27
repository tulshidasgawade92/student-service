FROM java:8
EXPOSE 8303
ADD /target/student-service.jar student-service.jar
ENTRYPOINT ["java", "-jar", "student-service.jar"]