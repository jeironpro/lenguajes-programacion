/* 
Enunciat

En aquesta iteració del nostre projecte, afegirem la capacitat de guardar i recuperar les dades dels vins en un fitxer, de manera que puguin ser accedides en diferents execucions de l'aplicació.

Diagrama de classes de la botiga de vins

Entorn en arrencar mirarà de llegir les dades del fitxer botiga.csv. En cas de no existir, la botiga restarà buida. Tant si existeix el fitxer com si no, Entorn informarà després del missatge de benvinguda, quants vins ha carregat del fitxer. "Referències llegides: 432".

En sortir, el programa guardarà les dades al fitxer. Per simplicitat, guardarà les dades sempre, encara que no hi hagi hagut canvis. Abans del missatge de comiat, indicarà el nombre de vins guardats al fitxer. "Referències guardades: 432".

Dotarem a la classe Vi d'un parell de mètodes nous que ens simplificaran la tasca de convertir de línies de csv a vi i viceversa.

    deArrayString(): aquest mètode estàtic rep un array de Strings que ha de contenir els valors dels diferents atributs d'un vi en forma de String i ens retorna un vi inicialitzat amb aquests valors. Si algun dels valors rebuts no fos adequat per l'atribut corresponent de vi, retornarà null.

    aArrayString(): aquest mètode retorna un array de Strings amb els valors del vi.

L'ordre dels atributs a l'array de Strings pot ser el que vulguem, sempre i quant sigui el mateix per deArrayString() i aArrayString(). Per exemple, podria ser nom, preu, estoc.

Per carregar els vins del fitxer no ens cal cap modificació de Botiga doncs podem anar llegint línia a línia, convertint-lo a Vi amb l'ajut de Vi.deArrayString() i, si hem tingut èxit, afegir el nou vi de la manera habitual a la botiga.

Per guardar els vins que ja hi són a la botiga, però, sí ens cal quelcom que encara no tenim: la possibilitat de recòrrer tots els vins que disposa la botiga. Per a aconseguir aquesta funcionalitat, afegirem dos nous mètodes a Botiga:

    iniciaRecorregut(): comença el recorregut dels vins de la botiga.

    getSeguent(): retorna el següent vi del recorregut. Si no hi ha més vins, retornarà null.

Així, per mostrar tots els vins disponibles a la botiga, podrem fer quelcom similar a:

botiga.iniciaRecorregut();

while (true) {

    Vi vi = botiga.getSeguent();

    if (vi == null) break;

    System.out.println(vi);

}

Considerarem que el fitxer CSV no conté capçaleres i que les files hauran de correspondre als valors separats per punt i coma (;) i no per una simple coma, ja que sospitem que algun vi podria tenir un nom tan sofisticat que requerís aquest símbol.

Un exemple de contingut esperable al fitxer botiga.csv podria ser:

Roura blanc;1234;24
El Quintà;1485;12
Almodi Petit Blanc;570;32

En cas que trobem una línia del fitxer que no contingui totes les dades requerides, o bé que el valor d'algun dels camps no sigui convertible al tipus que esperem, simplement la ignorarem. D'aquestes comprovacions se n'encarrega el mètode Vi.deArrayString().
Què haig de fer?

Implementa els canvis necessaris perquè l'aplicació pugui mantenir la informació de vins d'una execució a la següent.

Els canvis a realitzar són:

    afegir els nous mètodes a Botiga.

    afegir els nous mètodes a Vi.

    afegir la funcionalitat a l'entorn de carregar en arrencar i guardar en sortir.

Pistes

Llegeix això només si trobes problemes per realitzar alguna de les parts d'aquesta ampliació.
Ajuntar i separar línies de CSV

Un dels problemes que has de resoldre per realitzar aquesta ampliació és la manipulació de línies de CSV.

Per convertir les línies de CSV a un array de Strings ja saps que disposes del mètode String.split() però, com fas l'operació inversa? Per descomptat, la pots programar amb un bucle. A aquestes alçades segur que no et resulta difícil composar un String amb els elements d'un array separats per ;. Hi ha però una opció més immediata: String.join().

Considera aquest fragment de codi que converteix una entrada amb elements separats per , als mateixos elements però separats per ;:

String comes = "una,dues,tres";

String[] paraules = comes.split(",");           // {"una", "dues", "tres"}

String puntIComes = String.join(";", paraules); // una;dues;tres

Recorregut de la botiga

Per poder guardar els vins de la botiga, ens cal poder accedir a aquests de manera seqüencial. El problema és que fins ara Botiga només ens permet consultar els vins a partir del mètode cerca(), que no és adequat pel nostre objectiu actual.

El que ens cal és poder recorrer els vins des del primer al darrer, com si fos un array de vins. Com que no volem lliurar l'array de vins amb el que emmagatzema Botiga els vins, el que farem serà implementar un mecanisme de recorregut casolà.

La idea bàsica és que et cal una nova variable que et permeti saber quin serà el següent vi a retornar. Aquesta variable haurà de posar-se a 0 quan es demana iniciar el recorregut i anar-se incrementant a mida que ens van demanant retornar el següent. En el moment que arriba al límit de l'array de vins, no ha de continuar.

Un problema és que no totes les posicions de l'array de vins estan sempre ocupades. Amb la implementació actual, quan eliminem un vi, marquem la seva posició amb null. Això obligarà el teu getSeguent() a saltar espais buits.
*/

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

public class Entorn {
    private final Botiga botiga = new Botiga();
    private static final String ruta = "botiga.csv";
    private static int quantsVins = 0;
    
    public static void main(String[] args) throws IOException {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        entorn.carregaVins();        
        
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine();
            
            if (comanda.isEmpty()) { continue; }
            if (comanda.equals("surt")) { break; }
            
            switch (comanda) {
                case "ajuda": mostraAjuda();
                    break;
                case "afegeix": mostraComandaNoDisponible();
                    break;
                case "cerca": entorn.processaCerca();
                    break;
                case "modifica": mostraComandaNoDisponible();
                    break;
                case "elimina": mostraComandaNoDisponible();
                    break;
                default: mostraErrorComandaDesconeguda();
            };
        }
        mostraComiat();
    }
    
    public static void mostraBenvinguda() {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
    }
    
    public static void mostraPrompt() {
        System.out.print("botiga> ");
    }
    
    public static void mostraAjuda() {
        System.out.println("Comandes disponibles:");
        System.out.println("ajuda");
        System.out.println("cerca");
        System.out.println("surt");
    }
    
    public static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
    
    public static void mostraComandaNoDisponible() {
    	System.out.println("Comanda temporalment no disponible");
    }
    
    public static void mostraComiat() {
        System.out.println("adéu");
    }
    
    public static String llegirValorPropietat(String propietat) {
    	System.out.print(propietat);
    	String valor = Entrada.readLine();
    	return valor;
    } 

    public void processaCerca() {
        System.out.print("ref> ");
        String ref = Entrada.readLine();

        if (ref.equals("!")) {
            return;
        }
        
    	try {
        	if (!ref.isBlank()) {
		    	Vi cercaRef = botiga.cerca(ref);        	
		    	if (cercaRef != null) {
				    System.out.printf("Trobat:%s%n", cercaRef);
				    return;
				} else {
				    System.out.println("No trobat");
				    return;
				}
		    } else {
		        processaCercaPlantilla();
		    }
        } catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
    public void processaCercaPlantilla() {
    	String nom = "";
        String preu = "";
        String estoc = "";
        String origen = "";
        String tipus = "";
        String collita = "";
        int preuEnter = -1;
        int estocEnter = -1;

        while (true) {
            nom = llegirValorPropietat("nom> ");

            if (nom.equals("!")) {
            	nom = "";
                break;
            }
            
            preu = llegirValorPropietat("preu max.> ");

            if (preu.equals("!")) {
                break;
            }
            
            if (!preu.isEmpty() && !UtilString.esEnter(preu)) {
            	System.out.println("ERROR: el valor ha de ser un enter positiu");
            	return;
            } else if (!preu.isEmpty() && UtilString.esEnter(preu)) {
                preuEnter = UtilString.aEnter(preu);                   
            }
    
            estoc = llegirValorPropietat("estoc min.> ");

            if (estoc.equals("!")) {
                break;
            }
            
            if (!estoc.isEmpty() && !UtilString.esEnter(estoc)) {
            	System.out.println("ERROR: el valor ha de ser un enter positiu");
            	return;
            } else if (!estoc.isEmpty() && UtilString.esEnter(estoc)) {
                estocEnter = UtilString.aEnter(estoc);                   
            }
    
            origen = llegirValorPropietat("D.O.> ");

            if (origen.equals("!")) {
            	origen = "";
                break;
            }
    
            tipus = llegirValorPropietat("tipus> ");

            if (tipus.equals("!")) {
            	tipus = "";
                break;
            }
    
            collita = llegirValorPropietat("collita> ");

            if (collita.equals("!")) {
            	collita = "";
                break;
            }
            break;
        }
        Especificacio espec = new Especificacio(nom, origen, tipus, collita);
        try {
		    List<Vi> cercatEspec = botiga.cerca(espec, preuEnter, estocEnter);
		    
		    if (cercatEspec.size() == 0) {
			    System.out.println("No trobat");
				return;		    	
		    }
		    System.out.printf("Trobat:%n");
		    for (Vi vi: cercatEspec) {
		    	System.out.println(vi);
	    	}
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
    public void carregaVins() throws IOException {
        File fitxer = new File(ruta);
        if (fitxer.exists()) {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            
            while (true) {
                String dadesVi = lector.readLine();
                if (dadesVi == null) { break; }
                
                String[] arrayVi = dadesVi.split(";");
                Vi vi = Vi.deArrayString(arrayVi);
                if (vi != null) {
		            botiga.afegeix(vi);
	                quantsVins++;
                }
            }
            lector.close();
        } 
        System.out.printf("Referències llegides: %s%n", quantsVins);
    }
}
