import Models.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.cucumber.java.eo.Do;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentaryStepDef {
    Film film1;
    FilmAdapterToDocumentary filmAdpDoc1;
    Animal animal;
    Documentaire documentaire= new Documentaire();
    @Given("^un documentaire$")
    public void unDocumentaire() {
        assertNotNull(documentaire);
    }

    @And("^un film avec un (.*) et une (.*)$")
    public void unFilmAvecUnNom(String nom, String horaire) {
        film1 = new Film(nom);
        film1.addHoraire(horaire);
    }

    @And("^une (.*)$")
    public void UneChaineDeCreation(String chaineDeCreation) {
        documentaire= new Documentaire(film1);
        documentaire.setChaineDeCreation(chaineDeCreation);

    }

    @And("^un Animal avec (\\d+) et (\\d+)$")
    public void unAnimalAvecPoidsEtVitesse(int poids, int vitesse) {
        animal = new Chien();
        animal.setPoids(poids);
        animal.setVitesse(vitesse);
    }

    @When("^l'animal est ajouté$")
    public void lAnimalEstAjouté() {
        documentaire.addAnimal(animal);
    }

    @Then("^le Documentaire devient un Documentaire (.*)$")
    public void leDocumentaireDevientUnDocumentaireAnimalier(String Animalier) {
        assertEquals(Boolean.toString(documentaire.isAnimalier()),Animalier);
    }
}
