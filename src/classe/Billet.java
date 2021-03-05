package classe;

import java.util.Objects;

public class Billet {

    int prix;
    String classe;
    int nVoyage;
    int nSiege;
    String owner;
    boolean calme;
    boolean wifi;
    boolean prise;
    boolean carre;
    boolean velo;
    String assurance;
    boolean reductible;
    int nBillet;

    public Billet(int prix, String classe, int nVoyage, int nSiege, String owner, boolean calme, boolean wifi, boolean prise, boolean carre, boolean velo, String assurance, boolean reductible, int nBillet) {
        this.prix = prix;
        this.classe = classe;
        this.nVoyage = nVoyage;
        this.nSiege = nSiege;
        this.owner = owner;
        this.calme = calme;
        this.wifi = wifi;
        this.prise = prise;
        this.carre = carre;
        this.velo = velo;
        this.assurance = assurance;
        this.reductible = reductible;
        this.nBillet = nBillet;

    }

    public int getPrix() {
        return this.prix;
    }

    public String getClasse() {
        return this.classe;
    }

    public int getnVoyage() {
        return this.nVoyage;
    }

    public int getnSiege() {
        return this.nSiege;
    }

    public String getOwner() {
        return this.owner;
    }

    public boolean isCalme() {
        return this.calme;
    }

    public boolean isWifi() {
        return this.wifi;
    }

    public boolean isPrise() {
        return this.prise;
    }

    public boolean isCarre() {
        return this.carre;
    }

    public boolean isVelo() {
        return this.velo;
    }

    public String getAssurance() {
        return this.assurance;
    }

    public boolean isReductible() {
        return this.reductible;
    }

    public int getnBillet() {
        return this.nBillet;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "com.company.Main.Billet{" +
                "prix=" + this.prix +
                ", classe='" + this.classe + '\'' +
                ", nVoyage=" + this.nVoyage +
                ", nSiege=" + this.nSiege +
                ", owner='" + this.owner + '\'' +
                ", calme=" + this.calme +
                ", wifi=" + this.wifi +
                ", prise=" + this.prise +
                ", carre=" + this.carre +
                ", velo=" + this.velo +
                ", assurance='" + this.assurance + '\'' +
                ", reductible=" + this.reductible +
                ", nBillet=" + this.nBillet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billet billet = (Billet) o;
        return getPrix() == billet.getPrix() && getnVoyage() == billet.getnVoyage() && getnSiege() == billet.getnSiege() && isCalme() == billet.isCalme() && isWifi() == billet.isWifi() && isPrise() == billet.isPrise() && isCarre() == billet.isCarre() && isVelo() == billet.isVelo() && isReductible() == billet.isReductible() && getnBillet() == billet.getnBillet() && Objects.equals(getClasse(), billet.getClasse()) && Objects.equals(getOwner(), billet.getOwner()) && Objects.equals(getAssurance(), billet.getAssurance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrix(), getClasse(), getnVoyage(), getnSiege(), getOwner(), isCalme(), isWifi(), isPrise(), isCarre(), isVelo(), getAssurance(), isReductible(), getnBillet());
    }
}

