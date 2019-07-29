package com.upgrade.challenge.testing.Web.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class pageLogin {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  //TODO
  //better to use ID for all element, need talk with dev

  //Page login
  private static String url = "https://www.credify.tech/portal/login";
  private static String InputText_Email_Name = "username";
  private static String InputText_Password_Name = "password";
  private static String Button_SignIn_XPath = "//*[@id=\"root\"]/div/main/div/div/div/div/form/button";

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

  public pageLogin(pageSetup.Browser browser) throws Exception {
    page = new pageSetup(browser);
    page.openURL(url,InputText_Email_Name);
  }
  public void closePage() {
    page.closePage();
  }

  //Page login
  public void page1_inputEmail(String email) throws Exception {
    page.inputTextByName(InputText_Email_Name, email);
  }
  public void page1_inputPassword(String password) throws Exception {
    page.inputTextByName(InputText_Password_Name, password);
  }
  public void page1_clickSignIn() throws Exception {
    page.clickButtonByXPath(Button_SignIn_XPath);
  }

  //Page offer-page
  public String page2_getOfferLoanAmount() throws Exception {
    return page.getTextByXPath(Text_OfferLoanAmount_XPath);
  }
  public String page2_getOfferMonthlyPayment() throws Exception {
    return page.getTextByXPath(Text_OfferMonthlyPayment_XPath);
  }
  public String page2_getOfferTerm() throws Exception {
    return page.getTextByXPath(Text_OfferTerm_XPath);
  }
  public String page2_getOfferInterestRate() throws Exception {
    return page.getTextByXPath(Text_OfferInterestRate_XPath);
  }
  public String page2_getOfferAPR() throws Exception {
    return page.getTextByXPath(Text_OfferAPR_XPath);
  }
  public void page2_clickMenu() throws Exception {
    page.clickButtonByXPath(Label_Menu_XPath);
  }
  public void page2_clickSignOut() throws Exception {
    page.clickButtonByXPath(Button_SignOut_XPath);
  }






}
