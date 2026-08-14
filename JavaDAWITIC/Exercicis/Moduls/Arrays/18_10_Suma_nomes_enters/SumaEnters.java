/* Enunciat

Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.

Per passar les proves, el teu programa haurà de desenvolupar els següents mòduls dins del programa SumaEnters:

public static int quantsEnters(String[] valors)     // nombre d'enters a valors
public static int[] filtraEnters(String[] valors)   // enters que hi ha a valors
public static int sumaEnters(int[] valors)          // suma dels valors

En cas que no hi hagi cap enter, el resultat serà 0

Considera les simulacions:

java SumaEnters a 1 2 -2 +4 5 sis
 10

java SumaEnters un dos tres
 0

Pista: filtraEnters() haurà de crear un array d'enters. Per saber la mida de l'array a crear li serà útil quantsEnters().
*/

public class SumaEnters {
    public static void main(String[] args) {
        System.out.println(sumaEnters(filtraEnters(args)));
    }

    public static int quantsEnters(String[] valors) {
        int quants = 0;

        for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                quants++;
            }
        }
        return quants;
    }

    public static int[] filtraEnters(String[] valors) {
        int[] enters = new int[quantsEnters(valors)];

        for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                enters[i] = Integer.parseInt(valors[i]);
            }
        }
        return enters;
    }

    public static int sumaEnters(int[] valors) {
        int suma = 0;

        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }
        return suma;
    }
}