public class Partie {
    private int nbToursMax;
    private Joueur joueur1;
    private Joueur joueur2;

    public Partie(Joueur joueur1,Joueur joueur2,int nbToursMax) throws PasTour{
        if(nbToursMax >0){
            nbToursMax = nbToursMax;
            joueur1 = joueur1;
            joueur2 = joueur2;
        }
        else throw new PasTour();
    }

    public void go(){
        while(nbToursMax >0){
            unTour();
        }
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

    public int getNbToursMax(){
        return nbToursMax;
    }
    public void SetNbToursMax(int nbTour){
        nbToursMax = nbTour;
    }
    public void unTour(){
            SetNbToursMax(getNbToursMax() - 1);
            joueur1.choisitUncoup();
            joueur2.choisitUncoup();
            resoudreTour();
        }
    }
