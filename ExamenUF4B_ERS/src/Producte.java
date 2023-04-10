public abstract class Producte {
    String nom;
    float preu;
    int iva;

    public Producte(String nom, float preu, int iva) {
        if (!preuOK(preu)) throw new Error("No es pot tenir un preu inferior a 1.");
        this.nom = nom;
        this.preu = preu;
        this.iva = iva;
    }

    abstract String getInfo();


    boolean preuOK(float preu) {
        if (preu < 1) {
            return false;
        }
        return true;
    }

    public String getNom() {
        return nom;
    }

    public float pvp() {
        return (preu * (iva / 100)) + preu;
    }

    public int compare(Producte p, Producte p2) {
        return (int) (p.preu - p2.preu);
    }

}
