

import static org.junit.jupiter.api.Assertions.*;

import Models.Animal;
import Models.Nouriture;
import Exceptions.NourritureNotFundExcepton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class testAnimal
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
   protected Animal animal1;
   protected Nouriture nouriture;

   protected int quantite ;
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

         quantite = 10;

         nouriture=new Nouriture();
         nouriture.setNom("viande");
         nouriture.setCoeff(10);


         animal1= new Animal(75,5);
         animal1.AddNouriture(nouriture);


        
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
    public void testMangerList() throws NourritureNotFundExcepton {
        Nouriture nouriture2=new Nouriture("eau",10);
        Nouriture nouriture3=new Nouriture();
        ArrayList<Nouriture> listNouriture = new ArrayList<Nouriture>();

        listNouriture.add(nouriture);
        testMangeroK();
        listNouriture.add(nouriture2);
        testMangeroK();
        listNouriture.add(nouriture3);
        testMangernOToK();

    }

    @Test
    public void testMangeroK() throws NourritureNotFundExcepton {

        int ancienPoids = animal1.getPoids();
        int ancienneVitesse = animal1.getVitesse();

        animal1.manger(quantite);

        assertTrue(animal1.getPoids()==ancienPoids * quantite * 10 );
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
    public void testMangerNoNourittureException() throws Exceptions.NourritureNotFundExcepton {
        int quantite = 10;
        int ancienPoids = animal1.getPoids();
        int ancienneVitesse = animal1.getVitesse();

        animal1.setNouriture(null);


        assertThrows(Exceptions.NourritureNotFundExcepton.class, animal1.manger(quantite));


    }*/
}

