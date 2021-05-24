package Models;

public class Salle
{
    private int numero;
    private int places;
    private Cinema cinema;

    public Salle() {}

    public void setNumero(int numero){this.numero = numero; }
    public int getNumero(){
        return this.numero;
    }
    public void setPlaces(int places) {
        this.places = places;
    }
    public int getPlaces(){
        return this.places;
    }
    public Cinema getCinema() { return this.cinema;}
    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

}

