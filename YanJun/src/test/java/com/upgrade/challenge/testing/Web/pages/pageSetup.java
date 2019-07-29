package com.upgrade.challenge.testing.Web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageSetup {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public enum Browser {
    Chrome,
    Firefox,
    Opera,
    Edge,
    IE
  }
  private Browser browser;
  private WebDriver driver;
  private WebDriverWait wait;

  public pageSetup(Browser selectedBrowser) {
    switch (selectedBrowser) {
    case Chrome:
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      break;
    case Firefox:
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      break;
    case Opera:
      WebDriverManager.operadriver().setup();
      driver = new OperaDriver();
      break;
    case Edge:
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
      break;
    case IE:
      WebDriverManager.iedriver().setup();
      driver = new InternetExplorerDriver();
      break;
    }
    browser = selectedBrowser;
    wait = new WebDriverWait(driver, 30);
    logger.info("Use browser <" + browser.toString() + ">");
  }

  public WebDriver getWebDriver(){
    return driver;
  }

  //Open Page
  public void openURL(String url, String elementName) throws Exception {
    driver.get(url);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementName)));
    logger.info("Open url: <" + url + ">");
  }

  //Close page
  public void closePage() {
    driver.close();
    driver.quit();
  }

  //Input text
  public void inputTextByID(String elementID, String inputValue) throws Exception {
    WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
    inputElement.sendKeys(inputValue);
    logger.debug("Input <" + inputValue + "> to element by ID <"+ elementID +">");
  }
  public void inputTextByXPath(String elementXPath, String inputValue) throws Exception {
    WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    inputElement.sendKeys(inputValue);
    logger.debug("Input <" + inputValue + "> to element by XPath <"+ elementXPath +">");
  }
  public void inputTextByName(String elementName, String inputValue) throws Exception {
    WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementName)));
    inputElement.sendKeys(inputValue);
    logger.debug("Input <" + inputValue + "> to element by Name <"+ elementName +">");
  }

  //Click button
  public void clickButtonByID(String elementID) throws Exception {
    WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
    Thread.sleep(1000);
    inputElement.click();
    logger.debug("click element by ID <"+ elementID +">");
  }
  public void clickButtonByXPath(String elementXPath) throws Exception {
    WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    Thread.sleep(1000); //Menu button doesn't show up immediately, need wait more time
    inputElement.click();
    logger.debug("click element by XPath <"+ elementXPath +">");
  }
  public void clickButtonByName(String elementName) throws Exception {
    WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementName)));
    Thread.sleep(1000);
    inputElement.click();
    logger.debug("click element by Name <"+ elementName +">");
  }

  //Get text
  public String getTextByID(String elementID) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
    logger.debug("get element content by ID <"+ elementID +">");
    return element.getText();
  }
  public String getTextByXPath(String elementXPath) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    logger.debug("get element content by XPath <"+ elementXPath +">");
    return element.getText();
  }
  public String getTextByName(String elementName) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementName)));
    logger.debug("get element content by Name <"+ elementName +">");
    return element.getText();
  }

  //Tick/Un-tick checkbox
  //TODO
  //element.isSelected is not working, need find a way to verify tick/non-tick
  public void tickCheckBoxByID(String elementID) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
    if(!element.isSelected()){
      element.click();
    }
  }
  public void tickCheckBoxByXPath(String elementXPath) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    if(!element.isSelected()){
      element.click();
    }
  }
  public void tickCheckBoxByName(String elementName) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementName)));
    if(!element.isSelected()){
      element.click();
    }
  }
  public void untickCheckBoxByID(String elementID) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
    if(element.isSelected()){
      element.click();
    }
  }
  public void unTickCheckBoxByXPath(String elementXPath) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
    if(element.isSelected()){
      element.click();
    }
  }
  public void unTickCheckBoxByName(String elementName) throws Exception {
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementName)));
    if(element.isSelected()){
      element.click();
    }
  }



  @AfterClass
  public void quitPage() {
    driver.close();
    driver.quit();
  }


}
