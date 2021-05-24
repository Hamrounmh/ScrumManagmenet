package Models;

import Exceptions.NourritureNotFundExcepton;

import java.util.ArrayList;

public class Chien extends Animal{

    public Chien(){
        super();
    }
    public Chien(int vitesse, int poids) {
        super(vitesse,poids);
    }
    public Chien(int vitesse, int poids, ArrayList<Nourriture> nourriture){
        super(vitesse,poids, nourriture);
    }

    @Override
    public boolean manger(int quantite) throws NourritureNotFundExcepton {
        if(super.nourriture !=null){
            super.poids=super.nourriture.stream().map(x -> x.getCoeff()* super.poids * quantite).reduce(0,(x, y) -> x+y);
            super.vitesse+= super.vitesse * 0.3;
            return true;
        }else{
            throw new NourritureNotFundExcepton();
        }

    }
}
