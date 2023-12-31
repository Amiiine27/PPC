
import java.util.Objects;
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

    public static Coup saisirCoup(Scanner scan){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coup coup = (Coup) o;
        return Objects.equals(nom, coup.nom);
    }

    public boolean bat(Coup c) {
        if (this.getNom().equals("pierre") && c.getNom().equals("ciseau")) {
            return true;
        } else if (this.getNom().equals("papier") && c.getNom().equals("pierre")){
            return true;
        } else if (this.getNom().equals("ciseau") && c.getNom().equals("papier")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
