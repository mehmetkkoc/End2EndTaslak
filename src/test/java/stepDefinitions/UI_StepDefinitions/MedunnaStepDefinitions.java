package stepDefinitions.UI_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaStepDefinitions {


    MedunnaPage medunnaPage=new MedunnaPage();

    @Given("Medunna anasayfasina gider")
    public void medunna_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Account simgesine tiklar")
    public void account_simgesine_tiklar() {
    medunnaPage.accountLinki.click();

    }

    @When("Register sayfasina gider")
    public void register_sayfasina_gider() {
        medunnaPage.registerLink.click();

    }

    @Then("SSN in {int}. karakterin {string} olmasi gerektigini test eder")
    public void ssn_in_karakterin_olmasi_gerektigini_test_eder(Integer int1, String string) {
    Faker faker=new Faker();


        medunnaPage.ssnTextbox.sendKeys(faker.idNumber().ssnValid());
    }

    @Then("SSN in {int} rakamdan olusabilecegini test eder")
    public void ssn_in_rakamdan_olusabilecegini_test_eder(Integer int1) {

    }

    @Then("SSN textbox inin bos birakilamayacagini test eder")
    public void ssn_textbox_inin_bos_birakilamayacagini_test_eder() {

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {

    }
}
