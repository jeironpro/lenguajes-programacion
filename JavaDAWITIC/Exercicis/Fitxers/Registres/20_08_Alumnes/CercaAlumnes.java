/* Enunciat

En aquest exercici acabarem de completar algunes de les funcions associades al tipus Alumne que hem definit als continguts.

Recordem la definició:

static class Alumne {
    String nom;
    String email;
    int edat;
    boolean esOient;
    int[] notes;
}

Per provar algunes d'elles, desenvoluparem un programa que llegirà les dades d'un fitxer en format csv, i mostrarà la informació relativa a cada alumne que correspongui al criteri de cerca que s'indiqui per l'argument esperat.

El criteri de cerca és un String que el programa rep com a primer argument de la línia de comandes, i que ha d'aparèixer com a part del nom o de la part de l'usuari al correu electrònic (abans de @) dels alumnes a mostrar. El programa no serà sensible a majúscules/minúscules ni als caràcters especials propis de la llengua catalana (en concret, les vocals accentuades i la ç)

Per exemple, considera el contingut del fitxer:

cat alumnes.csv
 nom,email,edat,esOient,ex1,ex2,ex3,ex4,ex5,ex6
 Eleftèria Ortiz Luján,elefteria.ortiz@mevaempresa.org,10,false,7,8,5,7,8,9
 Daniel Carrasco Macadàmia,daniel.carrasco@mevaempresa.org,21,true,5,4,5,2,NP,NP
 Gabriela Cirerer Nasal,gabriela.cirerer@mevaempresa.org,20,false,6,7,5,8,9,5

Un exemple d'execució seria:

java CercaAlumnes elefteria
 Alumne: Eleftèria Ortiz Luján
 - email: lefi.ortiz@mevaempresa.org
 - edat: 10
 - és oïent: No
 - notes: 7,8,5,7,8,9

Consideracions addicionals i pistes

El prgtest t'indicarà els missatges esperats quan es produeixin algunes situacions especials com ara que no es trobi cap alumne amb els criteris indicats.

Podem suposar que el fitxer existeix, que conté al menys una línia amb les capçaleres, i que totes les línies contenen valors suficients i adequats per completar un alumne.

Considera la funció String.contains() per fer les comprovacions.

Potser et serveix la següent plantilla:

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        // XXX a completar
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        // XXX cal mostrar les dades de l'alumne

    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        // XXX a completar
    }

    public static String alumneACsv(Alumne alumne) {
        // XXX a completar encara que no es fa servir en aquest programa
    }

    public static Alumne csvAAlumne(String csv) {
        // XXX a completar
    }

    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        // XXX a completar

        // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        // XXX a completar

        while (true) {
            // llegeix entrada i finalitza bucle si no en queden més
            // XXX a completar

            // converteix l'entrada a Alumne
            // XXX a completar

            // comprova si el criteri de cerca es troba dins del nom o
            // el email. Si és així, mostra'l
            // XXX a completar
        }
        // consideracions finals com ara el tancament del fitxer
        // XXX a completar
    }
}
*/
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println("- email: " + alumne.email);
        System.out.println("- edat: " + alumne.edat);
        System.out.println("- és oient: " + alumne.esOient);
        System.out.println("- notes: "+ notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    public static String notesACsv(int[] notes) {
        String notesString = "";

        for (int i = 0; i < notes.length; i++) {
            if (i == 0) {
                notesString += ((notes[i] != -1) ? notes[i] : "NP");
            } else {
                notesString += "," + ((notes[i] != -1) ? notes[i] : "NP");
            }
        }
        return notesString;
    }

    public static String alumneACsv(Alumne alumne) {
        return String.format(
            "%s,%s,%d,%b,%s",
            alumne.nom,
            alumne.email,
            alumne.edat,
            alumne.esOient,
            notesACsv(alumne.notes)
        );
    }

    public static Alumne csvAAlumne(String csv) {
        Alumne alumne = new Alumne();
        String[] dadesAlumne = csv.split(",");

        alumne.nom = dadesAlumne[0];
        alumne.email = dadesAlumne[1];
        alumne.edat = Integer.parseInt(dadesAlumne[2]);
        alumne.esOient = Boolean.parseBoolean(dadesAlumne[3]);

        int[] notes = new int[dadesAlumne.length-4];

        for (int i = 0; i < notes.length; i++) {
            if (dadesAlumne[i+4].equals("NP")) {
                notes[i] = -1;
            } else {
                notes[i] = Integer.parseInt(dadesAlumne[i+4]);
            }
        }
        alumne.notes = notes;
        return alumne;
    }

    public static boolean alumneTrobat(String[] nom, String email, String criteri) {
        if (UtilString.esSubstring(email, criteri)) { return true; }

        for (int i = 0; i < nom.length; i++) {
            if (UtilString.esSubstring(nom[i], criteri)) { return true; }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            String ruta = "alumnes.csv";
            BufferedReader lector = new BufferedReader(new FileReader(ruta));

            String linia = lector.readLine();
            int comptador = 0;
    
            while (true) {
                linia = lector.readLine();

                if (linia == null) { break; }

                Alumne alumne = csvAAlumne(linia);

                String[] nomAlumne = alumne.nom.split(" ");
                String[] emailAlumne = alumne.email.split("@");

                args[0] = UtilString.filtraVocalsCatala(args[0].strip());

                emailAlumne[0] = UtilString.filtraVocalsCatala(emailAlumne[0].strip());

                if (alumneTrobat(nomAlumne, emailAlumne[0], args[0])) {
                    mostraAlumne(alumne);
                    comptador++;
                }
            }
            if (comptador == 0) {
                System.out.println("No s'ha trobat cap alumne");
            }
            lector.close();
        } else {
            System.out.println("Ús: CercaAlumnes «criteri de cerca»");
        }

    }
}