package Models;

import Exceptions.NourritureNotFundExcepton;

import java.util.ArrayList;

/**
     * Décrivez votre classe Animals.Animal ici.
     *
     * @author (votre nom)
     * @version (un numéro de version ou une date)
     */
    public abstract class Animal
    {

        // les Attributs
        protected int vitesse;
        protected int poids;
        protected ArrayList<Nouriture> nouriture = new ArrayList<Nouriture>();

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

        public abstract boolean manger(int quantite) throws NourritureNotFundExcepton;

    }
