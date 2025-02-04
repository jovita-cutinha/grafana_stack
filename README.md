Distributed Tracing and Logging with Grafana Stack (OTEL, Loki, Prometheus, Tempo): 

 This repository contains three simple servers configured with OpenTelemetry (OTEL) for distributed tracing and logging. The logs and traces are collected and visualized using the Grafana stack, which includes OTEL Collector, Loki, Prometheus, and Tempo. The entire setup is containerized using Docker and Docker Compose.

Overview

This project demonstrates how to set up distributed tracing and logging for microservices using the Grafana stack. The three servers are instrumented with OpenTelemetry (OTEL) to send logs and traces to the OTEL Collector. The collector then forwards the data to the appropriate components:

Logs are sent to Loki.
Metrics are sent to Prometheus.
Traces are sent to Tempo.
The Grafana dashboard is used to visualize the collected data.

Technologies Used

OpenTelemetry (OTEL): For instrumenting the application servers and collecting logs, metrics, and traces.

Grafana: For visualization of logs, metrics, and traces.

Loki: For log aggregation and storage.

Prometheus: For metric collection and storage.

Tempo: For distributed tracing storage and querying.

Docker: For containerizing the application servers and Grafana stack.

Docker Compose: For orchestrating the multi-container setup.

Springboot: To create applications
