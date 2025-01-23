FROM amazoncorretto:21-alpine-jdk

RUN mkdir /tmp/server3

COPY target/server3-0.0.1-SNAPSHOT.jar /tmp/server3

COPY opentelemetry-javaagent.jar /tmp/server3

COPY runner.sh /tmp/server3

WORKDIR /tmp/server3

RUN chmod +x runner.sh

CMD ["./runner.sh"]