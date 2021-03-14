import Models.Animal;
import io.cucumber.java.en.Given;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepsDefinitionTests {
    @Given("un animal avec <poids> et  <vitesse>")
    public void unAnimalAvecPoidsEtVitesse(int poids, int vitesse) {
        Animal chien = new Animal(vitesse,poids);
        assertTrue(chien!=null);
    }
}
