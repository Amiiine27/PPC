public class Partie {
    private int nbToursMax;
    private Joueur joueur1;
    private Joueur joueur2;
    private int nbTour = 0;

    public Partie(Joueur joueur1,Joueur joueur2,int nbToursMax) throws PasTour{
        if(nbToursMax >0){
            nbToursMax = nbToursMax;
            joueur1 = joueur1;
            joueur2 = joueur2;
        }
        else throw new PasTour();
    }

    public void resoudreTour(){
        Coup coupJoueur1 = joueur1.getCoupCourant();
        Coup coupJoueur2 = joueur2.getCoupCourant();

        if(coupJoueur1.bat(coupJoueur2)){
            joueur1.setScore(joueur1.getScore() + 1);
        }else if(coupJoueur2.bat(coupJoueur1)){
            joueur2.setScore(joueur2.getScore() + 1);
        }else{
            return;
        }
    }
    public void unTour(){
        while(nbTour != nbToursMax){

        }
    }
}
