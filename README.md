# Selenium POM Framework (Basic)

Structure:
- base: BaseTest
- pages: Page Object classes (LoginPage, HomePage)
- utils: Config reader
- tests: TestNG tests

How to run:
1. Update src/test/resources/config.properties for baseURL and browser.
2. Run: mvn test

Notes:
- This project uses WebDriverManager to auto-download drivers.
- Replace example locators in pages with your application-specific locators.
