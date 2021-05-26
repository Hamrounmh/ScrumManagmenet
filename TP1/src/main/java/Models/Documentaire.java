package Models;

import java.util.ArrayList;

public class Documentaire extends FilmAdapterToDocumentary {

    private ArrayList<Animal> animals;

    public Documentaire(Film film, ArrayList<Animal> animals) {
        super(film);
        this.animals = animals;
    }
    public Documentaire(Film film) {
        super(film);
        this.animals = new ArrayList<>();
    }

    public Documentaire() {
        super();
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public boolean isAnimalier(){
            return !animals.isEmpty();
    }

}
