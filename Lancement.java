public class Lancement {
    public static void main(String[] args) throws PasTour {
        Joueur j1 = new Humain("Amine");
        Joueur j2 = new Humain("Fael");
        Partie p1 = new Partie(j1,j2,5);
        p1.go();
    }
}
