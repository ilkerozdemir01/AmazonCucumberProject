package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage {
    public AmazonHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
