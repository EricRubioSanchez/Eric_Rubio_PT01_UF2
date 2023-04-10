public class Roba extends Producte {
    String color;
    char talla;

    public Roba(String nom, float preu, char talla, String color) {
        super(nom, preu, 21);
        if (!tallaOK(talla)) throw new Error("La talla nomes pot ser S, M o L.");
        this.color = color;
        this.talla = talla;
    }

    public String getInfo() {
        return "Nom: " + nom + "\n" +
                "Preu: " + preu + "\n" +
                "Iva: " + iva + "\n" +
                "Color: " + color + "\n" +
                "Talla: " + talla+"\n";
    }

    boolean tallaOK(char t) {
        if (t == 'S' || t == 'M' || t == 'L') {
            return true;
        }
        return false;
    }
}
