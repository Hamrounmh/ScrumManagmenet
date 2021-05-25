import Models.*;
import io.cucumber.java.eo.Do;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentaireTest {

        private Documentaire documentaire1;
        private Documentaire documentaire2;
        private FilmAdapterToDocumentary filmAdpDoc1;
        private FilmAdapterToDocumentary filmAdpDoc2;
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
        filmAdpDoc1 = new FilmAdapterToDocumentary(film1);
        filmAdpDoc1.setChaineDeCreation("ARTE");


        animal1 = new Chien();
        animal1.setPoids(10);
        animal1.setVitesse(65);

        animal2 = new Chat();
        animal2.setVitesse(40);
        animal2.setPoids(5);

        documentaire1=new Documentaire();
        documentaire1.setFilmAdapterToDocumentary(filmAdpDoc1);
        documentaire1.addAnimal(animal1);
        documentaire1.addAnimal(animal2);

        film2 = new Film("les mystres de la vie sur la planete Terre");
        film2.addHoraire("13h:30");

        filmAdpDoc2 = new FilmAdapterToDocumentary(film2);
        filmAdpDoc2.setChaineDeCreation("TF1");

        documentaire2 = new Documentaire();
        documentaire2.setFilmAdapterToDocumentary(filmAdpDoc2);
        // dans ce documentaire on n'ajoute pas d'animaux
        }

    @Test
    public void testIsAnimalier(){
       assertTrue(documentaire1.isAnimalier());
       assertFalse(documentaire2.isAnimalier());
    }
}
