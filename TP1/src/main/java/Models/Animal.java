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
        protected ArrayList<Nourriture> nourriture = new ArrayList<>();

        public Animal() {
        }

        public Animal(int vitesse, int poids, ArrayList<Nourriture> nourriture) {
            this.vitesse = vitesse;
            this.poids = poids;
            this.nourriture = nourriture;
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

        public ArrayList<Nourriture> getNouriture() {
            return nourriture;
        }

        public void AddNouriture(Nourriture nourriture) {
            this.nourriture.add(nourriture);
        }

        public abstract boolean manger(int quantite) throws NourritureNotFundExcepton;

    }
