package Com.Test.Shanthilal.test.pages.pages;

import Com.Test.Shanthilal.test.pages.base.PageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage extends PageObjectBase {

  /**
   * GLOBAL
   **/
  //VIEW//
  @FindBy(how = How.XPATH, using = "//span[@class='navigation_page']")
  public WebElement navigationTopLabelHeader;

  //BUTTONS & INPUTS & DROPDOWN//
  @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Proceed to checkout')]//i[@class='icon-chevron-right right'])[2]")
  public WebElement proceedToCheckoutButton;

  @FindBy(how = How.XPATH, using = "//button[@class='button btn btn-default button-medium']//span")
  public WebElement iConfirmMyOrderButton;

  //BUTTONS & INPUTS & DROPDOWN//
  @FindBy(how = How.XPATH, using = "//a[@title='Back to orders']")
  public WebElement backToOrders;

  /**
   * SHIPPING
   **/
  //VIEW//
  @FindBy(how = How.XPATH, using = "//td[@class='delivery_option_radio']//input")
  public WebElement myCarrierRadioButton;

  //BUTTONS & INPUTS & DROPDOWN//
  @FindBy(how = How.XPATH, using = "//input[@name='cgv']")
  public WebElement tosCheckbox;

  /**
   * YOUR PAYMENT METHOD
   **/
  //VIEW//
  @FindBy(how = How.XPATH, using = "//a[@class='bankwire']")
  public WebElement bankWirePaymentBox;

  @FindBy(how = How.XPATH, using = "//a[@class='cheque']")
  public WebElement chequePaymentBox;

  @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div")
  public WebElement orderConfirmation;

  /**
   * Order confirmation
   **/
  //MESSAGES//
  @FindBy(how = How.XPATH, using = "//p[@class='cheque-indent']//strong")
  public WebElement orderSuccessful;

  @Override
  public void trait() {
    assertDisplayed(navigationTopLabelHeader,10);
  }

  @Override
  public void navigateHere() {
    trait();
  }
}