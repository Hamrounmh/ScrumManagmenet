package Models;

import java.util.*;

public class Film {

    private ArrayList<String> horaires;
    private String name;

    public Film(String name){
        this.name = name;
        this.horaires = new ArrayList<>();
    }

    public List<String> getHoraires() {
        return horaires;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addHoraire(String horaire){
        this.horaires.add(horaire);
    }

}
