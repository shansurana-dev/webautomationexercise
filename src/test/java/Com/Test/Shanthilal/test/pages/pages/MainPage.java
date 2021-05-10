package Com.Test.Shanthilal.test.pages.pages;

import Com.Test.Shanthilal.test.pages.base.PageObjectBase;
import Com.Test.Shanthilal.setup.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObjectBase {

  @FindBy(css = "img.logo")
  private WebElement logo;

  @FindBy(xpath = "//a[@title='Manage my personal information']")
  public WebElement personalInformation;

  @Override
  public void trait() {
    assertDisplayed(logo, 10);
  }

  @Override
  public void navigateHere() {
    loadEnv(Config.getEnv());
  }
  public void isPageReady() {
    trait();
  }
}
