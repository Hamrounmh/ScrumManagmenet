package Models;

import java.util.ArrayList;


public class Cinema
{
    private String nom;
    private String ville;
    private int totplaces;
    private int nsalles;
    private final ArrayList<Salle> salles;

    public Cinema()
    {
        this.salles = new ArrayList();
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public int getTotplaces() {
        return totplaces;
    }

    public ArrayList<Salle> getSalles() {
        return salles;
    }

    public int getNsalles() {
        return nsalles;
    }

    public void setNsalles(int nsalles) {
        this.nsalles = nsalles;
    }

    public int getNombreSalles(){
        return salles.size();
    }

    public void addSalle(Salle s){
        s.setNumero(this.salles.size()+1);
        salles.add(s);
        s.setCinema(this);
        this.nsalles = salles.size();
        totplaces = this.totplaces + s.getPlaces();
    }
      
   public String showCinema(){
        return "Ce cinema s'appelle " + this.getNom() + " et se trouve a " + this.getVille();
  }
  
  public String afficherSalles(){
      String s;
      s = "le cinema contient " + this.getNombreSalles() + " salles";
      return s;
    }


}


