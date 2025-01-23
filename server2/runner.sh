#!/bin/sh
# This is a comment!
export OTEL_EXPORTER_OTLP_ENDPOINT="http://otel-collector:4318"
export OTEL_SERVICE_NAME="server2"

java -javaagent:opentelemetry-javaagent.jar -jar server2-0.0.1-SNAPSHOT.jar