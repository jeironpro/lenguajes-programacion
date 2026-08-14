/* Enunciat

Els fitxers de text poden presentar diferents formats. Un de molt típic és el conegut com a csv que són les sigles de Comma Separated Values o en el nostre idioma Valors Separats per Comes.

Un fitxer csv, en la seva forma més bàsica, és una seqüència de línies de text on cada línia presenta un o més valors separats per un caràcter especial, habitualment la coma ,.

És un format molt típic perquè representa molt eficientment dades en forma tabular com les que s'emmagatzemen a una taula d'una base de dades relacional, o a un full de càlcul.

Sovint la primera línia es considera les capçaleres; és a dir, el nom de cada columna.

Per exemple, considera el següent fitxer que conté les notes que han obtingut alguns estudiants en diferents exàmens:

cat notes.csv
 alumne,ex1,ex2,ex3,ex4,ex5,ex6
 Eleftèria Ortiz Luján,7,8,5,7,8,9
 Daniel Carrasco Macadàmia,5,4,5,2,NP,NP
 Gabriela Cirerer Nasal,6,7,5,8,9,5

Aquest fitxer codifica, amb els valors separats per comes, les notes en sis unitats formatives d'alguns estudiants.

Una representació tabular més gràfica d'aquestes dades podria ser:

alumne
	

ex1
	

ex2
	

ex3
	

ex4
	

ex5
	

ex6

Eleftèria Ortiz Luján
	

7
	

8
	

5
	

7
	

8
	

9

Daniel Carrasco Macadàmia
	

5
	

4
	

5
	

2
	

NP
	

NP

Gabriela Cirerer Nasal
	

6
	

7
	

5
	

8
	

9
	

5

Per facilitar el processament d'aquest tipus de línies, potser voldràs fer servir la funció separa() que vas implementar a aquest exercici o, si no el vas fer, directament la funció split() de String.
Què has de fer?

En aquest exercici desenvoluparàs un programa que calcularà la nota mitjana dels estudiants que contingui el fitxer de text notes.csv, que presenta el format que apareix a l'exemple anterior, encara que possiblement amb més o menys estudiants i notes.

El programa obrirà el fitxer i:

    Ignorarà la primera línia, doncs correspon a les capçaleres

    Per cada estudiant mirarà quines notes té i, si són numèriques sumarà els seus valors enters. El resultat el dividirà pel nombre d'exàmens, per obtenir la mitjana.

    Un cop disposa de la mitjana, el programa llistarà els noms seguits de la nota entre parèntesis i amb dos decimals

El nombre d'exàmens s'obtindrà del primer argument de la línia de comandes, i si no s'especifica o no és numèric, suposarà que és 6.

Suposant que notes.csv conté els valors de l'exemple anterior, que no s'especifica el nombre d'examens, el programa generarà la següent sortida:

Mitjana de notes dels 6 exàmens:
Eleftèria Ortiz Luján (7,33)
Daniel Carrasco Macadàmia (2,67)
Gabriela Cirerer Nasal (6,67)

Coses a tenir present:

    Pots suposar que el fitxer sempre existeix.

    El primer element de la línia, si hi és, es considerarà el nom de l'alumne.

    Si el nom de l'alumne està buit o només format per espais en blanc, el programa ignorarà tota la línia.

    Si un estudiant no té prou notes per a tots els exàmens, les que falten es consideraran NP. Si en té de més, només es consideraran les primeres.

    El prgtest t'informarà d'alguns detalls extra com ara, la sortida quan el fitxer no disposi de notes o el nombre d'exàmens no sigui suficient per calcular la mitjana.

    Per passar totes les proves, l'opertura i tancament del fitxer s'ha de realitzar dins del fitxer que conté el main().

    Per aconseguir els dos decimals, recorda:

    jshell> System.out.printf("Sense indicar quants %f i indicant-t'ho %.2f%n", (1/6.0), (1/6.0))
    Sense indicar quants 0,166667 i indicant-t'ho 0,17
*/
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        int nombreExamens = 6;
        
        if (args.length >= 1 && args[0] != null && UtilString.esEnter(args[0])) {
            int quants = Integer.parseInt(args[0]);
            
            if (quants < 2) {
                System.out.println("Com a mínim 2 exàmens.");
                return;
            }
            nombreExamens = quants;
        }
        System.out.printf("Mitjana de notes dels %d exàmens%n", nombreExamens);
        
        String ruta = "notes.csv";
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        
        String linia = lector.readLine();
        linia = lector.readLine();

        while (true) {
            if (linia == null) {
                System.out.println("El fitxer notes.csv no conté cap nota.");
                return;
            }
            
            String[] notes = linia.split(",");
            
            if (notes[0].isBlank()) { continue; }
            
            String nomEstudiant = notes[0].strip();

            if (notes.length+1 < nombreExamens) {
                notes = completaNotes(notes, nombreExamens);
            }
            
            float mitjanaNotes = calculaNotes(notes, nombreExamens);
            
            System.out.printf("%s (%.2f)%n", nomEstudiant, mitjanaNotes);
            
            linia = lector.readLine();
            if (linia == null) { break; }
        }
        lector.close();
    }

    public static String[] completaNotes(String[] notes, int nombreExamens) {
        String[] nouArray = new String[nombreExamens+1];

        for (int i = 0; i <= nombreExamens; i++) {
            nouArray[i] = "";

            if (i < notes.length) {
                nouArray[i] += notes[i];
            } else {
                nouArray[i] += "NP";
            }
        }
        return nouArray;
    }

    public static float calculaNotes(String[] notes, int nombreExamens) {
        float suma  = 0;

        for (int i = 1; i <= nombreExamens; i++) {
            if (UtilString.esEnter(notes[i].strip())) {
                suma += Integer.parseInt(notes[i].strip());
            }    
        }
        return suma / nombreExamens;
    }
}