public class Aliment extends Producte {
    int calories;
    boolean beguda;

    public Aliment(String nom, float preu, int calories, boolean beguda) {
        super(nom, preu, 10);
        if (!caloriesOK(calories)) throw new Error("Les calories no poden ni inferiors 0 ni superior a 1000.");
        this.beguda = beguda;
        this.calories = calories;
        if (beguda) iva = 21;

    }

    boolean caloriesOK(int calories) {
        if (calories < 0 || calories > 1000) {
            return false;
        }
        return true;
    }

    public String getInfo() {
        return "Nom: " + nom + "\n" +
                "Preu: " + preu + "\n" +
                "Iva: " + iva + "\n" +
                "Calories: "+ calories + "\n" +
                "Beguda: "+beguda+"\n";
    }
}
