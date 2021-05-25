package Models;

public class FilmAdapterToDocumentary {
    private Film film ;
    private String chaineDeCreation;
    private String TypeDocumentaire;
    public FilmAdapterToDocumentary(Film film) {
        this.film = film;
    }

    public String getChaineDeCreation() {
        return chaineDeCreation;
    }

    public void setChaineDeCreation(String chaineDeCreation) {
        this.chaineDeCreation = chaineDeCreation;
    }

    public String getTypeDocumentaire() {
        return TypeDocumentaire;
    }

    public void setTypeDocumentaire(String typeDocumentaire) {
        TypeDocumentaire = typeDocumentaire;
    }
}
