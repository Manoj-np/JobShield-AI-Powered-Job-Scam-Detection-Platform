# Software Requirements Specification (SRS)

## Project Name

**JobShield – AI-Powered Job Scam Detection Platform**

**Version:** 1.0

**Prepared By:** Manoj N

**Date:** July 2026

---

# Revision History

| Version | Date      | Description     | Author  |
| ------- | --------- | --------------- | ------- |
| 1.0     | July 2026 | Initial Version | Manoj N |

---

# Table of Contents

1. Introduction
2. Overall Description
3. External Interface Requirements
4. System Features
5. Non-Functional Requirements
6. Database Requirements
7. Business Rules
8. Assumptions and Dependencies
9. Constraints
10. Acceptance Criteria
11. Future Enhancements

---

# 1. Introduction

## 1.1 Purpose

This Software Requirements Specification (SRS) defines the functional and non-functional requirements for **JobShield**, an AI-powered job scam detection platform.

The document serves as a reference for developers, testers, designers, project managers, and stakeholders throughout the software development lifecycle.

---

## 1.2 Scope

JobShield enables users to:

* Register and authenticate securely.
* Analyze job descriptions, emails, and recruitment messages.
* Verify companies and recruiters.
* Receive AI-generated risk assessments with explanations.
* Report fraudulent recruiters.
* Access an AI-powered career assistant.
* View analytics and scam reports.

---

## 1.3 Intended Audience

* Product Owner
* Software Developers
* QA Engineers
* UI/UX Designers
* Database Designers
* DevOps Engineers
* AI Engineers
* System Administrators

---

## 1.4 Definitions

| Term | Meaning                           |
| ---- | --------------------------------- |
| AI   | Artificial Intelligence           |
| JWT  | JSON Web Token                    |
| REST | Representational State Transfer   |
| API  | Application Programming Interface |
| OCR  | Optical Character Recognition     |
| RBAC | Role-Based Access Control         |
| RAG  | Retrieval-Augmented Generation    |

---

# 2. Overall Description

## 2.1 Product Perspective

JobShield is a cloud-based web application built using a three-tier architecture.

Presentation Layer

↓

Business Layer

↓

Data Layer

↓

AI Services

The application integrates AI services for content analysis while maintaining a secure backend and relational database.

---

## 2.2 Product Functions

The platform provides:

* User Registration
* Login
* JWT Authentication
* Profile Management
* Company Verification
* Recruiter Email Verification
* AI Scam Detection
* Resume Safety Check
* Community Reporting
* AI Career Assistant
* Admin Dashboard
* Analytics Dashboard

---

## 2.3 User Classes

### Guest

* View homepage
* Register
* Login

---

### Registered User

* Analyze jobs
* Verify companies
* Report scams
* Chat with AI
* Manage profile

---

### Administrator

* Manage users
* Moderate reports
* Verify companies
* View analytics
* Configure platform settings

---

# 3. External Interface Requirements

## 3.1 User Interface

The application shall provide:

* Responsive web interface
* Dashboard
* Login page
* Registration page
* Company verification page
* AI analysis page
* Report submission page
* Admin dashboard

---

## 3.2 Hardware Interface

Supported Devices

* Desktop
* Laptop
* Tablet
* Mobile Browser

---

## 3.3 Software Interface

Frontend

* React.js

Backend

* Java 21
* Spring Boot

Database

* PostgreSQL

Authentication

* Spring Security
* JWT

AI

* Gemini API
* LangChain

Deployment

* Docker
* AWS

---

## 3.4 Communication Interface

* HTTPS
* REST APIs
* JSON
* Multipart File Upload

---

# 4. System Features

---

## 4.1 User Authentication

### Description

Provides secure user registration and login.

### Inputs

* Name
* Email
* Password

### Outputs

* JWT Token
* User Profile

### Functional Requirements

FR-1 Register User

FR-2 Login

FR-3 Logout

FR-4 Password Reset

FR-5 Email Verification

---

## 4.2 Company Verification

### Description

Allows users to verify companies before applying.

### Functional Requirements

FR-6 Search Company

FR-7 Verify Website

FR-8 Display Careers Page

FR-9 Display Verification Status

---

## 4.3 AI Scam Detection

### Description

Analyzes recruitment content.

### Inputs

* Job Description
* Email
* WhatsApp Message
* PDF
* Image

### Outputs

* Scam Risk Score
* AI Explanation
* Recommendations

### Functional Requirements

FR-10 Analyze Text

FR-11 Analyze Email

FR-12 Analyze Image

FR-13 Analyze PDF

FR-14 Generate Explanation

---

## 4.4 Resume Safety Checker

The system shall:

* Detect Aadhaar numbers
* Detect PAN numbers
* Detect bank account details
* Warn users before uploading sensitive information

---

## 4.5 Community Reporting

The system shall:

* Submit scam reports
* Upload screenshots
* Report fake recruiters
* Report fake companies
* Track report status

---

## 4.6 AI Career Assistant

Users can ask:

* Is this recruiter genuine?
* Is this bond acceptable?
* Is this internship suspicious?
* What are common recruitment scams?

---

## 4.7 Admin Dashboard

The administrator shall:

* Manage users
* Manage reports
* Verify companies
* Block malicious users
* View analytics
* Export reports

---

# 5. Non-Functional Requirements

## Performance

* API response time < 2 seconds (excluding AI processing)
* Support at least 1,000 concurrent users (target for initial release)
* Database query optimization

---

## Security

* JWT Authentication
* BCrypt Password Hashing
* HTTPS
* RBAC
* SQL Injection Prevention
* XSS Protection
* CSRF Protection (where applicable)
* Input Validation
* Rate Limiting
* Secure File Upload Validation

---

## Reliability

* Automatic error handling
* Logging
* Backup strategy
* Recovery mechanisms

---

## Availability

* Target uptime: 99%
* Health monitoring
* Graceful error responses

---

## Scalability

The architecture should support:

* Horizontal scaling
* Load balancing
* Cloud deployment
* Microservice migration in future

---

## Maintainability

* Layered architecture
* Modular components
* Code documentation
* API documentation
* Automated testing

---

# 6. Database Requirements

Main Entities

* User
* Company
* Recruiter
* ScamReport
* AIAnalysis
* ResumeAnalysis
* CommunityReport
* Admin

Relationships

* One User → Many Scam Reports
* One Company → Many Recruiters
* One Scam Report → One AI Analysis
* One Admin → Many Moderated Reports

---

# 7. Business Rules

* Users must verify email addresses before accessing protected features.
* Passwords shall never be stored in plain text.
* AI results shall be presented as recommendations, not definitive judgments.
* Reports submitted by users require moderation before public visibility.
* Only administrators may delete reports.
* Company verification status can only be modified by authorized administrators.

---

# 8. Assumptions and Dependencies

Assumptions

* Users have internet connectivity.
* AI service is available.
* Official company information is publicly accessible.

Dependencies

* Gemini API
* Spring Boot
* PostgreSQL
* React
* Docker
* AWS

---

# 9. Constraints

* AI responses depend on external service availability.
* Public company information may be incomplete.
* API usage limits may apply.
* AI predictions may contain false positives or false negatives.
* Privacy laws and platform policies must be followed.

---

# 10. Acceptance Criteria

The system shall be accepted when:

* Users can successfully register and log in.
* Protected APIs require valid JWT authentication.
* Job descriptions can be analyzed successfully.
* Company verification returns available information.
* AI generates explainable risk assessments.
* Scam reports are stored successfully.
* Administrators can moderate reports.
* All major workflows pass functional testing.
* Security testing identifies no critical vulnerabilities.

---

# 11. Future Enhancements

* Browser Extension
* Android Application
* iOS Application
* Browser Plug-ins
* Government Verification Integration
* Machine Learning Model Training
* Real-Time Scam Intelligence
* Multilingual Support
* Voice Assistant
* Public REST API
* Predictive Fraud Analytics

---

# Appendix

## Recommended Technology Stack

### Frontend

* React.js
* HTML5
* CSS3
* JavaScript

### Backend

* Java 21
* Spring Boot
* Spring Security

### Database

* PostgreSQL

### AI

* Google Gemini API
* LangChain

### Cloud

* AWS

### DevOps

* Docker
* GitHub Actions
* Nginx

### Testing

* JUnit
* Mockito
* Postman
* Selenium
