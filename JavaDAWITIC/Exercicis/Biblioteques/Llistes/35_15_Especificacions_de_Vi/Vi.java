/* Enunciat

Amb els canvis de l'exercici anterior hem millorat força la usabilitat de l'aplicació.

Hi ha, però, un element que "canta": per cercar els vins, el mètode Botiga.cerca() ens cal crear un Vi. El vi que li passem, però, no és exactament un Vi.

Per exemple, no li cal tenir referència, ja que si la té, faríem servir el Botiga.cerca(String). A més, el preu no és tampoc el preu real del vi sinó un màxim, i l'estoc es refereix al mínim necessari. Finalment, la resta d'atributs poden ser null per especificar que no cal considerar-lo en la cerca.

Quan dissenyem aplicacions orientades a objectes, hem de ser conscients de que aquests tipus d'incoherències tard o d'hora ens portaran problemes.

El cert és que, com ja ho diu bé el nom del seu paràmetre, el mètode cerca() espera una especificació de vi i no un vi!. Si el concepte especificació de vi sembla tenir tanta rellevància, potser ja va sent hora que li reconeguem, no trobes?

Tenint tot això en compte, millorem el nostre disseny afegint la classe Especificacio segons el següent diagrama.

class Botiga { + cerca(ref: String): Vi + cerca(espec: Especificacio): List<Vi> + cerca(espec: Especificacio, preuMax: int, estocMin: int): List<Vi> } class Vi { + Vi(ref, nom, preu, lloc, estoc, origen, tipus, collita) + getRef(): String + getNom(): String + getPreu(): int + setPreu(int) + getEstoc(): int + setEstoc(int) + getLloc(): String + setLloc(lloc) + getOrigen(): String + getTipus(): String + getCollita(): String + aArrayString(): String[] + {static} deArrayString(String[]): Vi + {static} esValid(ref, nom, preu, estoc, lloc, origen, tipus, collita):boolean } class Especificacio { + Especificacio(nom, origen, tipus, collita) + getNom(): String + getOrigen(): String + getTipus(): String + getCollita(): String } Entorn *-- Botiga Entorn --> Vi Entorn --> Especificacio Botiga o-- Vi Botiga --> Especificacio class Especificacio #yellow hide class circle hide enum circle hide enum method skinparam classAttributeIconSize 0 skinparam class { BackgroundColor White BorderColor Black ArrowColor Black }

Diagrama de classes de la botiga de vins amb Especificacio
El mètode Botiga.cerca()

Com que les especificacions de vi no disposen de totes les propietats, Botiga ha d'oferir diferents mètodes de cerca. Fins ara n'oferia dos: cerca(ref) i cerca(plantilla). Ara reemplaçarem aquest últim per cerca(espec) i n'afegirem cerca(espec, preuMax, estocMin). un més per permetre cercar per preu màxim i per estoc mínim. Fixa't que cerca(espec) serà equivalent a cerca(espec, -1, -1).

Deixarà d'estar disponible la cerca per localització. No és un gran problema. La raó principal de la cerca sol ser trobar aquesta localització i, si ja la sap, el més probable és que la sra. Estrella vagi directament a agafar l'ampolla que no pas usi l'aplicació.

Tot plegat fa que, una Especificacio sigui un valor immutable doncs totes les seves propietats són fixes en el moment de la creació. Això, com veurem més endavant, ens resultarà molt útil.
El Vi sempre correcte

L'aparició de la classe Especificacio ens permet afegir un sistema de seguretat per la classe Vi de manera que una instància no pugui tenir valors no vàlids. Ara, en cas que intentem construir un vi amb algun valor no vàlid, o bé intentem modificar-lo de manera que quedi no vàlid, llençarem l'excepció IllegalArgumentException. És una RuntimeException ja que considerem que seria un error del nostre codi si es produís.

Ara esValid() deixa de tenir sentit per validar una instància però sí el voldrem per assegurar-nos que els valors són vàlids abans de crear una. Per aquesta raó, passa a ser estàtic.

La validesa dels atributs de Vi són:

    els valors de tipus String no poden ser buits, només blancs ni null.

    el preu i l'estoc no poden ser negatius (ni tant sols -1)

Aquests valors, però, continuaran sent vàlids per les propietats de Especificacio.

Finalment, la classe Especificacio acceptarà null com valor per les seves propietats. El que indicarà que no s'està especificant i que s'accepta qualsevol.

Aquests canvis requeriran petites modificacions addicionals. Per exemple, en el mètode Botiga.afegeix().
*/

public class Vi {
    private final String ref;
    private final String nom;
    private int preu;
    private int estoc = 0;
    private String lloc;
    private String origen;
    private String tipus;
    private String collita;
    
    public Vi(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
    	if (!Vi.esValid(ref, nom, preu, estoc, lloc, origen, tipus, collita)) {
        	throw new IllegalArgumentException("El vi ha de ser vàlid");
        }
        this.ref = UtilString.normalitzaString(ref);
        this.nom = UtilString.normalitzaString(nom);
        
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
        
        if (estoc < 0) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
        
        this.lloc = UtilString.normalitzaString(lloc);
        this.origen = UtilString.normalitzaString(origen);
        this.tipus = UtilString.normalitzaString(tipus);
        this.collita = UtilString.normalitzaString(collita);
    }

    public String getRef() {
        return this.ref;
    }
    
    public String getNom() { 
        return this.nom; 
    }
    
    public int getPreu() { 
        return this.preu; 
    }
    
    public void setPreu(int preu) { 
    	if (preu < 0) {
    		throw new IllegalArgumentException("El preu ha de ser vàlid");
    	}
        this.preu = preu; 
    }
    
    public int getEstoc() { 
        return this.estoc; 
    }
    
    public void setEstoc(int estoc) { 
    	if (estoc < 0) {
    		throw new IllegalArgumentException("L'estoc ha de ser vàlid");
    	}
        this.estoc = estoc; 
    }

    public String getLloc() {
        return this.lloc;
    }

    public void setLloc(String lloc) {
    	if (lloc == null || lloc.isBlank()) {
    		throw new IllegalArgumentException("El lloc ha de ser vàlid");
    	}
	    this.lloc = UtilString.normalitzaString(lloc);
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getTipus() {
        return this.tipus;
    }

    public String getCollita() {
        return this.collita;
    }
    
    public String[] aArrayString() {
        String ref = this.getRef();
        String nom = this.getNom();
        int preu = this.getPreu();
        int estoc = this.getEstoc();
        String lloc = this.getLloc();
        String origen = this.getOrigen();
        String tipus = this.getTipus();
        String collita = this.getCollita();
        
        String[] viArray = new String[] {
            ref, nom, "" + preu, "" + estoc, lloc, origen, tipus, collita
        };
        return viArray;
    }
    
    public static Vi deArrayString(String[] atributsVi) {
        if (atributsVi.length != 8) {
            return null;
        }
        if (!UtilString.esEnter(atributsVi[2])) {
            return null;
        }
        if (!UtilString.esEnter(atributsVi[3])) {
            return null;
        }

        String ref = atributsVi[0];
        String nom = atributsVi[1];
        int preu = UtilString.aEnter(atributsVi[2]);
        int estoc = UtilString.aEnter(atributsVi[3]);
        String lloc = atributsVi[4];
        String origen = atributsVi[5];
        String tipus = atributsVi[6];
        String collita = atributsVi[7];
        
        if (!esValid(ref, nom, preu, estoc, lloc, origen, tipus, collita)) { 
            return null; 
        }
        return new Vi(ref, nom, preu, estoc, lloc, origen, tipus, collita);
    }
    
    public static boolean esValid(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
        String[] atributs = new String[] {
            ref, nom, lloc, origen, tipus, collita
        };

        for (String atribut: atributs) {
            if (atribut == null || atribut.isBlank()) {
                return false;
            }
        }

        if (preu < 0) { 
            return false; 
        }
        
        if (estoc < 0) { 
            return false; 
        }
        return true;
    }
    
    @Override
    public String toString() {
        return String.format("%n    Ref: %s%n    Nom: %s%n    Preu: %d%n    Estoc: %d%n    Lloc: %s%n    D.O.: %s%n    Tipus: %s%n    Collita: %s%n", ref, nom, preu, estoc, lloc, origen, tipus, collita);
    }
}
