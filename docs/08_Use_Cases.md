# Use Case Specification

## Project Name

**JobShield – AI-Powered Job Scam Detection Platform**

**Document Version:** 1.0

**Prepared By:** Manoj N

**Date:** July 2026

---

# 1. Purpose

This document describes the use cases for the JobShield platform. A use case defines how different actors interact with the system to achieve a specific goal.

The purpose of this document is to provide a clear understanding of the system's behavior and support system design, development, testing, and user acceptance.

---

# 2. Actors

| Actor           | Description                                                         |
| --------------- | ------------------------------------------------------------------- |
| Guest           | A visitor who has not logged into the platform.                     |
| Registered User | An authenticated user who can access all user features.             |
| Administrator   | A privileged user responsible for managing the platform.            |
| AI Service      | External AI service that performs analysis and generates responses. |
| Email Service   | External service used for email verification and notifications.     |

---

# 3. Use Case List

| Use Case ID | Use Case Name                 | Primary Actor   |
| ----------- | ----------------------------- | --------------- |
| UC-001      | Register Account              | Guest           |
| UC-002      | Login                         | Guest           |
| UC-003      | Logout                        | Registered User |
| UC-004      | Reset Password                | Registered User |
| UC-005      | Manage Profile                | Registered User |
| UC-006      | Analyze Job Description       | Registered User |
| UC-007      | Verify Company                | Registered User |
| UC-008      | Verify Recruiter Email        | Registered User |
| UC-009      | Upload Offer Letter           | Registered User |
| UC-010      | Upload Recruitment Screenshot | Registered User |
| UC-011      | View AI Analysis              | Registered User |
| UC-012      | Submit Scam Report            | Registered User |
| UC-013      | Track Report Status           | Registered User |
| UC-014      | Resume Safety Check           | Registered User |
| UC-015      | AI Career Assistant           | Registered User |
| UC-016      | View Dashboard                | Registered User |
| UC-017      | Search Reports                | Registered User |
| UC-018      | Manage Users                  | Administrator   |
| UC-019      | Moderate Scam Reports         | Administrator   |
| UC-020      | Manage Companies              | Administrator   |
| UC-021      | View Analytics                | Administrator   |

---

# 4. Detailed Use Cases

---

# UC-001 Register Account

### Goal

Allow a new user to create an account.

### Primary Actor

Guest

### Preconditions

* User is not logged in.

### Main Flow

1. User opens the registration page.
2. User enters personal information.
3. User submits the registration form.
4. System validates the data.
5. Password is encrypted.
6. User account is created.
7. Verification email is sent.
8. User receives a success message.

### Alternate Flow

* Email already exists.
* Passwords do not match.
* Required fields are missing.

### Postconditions

* User account is created.
* Email verification is pending.

---

# UC-002 Login

### Goal

Authenticate an existing user.

### Primary Actor

Guest

### Preconditions

* User account exists.

### Main Flow

1. User enters email and password.
2. System validates credentials.
3. JWT token is generated.
4. User is redirected to the dashboard.

### Alternate Flow

* Invalid credentials.
* Account disabled.

### Postconditions

* User is authenticated.

---

# UC-003 Logout

### Goal

Terminate the current user session.

### Primary Actor

Registered User

### Preconditions

* User is logged in.

### Main Flow

1. User selects Logout.
2. System invalidates the session or token.
3. User is redirected to the login page.

### Postconditions

* User is logged out.

---

# UC-004 Manage Profile

### Goal

Allow users to maintain their account information.

### Primary Actor

Registered User

### Main Flow

1. Open profile page.
2. Edit information.
3. Save changes.
4. System validates and updates profile.

### Postconditions

* Updated profile information is stored.

---

# UC-005 Analyze Job Description

### Goal

Analyze a job posting for potential scam indicators.

### Primary Actor

Registered User

### Supporting Actor

AI Service

### Preconditions

* User is authenticated.

### Main Flow

1. User opens the Job Analysis page.
2. User pastes the job description.
3. User clicks **Analyze**.
4. System validates the input.
5. Content is sent to the AI service.
6. AI returns:

   * Risk score
   * Confidence level
   * Explanation
   * Recommendations
7. System stores the analysis.
8. Results are displayed to the user.

### Alternate Flow

* AI service unavailable.
* Empty input.
* Request timeout.

### Postconditions

* Analysis is saved in user history.

---

# UC-006 Verify Company

### Goal

Verify available information about a company.

### Primary Actor

Registered User

### Main Flow

1. User enters company name.
2. System searches available company data.
3. Verification information is displayed.
4. User reviews available details.

### Postconditions

* Company verification result is displayed.

---

# UC-007 Verify Recruiter Email

### Goal

Evaluate whether a recruiter email appears legitimate.

### Primary Actor

Registered User

### Main Flow

1. User enters recruiter email.
2. System extracts the domain.
3. Domain is compared with available company information.
4. AI analyzes email characteristics.
5. Results are displayed.

### Postconditions

* Email analysis is completed.

---

# UC-008 Upload Offer Letter

### Goal

Analyze an uploaded offer letter.

### Primary Actor

Registered User

### Supporting Actor

AI Service

### Main Flow

1. User uploads a PDF.
2. System validates the file.
3. OCR extracts text if needed.
4. AI analyzes the content.
5. Risk assessment is displayed.

### Alternate Flow

* Invalid file format.
* File size exceeds the limit.
* OCR extraction fails.

---

# UC-009 Submit Scam Report

### Goal

Allow users to report fraudulent recruitment activity.

### Primary Actor

Registered User

### Main Flow

1. User opens the Report Scam page.
2. User enters report details.
3. User uploads optional evidence.
4. System validates the submission.
5. Report is stored.
6. Administrator is notified.

### Postconditions

* Report status is **Pending Review**.

---

# UC-010 Resume Safety Check

### Goal

Warn users about sensitive information in uploaded resumes.

### Primary Actor

Registered User

### Main Flow

1. User uploads a resume.
2. System scans for sensitive identifiers.
3. Potential issues are highlighted.
4. Privacy recommendations are displayed.

---

# UC-011 AI Career Assistant

### Goal

Provide AI-assisted career guidance.

### Primary Actor

Registered User

### Supporting Actor

AI Service

### Main Flow

1. User asks a question.
2. Question is sent to the AI service.
3. AI generates a response.
4. Response is displayed.

---

# UC-012 Search Reports

### Goal

Allow users to search public scam reports.

### Primary Actor

Registered User

### Main Flow

1. User enters search criteria.
2. System retrieves matching reports.
3. Results are displayed.
4. User may apply filters.

---

# UC-013 Manage Users

### Goal

Allow administrators to manage user accounts.

### Primary Actor

Administrator

### Main Flow

1. Administrator views user list.
2. Administrator searches for a user.
3. Administrator updates account status.
4. Changes are saved.

---

# UC-014 Moderate Scam Reports

### Goal

Review community-submitted reports.

### Primary Actor

Administrator

### Main Flow

1. Administrator views pending reports.
2. Administrator reviews submitted evidence.
3. Administrator approves or rejects the report.
4. Report status is updated.

---

# UC-015 View Analytics

### Goal

Allow administrators to monitor platform activity.

### Primary Actor

Administrator

### Main Flow

1. Administrator opens the Analytics Dashboard.
2. System displays:

   * Total Users
   * Total Reports
   * Daily Analyses
   * Most Reported Companies
   * Risk Trends
3. Administrator reviews analytics.

---

# 5. Use Case Relationships

## Include Relationships

* Analyze Job Description → AI Service
* Upload Offer Letter → OCR Processing
* Verify Recruiter Email → Domain Validation
* Submit Scam Report → File Upload Validation

## Extend Relationships

* AI Analysis → Generate Recommendations
* Resume Analysis → Privacy Suggestions
* Company Verification → Risk Indicators

---

# 6. Preconditions

* Internet connection available.
* Backend services operational.
* Database available.
* AI service reachable for AI-dependent features.
* User authenticated for protected functionality.

---

# 7. Postconditions

* Requested operation completed successfully.
* Relevant data stored in the database.
* Audit logs updated where applicable.
* User receives confirmation or error feedback.

---

# 8. Exception Scenarios

| Exception              | System Response                                   |
| ---------------------- | ------------------------------------------------- |
| Invalid login          | Display authentication error                      |
| Invalid file upload    | Reject file and show validation message           |
| AI service unavailable | Inform the user and allow retry                   |
| Database failure       | Log the error and display a generic error message |
| Unauthorized access    | Return an access denied response                  |

---

# 9. Traceability

Each use case maps to:

* Business Requirements Document (BRD)
* Software Requirements Specification (SRS)
* Functional Requirements (FR)
* User Stories (US)
* REST API Specification
* Database Design
* Test Cases
* User Acceptance Testing (UAT)

This traceability ensures that each user interaction can be implemented, tested, and validated against defined business requirements.
