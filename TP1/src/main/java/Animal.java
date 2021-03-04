    
    /**
     * Décrivez votre classe Animal ici.
     *
     * @author (votre nom)
     * @version (un numéro de version ou une date)
     */
    public class Animal
    {
        // les Attributs
        private String race;
        private int vitesse;
        private Nouriture nouriture;
        /**
         * Constructeur d'objets de classe Animal
         */
        public Animal()
        {
            // initialisation des variables d'instance
            this.race = "carnivore";
            this.vitesse= 0;
        }
    
        /**
         * les Méthodes
         * 
         */
        public void setRace(String Race)
        {
            // Insérez votre code ici
            this.race=Race;
        }
        
        public void setVitesse (int vitesseAnimal)
        {
            this.vitesse=vitesseAnimal;
        }
        
        public String getRace()
        {
            return this.race;
        }
        
        public int getVitesse()
        {
            return this.vitesse;
        }
        
        public void setNouriture (Nouriture nouriture)
        {
            this.nouriture=nouriture;
        }
        
        
        public boolean estCarnivore()
        {
            if(this.nouriture.type.toLowerCase()=="viande")
               return true;
            else
                return false;
        }
        
        
        
    }
