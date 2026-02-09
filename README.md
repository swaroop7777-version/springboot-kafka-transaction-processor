# Spring Boot Kafka Transaction Processor

An event-driven Spring Boot microservice that consumes high-volume transaction events from Apache Kafka, validates and persists them using Spring Data JPA, and exposes REST APIs to query user balances. Built as a practical backend project focusing on messaging, persistence, and clean service boundaries.

## Features
- **Kafka consumer pipeline** for ingesting transaction messages (configurable topic)
- **Validation + persistence** with **Spring Data JPA**
- **Balance updates** across relational **User** records
- **External REST API integration** for incentive enrichment
- **REST endpoint** to query user balances (JSON response)
- **Embedded Kafka testing** + Maven test suites

## Tech Stack
- Java 17
- Spring Boot
- Apache Kafka
- Spring Data JPA
- H2 SQL (local/testing)
- Maven

## Architecture (High Level)
1. Producer sends transaction payloads to Kafka topic  
2. Service consumes events, deserializes and validates  
3. Persist transaction/user balance updates via JPA  
4. Calls external Incentive API and applies incentive logic  
5. REST API exposes balance query by user ID  

## Running Locally

### Prerequisites
- Java 17+
- Maven 3.8+
- Kafka (or use Embedded Kafka via tests)

### Build
```bash
mvn clean package
