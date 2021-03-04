

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
   protected Animal Animal1;
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
         nouriture.setTypeNouriture("viande");
         Animal1= new Animal();
         Animal1.setNouriture(nouriture);
         
        
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
    public void testEstCarnivore()
    {
        assertTrue(Animal1.estCarnivore()==true);
    }
}

