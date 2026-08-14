/* Enunciat

L'exercici anterior inicialitza la taula de manera molt senzilla. En aquesta ocasió farem unes petites modificacions perquè faci una mica més de patxoca.

En comptes de UtilTaula.inicialitzaTaula(), farà servir el procediment UtilTaula.inicialitzaSequencial(int[][] taula, int valorInicial) que inicialitzarà les posicions de la taula que rep amb valors seqüencials a partir d'un donat.

Aquesta nova versió de TaulaEnterAString mostrarà les taules de la mateixa manera que l'anterior. La diferència estarà en com les inicialitzarà. Per la primera especificació

Considera la següent simulació:

java TaulaEnterAString 3x4

3x4
          1        2        3        4
          5        6        7        8
          9       10       11       12

Quan hi ha més especificacions, les successives taules començaran pel números correlatius.

java TaulaEnterAString 3x4 2x2 123x4 3x2

3x4
          1        2        3        4
          5        6        7        8
          9       10       11       12

2x2
          2         3
          4         5

123x4
Especificació no vàlida

3x2
          3        4
          5        6
          7        8

Fixa't com, a aquesta execució, la primera taula comença per 1 la segona pel 2. Com que la tercera és una especificació errònia, la darrera taula comença per 3 en comptes de 4.
*/


public class TaulaEnterAString {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

            int files = obteFiles(args[i]);
            int columnes = obteColumnes(args[i]);
            
            if (files < 1 || columnes < 1) {
                System.out.println("Especificació no vàlida");
            } else {
                int[][] taula  = new int[files][columnes];
                UtilTaula.inicialitzaSequencial(taula, 1);
                String resultat = UtilTaula.taulaToString(taula);
                System.out.println(resultat);
                System.out.println();
            }
        }
    }

    public static boolean especificacioCorrecta(String especificacio) {
        String[] coordenades = especificacio.split("x");

        if (coordenades.length != 2) return false;

        for (int i = 0; i < coordenades.length; i++) {
            if (!UtilString.esEnter(coordenades[i])) return false;
            
            int valor = Integer.parseInt(coordenades[i]);
            
            if (valor < 0 || valor > 99) return false;
        }
        return true;
    }

    public static int obteFiles(String especificacio) {
        String fila = "";
        if (especificacioCorrecta(especificacio)) {
            for (int i = 0; i < especificacio.length(); i++) {
                char c = especificacio.charAt(i);
                if (c == 'x') { break; }
    
                if (Character.isDigit(c)) {
                    fila += c;
                }
            }
            return Integer.parseInt(fila);
        }
        return -1;
    }

    public static int obteColumnes(String especificacio) {
        String columna = "";
        
        if (especificacioCorrecta(especificacio)) {
            for (int i = especificacio.length()-1; i >= 0; i--) {
                char c = especificacio.charAt(i);
                if (c == 'x') { break; }
    
                if (Character.isDigit(c)) {
                    columna += c;
                }
            }
            return Integer.parseInt(columna);
        }
        return -1;
    }
}