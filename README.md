# DemoQA Automation (Java + Selenium + TestNG)

This repository contains my automation solution for the DemoQA assignment.

## Features Automated
1. Checkbox: Expand all and check the Home checkbox; validated result.
2. Web Tables: Add a row, validate row count increased, then delete the row.
3. Dynamic Properties: Verified enable-after and visible-after buttons and captured the class change for color change.
4. File Upload: Uploaded `sample_upload.txt` and validated the UI acknowledgement.
5. Date Picker: Set date using input and validated the value.

## Tech stack
- Java 17
- Selenium 4
- TestNG
- WebDriverManager
- Maven

## How to run locally
1. Clone the repository to your machine.
2. Ensure Java 17+ and Maven are installed.
3. Run in terminal:

```bash
mvn clean test
```

## Evidence
- Screenshots are saved automatically to `target/screenshots` during test execution.

## Notes
- Chrome browser must be installed locally.
- For clarity, Thread.sleep is used; in real projects prefer WebDriverWait.
