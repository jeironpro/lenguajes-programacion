public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        for (int vides = 1; vides <= 3; vides++) {
            while (renat.esViu()) {
                System.out.println("Renat diu: " + renat.mor());
            }
            System.out.println("Renat diu: " + renat.mor());
            System.out.println("Renat diu: " + renat.reviu(vides));
        }
    }
}