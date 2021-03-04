import java.util.ArrayList;
import java.util.stream.Collector;

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
        private ArrayList<Nouriture> nouriture = new ArrayList<Nouriture>();

        public Animal() {
        }

        public Animal(int vitesse, int poids, ArrayList<Nouriture> nouriture) {
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

        public ArrayList<Nouriture> getNouriture() {
            return nouriture;
        }

        public void AddNouriture(Nouriture nouriture) {
            this.nouriture.add(nouriture);
        }

        public void manger(int quantite) throws NourritureNotFundExcepton {
            if(nouriture!=null){
                this.poids=this.nouriture.stream().map(x -> x.getCoeff()* this.poids * quantite).reduce(0,(x,y) -> x+y);
                this.vitesse+= this.vitesse * (1/this.poids);
            }else{
                throw new NourritureNotFundExcepton();
            }

        }
    }
