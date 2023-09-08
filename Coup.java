import java.util.Scanner;

public class Coup {
    private String nom;

    public Coup(String nomCoup) throws PasCoup{
        if (nomCoup.equals("Pierre")||nomCoup.equals("Papier")||nomCoup.equals("Ciseau")){
            nom=nomCoup;
        }
        else throw new PasCoup();
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Coup{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public static Coup saisirCoup(Scanner scan) throws PasCoup {
        Coup c = null;
        boolean ok =false;
        while (!ok) {
            try {
                c = new Coup(scan.nextLine());
                String s = scan.nextLine();
                System.out.println("ok");
                return c;
            } catch (PasCoup e){
                System.out.println("pas ok");
            }
        }
        return c;
    }


}
