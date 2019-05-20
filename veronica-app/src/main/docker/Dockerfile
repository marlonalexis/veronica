FROM openjdk
MAINTAINER Rolando Rodriguez <rolando.roc@gmail.com>
VOLUME /tmp
ADD maven/veronica-app-0.0.1-SNAPSHOT.jar veronica-app.jar
RUN sh -c 'touch /veronica-app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/veronica-app.jar"]