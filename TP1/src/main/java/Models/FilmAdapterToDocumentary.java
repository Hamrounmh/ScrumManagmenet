package Models;

import java.util.List;

public class FilmAdapterToDocumentary {
    private Film film ;
    private String chaineDeCreation; // NATGEAO, ART , TF1

    public FilmAdapterToDocumentary(Film film) {
        this.film = film;
    }

    public String getChaineDeCreation() {
        return chaineDeCreation;
    }

    public void setChaineDeCreation(String chaineDeCreation) {
        this.chaineDeCreation = chaineDeCreation;
    }


    public List<String> getHoraires() {
        return film.getHoraires();
    }
    public String getName() {
        return film.getName();
    }
    public void setName(String name) {
        film.setName(name);
    }

    public void addHoraire(String horaire){
        film.addHoraire(horaire);
    }
}
