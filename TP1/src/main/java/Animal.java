    
    /**
     * Décrivez votre classe Animal ici.
     *
     * @author (votre nom)
     * @version (un numéro de version ou une date)
     */
    public class Animal
    {

        // les Attributs
        private int vitesse;
        private int poids;
        private Nouriture nouriture;

        public Animal() {
        }

        public Animal(int vitesse, int poids, Nouriture nouriture) {
            this.vitesse = vitesse;
            this.poids = poids;
            this.nouriture = nouriture;
        }

        public Animal(int vitesse, int poids) {
            this.vitesse = vitesse;
            this.poids = poids;

        }

        public int getVitesse() {
            return vitesse;
        }

        public void setVitesse(int vitesse) {
            this.vitesse = vitesse;
        }

        public int getPoids() {
            return poids;
        }

        public void setPoids(int poids) {
            this.poids = poids;
        }

        public Nouriture getNouriture() {
            return nouriture;
        }

        public void setNouriture(Nouriture nouriture) {
            this.nouriture = nouriture;
        }

        public void manger(int quantite) throws NourritureNotFundExcepton {
            if(nouriture!=null){
                this.poids = quantite * this.nouriture.coeff * this.poids;
                this.vitesse+= this.vitesse * (1/this.poids);
            }else{
                throw new NourritureNotFundExcepton();
            }

        }
    }
