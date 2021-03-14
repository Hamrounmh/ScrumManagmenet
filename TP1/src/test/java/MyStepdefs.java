import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static junit.framework.Assert.assertTrue;

public class MyStepdefs {

  @Given("un animal")
  public void unAnimal(int poids,int vitesse) {
    assertTrue(1==1);
  }


  @And("avec <poids> et <vitesse>")
  public void avecPoidsEtVitesse(int poids, int vitesse) {
    assertTrue(1==1); }


  @Then("verifiee")
  public void verifiee() {
    assertTrue(1==1);
  }

}
