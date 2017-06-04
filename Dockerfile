FROM gradle:alpine

USER root

RUN apk add --update bash && \
        rm -rf /var/lib/apk/

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY gradle            /usr/src/app/gradle
COPY settings.gradle   /usr/src/app
COPY gradlew           /usr/src/app

VOLUME /root/.gradle

COPY build.gradle /usr/src/app

COPY . /usr/src/app

EXPOSE 7777