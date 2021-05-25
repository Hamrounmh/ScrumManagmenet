package Models;

import java.util.ArrayList;

public class Documentaire {
    private FilmAdapterToDocumentary filmAdapterToDocumentary ;
    private ArrayList<Animal> animals;

    public Documentaire(FilmAdapterToDocumentary filmAdapterToDocumentary, ArrayList<Animal> animals) {
        this.filmAdapterToDocumentary = filmAdapterToDocumentary;
        this.animals = animals;
    }
    public Documentaire(FilmAdapterToDocumentary filmAdapterToDocumentary) {
        this.filmAdapterToDocumentary = filmAdapterToDocumentary;
        this.animals = new ArrayList<>();
    }

    public Documentaire() {
        this.filmAdapterToDocumentary = null;
        this.animals = new ArrayList<>();
    }

    public FilmAdapterToDocumentary getFilmAdapterToDocumentary() {
        return filmAdapterToDocumentary;
    }

    public void setFilmAdapterToDocumentary(FilmAdapterToDocumentary filmAdapterToDocumentary) {
        this.filmAdapterToDocumentary = filmAdapterToDocumentary;
    }
    public void addAnimal(Animal a){
        animals.add(a);
    }

    public boolean isAnimalier(){
            return !animals.isEmpty();
    }

}
