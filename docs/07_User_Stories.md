# User Stories

## Project Name

**JobShield – AI-Powered Job Scam Detection Platform**

**Version:** 1.0

**Prepared By:** Manoj N

**Date:** July 2026

---

# 1. Purpose

This document defines the user stories for the JobShield platform. User stories describe the system from the perspective of its users and help the development team understand business value while planning implementation.

Each story follows the Agile format:

> **As a** <role> **I want** <goal> **so that** <benefit>.

---

# 2. User Roles

* Guest
* Registered User
* Administrator
* AI Service (External System)

---

# Epic 1 – User Authentication

---

## US-001 User Registration

**Priority:** High

**Story**

As a guest, I want to create an account so that I can securely access JobShield.

**Acceptance Criteria**

* Registration form validates required fields.
* Duplicate email addresses are rejected.
* Password is securely stored.
* Account is created successfully.

---

## US-002 User Login

**Priority:** High

As a registered user, I want to log in so that I can access protected features.

**Acceptance Criteria**

* Valid credentials allow login.
* Invalid credentials display an error.
* JWT token is generated after successful authentication.

---

## US-003 Forgot Password

**Priority:** High

As a user, I want to reset my password so that I can regain access to my account.

---

## US-004 Logout

**Priority:** High

As a user, I want to log out securely so that my account remains protected on shared devices.

---

# Epic 2 – User Profile

---

## US-005 View Profile

As a user, I want to view my profile information so that I can verify my account details.

---

## US-006 Edit Profile

As a user, I want to update my profile information so that my account remains current.

---

## US-007 Change Password

As a user, I want to change my password so that I can improve my account security.

---

# Epic 3 – Company Verification

---

## US-008 Search Company

As a user, I want to search for a company so that I can verify whether it appears to be legitimate.

---

## US-009 View Company Details

As a user, I want to view available company information so that I can make informed decisions before applying.

---

## US-010 Verify Company Website

As a user, I want to compare company website information with my job offer so that I can identify inconsistencies.

---

# Epic 4 – Recruiter Verification

---

## US-011 Verify Recruiter Email

As a user, I want to verify a recruiter email address so that I can identify suspicious email domains.

---

## US-012 Analyze Recruiter Message

As a user, I want to analyze recruiter messages so that I can identify possible scam indicators.

---

## US-013 View AI Explanation

As a user, I want AI to explain why a recruiter appears suspicious or trustworthy so that I understand the assessment.

---

# Epic 5 – AI Scam Detection

---

## US-014 Analyze Job Description

As a user, I want to submit a job description so that I can receive a scam risk assessment.

---

## US-015 Analyze Offer Letter

As a user, I want to upload an offer letter so that AI can identify suspicious content.

---

## US-016 Analyze Interview Letter

As a user, I want to analyze interview invitations so that I can identify warning signs before attending.

---

## US-017 Analyze WhatsApp Conversation

As a user, I want to analyze recruitment chats so that I can detect suspicious communication patterns.

---

## US-018 Upload Screenshot

As a user, I want to upload screenshots of recruitment conversations so that the system can analyze them.

---

## US-019 View Scam Score

As a user, I want to receive a risk score with explanations so that I can better evaluate the opportunity.

---

## US-020 Receive Safety Recommendations

As a user, I want practical recommendations after analysis so that I know what actions to take next.

---

# Epic 6 – Resume Safety

---

## US-021 Upload Resume

As a user, I want to upload my resume so that it can be checked for sensitive information.

---

## US-022 Detect Sensitive Information

As a user, I want the system to detect personal identifiers so that I avoid unnecessary data exposure.

---

## US-023 Receive Privacy Warnings

As a user, I want warnings before sharing sensitive information so that I can protect my identity.

---

# Epic 7 – Community Reporting

---

## US-024 Report Scam

As a user, I want to report suspicious recruiters so that other users can benefit from my experience.

---

## US-025 Upload Evidence

As a user, I want to upload screenshots and supporting documents so that administrators can review my report.

---

## US-026 View Report Status

As a user, I want to track the progress of my submitted report so that I know whether it has been reviewed.

---

## US-027 Browse Approved Reports

As a user, I want to browse verified scam reports so that I become aware of common recruitment fraud.

---

# Epic 8 – AI Career Assistant

---

## US-028 Ask Career Questions

As a user, I want to ask career-related questions so that I receive helpful guidance.

---

## US-029 Understand Scam Indicators

As a user, I want AI to explain recruitment scam patterns so that I can recognize similar situations in the future.

---

## US-030 Understand Employment Terms

As a user, I want explanations of employment terms and offer conditions so that I can make informed decisions.

---

# Epic 9 – Dashboard

---

## US-031 View Dashboard

As a user, I want a dashboard showing my recent analyses so that I can easily revisit previous results.

---

## US-032 View Analysis History

As a user, I want to access my previous AI analyses so that I can compare results over time.

---

## US-033 View Saved Reports

As a user, I want to save important reports so that I can review them later.

---

# Epic 10 – Notifications

---

## US-034 Receive Email Notifications

As a user, I want email notifications about important account events so that I stay informed.

---

## US-035 Receive In-App Notifications

As a user, I want notifications inside the application so that I know about report updates and security alerts.

---

# Epic 11 – Administration

---

## US-036 Manage Users

As an administrator, I want to manage user accounts so that the platform remains secure.

---

## US-037 Moderate Reports

As an administrator, I want to approve or reject community reports so that only appropriate content becomes publicly visible.

---

## US-038 Manage Companies

As an administrator, I want to manage company records so that verification information remains accurate.

---

## US-039 View Platform Analytics

As an administrator, I want to view system statistics so that I can monitor platform usage and trends.

---

## US-040 Manage Recruiters

As an administrator, I want to review recruiter information so that suspicious recruiters can be investigated.

---

# Epic 12 – Security

---

## US-041 Secure Authentication

As a user, I want secure authentication so that unauthorized users cannot access my account.

---

## US-042 Secure File Upload

As a user, I want uploaded files to be validated so that unsafe files are rejected.

---

## US-043 Session Management

As a user, I want my session to expire after inactivity so that my account remains protected.

---

# Epic 13 – Search and Filters

---

## US-044 Search Reports

As a user, I want to search reports by company, recruiter, or email so that I can quickly find relevant information.

---

## US-045 Filter Results

As a user, I want to filter reports by date, status, and risk level so that I can narrow my search.

---

# Epic 14 – Future Enhancements

---

## US-046 Browser Extension

As a user, I want to analyze job postings directly from supported job portals so that I do not need to copy and paste content.

---

## US-047 Mobile Application

As a user, I want a mobile application so that I can verify job offers anywhere.

---

## US-048 Public API

As a developer, I want secure APIs so that approved third-party applications can integrate with JobShield.

---

## US-049 Multi-Language Support

As a user, I want the application in my preferred language so that I can use it comfortably.

---

## US-050 Personalized AI Recommendations

As a user, I want personalized recommendations based on my previous analyses so that I receive more relevant guidance over time.

---

# 3. Story Priority Summary

| Priority | Stories          |
| -------- | ---------------- |
| High     | US-001 to US-020 |
| Medium   | US-021 to US-045 |
| Low      | US-046 to US-050 |

---

# 4. Definition of Done

A user story is considered complete when:

* Functional requirements are implemented.
* Code has been reviewed.
* Unit tests pass.
* Integration tests pass.
* Acceptance criteria are satisfied.
* Documentation is updated.
* Security validation is completed where applicable.
* The feature is approved by the product owner.

---

# 5. Story Traceability

Each user story is mapped to:

* Business Requirements Document (BRD)
* Software Requirements Specification (SRS)
* Functional Requirements (FR)
* Non-Functional Requirements (NFR)
* Use Cases
* Test Cases
* User Acceptance Testing (UAT)

This traceability ensures that every implemented feature delivers measurable business value and can be verified throughout the software development lifecycle.
