public class Soroll {
    public static void main(String[] args) {
        Picarol picarol = new Picarol();

        picarol.sona();

        GatRenat renat = new GatRenat();

        System.out.println(renat.aixecat());

        renat.agafaPicarol(picarol);

        System.out.println(renat.seu());

        System.out.println(renat.seu());

        renat.deixaPicarol();

        System.out.println(renat.estirat());

        System.out.println("Nombre de cops que sona el picarol: " + picarol.vegades());
    }
}