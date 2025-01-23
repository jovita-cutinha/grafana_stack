#!/bin/sh
# This is a comment!
export OTEL_EXPORTER_OTLP_ENDPOINT="http://otel-collector:4318"
export OTEL_SERVICE_NAME="server1"

java -javaagent:opentelemetry-javaagent.jar -jar server1-0.0.1-SNAPSHOT.jar