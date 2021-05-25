import Models.Animal;
import Models.Chien;
import Models.Documentaire;
import Models.Nourriture;
import io.cucumber.java.en.Given;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocumentaryStepDef {

    Animal animal = new Chien();
    Nourriture nourriture1;
    ArrayList<Nourriture> listeNourriture= new ArrayList<>();
    Documentaire documentaire = new Documentaire();
    @Given("un documentaire")
    public void unDocumentaire() {
        assertTrue(documentaire instanceof Documentaire);

    }
}
