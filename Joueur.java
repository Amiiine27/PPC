public abstract class Joueur {
    private String nom;
    private Integer score;
    private Coup coupCourant;

    public Joueur(String nom){
        this.nom = nom;
        this.score = 0;
    }

    public Coup getCoupCourant() {
        return coupCourant;
    }

    public void setCoupCourant(Coup coupCourant) {
        this.coupCourant = coupCourant;
    }

    public String getNom() {
        return nom;
    }
    public int getScore(){
        return score;
    }
    public abstract void choisitUncoup();

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", score=" + score +
                ", coupCourant=" + coupCourant +
                '}';
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
