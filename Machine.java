import java.io.StringReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Machine extends Joueur {

    private static final ArrayList<String> coupsPossibles = new ArrayList<>();
    private static final Random random = new Random();

    static {
        coupsPossibles.add("pierre");
        coupsPossibles.add("papier");
        coupsPossibles.add("ciseaux");
    }

    public Machine(String nom) {
        super(nom);
    }

    @Override
    public void choisitUncoup() {

        int indexAleatoire = random.nextInt(coupsPossibles.size());
        Scanner scanner = new Scanner(new StringReader((coupsPossibles.get(indexAleatoire))));

        try {
            setCoupCourant(Coup.saisirCoup(scanner));
        } catch (PasCoup e) {
            throw new RuntimeException(e);
        }
    }
}
