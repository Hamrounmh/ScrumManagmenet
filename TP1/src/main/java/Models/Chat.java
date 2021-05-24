package Models;

import Exceptions.NourritureNotFundExcepton;

public class Chat extends  Animal{

    public Chat(){
        super();
    }

    @Override
    public boolean manger(int quantite) throws NourritureNotFundExcepton {
        if(super.nouriture!=null){
            int poids=0;
            for ( Nouriture n:nouriture){
               poids+=(super.poids*quantite);
            }
            super.poids=poids/nouriture.size();
            super.vitesse+= super.vitesse * 0.1;
            return true;
        }else{
            throw new NourritureNotFundExcepton();
        }
    }


}
