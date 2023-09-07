public class Coup {
    private String nom;

    public Coup(String nomCoup) throws PasCoup{
        if (nomCoup.equals("Pierre")||nomCoup.equals("Papier")||nomCoup.equals("Ciseau")){
            nom=nomCoup;
        }
        else throw new PasCoup();
    }
}
