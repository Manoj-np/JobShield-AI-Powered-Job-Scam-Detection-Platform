# Non-Functional Requirements (NFR)

## Project Name

**JobShield – AI-Powered Job Scam Detection Platform**

**Document Version:** 1.0

**Prepared By:** Manoj N

**Date:** July 2026

---

# 1. Purpose

This document defines the **Non-Functional Requirements (NFRs)** for the JobShield platform. While functional requirements describe *what* the system does, non-functional requirements specify *how well* the system performs those functions.

These requirements establish quality attributes such as performance, security, reliability, usability, scalability, maintainability, and compliance.

---

# 2. Scope

These non-functional requirements apply to all components of the JobShield platform, including:

* React Frontend
* Spring Boot Backend
* PostgreSQL Database
* AI Integration Layer
* REST APIs
* Authentication Services
* Cloud Infrastructure

---

# 3. Performance Requirements

## NFR-001 Response Time

**Priority:** High

The system shall return responses for standard API requests within **2 seconds** under normal operating conditions, excluding external AI processing time.

---

## NFR-002 AI Processing Time

**Priority:** High

AI analysis should typically complete within **15 seconds**, depending on the complexity of the input and third-party AI service response time.

---

## NFR-003 Concurrent Users

**Priority:** High

The system should support at least **1,000 concurrent users** in the initial production release.

---

## NFR-004 Database Performance

Frequently accessed data shall be optimized through:

* Database indexing
* Efficient SQL queries
* Connection pooling

---

## NFR-005 File Upload Performance

Uploaded files should begin processing immediately after successful validation.

Supported formats include:

* PDF
* DOCX
* PNG
* JPG
* JPEG

---

# 4. Security Requirements

## NFR-006 Authentication

All authenticated users shall access protected resources using JWT-based authentication.

---

## NFR-007 Password Security

Passwords shall:

* Be hashed using BCrypt.
* Never be stored in plain text.
* Never be exposed through APIs or logs.

---

## NFR-008 Authorization

The platform shall implement Role-Based Access Control (RBAC).

Roles include:

* Guest
* Registered User
* Administrator

---

## NFR-009 Secure Communication

All communication between clients and servers shall use HTTPS in production environments.

---

## NFR-010 Input Validation

All user inputs shall be validated on both the client side and the server side.

---

## NFR-011 SQL Injection Protection

Parameterized queries or ORM mechanisms shall be used to prevent SQL injection attacks.

---

## NFR-012 Cross-Site Scripting (XSS) Protection

User-generated content shall be sanitized or encoded before rendering.

---

## NFR-013 File Upload Security

Uploaded files shall be validated based on:

* File type
* File extension
* File size
* Content checks where applicable

---

## NFR-014 Rate Limiting

Authentication and AI analysis endpoints shall implement rate limiting to reduce abuse.

---

## NFR-015 Audit Logging

Security-related events shall be logged, including:

* Login attempts
* Password changes
* Administrative actions
* Failed authorization attempts

---

# 5. Reliability Requirements

## NFR-016 System Availability

The target availability for the production system is **99% uptime**.

---

## NFR-017 Error Handling

Unexpected errors shall:

* Return meaningful error messages.
* Avoid exposing internal implementation details.
* Be recorded in server logs.

---

## NFR-018 Backup Strategy

Regular backups shall be performed for the production database.

---

## NFR-019 Recovery

The system should support restoration from recent backups after a failure.

---

# 6. Scalability Requirements

## NFR-020 Horizontal Scaling

The application architecture should support adding multiple backend instances behind a load balancer.

---

## NFR-021 Cloud Deployment

The application shall be deployable to cloud platforms such as AWS.

---

## NFR-022 Modular Design

Application modules shall be loosely coupled to simplify future feature additions.

---

# 7. Availability Requirements

## NFR-023 Graceful Degradation

If external AI services are unavailable, the application shall:

* Inform the user.
* Continue supporting non-AI features where possible.

---

## NFR-024 Health Monitoring

Health endpoints shall be available for monitoring application status.

---

# 8. Maintainability Requirements

## NFR-025 Layered Architecture

The backend shall follow a layered architecture including:

* Controller
* Service
* Repository
* Entity
* Configuration

---

## NFR-026 Coding Standards

Source code shall follow consistent naming conventions and formatting standards.

---

## NFR-027 Documentation

The project shall include:

* API Documentation
* Architecture Documentation
* Database Documentation
* Deployment Documentation
* User Documentation

---

## NFR-028 Version Control

All source code shall be managed using Git with a hosted repository.

---

# 9. Usability Requirements

## NFR-029 Responsive Design

The web application shall function correctly on:

* Desktop
* Laptop
* Tablet
* Mobile browsers

---

## NFR-030 User Interface

The interface shall provide:

* Consistent navigation
* Clear labels
* Informative validation messages
* Accessible layouts

---

## NFR-031 Accessibility

The application should consider accessibility best practices, including keyboard navigation and appropriate color contrast where feasible.

---

# 10. Compatibility Requirements

## NFR-032 Browser Compatibility

The application shall support current versions of major browsers, including:

* Google Chrome
* Microsoft Edge
* Mozilla Firefox
* Safari

---

## NFR-033 Device Compatibility

The application shall support multiple screen resolutions and responsive layouts.

---

# 11. AI Requirements

## NFR-034 Explainability

AI-generated outputs shall include an explanation describing the factors that influenced the assessment.

---

## NFR-035 Confidence Score

Each AI analysis shall include a confidence indicator alongside the risk assessment.

---

## NFR-036 Responsible AI

The platform shall present AI results as recommendations rather than definitive judgments and encourage users to verify information through official sources.

---

## NFR-037 Prompt Management

AI prompts shall be version-controlled and maintained separately from application logic.

---

# 12. Database Requirements

## NFR-038 Data Integrity

Database relationships shall enforce referential integrity through appropriate constraints.

---

## NFR-039 Transaction Management

Critical database operations shall use transactions to maintain consistency.

---

## NFR-040 Data Retention

User-generated content shall be retained according to platform policies and applicable legal requirements.

---

# 13. Logging and Monitoring

## NFR-041 Application Logging

The application shall record:

* API requests
* Exceptions
* Authentication events
* Administrative activities

---

## NFR-042 Monitoring

The platform should support monitoring of:

* CPU usage
* Memory usage
* API response times
* Database health
* Error rates

---

# 14. Deployment Requirements

## NFR-043 Containerization

The backend shall support deployment using Docker.

---

## NFR-044 Continuous Integration

The project should support automated build and test pipelines.

---

## NFR-045 Environment Configuration

Configuration values shall be externalized using environment variables or configuration files appropriate to each deployment environment.

---

# 15. Compliance Requirements

## NFR-046 Privacy

User data shall be collected and processed responsibly, with clear disclosure of how it is used.

---

## NFR-047 Sensitive Information

The platform shall avoid storing unnecessary sensitive personal information.

---

## NFR-048 Licensing

All third-party libraries and dependencies shall comply with their respective licenses.

---

# 16. Disaster Recovery

## NFR-049 Recovery Objective

Critical services should be recoverable within a reasonable operational timeframe following major failures.

---

## NFR-050 Data Recovery

The platform should support restoration of database backups with minimal data loss, subject to the configured backup schedule.

---

# 17. Non-Functional Requirement Summary

| Category             | Requirement IDs   |
| -------------------- | ----------------- |
| Performance          | NFR-001 – NFR-005 |
| Security             | NFR-006 – NFR-015 |
| Reliability          | NFR-016 – NFR-019 |
| Scalability          | NFR-020 – NFR-022 |
| Availability         | NFR-023 – NFR-024 |
| Maintainability      | NFR-025 – NFR-028 |
| Usability            | NFR-029 – NFR-031 |
| Compatibility        | NFR-032 – NFR-033 |
| AI                   | NFR-034 – NFR-037 |
| Database             | NFR-038 – NFR-040 |
| Logging & Monitoring | NFR-041 – NFR-042 |
| Deployment           | NFR-043 – NFR-045 |
| Compliance           | NFR-046 – NFR-048 |
| Disaster Recovery    | NFR-049 – NFR-050 |

---

# 18. Acceptance Criteria

The non-functional requirements will be considered satisfied when:

* Performance targets are met during testing.
* Security testing identifies no critical vulnerabilities.
* Authentication and authorization function correctly.
* AI responses include explanations and confidence indicators.
* The application remains responsive under expected user load.
* Data integrity is maintained during normal and exceptional operations.
* Documentation is complete and current.
* The system is successfully deployed using the defined deployment process.
* Monitoring and logging operate as expected.
* All critical non-functional requirements pass verification before production deployment.
