package Models;

/**
 * Décrivez votre classe Animals.Nouriture ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Nouriture
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public String nom;
    public int coeff;
    public int nbCalorie;

    public Nouriture(String nom, int coeff) {
        this.nom = nom;
        this.coeff = coeff;

        switch (nom){
            case "viande" : nbCalorie=143;  break;
            case "poivre"   : nbCalorie=251;  break;
            case "herbe"   : nbCalorie=150;  break;
            case "eau"   : nbCalorie=0;  break;

        }
    }

    public Nouriture() {


    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public int nombreDeColorie(){
        return nbCalorie;
    }

}
