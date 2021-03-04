

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testAnimal
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
   protected Animal animal1;
   protected Nouriture nouriture;

    /**
     * Constructeur de la classe-test testAnimal
     */
    public testAnimal()
    {
    
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // ;Initialisez ici vos engagements
         
         nouriture=new Nouriture();
         nouriture.setNom("viande");
         nouriture.setCoeff(10);
         animal1= new Animal(75,5);
         animal1.setNouriture(nouriture);


        
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testMangeroK() throws NourritureNotFundExcepton {
        int quantite = 10;
        int ancienPoids = animal1.getPoids();
        int ancienneVitesse = animal1.getVitesse();

        animal1.manger(quantite);

        assertTrue(animal1.getPoids()==500 );
        assertTrue(animal1.getVitesse()==75);
    }

    @Test
    public void testMangernOToK() throws NourritureNotFundExcepton {
        int quantite = 10;
        int ancienPoids = animal1.getPoids();
        int ancienneVitesse = animal1.getVitesse();

        animal1.manger(quantite);

        assertFalse(animal1.getPoids()==200 );
        assertFalse(animal1.getVitesse()==2);
    }
   /* @Test
    public void testMangerNoNourittureException() throws NourritureNotFundExcepton {
        int quantite = 10;
        int ancienPoids = animal1.getPoids();
        int ancienneVitesse = animal1.getVitesse();

        animal1.setNouriture(null);


        assertThrows(NourritureNotFundExcepton.class, animal1.manger(quantite));


    }*/
}

