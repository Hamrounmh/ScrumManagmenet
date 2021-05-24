import Exceptions.NourritureNotFundExcepton;
import Models.Animal;
import Models.Chien;
import Models.Nourriture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_0003StepDefTests {

    Animal animal = new Chien();
    Nourriture nourriture1;
    ArrayList<Nourriture> listeNourriture= new ArrayList<>();
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
            e.getMessage();
        }
    }


    @Then("^le poids de l'animal devient (\\d+) et la vitesse devient (\\d+)$")
    public void lePoidsDeLAnimalDevientNouveauPoidsEtLaVitesseDevientNouvelleVitesse(int nouveauPoids,int nouvelleVitesse) {
        assertTrue(animal.getVitesse()==nouvelleVitesse && animal.getPoids() == nouveauPoids);
    }

    @And("^On donne la nouriture (.*) et (\\d+)$")
    public void onDonneLaNouritureNomNouritureEtTauxDeGras(String nomNouriture,int TauxDeGras) {
        Nourriture nourriture = new Nourriture(nomNouriture,TauxDeGras);
        animal.AddNouriture(nourriture);
        assertTrue(animal.getNouriture().contains(nourriture));
    }



    @Then("^on a le message d'erreur suivant (.*)$")
    public void onALeMessageDErreurSuivantMessage(String message) {
        try{
            animal.manger(10 );

        }catch (NourritureNotFundExcepton e){
            assertEquals(e.getMessage(),message);
        }
    }


    @When("^l'animal mange$")
    public void lAnimalMange() {
        animal.setPoids(10);
        animal.setVitesse(5);
    }


    @Given("^une nourriture$")
    public void uneNourriture() {
         nourriture1= new Nourriture();
        assertTrue(nourriture1 instanceof Nourriture);
    }

    @And("^un (.*) et un (\\d+)$")
    public void unNomEtUnTauxDeGras(String nom, int tauxDeGras) {
        nourriture1.setCoeff(tauxDeGras);
        nourriture1.setNom(nom);
        assertSame(nourriture1.getNom(),nom);
        assertSame(nourriture1.getCoeff(),tauxDeGras);

    }


    @Then("^on retourne (\\d+)$")
    public void onRetourneNombreDeCalorie(int nbCalorie) {
        assertEquals(nbCalorie,nourriture1.nombreDeColorie());
    }
}
