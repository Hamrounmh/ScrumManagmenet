

import static org.junit.jupiter.api.Assertions.*;

import Models.Animal;
import Models.Chat;
import Models.Chien;
import Models.Nourriture;
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
   protected Animal chien;
   protected Animal chat;
   protected Nourriture nourriture;

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

         nourriture =new Nourriture();
         nourriture.setNom("viande");
         nourriture.setCoeff(10);

         //chien
         chien = new Chien(75,5);
         chien.AddNouriture(nourriture);

         //chat
         chat= new Chat(50,4);
         chat.AddNouriture(nourriture);

        
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
        Nourriture nourriture3 =new Nourriture();
        ArrayList<Nourriture> listNourriture = new ArrayList<>();

        listNourriture.add(nourriture);
        testMangeroK();
        listNourriture.add(nourriture3);
        testMangernOToK();

    }

    @Test
    public void testMangeroK() throws NourritureNotFundExcepton {
        chien.manger(quantite);
        int chien_ancien_poids= chien.getPoids();
        chat.manger(quantite);
        int chat_ancien_poids= chat.getPoids();

        assertEquals(chien.getPoids(),500);
        assertEquals(chien.getVitesse(),97);

        assertEquals(chat.getPoids(),400);
        assertEquals(chat.getVitesse(),55);
    }

    @Test
    public void testMangernOToK() throws NourritureNotFundExcepton {
        int quantite = 10;

        chien.manger(quantite);

        assertNotEquals(chien.getPoids(),200 );
        assertNotEquals(chien.getVitesse(),2);

        assertNotEquals(chat.getPoids(),150);
        assertNotEquals(chat.getVitesse(),6);
    }

}

