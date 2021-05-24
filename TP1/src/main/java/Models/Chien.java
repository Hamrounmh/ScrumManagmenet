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
    public Chien(int vitesse, int poids, ArrayList<Nouriture> nouriture){
        super(vitesse,poids,nouriture);
    }

    @Override
    public boolean manger(int quantite) throws NourritureNotFundExcepton {
        if(super.nouriture!=null){
            super.poids=super.nouriture.stream().map(x -> x.getCoeff()* super.poids * quantite).reduce(0,(x,y) -> x+y);
            super.vitesse+= super.vitesse * 0.3;
            return true;
        }else{
            throw new NourritureNotFundExcepton();
        }

    }
}
