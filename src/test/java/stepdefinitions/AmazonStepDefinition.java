package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    @Given("amazon sayfasına gidilir")
    public void amazonSayfasınaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("sayfa basligi yazdirilir")
    public void sayfaBasligiYazdirilir() {
    }

    @Then("sayfa basliginda amazon yazısı oldugu test edilir")
    public void sayfaBasligindaAmazonYazısıOlduguTestEdilir() {
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
    }
}
