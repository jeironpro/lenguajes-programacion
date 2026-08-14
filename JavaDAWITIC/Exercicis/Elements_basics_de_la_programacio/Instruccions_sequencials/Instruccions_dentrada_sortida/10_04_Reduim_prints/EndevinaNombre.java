/* Enunciat

Recorda un altre cop el programa EndevinaNombre

     * Aquest programa mostra capacitats d'endevinació

     * Per executar-ho, fes

     * $ java EndevinaNombre 42

    public class EndevinaNombre {
        public static void main(String[] args) {
            int numeroPensat;   // guardarà el número pensat
            int numero;         // guardarà els càlculs intermitjos

            // pensa un número
            numeroPensat = Integer.parseInt(args[0]);
            System.out.print("El número pensat és ");
            System.out.println(numeroPensat);

            // Multiplica'l per 3
            numero = numeroPensat * 3;
            System.out.print("Quan el multipliques per 3 obtens ");
            System.out.println(numero);

            // Suma-li 6
            numero = numero + 6;
            System.out.print("Quan li sumes 6 arriba a ");
            System.out.println(numero);

            // divideix-ho tot per 3
            numero = numero / 3;
            System.out.print("Un cop dividit per 3 queda ");
            System.out.println(numero);

            // resta-li el número pensat
            numero = numero - numeroPensat;
            System.out.print("Finalment, en restar-li el valor inicial, queda ");
            System.out.println(numero);

            // compara el resultat
            System.out.println("A que el resultat és 2?");
        }
    }

Crea una nova versió que faci el mateix però que compacti les crides a System.out.print() fent servir la notació que hem vist System.out.println("El número és " + numero);.
*/

public class EndevinaNombre {
    public static void main(String[] args) {
        int numeroPensat = Integer.parseInt(args[0]);

        System.out.println("El número pensat és " + numeroPensat);

        int numero = numeroPensat * 3;

        System.out.println("Quan el multipliques per 3 obtens " + numero);

        numero = numero + 6;

        System.out.println("Quan li sumes 6 arriba a " + numero);

        numero = numero / 3;

        System.out.println("Un cop dividit per 3 queda " + numero);

        numero = numero - numeroPensat;

        System.out.println("Finalment, en restar-li el valor incial, queda " + numero);

        System.out.println("A que el resultat és 2?");
    }
}