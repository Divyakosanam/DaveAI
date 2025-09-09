# QA Test Automation (Java + Selenium)

## 📌 Overview
This project contains **UI automation tests** for [https://www.iamdave.ai/](https://www.iamdave.ai/) using **Java, Selenium, and WebDriverManager**.  
It verifies:
- Page load success
- Logo visibility
- Navigation to other links via button
- Form input + submission

## ⚙️ Dependencies
- Java 
- Maven
- Selenium 
- WebDriverManager 

All dependencies are managed via `pom.xml`.

## ▶️ How to Run
1. Clone repo or unzip folder.
2. Navigate to project root.
3. Run with Maven:
   ```bash
   mvn compile exec:java -Dexec.mainClass="Test.DaveAITest"

Or run directly in any IDE (Eclipse/IntelliJ/VS Code).
