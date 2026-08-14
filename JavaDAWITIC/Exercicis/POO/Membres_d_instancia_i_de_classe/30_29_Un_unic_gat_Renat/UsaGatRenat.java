public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = GatRenat.getInstancia();
        System.out.println("Inicialment Renat està " + renat.getPosicio());
        for (String posicio: args) {
            canviaPosicio(posicio);
            System.out.println("Ara està " + renat.getPosicio());
        }
    }

    private static void canviaPosicio(String novaPosicio) {
        novaPosicio = switch(novaPosicio) {
            case "1" -> "estirat";
            case "2" -> "assegut";
            case "3" -> "dret";
            case "estirat" -> "estirat";
            case "assegut" -> "assegut";
            case "dret" -> "dret";
            default -> GatRenat.getInstancia().getPosicio();
        };
        GatRenat.getInstancia(novaPosicio);
    }
}