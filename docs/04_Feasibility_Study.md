# Feasibility Study

## Project Name

**JobShield – AI-Powered Job Scam Detection Platform**

**Version:** 1.0

**Prepared By:** Manoj N

**Date:** July 2026

---

# 1. Introduction

## 1.1 Purpose

This Feasibility Study evaluates whether the JobShield project can be successfully designed, developed, deployed, and maintained. The study examines the project's viability from technical, economic, operational, legal, and scheduling perspectives.

The objective is to identify potential risks, constraints, and opportunities before beginning full-scale development.

---

# 2. Project Overview

JobShield is an AI-powered web application designed to help job seekers identify potentially fraudulent job opportunities. The platform analyzes job descriptions, recruiter emails, hiring messages, and uploaded documents using Artificial Intelligence to provide an explainable risk assessment. It also supports company verification, recruiter validation, community reporting, and resume safety checks.

---

# 3. Feasibility Analysis

## 3.1 Technical Feasibility

### Objective

Determine whether the required technology, tools, and expertise are available to successfully develop the application.

### Technology Stack

**Frontend**

* React.js
* HTML5
* CSS3
* JavaScript

**Backend**

* Java 21
* Spring Boot
* Spring Security

**Database**

* PostgreSQL

**Artificial Intelligence**

* Google Gemini API
* LangChain
* OCR Library
* Vector Database (Future Enhancement)

**Cloud & Deployment**

* Docker
* AWS
* GitHub Actions

### Technical Assessment

| Requirement            | Status   |
| ---------------------- | -------- |
| Web Development        | Feasible |
| REST API Development   | Feasible |
| Database Management    | Feasible |
| Authentication         | Feasible |
| AI Integration         | Feasible |
| Cloud Deployment       | Feasible |
| File Upload Processing | Feasible |

### Technical Risks

* Dependence on third-party AI APIs.
* OCR accuracy may vary depending on image quality.
* AI predictions may occasionally produce false positives or false negatives.
* Public company information may be incomplete.

### Mitigation

* Implement fallback error handling.
* Validate AI outputs before presenting them to users.
* Clearly communicate that AI provides recommendations rather than definitive judgments.
* Design the system to support future integration with additional verification sources.

---

# 3.2 Economic Feasibility

## Objective

Evaluate whether the project can be developed and maintained within acceptable financial limits.

### Development Costs

| Item                               | Estimated Cost                                     |
| ---------------------------------- | -------------------------------------------------- |
| Development Tools                  | Free / Open Source                                 |
| IDE (IntelliJ Community / VS Code) | Free                                               |
| PostgreSQL                         | Free                                               |
| GitHub                             | Free                                               |
| Docker                             | Free                                               |
| Initial Cloud Hosting              | Low Cost / Free Tier                               |
| AI API Usage                       | Pay-as-you-go or Free Tier (depending on provider) |

### Operational Costs

* Cloud hosting
* Domain registration
* SSL certificate (if not included by hosting provider)
* AI API usage
* Monitoring services

### Benefits

* Practical portfolio project.
* Demonstrates modern software engineering skills.
* Potential to evolve into a public product.
* Opportunity for future premium or enterprise features.

### Conclusion

The project is economically feasible for an individual developer, especially during development using free and educational resources.

---

# 3.3 Operational Feasibility

## Objective

Determine whether users can effectively use the proposed system.

### Target Users

* Fresh graduates
* Students
* Internship seekers
* Experienced professionals
* Career changers

### Expected User Activities

* Register an account.
* Verify companies.
* Analyze job offers.
* Report scams.
* Ask AI-related career questions.

### Operational Advantages

* Simple and intuitive interface.
* AI-generated explanations improve transparency.
* Community reporting enhances collective awareness.
* Secure authentication protects user accounts.

### Potential Challenges

* Users may rely solely on AI recommendations.
* False reports may be submitted.
* Scam techniques evolve over time.

### Mitigation

* Provide clear disclaimers.
* Moderate community reports.
* Regularly update AI prompts and detection logic.

---

# 3.4 Legal and Ethical Feasibility

## Legal Considerations

The platform should:

* Protect user privacy.
* Store passwords securely using hashing.
* Encrypt sensitive information during transmission.
* Respect intellectual property rights.
* Comply with applicable data protection regulations.

### Ethical Considerations

* AI should provide explainable recommendations.
* Avoid presenting predictions as legal conclusions.
* Minimize algorithmic bias where possible.
* Allow users to report incorrect assessments.
* Ensure transparency about the limitations of AI.

---

# 3.5 Schedule Feasibility

## Estimated Development Timeline

| Phase                 | Duration               |
| --------------------- | ---------------------- |
| Requirements Analysis | 1 Week                 |
| System Design         | 1 Week                 |
| Database Design       | 1 Week                 |
| Backend Development   | 3 Weeks                |
| Frontend Development  | 3 Weeks                |
| AI Integration        | 2 Weeks                |
| Testing               | 2 Weeks                |
| Deployment            | 1 Week                 |
| Documentation         | Throughout Development |

**Estimated Total Duration:** 14 Weeks

---

# 4. Resource Feasibility

## Human Resources

* Full Stack Developer
* AI Developer (same developer in this project)
* UI/UX Designer (or self-designed)
* Tester (self-testing initially)

## Software Resources

* Java Development Kit (JDK)
* IntelliJ IDEA Community Edition
* Visual Studio Code
* PostgreSQL
* Git
* GitHub
* Postman
* Docker
* Node.js

## Hardware Resources

Minimum Development Machine:

* 8 GB RAM
* Multi-core processor
* Stable internet connection
* 20 GB free storage

---

# 5. Risk Analysis

| Risk                                 | Probability | Impact | Mitigation                                             |
| ------------------------------------ | ----------- | ------ | ------------------------------------------------------ |
| AI API unavailable                   | Medium      | High   | Retry logic and graceful error messages                |
| Public verification data unavailable | Medium      | Medium | Inform users when verification cannot be completed     |
| False AI predictions                 | Medium      | High   | Provide explanations and encourage manual verification |
| Database failure                     | Low         | High   | Regular backups and monitoring                         |
| Security vulnerabilities             | Low         | High   | Secure coding practices and regular testing            |
| High API usage costs                 | Medium      | Medium | Optimize prompts and cache results where appropriate   |

---

# 6. SWOT Analysis

## Strengths

* Solves a real-world problem.
* Integrates Artificial Intelligence.
* Modern full-stack architecture.
* Community-driven reporting.
* Scalable design.

## Weaknesses

* Dependence on external AI services.
* Verification quality depends on available public information.
* Requires continuous updates as scam patterns evolve.

## Opportunities

* Browser extension.
* Mobile application.
* Collaboration with educational institutions.
* Integration with job portals.
* Enterprise verification services.

## Threats

* Rapidly changing scam techniques.
* AI service pricing changes.
* Misuse of community reporting.
* Competition from future recruitment security platforms.

---

# 7. Feasibility Summary

| Category                    | Status                                 |
| --------------------------- | -------------------------------------- |
| Technical Feasibility       | Feasible                               |
| Economic Feasibility        | Feasible                               |
| Operational Feasibility     | Feasible                               |
| Legal & Ethical Feasibility | Feasible (with appropriate safeguards) |
| Schedule Feasibility        | Feasible                               |

---

# 8. Recommendation

Based on the technical capabilities, available development tools, manageable costs, operational benefits, and identified risks, the JobShield project is considered **feasible**.

The project can be successfully implemented using Java, Spring Boot, React.js, PostgreSQL, and modern AI services. It addresses a genuine problem faced by job seekers while providing an opportunity to demonstrate enterprise software development practices, secure application design, and responsible AI integration.

It is recommended to proceed with development using an iterative approach, beginning with core features such as authentication, company verification, and AI-assisted job analysis before expanding to advanced capabilities like community reporting, analytics, browser extensions, and mobile applications.
