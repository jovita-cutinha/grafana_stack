FROM amazoncorretto:21-alpine-jdk

RUN mkdir /tmp/server1

COPY target/server1-0.0.1-SNAPSHOT.jar /tmp/server1

COPY opentelemetry-javaagent.jar /tmp/server1

COPY runner.sh /tmp/server1

WORKDIR /tmp/server1

RUN chmod +x runner.sh

CMD ["./runner.sh"]