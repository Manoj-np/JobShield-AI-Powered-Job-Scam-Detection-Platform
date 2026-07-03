# Functional Requirements

## Project Name

**JobShield – AI-Powered Job Scam Detection Platform**

**Document Version:** 1.0

**Prepared By:** Manoj N

**Date:** July 2026

---

# 1. Purpose

This document defines the detailed functional requirements for the JobShield platform. Each requirement describes a specific system capability and serves as the basis for design, development, testing, and acceptance.

---

# 2. Requirement Priority

| Priority | Description                                          |
| -------- | ---------------------------------------------------- |
| High     | Essential for the first production release           |
| Medium   | Important but can be implemented after core features |
| Low      | Optional enhancement for future releases             |

---

# 3. User Roles

* Guest
* Registered User
* Administrator
* AI Service (External System)

---

# 4. Functional Requirements

---

# Module 1 – User Authentication

---

## FR-001 User Registration

**Priority:** High

**Actor:** Guest

### Description

The system shall allow a new user to create an account.

### Input

* Full Name
* Email Address
* Password
* Confirm Password

### Processing

* Validate input fields.
* Check if the email already exists.
* Encrypt the password using BCrypt.
* Store user information.
* Send email verification.

### Output

User account successfully created.

### Acceptance Criteria

* Required fields cannot be empty.
* Duplicate email addresses are rejected.
* Password is never stored in plain text.

---

## FR-002 User Login

**Priority:** High

Actor: Registered User

### Description

The system shall authenticate users and generate a JWT access token.

### Acceptance Criteria

* Valid credentials return a JWT.
* Invalid credentials display an error.
* Locked accounts cannot log in.

---

## FR-003 Forgot Password

Priority: High

The system shall allow users to reset forgotten passwords using a secure email-based reset process.

---

## FR-004 Logout

Priority: High

The system shall invalidate the current user session or token according to the application's authentication strategy.

---

# Module 2 – User Profile

---

## FR-005 View Profile

Users shall be able to view their profile information.

---

## FR-006 Update Profile

Users shall be able to edit:

* Name
* Phone Number
* Profile Picture
* Password

---

# Module 3 – Company Verification

---

## FR-007 Search Company

Priority: High

Users shall search companies using:

* Company Name
* Website

---

## FR-008 Verify Company

The system shall display available verification information, such as:

* Official Website
* Careers Page
* Company Status (if available)
* Public Contact Information

---

## FR-009 Company Risk Indicators

The system shall display indicators such as:

* Missing official website
* Unverified domain
* Recently registered domain (if supported)
* Missing contact details

---

# Module 4 – Recruiter Email Verification

---

## FR-010 Email Verification

Users shall submit recruiter email addresses.

Example:

[careers@company.com](mailto:careers@company.com)

---

## FR-011 Domain Validation

The system shall:

* Extract domain
* Compare with official company domain (when available)
* Detect free email providers
* Highlight suspicious patterns

---

## FR-012 AI Email Analysis

The AI service shall explain why an email appears trustworthy or suspicious.

---

# Module 5 – AI Scam Detection

---

## FR-013 Analyze Job Description

Users shall paste a job description.

The AI shall generate:

* Risk Score
* Confidence Level
* Explanation
* Recommendations

---

## FR-014 Analyze Email Content

Users shall upload or paste recruiter emails.

---

## FR-015 Analyze WhatsApp or Chat Messages

Users shall paste recruitment conversations for analysis.

---

## FR-016 Analyze PDF Documents

Supported files include:

* Offer Letters
* Interview Letters
* Job Advertisements

---

## FR-017 Analyze Images

Users shall upload:

* Posters
* Screenshots
* Flyers

OCR shall extract text before AI analysis.

---

## FR-018 Generate Risk Score

The system shall generate a normalized risk score (for example, 0–100) together with a confidence level.

---

## FR-019 Explain AI Decision

The AI shall provide an explanation including:

* Suspicious phrases
* Missing company details
* Payment requests
* Unrealistic salary promises
* Urgency indicators
* Other relevant observations

---

# Module 6 – Resume Safety

---

## FR-020 Resume Upload

Users shall upload resumes in PDF or DOCX format.

---

## FR-021 Sensitive Information Detection

The system shall detect possible sensitive information such as:

* Aadhaar Number
* PAN Number
* Bank Account Number
* IFSC Code
* Passport Number

---

## FR-022 Privacy Recommendation

The system shall warn users before sharing sensitive personal information.

---

# Module 7 – Community Reporting

---

## FR-023 Submit Scam Report

Users shall report:

* Fake Recruiter
* Fake Company
* Fake Website
* Fake Phone Number
* Scam Email

---

## FR-024 Upload Evidence

Users may upload supporting screenshots or documents.

---

## FR-025 Report Tracking

Users shall view the status of submitted reports.

Possible statuses:

* Pending
* Under Review
* Approved
* Rejected

---

# Module 8 – AI Career Assistant

---

## FR-026 Ask Questions

Users shall ask career-related questions using natural language.

Examples include:

* Is this company genuine?
* Is this internship worth joining?
* What does this employment bond mean?

---

## FR-027 AI Response

The assistant shall provide contextual guidance and recommendations while avoiding definitive legal conclusions.

---

# Module 9 – Dashboard

---

## FR-028 User Dashboard

Users shall view:

* Recent analyses
* Saved reports
* Risk history
* Profile summary

---

## FR-029 Analytics Dashboard

The dashboard shall display:

* Total analyses
* Average risk score
* Recent activity
* Community statistics

---

# Module 10 – Administration

---

## FR-030 Manage Users

Administrator can:

* View Users
* Search Users
* Suspend Users
* Activate Users

---

## FR-031 Manage Reports

Administrator can:

* Approve Reports
* Reject Reports
* Delete Reports

---

## FR-032 Manage Companies

Administrator can:

* Add Company
* Update Company
* Verify Company
* Remove Company

---

## FR-033 View Analytics

Administrator shall access:

* Total Users
* Total Reports
* Most Reported Companies
* Scam Trends
* Platform Usage

---

# Module 11 – Notifications

---

## FR-034 Email Notifications

The system shall send notifications for:

* Registration
* Password Reset
* Report Status Updates
* Important Security Alerts

---

## FR-035 In-App Notifications

Users shall receive notifications for important platform events.

---

# Module 12 – Security

---

## FR-036 JWT Authentication

Protected APIs shall require a valid JWT.

---

## FR-037 Role-Based Access Control

Roles:

* Guest
* User
* Admin

Access permissions shall be enforced based on role.

---

## FR-038 Secure File Upload

The system shall:

* Validate file type
* Validate file size
* Reject unsupported formats
* Scan uploaded files if malware scanning is available

---

# Module 13 – Search

---

## FR-039 Search Reports

Users shall search reports using:

* Company
* Recruiter
* Email
* Phone Number

---

## FR-040 Filter Results

Users shall filter reports by:

* Date
* Risk Level
* Company
* Status

---

# Module 14 – Audit and Logging

---

## FR-041 Activity Logging

The system shall log:

* Login
* Logout
* Report Submission
* AI Analysis Requests
* Administrative Actions

---

## FR-042 Error Logging

System errors shall be logged for troubleshooting without exposing sensitive information to end users.

---

# Module 15 – REST API

---

## FR-043 REST API

The backend shall expose secure REST endpoints for all supported features.

---

## FR-044 JSON Responses

All APIs shall return structured JSON responses with appropriate HTTP status codes.

---

# Module 16 – Future Features

---

## FR-045 Browser Extension

Users shall analyze job postings directly from supported websites.

---

## FR-046 Mobile Application

Android and iOS support.

---

## FR-047 Public REST API

Provide secure APIs for approved third-party integrations.

---

## FR-048 Multi-Language Support

Support multiple interface languages.

---

## FR-049 Machine Learning Model

Support custom model training using historical scam data in future versions.

---

## FR-050 Threat Intelligence

Integrate additional trusted fraud intelligence sources to improve analysis.

---

# 5. Functional Requirement Summary

| Module               | Requirement IDs |
| -------------------- | --------------- |
| Authentication       | FR-001 – FR-004 |
| User Profile         | FR-005 – FR-006 |
| Company Verification | FR-007 – FR-009 |
| Email Verification   | FR-010 – FR-012 |
| AI Scam Detection    | FR-013 – FR-019 |
| Resume Safety        | FR-020 – FR-022 |
| Community Reporting  | FR-023 – FR-025 |
| AI Career Assistant  | FR-026 – FR-027 |
| Dashboard            | FR-028 – FR-029 |
| Administration       | FR-030 – FR-033 |
| Notifications        | FR-034 – FR-035 |
| Security             | FR-036 – FR-038 |
| Search               | FR-039 – FR-040 |
| Logging              | FR-041 – FR-042 |
| REST API             | FR-043 – FR-044 |
| Future Enhancements  | FR-045 – FR-050 |

---

# 6. Traceability

Each functional requirement will be traced to:

* Business Requirements (BRD)
* Software Requirements Specification (SRS)
* Use Cases
* Database Design
* API Specification
* Test Cases
* User Acceptance Testing (UAT)

This traceability ensures every implemented feature can be verified and linked back to a defined business need.
