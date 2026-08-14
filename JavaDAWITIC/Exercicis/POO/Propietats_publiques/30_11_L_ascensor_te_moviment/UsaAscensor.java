public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        System.out.printf("Pis inicial: %d%n", ascensor.pis);
        System.out.printf("Moviment inicial: %s%n", ascensor.moviment);
        ascensor.moviment = "pujant";
        System.out.printf("Moviment final: %s%n", ascensor.moviment);
    }
}
