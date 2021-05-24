import Exceptions.NourritureNotFundExcepton;
import Models.Animal;
import Models.Chien;
import Models.Nouriture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_0003StepDefTests {

    Animal animal = new Chien();
    Nouriture nourriture1;
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

    @When("^l'animal mange une (\\d+) de nouriture$")
    public void lAnimalMangeUneQuantiteDeNouriture(int quantite) {
        try{
            assertTrue(animal.manger(quantite ));

        }catch (NourritureNotFundExcepton e){

        }
    }


    @Then("^le poids de l'animal devient (\\d+) et la vitesse devient (\\d+)$")
    public void lePoidsDeLAnimalDevientNouveauPoidsEtLaVitesseDevientNouvelleVitesse(int nouveauPoids,int nouvelleVitesse) {
        assertTrue(animal.getVitesse()==nouvelleVitesse && animal.getPoids() == nouveauPoids);
    }

    @And("^On donne la nouriture (.*) et (\\d+)$")
    public void onDonneLaNouritureNomNouritureEtTauxDeGras(String nomNouriture,int TauxDeGras) {
        Nouriture nouriture = new Nouriture(nomNouriture,TauxDeGras);
        animal.AddNouriture(nouriture);
        assertTrue(animal.getNouriture().contains(nouriture));
    }



    @Then("^on a le message d'erreur suivant (.*)$")
    public void onALeMessageDErreurSuivantMessage(String message) {
        try{
            animal.manger(10 );

        }catch (NourritureNotFundExcepton e){
            assertTrue(e.getMessage().equals(message));
        }
    }


    @When("^l'animal mange$")
    public void lAnimalMange() {
        animal.setPoids(10);
        animal.setVitesse(5);
    }


    @Given("^une nourriture$")
    public void uneNourriture() {
         nourriture1= new Nouriture();
        assertTrue(nourriture1 instanceof Nouriture);
    }

    @And("^un (.*) et un (\\d+)$")
    public void unNomEtUnTauxDeGras(String nom, int tauxDeGras) {
        nourriture1.setCoeff(tauxDeGras);
        nourriture1.setNom(nom);
        assertTrue(nourriture1.getNom()==nom);
        assertTrue(nourriture1.getCoeff()==tauxDeGras);

    }


    @Then("^on retourne (\\d+)$")
    public void onRetourneNombreDeCalorie(int nbCalorie) {
        assertTrue(nbCalorie==nourriture1.nombreDeColorie());
    }
}
