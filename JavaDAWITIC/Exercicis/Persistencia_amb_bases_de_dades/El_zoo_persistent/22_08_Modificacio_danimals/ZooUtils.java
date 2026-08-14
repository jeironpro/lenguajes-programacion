import java.util.List;

public class ZooUtils {
    public static void mostraCategories(List<Categoria> categories) {
        int longitud = categories.size();
        System.out.printf("%s%n", (longitud > 0 ? "Nombre de categories: " + longitud: "Cap categoria"));
        for (Categoria categoria: categories) {
            System.out.println("\t" + categoria);
        }
    }

    public static void mostraAnimals(List<Animal> animals) {
        int longitud = animals.size();
        System.out.printf("%s%n", (longitud > 0 ? "Nombre de animals: " + longitud: "Cap animal"));
        for (Animal animal: animals) {
            System.out.println("\t" + animal);
        }
    }
}