# Database Design

## Project Name

**JobShield – AI-Powered Job Scam Detection Platform**

**Document Version:** 1.0

**Prepared By:** Manoj N

**Date:** July 2026

---

# 1. Purpose

This document describes the logical database design for the JobShield platform. The database is designed to securely store user information, company details, recruiter data, AI analysis results, community scam reports, uploaded files, and system audit logs.

The design emphasizes data integrity, scalability, security, and maintainability while following relational database best practices.

---

# 2. Database Overview

| Attribute                  | Value                   |
| -------------------------- | ----------------------- |
| Database Name              | jobshield_db            |
| Database Management System | MySQL 8.x               |
| Database Type              | Relational Database     |
| Storage Engine             | InnoDB                  |
| Character Set              | UTF8MB4                 |
| Collation                  | utf8mb4_unicode_ci      |
| Normalization              | Third Normal Form (3NF) |

---

# 3. Design Goals

The database has been designed to achieve the following objectives:

* Maintain data integrity through primary and foreign key constraints.
* Minimize data redundancy using normalization.
* Support secure authentication and authorization.
* Store AI analysis history for future reference.
* Enable scalable management of companies, recruiters, and scam reports.
* Maintain audit logs for security and monitoring.
* Support future feature expansion without major schema redesign.

---

# 4. Database Modules

The database is divided into the following logical modules:

### User Management

Responsible for authentication and profile management.

Tables:

* users

---

### Company Management

Stores verified company information.

Tables:

* companies

---

### Recruiter Management

Stores recruiter details associated with companies.

Tables:

* recruiters

---

### Job Management

Stores job posting information submitted for analysis.

Tables:

* job_posts

---

### AI Analysis

Stores AI-generated analysis results.

Tables:

* analyses

---

### File Management

Stores uploaded files related to analyses and reports.

Tables:

* uploaded_files

---

### Community Reporting

Stores scam reports submitted by users.

Tables:

* scam_reports
* report_evidence

---

### Resume Safety

Stores resume scan results.

Tables:

* resume_scans

---

### AI Chat

Stores AI assistant conversation history.

Tables:

* ai_chat_history

---

### Notification System

Stores notifications sent to users.

Tables:

* notifications

---

### Audit System

Stores security and activity logs.

Tables:

* audit_logs

---

# 5. Entity Description

## Users

Stores user account information.

Purpose:

* Authentication
* Authorization
* Profile Management

Primary Key:

* user_id

---

## Companies

Stores company information available for verification.

Purpose:

* Company Verification
* Recruiter Association
* Job Posting Association

Primary Key:

* company_id

---

## Recruiters

Stores recruiter information.

Purpose:

* Recruiter Verification
* Company Relationship

Primary Key:

* recruiter_id

Foreign Key:

* company_id

---

## Job Posts

Stores job postings submitted for analysis.

Purpose:

* AI Scam Analysis
* Company Mapping

Primary Key:

* job_id

Foreign Key:

* company_id

---

## Analyses

Stores AI-generated scam analysis.

Purpose:

* Risk Assessment
* AI Explanation
* Analysis History

Primary Key:

* analysis_id

Foreign Keys:

* user_id
* job_id

---

## Uploaded Files

Stores uploaded documents and images.

Purpose:

* PDF Analysis
* Image Analysis
* OCR Processing

Primary Key:

* file_id

Foreign Key:

* analysis_id

---

## Scam Reports

Stores reports submitted by the community.

Purpose:

* Community Reporting
* Fraud Investigation

Primary Key:

* report_id

Foreign Keys:

* user_id
* company_id
* recruiter_id

---

## Report Evidence

Stores supporting evidence for scam reports.

Purpose:

* Screenshot Storage
* Document Storage

Primary Key:

* evidence_id

Foreign Key:

* report_id

---

## Resume Scans

Stores resume safety scan results.

Purpose:

* Privacy Protection
* Sensitive Information Detection

Primary Key:

* scan_id

Foreign Key:

* user_id

---

## AI Chat History

Stores conversations between users and the AI assistant.

Purpose:

* Conversation History
* AI Context

Primary Key:

* chat_id

Foreign Key:

* user_id

---

## Notifications

Stores application notifications.

Purpose:

* Alert Users
* Report Updates
* Security Notifications

Primary Key:

* notification_id

Foreign Key:

* user_id

---

## Audit Logs

Stores application activity logs.

Purpose:

* Security Monitoring
* Compliance
* Troubleshooting

Primary Key:

* log_id

Foreign Key:

* user_id

---

# 6. Entity Relationships

The database follows the relationships below:

* One User can create many AI Analyses.
* One User can submit many Scam Reports.
* One User can have many Resume Scans.
* One User can receive many Notifications.
* One User can have many AI Chat sessions.
* One Company can have many Recruiters.
* One Company can have many Job Posts.
* One Job Post can have many AI Analyses.
* One Scam Report can contain multiple Evidence files.

---

# 7. Normalization

The database design follows **Third Normal Form (3NF)**.

## First Normal Form (1NF)

* Atomic column values.
* No repeating groups.

## Second Normal Form (2NF)

* All non-key attributes depend on the whole primary key.

## Third Normal Form (3NF)

* No transitive dependencies.
* Each non-key attribute depends only on the primary key.

---

# 8. Primary Keys

| Table           | Primary Key     |
| --------------- | --------------- |
| users           | user_id         |
| companies       | company_id      |
| recruiters      | recruiter_id    |
| job_posts       | job_id          |
| analyses        | analysis_id     |
| uploaded_files  | file_id         |
| scam_reports    | report_id       |
| report_evidence | evidence_id     |
| resume_scans    | scan_id         |
| ai_chat_history | chat_id         |
| notifications   | notification_id |
| audit_logs      | log_id          |

---

# 9. Foreign Keys

| Parent Table | Child Table     | Relationship |
| ------------ | --------------- | ------------ |
| users        | analyses        | One-to-Many  |
| users        | scam_reports    | One-to-Many  |
| users        | resume_scans    | One-to-Many  |
| users        | notifications   | One-to-Many  |
| users        | ai_chat_history | One-to-Many  |
| companies    | recruiters      | One-to-Many  |
| companies    | job_posts       | One-to-Many  |
| job_posts    | analyses        | One-to-Many  |
| analyses     | uploaded_files  | One-to-Many  |
| scam_reports | report_evidence | One-to-Many  |

---

# 10. Indexing Strategy

Indexes will be created on frequently searched columns to improve query performance.

Examples include:

* users.email
* companies.company_name
* recruiters.email
* job_posts.company_id
* analyses.user_id
* scam_reports.status

Additional indexes may be introduced after performance testing.

---

# 11. Data Integrity

The database will enforce:

* Primary Keys
* Foreign Keys
* Unique Constraints
* NOT NULL Constraints
* CHECK Constraints (where supported)
* Default Values
* Cascading Rules where appropriate

---

# 12. Security Considerations

The database will implement the following security practices:

* Store passwords as BCrypt hashes.
* Never store plaintext passwords.
* Restrict database privileges according to application roles.
* Validate user input at the application layer.
* Use parameterized queries through Spring Data JPA.
* Protect against SQL injection and unauthorized access.

---

# 13. Scalability Considerations

The schema is designed to support future enhancements, including:

* Browser Extension Integration
* Mobile Applications
* Public REST API
* Machine Learning Models
* Additional AI Providers
* Government Verification Services
* Multi-language Support

---

# 14. Backup and Recovery

Recommended database maintenance practices include:

* Daily automated backups.
* Point-in-time recovery where supported.
* Regular integrity checks.
* Backup verification through periodic restoration tests.

---

# 15. ER Diagram

The Entity Relationship Diagram (ERD) illustrates the relationships between all database entities.

**Location in Repository:**

```text
design/ER_Diagram.png
```

or

```text
docs/images/ER_Diagram.png
```

The ERD will be generated after the physical database schema has been implemented.

---

# 16. Future Improvements

Potential enhancements include:

* Soft delete support.
* Audit history versioning.
* Full-text search.
* Database partitioning for large datasets.
* Read replicas for improved scalability.
* Redis caching for frequently accessed data.
* Multi-tenant database architecture.

---

# 17. Conclusion

The JobShield database has been designed using relational database principles and normalized to Third Normal Form (3NF). The schema supports secure user management, AI-driven job scam analysis, company verification, recruiter management, community reporting, and audit logging.

The design prioritizes data integrity, performance, maintainability, and scalability, providing a solid foundation for implementing the application's business logic and future feature enhancements.
