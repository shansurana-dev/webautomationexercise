package Com.Test.Shanthilal.test.pages.pages;

import Com.Test.Shanthilal.test.pages.base.PageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends PageObjectBase {

  /**
   * ALREADY REGISTERED
   **/
  //VIEW//
  @FindBy(how = How.XPATH, using = "//h1[@itemprop='name']")
  public WebElement productName;

  //POPUP//
  @FindBy(how = How.XPATH, using = "//div[@id='layer_cart']//div[@class='clearfix']")
  public WebElement popupPaneProductDetails;

  //POPUP LEFT SIDE//
  @FindBy(how = How.XPATH, using = "//div[@id='layer_cart']//div[@class='clearfix']//i[@class='icon-ok']//parent::h2")
  public WebElement popupPaneAddedSuccessfully;

  @FindBy(how = How.XPATH, using = "//span[@id='layer_cart_product_title']")
  public WebElement popupPaneCartProductName;

  @FindBy(how = How.XPATH, using = "//span[@id='layer_cart_product_quantity']")
  public WebElement popupPaneCartProductQuantity;

  //POPUP BUTTONS//
  @FindBy(how = How.XPATH, using = "//a[@class='btn btn-default button button-medium']")
  public WebElement proceedToCheckoutButton;

  //BUTTONS & INPUTS & DROPDOWN//
  @FindBy(how = How.XPATH, using = "//input[@id='quantity_wanted']")
  public WebElement quantityInput;

  @FindBy(how = How.XPATH, using = "//div[@id='uniform-group_1']//select")
  public WebElement sizeDropdown;

  @FindBy(how = How.XPATH, using = "//div[@id='uniform-group_1']//span")
  public WebElement readSizeDropdown;

  @FindBy(how = How.XPATH, using = "//a[@title='Blue']")
  public WebElement blueColorButton;

  @FindBy(how = How.XPATH, using = "//a[@title='Orange']")
  public WebElement orangeColorButton;

  @FindBy(how = How.XPATH, using = "//a[@class='color_pick selected']")
  public WebElement readChosenColor;

  @FindBy(how = How.XPATH, using = "//p[@id='add_to_cart']//span[text()='Add to cart']")
  public WebElement addToCartButton;

  @Override
  public void trait() {
    assertDisplayed(productName, 5);
  }

  @Override
  public void navigateHere() {
    trait();
  }
}
