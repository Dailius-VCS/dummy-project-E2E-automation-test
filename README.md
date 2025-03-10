# 🌐 Web UI Automation Framework with Selenium & TestNG

🚀 This framework automates UI testing for web applications using Selenium WebDriver, TestNG, and the Page Object Model (POM).

### Key Features:

* 💻 Cross-browser testing (Chrome, Firefox, Edge)
* ⚙️ TestNG for test execution and reporting
* 🧪 Test cases for [List of UI Features]
* 🧩 Page Object Model for maintainability
* 📸 Screenshots and logging for debugging

### Prerequisites:

* ☕ Java JDK
* 📦 Maven
* 🌐 Selenium WebDriver
* 🧪 TestNG

### Project Structure:

>src  
>├── main  
>└── test  
>│   └── java  
>│       └── [Your Package Name]  
>│           ├── pages (Page Objects)  
>│           ├── tests (Test Classes)  
>│           └── utils (Utility Classes)  
>└── resources  
>├── data (Test Data)  
>└── testng.xml (TestNG Configuration)

### How to Run Tests:

```bash
mvn clean test
```

### Reports:
📊 TestNG reports will be generated in target/surefire-reports/.  
📸 Screenshots will be saved in target/screenshots/.