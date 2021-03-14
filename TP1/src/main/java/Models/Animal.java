package Models;

import Exceptions.NourritureNotFundExcepton;

import java.util.ArrayList;

/**
     * Décrivez votre classe Animals.Animal ici.
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

        public boolean manger(int quantite) throws NourritureNotFundExcepton {
            if(nouriture!=null){
                this.poids=this.nouriture.stream().map(x -> x.getCoeff()* this.poids * quantite).reduce(0,(x,y) -> x+y);
                this.vitesse+= this.vitesse * 0.2;
                return true;
            }else{
                throw new NourritureNotFundExcepton();
            }

        }

        public static void main(String[] args) {
            Animal animal = new Animal(7     ,99   );
            Nouriture nou = new Nouriture("tt",9);
            animal.AddNouriture(nou); animal.AddNouriture(new Nouriture("tt",2));
            try {
                animal.manger(10);
            } catch (NourritureNotFundExcepton nourritureNotFundExcepton) {
                nourritureNotFundExcepton.printStackTrace();
            }

        }

    }
