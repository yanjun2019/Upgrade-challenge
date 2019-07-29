Upgrade challenge - YanJun TANG
=======================

This is a small test framework for Upgrade challenge user stories: Web and API

### Run test (API and Web):
- Open project in IntelliJ, right click file /upgrade/challenge/testing/testng.xml
- Test report located at: YanJun\test-output\Upgrade_challenge
- Web test result: total test 1, pass test 1, failed test 0;
- API test result: total test 3, pass test 2, failed test 1; Failed test is due to <District of Columbia> is NOT
 valid state name; The only state has a min age of 19 is Alabama.


### Web

Test step:
1. Create account on page "https://www.credify.tech/phone/nonDMFunnel", provide personal information, and get loan
detail: amount, APR, Term, Monthly payment.
2. Login the same account on page "https://www.credify.tech/portal/login", get the loan detail information.
3. Compare the the loan information from two pages, expected result is they are match.

Code:
- Code at: com.upgrade.challenge.testing.Web
- Classes:
    pages.pageSetup: provide commen methods to operate webpage, like: open, close, input text, get text, click button,
    and etc.
    pages.pageNonDMFunnel: provide methods to operate page nonDMFunnel, like input text to box, click any button, fetch any text content on these pages.
    pages.pageLogin: provide methods to operate page login, like input text to box, click any button, fetch any text
    content on these pages.
    test.smoke: provide test cases and scenarios, used by testng.xml

### API
Test step:
1. GET endpoint response by rest-assured
2. Fetch data from response by rest-assured jsonPath().getList XPath
3. Validate data

Code:
- Code at: com.upgrade.challenge.testing.API
- Classes:
    testEndPoints.states: use rest-assured to GET endpoint response, 3 validations based on reqirement

### Develop environment and tools
- IDE: IntelliJ IDEA 2019.1 (Community Edition)
- Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-24T14:49:05-05:00)
- Java version: 12.0.1, vendor: Oracle Corporation
- Selenium: 3.141.59
- TestNG: 6.14.3
- OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"



