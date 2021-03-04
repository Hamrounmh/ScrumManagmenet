
/**
 * Décrivez votre classe Nouriture ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Nouriture
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public String nom;
    public int coeff;

    public Nouriture(String nom, int coeff) {
        this.nom = nom;
        this.coeff = coeff;
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
}
