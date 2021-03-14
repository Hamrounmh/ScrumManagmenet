import Exceptions.NourritureNotFundExcepton;
import Models.Animal;
import Models.Nouriture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_0003StepDefTests {
    Animal animal = new Animal();
    ArrayList<Nouriture> listeNourriture= new ArrayList<>();
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



    @And("On donne la nouriture (.*) (\\d+)")
    public void onDonneLaNouritureNomNouritureTauxDeGras(String nomNouriture,int TauxDeGras) {
        Nouriture nouriture = new Nouriture(nomNouriture,TauxDeGras);
        animal.AddNouriture(nouriture);
        assertTrue(animal.getNouriture().contains(nouriture));
    }

    @When("l'animal mange une (\\d+) de nouriture")
    public void lAnimalMangeUneQuantiteDeNouriture(int quantite) {
        try{
            assertTrue(animal.manger(quantite));

        }catch (NourritureNotFundExcepton e){

        }
    }

    @Then("le poids de l'animal devient (\\d+) et la vitesse devient (\\d+)")
    public void lePoidsDeLAnimalDevientNouveauPoidsEtLaVitesseDevientNouvelleVitesse(int nouveauPoids,int nouvelleVitesse) {
        assertTrue(animal.getVitesse()==nouvelleVitesse && animal.getPoids() == nouveauPoids);
    }
}
