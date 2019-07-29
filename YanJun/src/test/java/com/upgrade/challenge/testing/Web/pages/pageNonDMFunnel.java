package com.upgrade.challenge.testing.Web.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class pageNonDMFunnel {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  //TODO
  //better to use ID for all element, need talk with dev

  //Page nonDMFunnel
  private static String url = "https://www.credify.tech/phone/nonDMFunnel";
  private static String InputText_LoanAmount_Name = "desiredAmount";
  private static String Text_LoanAmountError_XPath = "//*[@id=\"root\"]/div/main/div/div/div/div/div[2]/div[2]/form/div/div/div"
      + "[1]/div/div/div[2]";
  private static String Select_LoanPurpose_XPath = "//*[@id=\"root\"]/div/main/div/div/div/div/div[2]/div[2]/form/div/div/div[2"
      + "]/div/select";
  private static String Text_LoanPurposeError_XPath = "//*[@id=\"root\"]/div/main/div/div/div/div/div[2]/div[2]/form/div/div/div[2"
      + "]/div/div";
  private static String Button_CheckYourRate1_XPath = "//*[@id=\"root\"]/div/main/div/div/div/div/div[2]/div[2]/form/div/div/div"
      + "[3"
      + "]/button";

  //Page personal-information-1
  private static String InputRadio_Individual_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/div/div/div/label[1]/div[1]";
  private static String InputRadio_JointApplication_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/div/div/div"
      + "/label[2]/div[1]";
  private static String InputText_FirstName_Name = "borrowerFirstName";
  private static String Text_FirstNameError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[1]/div[1]/div/div/div[2]";
  private static String InputText_LastName_Name = "borrowerLastName";
  private static String Text_LastNameError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[1]/div[2]/div/div/div[2]";
  private static String InputText_HomeAddress_Name = "borrowerStreet";
  private static String Text_HomeAddressError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2"
      + "]/div/div/div/div/div[2]";
  private static String InputText_City_Name = "borrowerCity";
  private static String Text_CityError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[1]/div/div/div[2]";
  private static String InputText_State_Name = "borrowerState";
  private static String Text_StateError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[2]/div/div/div[2]";
  private static String InputText_ZipCode_Name = "borrowerZipCode";
  private static String Text_ZipCodeError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[3]/div/div/div[2]";
  private static String InputText_DateOfBirth_Name = "borrowerDateOfBirth";
  private static String Text_DateOfBirthError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[4]/div/div[2]";
  private static String InputText_IndividualAnnualIncome_Name = "borrowerIncome";
  private static String Text_IndividualAnnualIncomeError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[5]/div/div[2]";
  private static String InputText_AdditionalAnnualIncome_Name = "borrowerAdditionalIncome";
  private static String InputText_CoFirstName_Name = "coBorrowerFirstName";
  private static String Text_CoFirstNameError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[1]/div[1]/div/div/div[2]";
  private static String InputText_CoLastName_Name = "coBorrowerLastName";
  private static String Text_CoLastNameError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[1]/div[2]/div/div/div[2]";
  private static String InputText_CoDateOfBirth_Name = "coBorrowerDateOfBirth";
  private static String Text_CoDateOfBirthError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[2]/div/div[2]";
  private static String InputText_CoIndividualAnnualIncome_Name = "coBorrowerIncome";
  private static String Text_CoIndividualAnnualIncomeError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[3]/div/div[2]";
  private static String Checkbox_UseSameAddress_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2"
      + "]/label/div[1]";
  private static String InputText_CoHomeAddress_Name = "coBorrowerStreet";
  private static String Text_CoHomeAddressError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[4]/div/div/div/div/div[2]";
  private static String InputText_CoCity_Name = "coBorrowerCity";
  private static String Text_CoCityError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[5]/div[1]/div/div/div[2]";
  private static String InputText_CoState_Name = "coBorrowerState";
  private static String Text_CoStateError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[5]/div[2]/div/div/div[2]";
  private static String InputText_CoZipCode_Name = "coBorrowerZipCode";
  private static String Text_CoZipCodeError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div[5]/div[3]/div/div/div[2]";
  private static String InputText_Email_Name = "username";
  private static String Text_EmailError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[3]/div[1]/div/div[2]";
  private static String InputText_Password_Name = "password";
  private static String Text_PasswordError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[3]/div[2]/div/div[2]";
  private static String Checkbox_TermsOfUse_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[3"
      + "]/div/label/div[1]";
  private static String Text_TermsOfUseError_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[4]/div/div";
  private static String Button_CheckYourRate2_XPath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[4]/button";

  //Page offer-page
  private static String Text_OfferLoanAmount_XPath = "//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[2]/span[2]";
  private static String Text_OfferMonthlyPayment_XPath = "//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div[1]/div/div/span";
  private static String Text_OfferTerm_XPath = "//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div/div/div[1]";
  private static String Text_OfferInterestRate_XPath = "//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div"
      + "/div/div/div[2]/div/div/div[2]";
  private static String Text_OfferAPR_XPath = "//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div/div/div[3]/div/div";
  private static String Label_Menu_XPath = "//*[@id=\"root\"]/div/main/div/header/div/label";
  private static String Button_SignOut_XPath = "//*[@id=\"root\"]/div/main/div/header/div/nav/ul/li[2]/a";

  private pageSetup page;

  public pageNonDMFunnel(pageSetup.Browser browser) throws Exception {
    page = new pageSetup(browser);
    page.openURL(url,InputText_LoanAmount_Name);
  }
  public void closePage() {
    page.closePage();
  }

  //Page nonDMFunnel
  public void page1_inputLoanAmount(String loanAmount) throws Exception {
    page.inputTextByName(InputText_LoanAmount_Name, loanAmount);
  }
  public String page1_getLoanAmountError() throws Exception {
    return page.getTextByXPath(Text_LoanAmountError_XPath);
  }
  public void page1_inputLoanPurpose(String loanPurpose) throws Exception {
    page.inputTextByXPath(Select_LoanPurpose_XPath, loanPurpose);
  }
  public String page1_getLoanPurposeError() throws Exception {
    return page.getTextByXPath(Text_LoanPurposeError_XPath);
  }
  public void page1_clickCheckYourRate() throws Exception {
    page.clickButtonByXPath(Button_CheckYourRate1_XPath);
  }

  //Page personal-information-1
  public void page2_clickIndividual() throws Exception {
    page.clickButtonByXPath(InputRadio_Individual_XPath);
  }
  public void page2_clickJointApplication() throws Exception {
    page.clickButtonByXPath(InputRadio_JointApplication_XPath);
  }
  public void page2_inputFirstName(String firstName) throws Exception {
    page.inputTextByName(InputText_FirstName_Name, firstName);
  }
  public String page2_getFirstNameError() throws Exception {
    return page.getTextByXPath(Text_FirstNameError_XPath);
  }
  public void page2_inputLastName(String lastName) throws Exception {
    page.inputTextByName(InputText_LastName_Name, lastName);
  }
  public String page2_getLastNameError() throws Exception {
    return page.getTextByXPath(Text_LastNameError_XPath);
  }
  public void page2_inputHomeAddress(String address) throws Exception {
    page.inputTextByName(InputText_HomeAddress_Name, address);
  }
  public String page2_getHomeAddressError() throws Exception {
    return page.getTextByXPath(Text_HomeAddressError_XPath);
  }
  public void page2_inputCity(String city) throws Exception {
    page.inputTextByName(InputText_City_Name, city);
  }
  public String page2_getCityError() throws Exception {
    return page.getTextByXPath(Text_CityError_XPath);
  }
  public void page2_inputState(String state) throws Exception {
    page.inputTextByName(InputText_State_Name, state);
  }
  public String page2_getStateError() throws Exception {
    return page.getTextByXPath(Text_StateError_XPath);
  }
  public void page2_inputZipCode(String zip) throws Exception {
    page.inputTextByName(InputText_ZipCode_Name, zip);
  }
  public String page2_getZipCodeError() throws Exception {
    return page.getTextByXPath(Text_ZipCodeError_XPath);
  }
  public void page2_inputDateOfBirth(String dateOfBirth) throws Exception {
    page.inputTextByName(InputText_DateOfBirth_Name, dateOfBirth);
  }
  public String page2_getDateOfBirthError() throws Exception {
    return page.getTextByXPath(Text_DateOfBirthError_XPath);
  }
  public void page2_inputIndividualAnnualIncome(String income) throws Exception {
    page.inputTextByName(InputText_IndividualAnnualIncome_Name, income);
  }
  public String page2_getIndividualAnnualIncomeError() throws Exception {
    return page.getTextByXPath(Text_IndividualAnnualIncomeError_XPath);
  }
  public void page2_inputAdditionalAnnualIncome(String income) throws Exception {
    page.inputTextByName(InputText_AdditionalAnnualIncome_Name, income);
  }
  public void page2_inputCoFirstName(String coFirstName) throws Exception {
    page.inputTextByName(InputText_CoFirstName_Name, coFirstName);
  }
  public String page2_getCoFirstNameError() throws Exception {
    return page.getTextByXPath(Text_CoFirstNameError_XPath);
  }
  public void page2_inputCoLastName(String coLastName) throws Exception {
    page.inputTextByName(InputText_CoLastName_Name, coLastName);
  }
  public String page2_getCoLastNameError() throws Exception {
    return page.getTextByXPath(Text_CoLastNameError_XPath);
  }
  public void page2_inputCoDateOfBirth(String coDateOfBirth) throws Exception {
    page.inputTextByName(InputText_CoDateOfBirth_Name, coDateOfBirth);
  }
  public String page2_getCoDateOfBirthError() throws Exception {
    return page.getTextByXPath(Text_CoDateOfBirthError_XPath);
  }
  public void page2_inputCoIndividualAnnualIncome(String coIncome) throws Exception {
    page.inputTextByName(InputText_CoIndividualAnnualIncome_Name, coIncome);
  }
  public String page2_getCoIndividualAnnualIncomeError() throws Exception {
    return page.getTextByXPath(Text_CoIndividualAnnualIncomeError_XPath);
  }
  public void page2_tickUseSameAddress() throws Exception {
    page.tickCheckBoxByXPath(Checkbox_UseSameAddress_XPath);
  }
  public void page2_unTickUseSameAddress() throws Exception {
    page.unTickCheckBoxByXPath(Checkbox_UseSameAddress_XPath);
  }
  public void page2_inputCoHomeAddress(String coAddress) throws Exception {
    page.inputTextByName(InputText_CoHomeAddress_Name, coAddress);
  }
  public String page2_getCoHomeAddressError() throws Exception {
    return page.getTextByXPath(Text_CoHomeAddressError_XPath);
  }
  public void page2_inputCoCity(String coCity) throws Exception {
    page.inputTextByName(InputText_CoCity_Name, coCity);
  }
  public String page2_getCoCityError() throws Exception {
    return page.getTextByXPath(Text_CoCityError_XPath);
  }
  public void page2_inputCoState(String coState) throws Exception {
    page.inputTextByName(InputText_CoState_Name, coState);
  }
  public String page2_getCoStateError() throws Exception {
    return page.getTextByXPath(Text_CoStateError_XPath);
  }
  public void page2_inputCoZipCode(String coZip) throws Exception {
    page.inputTextByName(InputText_CoZipCode_Name, coZip);
  }
  public String page2_getCoZipCodeError() throws Exception {
    return page.getTextByXPath(Text_CoZipCodeError_XPath);
  }
  public void page2_inputEmail(String email) throws Exception {
    page.inputTextByName(InputText_Email_Name, email);
  }
  public String page2_getEmailError() throws Exception {
    return page.getTextByXPath(Text_EmailError_XPath);
  }
  public void page2_inputPassword(String password) throws Exception {
    page.inputTextByName(InputText_Password_Name, password);
  }
  public String page2_getPasswordError() throws Exception {
    return page.getTextByXPath(Text_PasswordError_XPath);
  }
  public void page2_tickTermsOfUse() throws Exception {
    page.tickCheckBoxByXPath(Checkbox_TermsOfUse_XPath);
  }
  public void page2_unTickTermsOfUse() throws Exception {
    page.unTickCheckBoxByXPath(Checkbox_TermsOfUse_XPath);
  }
  public void page2_clickTermsOfUse() throws Exception {
    page.clickButtonByXPath(Checkbox_TermsOfUse_XPath);
  }
  public String page2_getTermsOfUseError() throws Exception {
    return page.getTextByXPath(Text_TermsOfUseError_XPath);
  }
  public void page2_clickCheckYourRate() throws Exception {
    page.clickButtonByXPath(Button_CheckYourRate2_XPath);
  }

  //Page offer-page
  public String page3_getOfferLoanAmount() throws Exception {
    return page.getTextByXPath(Text_OfferLoanAmount_XPath);
  }
  public String page3_getOfferMonthlyPayment() throws Exception {
    return page.getTextByXPath(Text_OfferMonthlyPayment_XPath);
  }
  public String page3_getOfferTerm() throws Exception {
    return page.getTextByXPath(Text_OfferTerm_XPath);
  }
  public String page3_getOfferInterestRate() throws Exception {
    return page.getTextByXPath(Text_OfferInterestRate_XPath);
  }
  public String page3_getOfferAPR() throws Exception {
    return page.getTextByXPath(Text_OfferAPR_XPath);
  }
  public void page3_clickMenu() throws Exception {
    page.clickButtonByXPath(Label_Menu_XPath);
  }
  public void page3_clickSignOut() throws Exception {
    page.clickButtonByXPath(Button_SignOut_XPath);
  }




}
