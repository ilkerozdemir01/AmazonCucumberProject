package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    @Given("amazon sayfasına gidilir")
    public void amazonSayfasınaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("sayfa basligi yazdirilir")
    public void sayfaBasligiYazdirilir() {
        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("sayfa basliginda amazon yazısı oldugu test edilir")
    public void sayfaBasligindaAmazonYazısıOlduguTestEdilir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}
