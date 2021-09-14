FROM gradle:6.3-jdk8 as builder

WORKDIR /home/gradle/src
COPY . .
RUN gradle test --no-daemon