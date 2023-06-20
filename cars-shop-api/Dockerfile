FROM gradle:jdk17-alpine
VOLUME gradle-cache:/home/gradle/.gradle
VOLUME /tmp
USER root
ADD . /home/gradle/project
WORKDIR /home/gradle/project
RUN chown gradle:gradle -R /home/gradle
USER gradle
RUN gradle bootJar
#Start from a java
RUN mv /home/gradle/project/build/libs/*.jar /home/gradle/project/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-Djava.security.egd=file:/dev/./urandom","-jar","/home/gradle/project/app.jar"]op/cars-shop-api/build/libs/cars-shop-api-0.0.1-SNAPSHOT-plain.jar"]