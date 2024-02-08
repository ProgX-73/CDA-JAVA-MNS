package distributeursBoissons.magasin.hapsatou;
public class Emplacement {
    private int colonne;
    private String rangee;
    private String place;

    public Emplacement(int colonne, String rangee, String place) {
        this.colonne = colonne;
        this.rangee = rangee;
        this.place = place;
    }


    public int getColonne() {
        return colonne;
    }

    public String getRangee() {
        return rangee;
    }

    public String getPlace() {
        return place;
    }
}