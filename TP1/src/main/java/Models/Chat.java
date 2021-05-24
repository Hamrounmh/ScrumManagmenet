package Models;

import Exceptions.NourritureNotFundExcepton;

import java.util.ArrayList;

public class Chat extends  Animal{

    public Chat() {
        super();
    }

    public Chat(int vitesse, int poids, ArrayList<Nourriture> nourriture) {
        super(vitesse,poids, nourriture);
    }


    public Chat(int vitesse, int poids) {
        super(vitesse,poids);
    }



    @Override
    public boolean manger(int quantite) throws NourritureNotFundExcepton {
        if(super.nourriture !=null){
            int poids=0;
            for ( Nourriture n: nourriture){
               poids+=(super.poids*quantite*n.coeff);
            }
            super.poids=poids/ nourriture.size();
            super.vitesse+= super.vitesse * 0.1;
            return true;
        }else{
            throw new NourritureNotFundExcepton();
        }
    }


}
