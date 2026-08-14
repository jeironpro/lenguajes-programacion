/* Enunciat

Quina de les dues implementacions de List que estem treballant (ArrayList, LinkedList) funcionarà més ràpida amb l'operació remove()?

Comprovem-ho!

Desenvolupa un programa anomenat ComparaRemove que comprovi el temps que costa eliminar els elements d'una llista, tot eliminant-los sempre per l'inici, pel final o pel punt mig.

Completa la següent implementació parcial, tot revisant que no et deixes cap punt marcat amb XXX.

/*

    Aquest programa realitza una comparació de l'operació remove() en

    ArrayList i LinkedList eliminant per l'inici, pel final i pel mig.


    El funcionament de cada prova és el següent:

    - primer s'inicialitza una nova List<Integer> amb la implementació a evaluar.

    - a continuació, s'emplena la llista creada amb enters del 0 a longitud - 1.

    - finalment s'execuita el mètode corresponent que elimina tots els

      valors des de diferents posicions, i retorna el temps invertit.



    En aquesta capçalera, s'inclou un resum dels resultats obtinguts amb les proves

    realitzades per l'autor/autora d'aquest lliurament:


    La longitud escollida ha estat: XXX


    Els resultats obtinguts han estat:


    Primera execució:

    =================


Comparant l'eficiència de les llistes


Comparació quan eliminem sempre de l'inici

test remove(0) LinkedList:     XXX

test remove(0) ArrayList:      XXX


Comparació quan eliminem sempre del final

test remove(últim) LinkedList: XXX

test remove(últim) ArrayList:  XXX


Comparació quan eliminem sempre del mig

test remove(mig) LinkedList:   XXX

test remove(mig) ArrayList:    XXX


        Segona execució:

        ================


Comparant l'eficiència de les llistes


Comparació quan eliminem sempre de l'inici

test remove(0) LinkedList:     XXX

test remove(0) ArrayList:      XXX


Comparació quan eliminem sempre del final

test remove(últim) LinkedList: XXX

test remove(últim) ArrayList:  XXX


Comparació quan eliminem sempre del mig

test remove(mig) LinkedList:   XXX

test remove(mig) ArrayList:    XXX


        Tercera execució:

        =================


Comparant l'eficiència de les llistes


Comparació quan eliminem sempre de l'inici

test remove(0) LinkedList:     XXX

test remove(0) ArrayList:      XXX


Comparació quan eliminem sempre del final

test remove(últim) LinkedList: XXX

test remove(últim) ArrayList:  XXX


Comparació quan eliminem sempre del mig

test remove(mig) LinkedList:   XXX

test remove(mig) ArrayList:    XXX


        Resultats

        =========


========== ===================== ==================== ====================

**prova**  **linkedList**         **ArrayList**        **resultat**

---------- --------------------- -------------------- --------------------

inici       XXX                    XXX                  XXX

final       XXX                    XXX                  XXX

mig         XXX                    XXX                  XXX

========== ===================== ==================== ====================


    Per calcular cada columna:


    * la cel·la (1, 1) correspon al temps mig de la implementació LinkedList eliminant des de l'inici

      Es calcula sumant els valors obtinguts a les tres execucions i dividint-los per 3


    * el resultat per la fila inici indica quantes vegades és més ràpid un que l'altre. Per fer-ho, dividim

      el valor més gran pel més petit i arrodonim a l'enter.


    Conclusions

    ===========


    En vistes als resultats, en cas que hagi de fer servir una List per eliminar molts valors, escolliré XXX


Pista: Per calcular la taula final, jo ho he fet extraient les dades en forma de csv. A continuació l'he formatejat una mica perquè els números quedin col·locats coòmodament. Després he overt el fitxer resultant amb LibreOffice, he creat les fòrmules necessàries per calcular les mitjana dels tres intents per les tres proves diferents de cada implementació de List, i finalment, el resultat l'he calculat a partir de la fòrmula =INT(MAX(B9:C9)/MIN(B9:C9)) on B9 i C9 contenien, les mitjanes que he calculat abans per LinkedList i ArrayList. Per emplenar el comentari, només he hagut de copiar, enganxar i aliniar una mica.gqq
*/

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ComparaRemove {
    private static int longitud;
    private static List<Integer> llista;

    // XXX defineix el mètode emplenaLlista() que emplena la variable llista amb enters del 0 a longitud - 1
    private static void emplenaLLista() {
        for (int i = 0; i < longitud-1; i++) {
            llista.add(i);
        }
    }

    private static long testRemove0() {
        long tempsInicial = System.nanoTime();
        for (int i = 0; i < llista.size(); i++) {
            llista.remove(0);
        }
        return System.nanoTime() - tempsInicial;
    }

    private static long testRemove() {
        long tempsInicial = System.nanoTime();
        for (int i = 0; i < llista.size(); i++) {
            int darrer = llista.size()-1; 
            llista.remove(darrer);
        }
        return System.nanoTime() - tempsInicial;
    }


    // XXX mètode testRemoveMig() que elimina un a un tots els elements de la llista per la posició mig
    private static long testRemoveMig() {
        long tempsInicial = System.nanoTime();
        for (int i = 0; i < llista.size(); i++) {
            int mig = llista.size()/2; 
            llista.remove(mig);
        }
        return System.nanoTime() - tempsInicial;
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
        	System.out.println("Vull obtenir resultats?");
        	boolean confirmacio = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        	
        	if (confirmacio) {
        		obtenirResultats();
        		return;
        	}
        	System.out.println("Ha d'introduir un argument");
        	return;
        }

        if (!UtilString.esEnter(args[0])) {
        	System.out.println("L'argument ha de ser un enter");
        	return;
        }
        
        if (UtilString.aEnter(args[0]) < 100000) {
        	System.out.println("El valor no pot ser menor a 100.000");
        	return;
        }
        longitud = UtilString.aEnter(args[0]);

        System.out.println("Comparant l'eficiència de les llistes");
        System.out.println();

        System.out.println("Comparació quan eliminem sempre de l'inici");
        llista = new LinkedList<Integer>();
        emplenaLLista();
        long testIniLinkedList = testRemove0();
        System.out.printf("test remove(0) LinkedList:     %20d%n", testRemove0());
        llista = new ArrayList<Integer>();
        emplenaLLista();
        long testIniArrayList = testRemove0();
        System.out.printf("test remove(0) ArrayList:      %20d%n", testRemove0());
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del final");
        llista = new LinkedList<Integer>();
        emplenaLLista();
        long testFiLinkedList = testRemove();
        System.out.printf("test remove(últim) LinkedList: %20d%n", testRemove());
        llista = new ArrayList<Integer>();
        emplenaLLista();
        long testFiArrayList = testRemove();
        System.out.printf("test remove(últim) ArrayList:  %20d%n", testRemove());
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del mig");
        llista = new LinkedList<Integer>();
        emplenaLLista();
        long testMigLinkedList = testRemoveMig();
        System.out.printf("test remove(mig) LinkedList:   %20d%n", testRemoveMig());
        llista = new ArrayList<Integer>();
        emplenaLLista();
        long testMigArrayList = testRemoveMig();
        System.out.printf("test remove(mig) ArrayList:    %20d%n", testRemoveMig());
        System.out.println();

        guardaTests(testIniLinkedList,testIniArrayList,testFiLinkedList,testFiArrayList,testMigLinkedList,testMigArrayList);
    }

     public static void guardaTests(long testIniLinkedList, 
    						  long testIniArrayList, 
    						  long testFiLinkedList, 
    						  long testFiArrayList, 
    						  long testMigLinkedList, 
    						  long testMigArrayList) throws IOException {
    	File fitxer = new File("tests.csv");
        FileWriter obrirFitxer = new FileWriter(fitxer, true);
        BufferedWriter entrada = new BufferedWriter(obrirFitxer);
        
        if (!fitxer.exists()) {
		    String capcelera = "Test,LinkedList,ArrayList";
		    entrada.write(capcelera);
		    entrada.newLine();        
        }
        
        String testInici = "inici" + "," + testIniLinkedList + "," + testIniArrayList;
        entrada.write(testInici);
        entrada.newLine();
        
        String testFinal = "final" + "," + testFiLinkedList + "," + testFiArrayList;
        entrada.write(testFinal);
        entrada.newLine();
        
        String testMig = "mig" + "," + testMigLinkedList + "," + testMigArrayList;
        entrada.write(testMig);
        entrada.newLine();
        entrada.close();
    }
    
    public static void obtenirResultats() throws IOException {
    	File fitxer = new File("tests.csv");
    	
    	if (fitxer.exists()) {
	    	FileReader obrirFitxer = new FileReader(fitxer);
	        BufferedReader lector = new BufferedReader(obrirFitxer);
        	long testsIniLinkedList = 0;
        	long testsFiLinkedList = 0;
        	long testsMigLinkedList = 0;
        	long testsIniArrayList = 0;
        	long testsFiArrayList = 0;
        	long testsMigArrayList = 0;
        	int comptadorTestIni = 0;
        	int comptadorTestFi = 0;
        	int comptadorTestMig = 0;
	        
	        while (true) {
	        	String linia = lector.readLine();
	        	
	        	if (linia == null) break;
	        	
	        	String[] valorTests = linia.split(",");
	        	
	        	String test = valorTests[0];
	        	if (test.equals("inici")) {
	        		testsIniLinkedList += Long.parseLong(valorTests[1]);
	        		testsIniArrayList += Long.parseLong(valorTests[2]);
	        		comptadorTestIni++;
	        	}
	        	
	        	if (test.equals("final")) {
	        		testsFiLinkedList += Long.parseLong(valorTests[1]);
	        		testsFiArrayList += Long.parseLong(valorTests[2]);
	        		comptadorTestFi++;
	        	}
	        	
	        	if (test.equals("mig")) {
	        		testsMigLinkedList += Long.parseLong(valorTests[1]);
	        		testsMigArrayList += Long.parseLong(valorTests[2]);
	        		comptadorTestMig++;
	        	}
	        }	
	        
	        long mitjaIniLinkedList = testsIniLinkedList / comptadorTestIni;
	        long mitjaIniArrayList = testsIniArrayList / comptadorTestIni;
	        long resultatIni = (Math.max(mitjaIniLinkedList, mitjaIniArrayList) / Math.min(mitjaIniLinkedList, mitjaIniArrayList));
	        
	        long mitjaFiLinkedList = testsFiLinkedList / comptadorTestFi;
	        long mitjaFiArrayList = testsFiArrayList / comptadorTestFi;
	        long resultatFi = (Math.max(mitjaFiLinkedList, mitjaFiArrayList) / Math.min(mitjaFiLinkedList, mitjaFiArrayList));
	        
	        long mitjaMigLinkedList = testsMigLinkedList / comptadorTestMig;
	        long mitjaMigArrayList = testsMigArrayList / comptadorTestMig;
	        long resultatMig = (Math.max(mitjaMigLinkedList, mitjaIniArrayList) / Math.min(mitjaMigLinkedList, mitjaMigArrayList));
	        
	        System.out.println("Resultat test inici LinkedList" + "(" + mitjaIniLinkedList +")" + "    vs " + "ArrayList" + "(" + mitjaIniArrayList +")" + ": " +
							   ((testsIniLinkedList < testsIniArrayList) ? 
						   	   "LinkedList guanya per " + resultatIni : 
							   "ArrayList  guanya per " + resultatIni));
			
			System.out.println("Resultat test final LinkedList" + "(" + mitjaFiLinkedList +")" + "    vs " + "ArrayList" + "(" + mitjaFiArrayList +")" + "  : " +
							   ((testsFiLinkedList < testsFiArrayList) ? 
						   	   "LinkedList guanya per " + resultatFi : 
							   "ArrayList  guanya per " + resultatFi));
			
			System.out.println("Resultat test mig   LinkedList" + "(" + mitjaMigLinkedList +")" + " vs " + "ArrayList" + "(" + mitjaMigArrayList +")" + ": " +
							   ((testsMigLinkedList < testsMigArrayList) ? 
						   	   "LinkedList guanya per " + resultatMig : 
							   "ArrayList  guanya per " + resultatMig));
	        lector.close();	           
        }  else {
        	System.out.println("No hi ha cap test");
        	return;
        }
    }
}