import Models.Cinema;
import Models.Salle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewCinemaTest {
    private Salle salle1;
    private Salle salle2;
    private Cinema cinema;

    public NewCinemaTest() { }

    @BeforeEach
    public void setUp(){
        salle1 = new Salle( );
        salle2 = new Salle();
        salle1.setPlaces(60);
        salle2.setPlaces(40);
        cinema = new Cinema();
        cinema.setNom("UGC");
        cinema.setVille("Bercy");
        cinema.addSalle(salle1);
        cinema.addSalle(salle2);
    }


    @Test
    public void showCinemaTest() { Assertions.assertTrue("Ce cinema s'appelle UGC et se trouve a Bercy".equals(cinema.showCinema())); }
    @Test
    public void NbPlacesTest() { Assertions.assertTrue(100==cinema.getTotplaces()); }
    @Test
    public void getCinemaTest() {Assertions.assertTrue(cinema.equals(salle1.getCinema())); }
}
