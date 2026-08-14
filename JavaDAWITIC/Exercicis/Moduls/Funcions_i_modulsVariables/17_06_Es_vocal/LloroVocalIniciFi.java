/* Enunciat

En diferents exercicis ens hem trobat la necessitat de distingir si un caràcter és o no una vocal. Ara que ja coneixem les funcions, podem definir la nostra funció esVocal() que rebi un caràcter i retorni un booleà indicant si el caràcter correspon o no amb una vocal.

Considerarem com a vocals totes les variants d'accents i dièresis de les vocals catalanes.

Recorda que aquests variants són, a banda de les cinc habituals, à, è, é, í, ï, ò, ó, ú i ü.
Què has de fer

En aquest exercici hi haurà tres fitxers:

    UtilString.java: contindrà la funció esVocal(). No cal que contingui main().

    LloroVocalIniciFi.java: una nova versió entre mig de Exercici 14_05. Inicia amb vocal minúscula i Exercici 14_06. Inicia i acaba en vocal que farà servir la nova funció per que el lloro repeteixi qualsevol text que comenci o acabi en vocal (siguin majúscules o minúscules)

    UtilitatsConfirmacio.java: que ja tens d'un exercici anterior

Una simulació d'execució seria:

El lloro demana paraula amb vocal a l'inici o/i final
ànec
El lloro diu: ànec
El lloro demana paraula amb vocal a l'inici o/i final
lleó
El lloro diu: lleó
El lloro demana paraula amb vocal a l'inici o/i final
gos
El lloro demana paraula amb vocal a l'inici o/i final

El lloro demana confirmació per finalitzar
Encara no
El lloro demana paraula amb vocal a l'inici o/i final

El lloro demana confirmació per finalitzar
sí
Adéu
*/

public class LloroVocalIniciFi {
    public static void main(String[] args) {
        while (true) {
            System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
            String paraula = Entrada.readLine();
            
            if (!paraula.isEmpty()) {
                char primerCaracter = paraula.charAt(0);
                char ultimCaracter = paraula.charAt(paraula.length()-1);
                
                boolean iniVocal = UtilString.esVocal(primerCaracter);  
                boolean fiVocal = UtilString.esVocal(ultimCaracter);   
                
                if (iniVocal || fiVocal) {
                    System.out.println("El lloro diu: " + paraula);
                }  
            } else {
                System.out.println("El lloro demana confirmació per finalitzar");
                if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
                    break;                                
                }
            }
        }
        System.out.println("Adéu");
    }
}