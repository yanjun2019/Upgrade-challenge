package com.upgrade.challenge.testing.Web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.upgrade.challenge.testing.Web.pages.pageLogin;
import com.upgrade.challenge.testing.Web.pages.pageNonDMFunnel;
import com.upgrade.challenge.testing.Web.pages.pageSetup;

import static org.assertj.core.api.Assertions.assertThat;

public class smoke {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private pageSetup.Browser browser= pageSetup.Browser.Chrome; //Default browser is Chrome

  @BeforeSuite(alwaysRun=true)
  private void setupBeforeSuite(ITestContext context) {
    browser = pageSetup.Browser.valueOf(context.getCurrentXmlTest().getParameter("testBrowser"));
  }

  //Test Scenario 01: sign in, request loan detail, and re-login to get loan detail again, compare two details
  public void runTestScenario01(String loanAmount, String loanPurpose, String firstName, String lastName,
      String address, String city, String state, String zip, String dateOfBirth, String income, String additionalIncome, String email,
      String password) throws Exception {

    String expectLoanAmount;
    String expectInterestRate;
    String expectAPR;
    String expectLoanTerm;
    String expectMonthlyPayment;

    String actualLoanAmount;
    String actualInterestRate;
    String actualAPR;
    String actualLoanTerm;
    String actualMonthlyPayment;

    //Sign in Pages
    pageNonDMFunnel pageSignup = new pageNonDMFunnel(browser);
    pageSignup.page1_inputLoanAmount(loanAmount);
    pageSignup.page1_inputLoanPurpose(loanPurpose);
    pageSignup.page1_clickCheckYourRate();

    pageSignup.page2_inputFirstName(firstName);
    pageSignup.page2_inputLastName(lastName);
    pageSignup.page2_inputHomeAddress(address);
    pageSignup.page2_inputCity(city);
    pageSignup.page2_inputState(state);
    pageSignup.page2_inputZipCode(zip);
    pageSignup.page2_inputDateOfBirth(dateOfBirth);
    pageSignup.page2_inputIndividualAnnualIncome(income);
    pageSignup.page2_inputAdditionalAnnualIncome(additionalIncome);
    pageSignup.page2_inputEmail(email);
    pageSignup.page2_inputPassword(password);
    pageSignup.page2_clickTermsOfUse();
    pageSignup.page2_clickCheckYourRate();

    expectLoanAmount = pageSignup.page3_getOfferLoanAmount();
    expectInterestRate = pageSignup.page3_getOfferInterestRate();
    expectAPR = pageSignup.page3_getOfferAPR();
    expectLoanTerm = pageSignup.page3_getOfferTerm();
    expectMonthlyPayment = pageSignup.page3_getOfferMonthlyPayment();
    pageSignup.page3_clickMenu();
    pageSignup.page3_clickSignOut();
    pageSignup.closePage();

    //Re-login pages
    pageLogin pageReLogin = new pageLogin(browser);
    pageReLogin.page1_inputEmail(email);
    pageReLogin.page1_inputPassword(password);
    pageReLogin.page1_clickSignIn();

    actualLoanAmount = pageReLogin.page2_getOfferLoanAmount();
    actualInterestRate= pageReLogin.page2_getOfferInterestRate();
    actualAPR = pageReLogin.page2_getOfferAPR();
    actualLoanTerm = pageReLogin.page2_getOfferTerm();
    actualMonthlyPayment = pageReLogin.page2_getOfferMonthlyPayment();
    pageReLogin.page2_clickMenu();
    pageReLogin.page2_clickSignOut();
    pageReLogin.closePage();

    //Validation
    logger.info("Verify Loan Amount: expect <"+expectLoanAmount+">, actual <"+actualLoanAmount+">");
    assertThat(expectLoanAmount).isEqualTo(actualLoanAmount);
    logger.info("Verify APR: expect <"+expectAPR+">, actual <"+actualAPR+">");
    assertThat(expectAPR).isEqualTo(actualAPR);
    logger.info("Verify Interest Rate: expect <"+expectInterestRate+">, actual <"+actualInterestRate+">");
    assertThat(expectInterestRate).isEqualTo(actualInterestRate);
    logger.info("Verify Loan Term: expect <"+expectLoanTerm+">, actual <"+actualLoanTerm+">");
    assertThat(expectLoanTerm).isEqualTo(actualLoanTerm);
    logger.info("Verify Monthly Payment: expect <"+expectMonthlyPayment+">, actual <"+actualMonthlyPayment+">");
    assertThat(expectMonthlyPayment).isEqualTo(actualMonthlyPayment);
  }


  @Test(description="Test case 01: sign in, request loan detail, and re-login to get loan detail again, compare two details",
      groups = {"smoke","function"})
  public void test01() throws Exception {
    int randomNumber = (int)(Math.random()*1000+1);
    String firstname = "fl" + randomNumber;
    String lastname = "ln" + randomNumber;
    String email = "candidate"+randomNumber+"@upgrade-challenge.com";

    runTestScenario01("2000", "Pay off Credit Cards",
        firstname, lastname, "1 main", "new york", "WA", "92005", "01/01/2000", "100000", "5000",
        email, "123456aA");
  }


}
