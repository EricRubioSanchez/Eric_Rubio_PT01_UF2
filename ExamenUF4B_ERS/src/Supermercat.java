import java.util.ArrayList;

public class Supermercat {
    static ArrayList<Producte> productes = new ArrayList<Producte>();
    public static void afegirProducte(Producte p) {
        try {
            productes.add(p);
            System.out.println("S'ha agregat el producte a la llista.");
        }catch (Error e){
            System.out.println("Error afegint el producte");
        }
    }

    public static void eliminarProducte(String n) {
        for (int i = 0; i < productes.size(); i++) {
            if (productes.get(i).getNom().equals(n)) {
                productes.remove(i);
                System.out.println("Producte eliminat de la llista");
                return;
            }
        }
        System.out.println("No es troba en la llista");
    }

    public static ArrayList<Producte> filtarCotxe(String tipus) {
        ArrayList<Producte> filtraProductes = new ArrayList<Producte>();
        if (tipus.equalsIgnoreCase("Roba")) {
            for (int i = 0; i < productes.size(); i++) {
                if(productes.get(i)instanceof Roba)filtraProductes.add(productes.get(i));
            }
        }else if (tipus.equalsIgnoreCase("Aliment")) {
            for (int i = 0; i < productes.size(); i++) {
                if(productes.get(i)instanceof Aliment)filtraProductes.add(productes.get(i));
            }
        }else if (tipus.equalsIgnoreCase("Llibre")) {
            for (int i = 0; i < productes.size(); i++) {
                if(productes.get(i)instanceof Llibre)filtraProductes.add(productes.get(i));
            }
        }
        return filtraProductes;
    }

    public static void mostrarLlista(ArrayList<Producte>l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getInfo());
        }
    }

    public static void main(String[] args) {
        try {
            afegirProducte(new Llibre("Terra Baixa", 18.6f, true));
            afegirProducte(new Llibre("Dragon ball", 18.6f, true));
            afegirProducte(new Aliment("Nestea", 18.6f, 600, true));
            afegirProducte(new Aliment("Aquarius", 18.6f, 600, true));
            afegirProducte(new Aliment("Patates", 18.6f, 670, false));
            afegirProducte(new Aliment("Peres", 18.6f, 670, false));
            afegirProducte(new Roba("Pantalons", 18.6f, 'S', "blau"));
            afegirProducte(new Roba("Camiseta", 18.6f, 'S', "blau"));
        }catch (Error e){
            System.out.println("Error amb la creacio de productes");
        }
        eliminarProducte("Terra Baixa");
        ArrayList<Producte> tipusProductes = new ArrayList<Producte>();
        tipusProductes= filtarCotxe("Roba");
        mostrarLlista(tipusProductes);
        tipusProductes.clear();
        tipusProductes= filtarCotxe("Aliment");
        mostrarLlista(tipusProductes);
        tipusProductes.clear();
        tipusProductes= filtarCotxe("Llibre");
        mostrarLlista(tipusProductes);
        tipusProductes.clear();

    }
}
