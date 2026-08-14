/* Enunciat

Hem fet una visita a la Sra. Estrella per veure com li anava la nova actualització, i com no? també gaudir de la seva hospitalitat amb un vinet. Tot i que es mostra contenta, ens comenta que potser li aniria bé disposar de més característiques per la cerca. Per exemple, la graduació del vi, el celler, la temperatura recomanada, i un inacabable etcètera.

Ens diu que no té presa, però. Simplement que anem pensant-hi. I això fem.

Què ens costaria afegir una nova propietat de vi al disseny actual? Ens preguntem.

La resposta és: molt!

El cert és que hauríem de modificar pràcticament totes les classes de l'aplicació:

    Vi i Especificacio han de disposar de la nova propietat

    Botiga: ha de considerar la nova propietat per la cerca.

    Entorn: ha de considerar la nova propietat per demanar les dades.

Ops! Molta feina!

Ara que tenim temps, és un bon moment per plantejar canvis en l'estructura de l'aplicació de manera que ens facilitin les ampliacions que la nostra clienta ens demanarà en breu.

Anem a pams
Vi i Especificacio

Entre aquestes dues classes no tenim ara per ara una relació directa. Malgrat això, ambdues classes dupliquen una bona part de les propietats d'un vi!

Ja que tenim Especificacio que conté el nom, l'origen, el tipus i la collita, no podríem fer que Vi contingués una especificació en comptes dels atributs per separat?

class Vi { - ref: String - preu: int - estoc: int - lloc: String - espec: Especificacio + Vi(ref, preu, lloc, espec) + getRef(): String + getPreu(): int + setPreu(int) + getEstoc(): int + setEstoc(int) + getLloc(): String + setLloc(lloc) + getEspec(): Especificacio + aArrayString(): String[] + {static} deArrayString(String[]): Vi + {static} esValid(ref, preu, estoc, lloc, espec):boolean } class Especificacio { - nom: String - origen: String - tipus: String - collita: Collita + Especificacio(nom, origen, tipus, collita) + getNom(): String + getOrigen(): String + getTipus(): String + getCollita(): String + esComplet(): boolean } Vi *-right- Especificacio Botiga o-- Vi Botiga --> Especificacio hide class circle hide enum circle hide enum method skinparam classAttributeIconSize 0 skinparam class { BackgroundColor White BorderColor Black ArrowColor Black }

És clar que Especificacio està pensat per ser usat com a plantilla i que si l'afegim tal qual a un Vi, podem trobar-nos amb valors no definits.

Per resoldre aquest problema, farem que:

    Especificacio disposi d'un mètode que ens digui si és complet o bé alguna de les seves propietats està indefinida.

    Així Especificacio.esComplet() ens retornarà true quan cap dels valors (recordem que estan normalitzats) sigui null.

    Vi.esValid() requerirà que l'especificació sigui completa per retornar true.

Vi.toString()

Fins ara hem estat mostrant els vins fent servir Vi.toString(). Ha estat una manera molt convenient. El problema és que amb el nou disseny, antigues propietats de Vi ara es trobaran a Especificacio i l'ordre sí que resulta important.

Hem enviat un missatge a la nostra clienta amb el següent contingut

    Estimada Estrella

    Fins ara l'aplicació mostra els vins d'aquesta manera:

    Ref: MATISNEG20190011
    Nom: Matís Negre
    Preu: 1325
    Estoc: 12
    Lloc: P20E01N12E
    D.O.: Pla de Bages
    Tipus: negre
    Collita: 2019

    Teniu cap inconvenient que sigui d'aquesta altra?

    Ref: MATISNEG20190011
    Nom: Matís Negre
    D.O.: Pla de Bages
    Tipus: negre
    Collita: 2019
    Preu: 1325
    Estoc: 12
    Lloc: P20E01N12E

En un moment, rebem una elaborada resposta pròpia d'algú a qui li sobra el temps:

    bé

Així, ja podem modificar Vi.toString() i afegir un Especificacio.toString() de manera que Vi no tingui perquè saber res de quines propietats tenim a Especificacio!

class Vi { + toString(): String } class Especificacio { + toString(): String } Vi *-right- Especificacio hide class circle hide enum circle hide enum method skinparam classAttributeIconSize 0 skinparam class { BackgroundColor White BorderColor Black ArrowColor Black }
Serialització de Vi

El darrer punt en que encara Vi ha de conèixer les propietats de que es composa l'espeficiació és en els mètodes de serialització: aArrayString() i deArrayString().

Mourem part d'aquests dos mètodes a Especificacio.

A l'igual que passava amb toString() que el nom formi part de l'especificació i estigui entre mig de les propietats de Vi, ens complica una mica. Aquí hem optat per no modificar l'ordre de les columnes al fitxer botiga.csv. Així, Vi haurà de ser conscient que les especificacions inclouen el nom del vi.

class Vi { + aArrayString(): String[] + {static} deArrayString(String[]): Vi } class Especificacio { + aArrayString(): String[] + {static} deArrayString(String[]): Especificacio } Vi *-right- Especificacio hide class circle hide enum circle hide enum method skinparam classAttributeIconSize 0 skinparam class { BackgroundColor White BorderColor Black ArrowColor Black }
Cerca a Botiga

La implementació anterior de Botiga requeria comparar cada propietat de Vi amb el requerit per la plantilla rebuda.

Això fa que si volem afegir o modificar alguna de les propietats, ens caldrà modificar també Botiga.

Per evitar-ho, mourem la responsabilitat de saber si les especificacions dun vi es corresponen o no a una especificació, a la classe Especificacio.

Així, Especificacio disposarà d'un nou mètode anomenat esPlantillaDe() que rebrà un Vi i retornarà true en cas que la plantilla sigui vàlida pel vi, o si vols, que els valors que especifica la plantilla són satisfets pel vi.
Entorn

La classe Entorn continua sent dependent de les propietats de Vi. Malauradament, de moment, no sabem com independitzar-la. Potser en un futur.
El diagrama final

El nou disseny tindrà el següent aspecte:

class Botiga { + cerca(ref: String): Vi + cerca(espec: Especificacio): List<Vi> + cerca(espec: Especificacio, preuMax: int, estocMin: int): List<Vi> } class Vi { - ref: String - preu: int - estoc: int - lloc: String - espec: Especificacio + Vi(ref, preu, lloc, espec) + getRef(): String + getPreu(): int + setPreu(int) + getEstoc(): int + setEstoc(int) + getLloc(): String + setLloc(lloc) + getEspec(): Especificacio + toString(): String + aArrayString(): String[] + {static} deArrayString(String[]): Vi + {static} esValid(ref, preu, estoc, lloc, espec):boolean } class Especificacio { - nom: String - origen: String - tipus: String - collita: Collita + Especificacio(nom, origen, tipus, collita) + getNom(): String + getOrigen(): String + getTipus(): String + getCollita(): String + toString(): String + esComplet(): boolean + aArrayString(): String[] + {static} deArrayString(String[]): Especificacio + esPlantillaDe(Vi): boolean } Entorn *-- Botiga Entorn --> Vi Entorn --> Especificacio Botiga o-- Vi Botiga --> Especificacio class Especificacio #yellow hide class circle hide enum circle hide enum method skinparam classAttributeIconSize 0 skinparam class { BackgroundColor White BorderColor Black ArrowColor Black }

Diagrama de classes de la botiga de vins amb especificacions independents

*/

public class Vi {
    private final String ref;
    private int preu;
    private int estoc = 0;
    private String lloc;
    private Especificacio espec;
    
    public Vi(String ref, int preu, int estoc, String lloc, Especificacio espec) {
    	if (!Vi.esValid(ref, preu, estoc, lloc, espec)) {
        	throw new IllegalArgumentException("El vi ha de ser vàlid");
        }
        this.ref = UtilString.normalitzaString(ref);
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
        if (espec.esComplet()) {
		    this.espec = espec;        
        }
    }

    public String getRef() {
        return this.ref;
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
    
    public Especificacio getEspec() {
    	return this.espec;
    }
    
    public String[] aArrayString() {
        String ref = this.getRef();
        String nom = this.getEspec().getNom();
        int preu = this.getPreu();
        int estoc = this.getEstoc();
        String lloc = this.getLloc();
        String origen = this.getEspec().getOrigen();
        String tipus = this.getEspec().getTipus();
        String collita = this.getEspec().getCollita();
        
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
        Especificacio atributsEspec = new Especificacio(nom, origen, tipus, collita);
        
        if (!esValid(ref, preu, estoc, lloc, atributsEspec)) { 
            return null; 
        }
        return new Vi(ref, preu, estoc, lloc, atributsEspec);
    }
    
    public static boolean esValid(String ref, int preu, int estoc, String lloc, Especificacio espec) {
    	String nom = espec.getNom();
    	String origen = espec.getOrigen();
    	String tipus = espec.getTipus();
    	String collita = espec.getCollita();
    	
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
        return String.format("%n    Ref: %s%n%s    Preu: %d%n    Estoc: %d%n    Lloc: %s%n", ref, espec, preu, estoc, lloc);
    }
}
