package Models;

import java.util.*;

public class Film {

    private Salle salle;
    private ArrayList<Animal> animals;
    private ArrayList<String> horaires;
    private String name;

    public Film(String name){
        this.name = name;
        this.animals = new ArrayList<>();
        this.horaires = new ArrayList<>();
    }
    public Film(){
        this.name="";
        this.horaires=new ArrayList<>();
    }

    public List<Animal> getAnimals(){
        return this.animals;
    }
    public Salle getSalle() {
        return salle;
    }
    public List<String> getHoraires() {
        return horaires;
    }
    public String getName() {
        return name;
    }
    public void setSalle(Salle salle) { this.salle = salle;}
    public void setName(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
    public void addHoraire(String horaire){
        this.horaires.add(horaire);
    }

}
