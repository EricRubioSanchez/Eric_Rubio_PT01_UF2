public class Llibre extends Producte {
    boolean tapaDura;

    public Llibre(String nom, float preu, boolean tapaDura) {
        super(nom, preu, 4);
        this.tapaDura = tapaDura;
    }

    public String getInfo() {
        return "Nom: " + nom + "\n" +
                "Preu: " + preu + "\n" +
                "Iva: " + iva + "\n" +
                "Tapa Dura: " + tapaDura+"\n";
    }
}
