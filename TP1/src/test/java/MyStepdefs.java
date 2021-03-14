import Models.Animal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStepdefs {
    Animal animal = new Animal();
    @Given("^un animal$")
    public void unAnimal() {

        assertTrue(animal instanceof Animal);

    }

    @And("^avec (\\d+) et (\\d+)$")
    public void avecPoidsEtVitesse(int poids,int vitesse) {
        animal.setPoids(poids);
        animal.setVitesse(vitesse);
        assertTrue(animal.getVitesse()==vitesse && animal.getPoids() == poids);
    }

    @Then("^verifiee$")
    public void verifiee() {
        assertTrue(1==1);
    }

    @And("On donne la nouriture <nomNouriture> <TauxDeGras>")
    public void onDonneLaNouritureNomNouritureTauxDeGras() {
    }
}
