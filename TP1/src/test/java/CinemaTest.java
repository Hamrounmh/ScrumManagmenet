import static org.junit.jupiter.api.Assertions.*;

import Models.Cinema;
import Models.Salle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CinemaTest
{
    private Salle salle1;
    private Salle salle2;
    private Cinema cinema1;

    public CinemaTest()
    {
    }

    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        salle1 = new Salle();
        salle2 = new Salle();
        salle1.setPlaces(60);
        salle2.setPlaces(40);
        cinema1 = new Cinema();
        cinema1.addSalle(salle1);
        cinema1.addSalle(salle2);
    }

    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {

    }

    @Test
    public void TestAffichage()
    {
        Cinema cinema1 = new Cinema();
        cinema1.setNom("UGC");
        cinema1.setVille("Bercy");
        assertEquals("Ce cinema s'appelle UGC et se trouve a Bercy", cinema1.showCinema());
    }

    @Test
    public void TestNbPlaces()
    {
        assertEquals(100, cinema1.getTotplaces());
    }

    @Test
    public void TestAfficheSalles()
    {
        assertEquals("le cinema contient 2 salles", cinema1.afficherSalles());
    }
}



