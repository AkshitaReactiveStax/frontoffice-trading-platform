# Front Office Trading Platform (Microservices + Kafka + K8s)

This is a microservices-based trading system MVP with Kafka, Docker, and Spring Boot.

## 🔧 Modules
- `order-service`: Sends new orders to Kafka
- `fix-connector-service`: Simulates FIX integration
- `blotter-service`: Tracks execution status
- `marketdata-service`: Streams price updates
- `common-library`: Shared DTOs
- `docker-compose.yml`: Local infra

## 🚀 Running Locally

```bash
docker compose up --build