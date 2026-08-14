public class UsaAscensor {
    /* XXX */
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        if (args.length >= 1) {
            ascensor.setPis(Integer.parseInt(args[0]));

            if (args.length > 1) {
                ascensor.setMoviment(args[1]);
            }
        }
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}