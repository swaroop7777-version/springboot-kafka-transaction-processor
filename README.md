# springboot-kafka-transaction-processor
Event-Driven Transaction Processing Microservice  An event-driven backend microservice designed to process high-volume financial transactions using asynchronous messaging and scalable backend architecture. The system consumes transaction events from a message broker, applies business validation rules.

Key Features
	•	Built an event-driven architecture using Apache Kafka to consume and process transaction events asynchronously.
	•	Implemented Spring Boot microservices with clear separation of concerns across controller, service, and persistence layers.
	•	Designed transaction validation and balance update workflows, ensuring data consistency across user accounts.
	•	Persisted transactional data using Spring Data JPA with an H2 SQL database for fast local testing.
	•	Integrated an external REST Incentive API to enrich transaction workflows with incentive calculations.
	•	Exposed RESTful APIs to retrieve user balances and transaction states in structured JSON format.
	•	Ensured reliability through unit and integration testing using Maven test suites and embedded Kafka testing.
	•	Followed clean architecture principles to support scalability, maintainability, and extensibility.

Tech Stack
	•	Backend: Java, Spring Boot
	•	Messaging: Apache Kafka
	•	Persistence: Spring Data JPA, H2 SQL
	•	APIs: RESTful Web Services
	•	Testing & Build: Maven, Embedded Kafka
	•	Architecture: Event-Driven Microservices

Why This Project

This project demonstrates real-world backend engineering skills, including asynchronous processing, message-driven systems, API integration, and transactional data handling—core competencies for modern distributed systems and enterprise applications.
