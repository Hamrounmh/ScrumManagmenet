import Models.*;
import io.cucumber.java.eo.Do;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentaireTest {

        private Documentaire documentaire1;
        private Documentaire documentaire2;

        private Film film1;
        private Film film2;
        private Animal animal1;
        private Animal animal2;

    public DocumentaireTest() {
    }

    @BeforeEach
    public void setUp() {
        film1 = new Film("Nos Animaux et nous");
        film1.addHoraire("20h:50");


        animal1 = new Chien();
        animal1.setPoids(10);
        animal1.setVitesse(65);

        animal2 = new Chat();
        animal2.setVitesse(40);
        animal2.setPoids(5);

        documentaire1=new Documentaire(film1);
        documentaire1.setChaineDeCreation("ARTE");
        documentaire1.addAnimal(animal1);
        documentaire1.addAnimal(animal2);

        film2 = new Film("les mystres de la vie sur la planete Terre");
        film2.addHoraire("13h:30");



        documentaire2 = new Documentaire(film2);
        documentaire1.setChaineDeCreation("TF1");

        // dans ce documentaire on n'ajoute pas d'animaux
        }

    @Test
    public void testIsAnimalier(){
       assertTrue(documentaire1.isAnimalier());
       assertFalse(documentaire2.isAnimalier());
    }
}
