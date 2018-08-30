FROM openjdk:10-jre

MAINTAINER Philipp Knobel

VOLUME /tmp

ADD "target/config-server-1.0-SNAPSHOT.jar" app.jar

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
