/* Enunciat

Aquest exercici és una ampliació de l'exercici anterior. En aquesta ocasió hi afegirem formes plenes.

Què són les formes plenes? Algunes de les formes anteriors dividien la taula en dos o més subtaules. Aquesta activitat farà que es puguin especificar aquestes subtaules i inicialitzar-les com a plenes.

Les noves especificacions són:

    *\: primera diagonal amb primer triangle ple

    \*: primera diagonal amb segon triangle ple

    *///: segona diagonal amb primer triangle ple

    /*: segona diagonal amb segon triangle ple

    *|: vertical al mig amb primer costat ple

    |*: vertical al mig amb segon costat ple

    *-: horitzontal al mig amb primer costat ple

    -*: horitzontal al mig amb segon costat ple

    *+: quarts amb quadrant nord-oest ple

    **+: quarts amb quadrant sud-oest ple

    +*: quarts amb quadrant nord-est ple

    +**: quarts amb quadrant sud-est ple

    *+**: quarts amb quadrant nord-oest i sud-est plens

    **+*: quarts amb quadrant sud-oest i nord-est plens

    *x: creu amb quadrant nord ple

    **x: creu amb quadrant oest ple

    x*: creu amb quadrant est ple

    x**: creu amb quadrant est ple

    *x*: creu amb quadrants nord i sud plens

    **x**: creu amb quadrants oest i est plens

Mòduls

Es requereixen els següents nous mòduls:

    UtilTaula.inicialitzaPrimeraDiagonalPrimerPle(boolean[][]): per *\

    UtilTaula.inicialitzaPrimeraDiagonalSegonPle(boolean[][]): per \*

    UtilTaula.inicialitzaSegonaDiagonalPrimerPle(boolean[][]): per *&/

    UtilTaula.inicialitzaSegonaDiagonalSegonPle(boolean[][]): per /*

        Aquests quatre mòduls construeixen les diagonals amb un dels costats plens.

        Els següents exemples haurien d'ajudar-te a entendre a què em refereixo:

    6x6*\              6x6\*               6x6*&/                 6x6/*
    X·····             XXXXXX              XXXXXX              ·····X
    XX····             ·XXXXX              XXXXX·              ····XX
    XXX···             ··XXXX              XXXX··              ···XXX
    XXXX··             ···XXX              XXX···              ··XXXX
    XXXXX·             ····XX              XX····              ·XXXXX
    XXXXXX             ·····X              X·····              XXXXXX

    UtilTaula.inicialitzaVerticalMigPrimerPle(boolean[][]): per *|

    UtilTaula.inicialitzaVerticalMigSegonPle(boolean[][]): per |*

    UtilTaula.inicialitzaHoritzontalMigPrimerPle(boolean[][]): per *-

    UtilTaula.inicialitzaHoritzontalMigSegonPle(boolean[][]): per -*

        Aquests quatre mòduls construeixen els horitzontals i verticals amb un dels costats plens.

        Els següents exemples haurien d'ajudar-te a entendre a què em refereixo:

    5x5*|                   5x5|*               5x5*-               5x5-*
    XXX··                   ··XXX               XXXXX               ·····
    XXX··                   ··XXX               XXXXX               ·····
    XXX··                   ··XXX               XXXXX               XXXXX
    XXX··                   ··XXX               ·····               XXXXX
    XXX··                   ··XXX               ·····               XXXXX

    UtilTaula.inicialitzaQuartsNOPle(boolean[][]): per *+

    UtilTaula.inicialitzaQuartsSOPle(boolean[][]): per **+

    UtilTaula.inicialitzaQuartsNEPle(boolean[][]): per +*

    UtilTaula.inicialitzaQuartsSEPle(boolean[][]): per +**

    UtilTaula.inicialitzaQuartsNOSEPlens(boolean[][]): per *+**

    UtilTaula.inicialitzaQuartsSONEPlens(boolean[][]): per **+*

        Els sis mòduls anteriors permeten definir quins quadrans volem plens.

        Considera els següents exemples:

    7x7*+         7x7**+        7x7+*         7x7+**        7x7*+**       7x7**+*
    XXXX···       ···X···       ···XXXX       ···X···       XXXX···       ···XXXX
    XXXX···       ···X···       ···XXXX       ···X···       XXXX···       ···XXXX
    XXXX···       ···X···       ···XXXX       ···X···       XXXX···       ···XXXX
    XXXXXXX       XXXXXXX       XXXXXXX       XXXXXXX       XXXXXXX       XXXXXXX
    ···X···       XXXX···       ···X···       ···XXXX       ···XXXX       XXXX···
    ···X···       XXXX···       ···X···       ···XXXX       ···XXXX       XXXX···
    ···X···       XXXX···       ···X···       ···XXXX       ···XXXX       XXXX···

    UtilTaula.inicialitzaCreuNPle(boolean[][] taula): per *x

    UtilTaula.inicialitzaCreuOPle(boolean[][] taula): per **x

    UtilTaula.inicialitzaCreuSPle(boolean[][] taula): per x*

    UtilTaula.inicialitzaCreuEPle(boolean[][] taula): per x**

    UtilTaula.inicialitzaCreuNSPlens(boolean[][] taula): per *x*

    UtilTaula.inicialitzaCreuOEPlens(boolean[][] taula): per **x**

        Els sis mòduls anteriors permeten definir quines seccions de la creu volem plenes.

        Considera els següents exemples:

    7x7*x         7x7**x        7x7x*         7x7x**        7x7*x*        7x7**x**
    XXXXXXX       X·····X       X·····X       X·····X       XXXXXXX       X·····X
    ·XXXXX·       XX···X·       ·X···X·       ·X···XX       ·XXXXX·       XX···XX
    ··XXX··       XXX·X··       ··X·X··       ··X·XXX       ··XXX··       XXX·XXX
    ···X···       XXXX···       ···X···       ···XXXX       ···X···       XXXXXXX
    ··X·X··       XXX·X··       ··XXX··       ··X·XXX       ··XXX··       XXX·XXX
    ·X···X·       XX···X·       ·XXXXX·       ·X···XX       ·XXXXX·       XX···XX
    X·····X       X·····X       XXXXXXX       X·····X       XXXXXXX       X·····X
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
            case "*\\": UtilTaula.inicialitzaPrimeraDiagonalPrimerPle(taula);
                break;
            case "\\*": UtilTaula.inicialitzaPrimeraDiagonalSegonPle(taula);
                break;
            case "*/": UtilTaula.inicialitzaSegonaDiagonalPrimerPle(taula);
                break;
            case "/*": UtilTaula.inicialitzaSegonaDiagonalSegonPle(taula);
                break;
            case "*|": UtilTaula.inicialitzaVerticalMigPrimerPle(taula);
                break;
            case "|*": UtilTaula.inicialitzaVerticalMigSegonPle(taula);
                break;
            case "*-": UtilTaula.inicialitzaHoritzontalMigPrimerPle(taula);
                break;
            case "-*": UtilTaula.inicialitzaHoritzontalMigSegonPle(taula);
                break;
            case "*+": UtilTaula.inicialitzaQuartsNOPle(taula);
                break;
            case "**+": UtilTaula.inicialitzaQuartsSOPle(taula);
                break;
            case "+*": UtilTaula.inicialitzaQuartsNEPle(taula);
                break;
            case "+**": UtilTaula.inicialitzaQuartsSEPle(taula);
                break;
            case "*+**": UtilTaula.inicialitzaQuartsNOSEPlens(taula);
                break;
            case "**+*": UtilTaula.inicialitzaQuartsSONEPlens(taula);
                break;
            case "*x": UtilTaula.inicialitzaCreuNPle(taula);
                break;
            case "**x": UtilTaula.inicialitzaCreuOPle(taula);
                break;
            case "x*": UtilTaula.inicialitzaCreuSPle(taula);
                break;
            case "x**": UtilTaula.inicialitzaCreuEPle(taula);
                break;
            case "*x*": UtilTaula.inicialitzaCreuNSPlens(taula);
                break;
            case "**x**": UtilTaula.inicialitzaCreuOEPlens(taula);
                break;
            default: UtilTaula.inicialitzaFalse(taula);
        }
        String resultat = UtilTaula.taulaToString(taula, 'X', '·');
        System.out.println(resultat);
    }
}