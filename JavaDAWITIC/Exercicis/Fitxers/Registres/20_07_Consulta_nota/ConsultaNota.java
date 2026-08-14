/* Enunciat

Torna a considerar l'exercici del csv de notes. Com en aquell exercici, en aquest també processaràs el fitxer de notes.

En aquesta ocasió, el programa que se't demana es diu ConsultaNota i permet consultar la nota que un alumne va obtenir en una determinada prova.

El programa l'estructuraràs en forma de lloro, i demanarà el nom de l'alumne i el de la prova. Si hi ha una nota per aquest alumne i en aquesta prova, mostrarà el seu valor, altrament, indicarà que no està disponible.

La terminació del programa es produirà quan el lloro rebi un valor buit per alguna de les dades que sol·licita. Per descomptat, si el nom de l'alumne ja és buit, o desconegut, el programa no demanarà el nom de la prova.

Els detalls dels missatges de sortida, te'ls anirà oferint el prgtest

Per passar totes les proves, caldrà que defineixis els següents mòduls:

    String[] carregaAlumnes(String nomFitxer) que retorna un array de noms dels alumnes trobats al fitxer.

    String[] carregaProves(String nomFitxer) que retorna un array de noms de proves trobats al fitxer.

    int[][] carregaNotes(String nomFitxer, int numAlumnes, int numProves) que retorna una taula amb les notes trobades al fitxer. En cas que la nota sigui un valor enter entre 0 i 100, la funció guardarà aquest com a valor. En cas que la nota sigui "NP", guardarà com a valor -1. Si la nota no és un valor enter o bé no està dins del rang, guardarà -2. Finalment, si la fila no conté prou notes per totes les proves, guardarà un -3 per a les que faltin. I si un alumne té més notes de les esperades (numProves), només considerarà les primeres.

    int filaAlumne(String nomAlumne, String[] alumnes) que retorna la fila en que es troba el nom de l'alumne dins de l'array. Si no es troba l'alumne, retornarà -1, i si hi ha més d'un alumne amb aquest nom, retornarà la posició de la primera ocurrencia.

    int columnaProva(String nomProva, String[] proves) que retorna la columna en que es troba el nom de la prova dins del fitxer de notes. Si no es troba la prova, retornarà -1, i si hi ha més d'una prova amb aquest nom, retornarà la posició de la primera ocurrencia.

A més a més, tingues en compte:

    Les comparacions de noms d'alumnes i proves es realitzaran ignorant majúscules/minúscules, caracters especials del nostre idioma (l'el·la geminada no inclosa), i espais sobrers a inici i final.

    En cas que el fitxer estigui buit o bé la primera línia no comenci amb alumne,, el programa finalitzarà amb un missatge d'error.

Exemple d'execució:

cat notes.csv
 alumne,ex1,ex2,ex3,ex4,ex5,ex6
 Eleftèria Ortiz Luján,7,8,5,7,8,9
 Daniel Carrasco Macadàmia,5,4,5,2,NP,NP
 Gabriela Cirerer Nasal,6,7,5,8,9,5

ConsultaNota
 Alumne:
 Eleftèria Ortiz Luján
 Prova:
 ex2
 Nota: 8
 Alumne:
 
 $
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ConsultaNota {
    public static void main(String[] args) throws IOException {
        String ruta = "notes.csv";
        
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        
        String linia = lector.readLine();
        if (linia == null) {
            System.out.println("Error");
            lector.close();
            return;
        }
        
        String[] liniaNotes = linia.split(",");

        if (!liniaNotes[0].strip().equals("alumne")) {
            System.out.println("Error");
            lector.close();
            return;
        }
        
        for (int i = 0; i < liniaNotes.length; i++) {
            if (liniaNotes.length == 1 || liniaNotes[i].strip().isEmpty()) {
                System.out.println("El fitxer notes.csv no es vàlid");
                lector.close();
                return;
            }
        }
        lector.close();
        
        while (true) {
            System.out.println("Alumne:");
            
            String alumne = Entrada.readLine();
            
            if (alumne.isEmpty()) break;
            
            String[] noms = carregaAlumnes(ruta);
            
            int posAlumne = filaAlumne(alumne, noms);
            
            if (posAlumne == -1) {
                System.out.println("Alumne " + "\"" + alumne + "\"" + " no disponible");
                continue;
            }
            
            System.out.println("Prova:");
            String prova = Entrada.readLine();
            
            if (prova.isEmpty()) break;
            
            String[] proves = carregaProves(ruta);

            int posProva = filaAlumne(prova, proves);
            
            if (posProva == -1) {
                System.out.println("Prova " + "\"" + prova + "\"" + " no disponible");
                continue;
            }
            
            int[][] notes = carregaNotes(ruta, noms.length, proves.length);
            
            if (notes[posAlumne][posProva] == -1) {
                System.out.println("No Presentat");
            } else if (notes[posAlumne][posProva] == -2) {
                System.out.println("Nota amb valor no numèric o fora de rang");
            } else if (notes[posAlumne][posProva] == -3) {
                System.out.println("Nota no disponible");
            } else {
                System.out.printf("Nota: %d%n", notes[posAlumne][posProva]);
            }
            
        }
        System.out.println("Arreveure");
    }

    public static String[] carregaAlumnes(String nomFitxer) throws IOException {
        String[] nomsAlumnes = new String[quantsAlumnes(nomFitxer)];
        BufferedReader lector = new BufferedReader(new FileReader(nomFitxer));
        
        String linia = lector.readLine();

        int i = 0;
        while (true) {
            linia = lector.readLine();

            if (linia == null) { break; }

            String[] noms = linia.split(",");

            nomsAlumnes[i] = noms[0];
            i++;
        }
        lector.close();
        return nomsAlumnes;
    }

    public static String[] carregaProves(String nomFitxer) throws IOException {
        String[] provesAlumnes;
        BufferedReader lector = new BufferedReader(new FileReader(nomFitxer));

        String linia = lector.readLine();

        if (linia == null) {
            provesAlumnes = new String[0];
            lector.close();
            return provesAlumnes;
        }

        String[] proves = linia.split(",");
        provesAlumnes = new String[proves.length-1];

        for (int i = 0; i < provesAlumnes.length; i++) {
            provesAlumnes[i] = "";

            provesAlumnes[i] += proves[i+1].strip();
        }
        lector.close();
        return provesAlumnes;

    }

    public static int[][] carregaNotes(String nomFitxer, int numAlumnes, int numProves) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(nomFitxer));
        int[][] notes = new int[numAlumnes][numProves];

        String linia = lector.readLine();
        int fila = 0;

        while (true) {
            linia = lector.readLine();

            String[] liniaNotes = linia.split(",");

            if (liniaNotes.length-1 < numProves) {
                liniaNotes = novesNotes(liniaNotes, numProves);
            }

            if (fila < numAlumnes) {
                for (int col = 0; col < numProves; col++) {
                    liniaNotes[col+1] = liniaNotes[col+1].strip();

                    if (liniaNotes[col+1].equals("NP")) {
                        notes[fila][col] = -1;
                    } else if (UtilString.esEnter(liniaNotes[col+1])) {
                        int nota = Integer.parseInt(liniaNotes[col+1]);

                        if (nota == -3) {
                            notes[fila][col] = -3;
                        } else if (nota >= 0 && nota <= 100) {
                            notes[fila][col] = nota;
                        } else {
                            notes[fila][col] = -2;
                        }
                    } else {
                        notes[fila][col] = -2;
                    }
                }
                fila++;
            }
            linia = lector.readLine();
            if (linia == null) { break; }
        }
        lector.close();
        return notes;
    }

    public static int filaAlumne(String nomAlumne, String[] alumnes) {
        for (int i = 0; i < alumnes.length; i++) {
            alumnes[i] = UtilString.filtraVocalsCatala(alumnes[i]).strip();
            nomAlumne = UtilString.filtraVocalsCatala(nomAlumne).strip();
            if (alumnes[i].equals(nomAlumne)) { return i; }
        }
        return -1;
    }

    public static int columnaProva(String nomProva, String[] proves) {
        for (int i = 0; i < proves.length; i++) {
            proves[i] = UtilString.filtraVocalsCatala(proves[i]).strip();
            nomProva = UtilString.filtraVocalsCatala(nomProva).strip();
            if (proves[i].equals(nomProva)) { return i; }
        }
        return -1;
    }

    public static int quantsAlumnes(String fitxer) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(fitxer));

        String linia = lector.readLine();
        int comptador = 0;

        while (true) {
            linia = lector.readLine();

            if (linia == null) { break; }

            comptador++;
        }
        lector.close();
        return comptador;
    }

    public static String[] novesNotes(String[] notes, int quantsNotes) {
        String[] notesCompleta = new String[quantsNotes+1];
        
        for (int i = 0; i <= quantsNotes; i++) {
            notesCompleta[i] = "";
            
            if (i < notes.length) {
                notesCompleta[i] += notes[i];
            } else {
                notesCompleta[i] += "-3";
            }
        }
        return notesCompleta;
    }
}