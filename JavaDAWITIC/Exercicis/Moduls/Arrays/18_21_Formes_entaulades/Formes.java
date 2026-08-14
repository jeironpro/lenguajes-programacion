/* Enunciat

Desenvolupa un programa que, a partir de l'especificació d'una taula, la dibuixi.

Una especificació d'una taula consisteix en un string amb els seguents elements:

    Una especificació de dimensió com la que ja hem vist a exercicis com aquest

    Com a recordatori, l'especificació de dimensió està formada per dos números del 1 al 99, separades amb un caràcter 'x'.

    Opcionalment, una especificació de forma.

L'especificació de forma consisteix en un text amb un dels següents valors:

    \: primera diagonal

    |: vertical al mig

    -: horitzontal al mig

    +: quarts

    /: segona diagonal

    x: creu

    =: pas de vianants

    ||: zebra

    ++: taulell d'escacs

Les especificacions de les taules es rebran com a arguments de la línia de comandes.

Per exemple, si volem especificar una taula de 5x6 amb la primera diagonal, indicarem:

java Formes '5x6\'
5x6\
X.....
.X....
..X...
...X..
....X.

Nota: Per assegurar que bash no interpreti els caràcters especials de la línia de comandes, pot ser necessari envoltar cada especificació entre cometes simples.

En cas que l'especificació de la taula no sigui correcta, el programa mostrarà un error.

Si l'especificació de la taula no inclou l'especificació de forma o bé aquesta no es troba entre les conegudes, el programa no ho considerarà un error. En canvi, mostrarà una taula "buida".

La següent simulació exemplifica aquests casos:

java Formes '5x6\' '0x6\' 4x3 '2x3?'
5x6\
X.....
·X....
··X...
···X..
····X.

0x6\
Especificació errònia

4x3
···
···
···
···

2x3?
···
···

Mòduls

Es requereixen els següents mòduls:

    UtilTaula.taulaToString(boolean[][] taula, char caracterTrue, char caracterFalse)

    Aquesta funció pura retornarà un string amb una representació dels valors de la taula que rep amb els caràcters rebuts.

    Per exemple, considera el següent fragment de codi:

boolean[][] taula = {

                        {true, false, false},

                        {false, true, true}

                    };

String resultat = UtilTaula.taulaToString(taula, 'X', '·');

System.out.println(resultat);

Per sortida estàndard mostrarà:

X··
·XX

UtilTaula.inicialitzaPrimeraDiagonal(boolean[][])

Procediment que rep una taula de booleans i la inicialitza amb la primera diagonal a true i la resta a false.

És a dir, aquest procediment és l'encarregat d'inicialitzar la taula per l'especificació \.

Considera el següent fragment de codi:

boolean[][] taula = UtilTaula.inicialitzaPrimeraDiagonal(new boolean[5][6]);

String resultat = UtilTaula.taulaToString(taula, 'X', '·');

System.out.println(resultat);

Per sortida estàndard mostrarà:

5x6\
X·····
·X····
··X···
···X··
····X·

Aquesta forma sempre començarà emplenant per la primera fila i primera columna. Així, per algunes dimensions, no semblarà gaire una diagonal. Per exemple:

5x8\
X···
·X··
··X·
···X
····
····
····
····

UtilTaula.inicialitzaVerticalMig(boolean[][])

Com en el cas de la primera diagonal, però ara dividint la taula en dues seccions, amb una línia vertical. Aquest procediment és l'encarregat de dibuixar l'especificació |.

Tingues present que si les columnes són parelles, la vertical estarà a la columna menor de les dues del mig.

4x4|                    4x5|
·X··                    ··X··
·X··                    ··X··
·X··                    ··X··
·X··                    ··X··

UtilTaula.inicialitzaHoritzontalMig(boolean[][])

Molt similar a la | però ara amb una línia horitzontal per processar l'especificació -. En aquest cas, caldrà que tinguis present si el nombre de files és parell o senar.

7x5-               2x4-                4x5-
·····              XXXX                ·····
·····              ····                XXXXX
·····                                  ·····
XXXXX                                  ·····
·····
·····
·····

UtilTaula.inicialitzaQuarts(boolean[][]): per +

Amb aquesta forma caldrà que tinguis present les mateixes consideracions que amb les formes | i - respecte dimensions parelles i senars.

5x5+                    3x2+                4x6+
··X··                   X·                  ··X···
··X··                   XX                  XXXXXX
XXXXX                   X·                  ··X···
··X··                                       ··X···
··X··

UtilTaula.inicialitzaSegonaDiagonal(boolean[][]): per l'especificació de la forma /.

Aquesta forma és molt similar a la \.

Aquesta forma sempre començarà emplenant per la primera fila i darrera columna.

7x7/                         7x5/                4x7/
······X                      ····X               ······X
·····X·                      ···X·               ·····X·
····X··                      ··X··               ····X··
···X···                      ·X···               ···X···
··X····                      X····
·X·····                      ·····
X······                      ·····

UtilTaula.inicialitzaCreu(boolean[][] taula): per x

Amb aquesta forma caldrà que tinguis present les mateixes consideracions que amb les formes \ i / respecte dimensions parelles i senars. Això implicarà que per algunes dimensions, no semblarà pas una X sinó, com al següent exemple, més aviat una V, mentre que per d'altres quedaran línies en blanc al final.

7x7x                     3x5x                7x5x
X·····X                  X···X               X···X
·X···X·                  .X.X.               ·X·X·
··X·X··                  ..X..               ··X··
···X···                                      ·X·X·
··X·X··                                      X···X
·X···X·                                      ·····
X·····X                                      ·····

UtilTaula.inicialitzaPasVianants(boolean[][]): per =

El pas de vianants fa una sèrie de línies horitzontals intercalades, començant per una línia buida.

7x4=                    4x4=
····                    ····
XXXX                    XXXX
····                    ····
XXXX                    XXXX
····
XXXX
····

UtilTaula.inicialitzaZebra(boolean[][]): per ||

Molt semblant al pas de vianants, aquest mòdul inicialitza la taula amb una sèrie de línies verticals intercalades, començant amb una buida.

4x7||                   4x6||
·X·X·X·                 ·X·X·X
·X·X·X·                 ·X·X·X
·X·X·X·                 ·X·X·X
·X·X·X·                 ·X·X·X

UtilTaula.inicialitzaEscacs(boolean[][]): per ++

En aquesta ocasió, la forma representarà un patró intercalat similar al que apareix a un taulell d'escacs. La primera casella (primera fila i primera columna) començarà sempre en blanc.

8x8++                   5x8++               4x7++
·X·X·X·X                ·X·X·X·X            ·X·X·X·
X·X·X·X·                X·X·X·X·            X·X·X·X
·X·X·X·X                ·X·X·X·X            ·X·X·X·
X·X·X·X·                X·X·X·X·            X·X·X·X
·X·X·X·X                ·X·X·X·X
X·X·X·X·
·X·X·X·X
X·X·X·X·
*/

public class Formes {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            int files = obteFiles(args[i]);
            int columnes = obteColumnes(args[i]);
            String forma = obteForma(args[i]);
            
            if (files < 1 || columnes < 1) {
                System.out.println("Especificació no vàlida");
            } else {
                boolean[][] taula = new boolean[files][columnes];
                mostraForma(taula, forma);
            }
        }
    }

    public static int obteFiles(String especificacio) {
        String files = "";   
        for (int i = 0; i < especificacio.length(); i++) {
            char c = especificacio.charAt(i);
            if (Character.isDigit(c)) {          
                files += c;
            } else {
                break;
            }
        }
        if (!files.isEmpty()) {
            int fila = Integer.parseInt(files);
            if (fila >= 1 && fila <= 99) {
                return fila;            
            }
        }
        return -1;
    }

    public static int obteColumnes(String especificacio) {
        String columnes = "";
        for (int i = 0; i < especificacio.length(); i++) {
            char c = especificacio.charAt(i);
            if (c == 'x') {
                for (int j = i+1; j < especificacio.length(); j++) {
                    char ch = especificacio.charAt(j);
                    if (Character.isDigit(ch)) {
                        columnes += ch;
                    }
                }
            }
            if (columnes.length() > 2) {
                columnes = columnes.substring(0, 2);
                break;
            }
        }
        if (!columnes.isEmpty()) {
            int col = Integer.parseInt(columnes);
            if (col >= 1 && col <= 99) {
                return col;           
            }
        }
        return -1;        
    }
    
    public static String obteForma(String especificacio) {
        String formaTmp = "";
        String forma = "";
        
        for (int i = especificacio.length()-1; i >= 0; i--) {
            char c = especificacio.charAt(i);
            if (!Character.isDigit(c)) {
                formaTmp += c;
            } else {
                break;
            }
        }
        
        for (int i = formaTmp.length()-1; i >= 0; i--) {
            char c = formaTmp.charAt(i);
            if (!Character.isDigit(c)) {
                forma += c;
            }
        }
        return forma;
    }
    
    public static void mostraForma(boolean[][] taula, String forma) {
        switch (forma) {
            case "\\": UtilTaula.inicialitzaPrimeraDiagonal(taula);
                break;
            case "|": UtilTaula.inicialitzaVerticalMig(taula);
                break;
            case "-": UtilTaula.inicialitzaHoritzontalMig(taula);
                break;
            case "+": UtilTaula.inicialitzaQuarts(taula);
                break;
            case "/": UtilTaula.inicialitzaSegonaDiagonal(taula);
                break;
            case "x": UtilTaula.inicialitzaCreu(taula);
                break; 
            case "=": UtilTaula.inicialitzaPasVianants(taula);
                break;
            case "||": UtilTaula.inicialitzaZebra(taula);
                break;
            case "++": UtilTaula.inicialitzaEscacs(taula);
                break;
            default: UtilTaula.inicialitzaFalse(taula);
        }
        String resultat = UtilTaula.taulaToString(taula, 'X', '·');
        System.out.println(resultat);
    }
}