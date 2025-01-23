FROM amazoncorretto:21-alpine-jdk

RUN mkdir /tmp/server2

COPY target/server2-0.0.1-SNAPSHOT.jar /tmp/server2

COPY opentelemetry-javaagent.jar /tmp/server2

COPY runner.sh /tmp/server2

WORKDIR /tmp/server2

RUN chmod +x runner.sh

CMD ["./runner.sh"]