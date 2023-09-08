import java.util.Scanner;

public class Humain extends Joueur{
    public Humain(String nom) {
        super(nom);
    }

    @Override
    public void choisitUncoup(){
        Scanner sc = new Scanner(System.in);
        setCoupCourant(Coup.saisirCoup(sc));
    }
}
