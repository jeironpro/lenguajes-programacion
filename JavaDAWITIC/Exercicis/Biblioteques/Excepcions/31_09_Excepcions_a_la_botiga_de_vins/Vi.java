/*
Enunciat

La nostra aplicació està funcionant força bé. La Sra. Estrella està contenta i ha començat a provar-la amb els seus clients. El Tomet no està tant content perquè li ha tocat anar introduint tots els vins a botiga.csv però, com dirien els savis "averestudiao".

Ara que tenim un moment de descans, és un bon moment per millorar el nostre codi.

Un dels punts febles del codi és la gestió d'errors. En concret, la classe Botiga fa un cert abús del retorn de null cada cop que troba un error. Alguns errors pot ser raonable gestionar-los així però d'altres definitivament no.

class Entorn class Botiga class Vi class BotigaException extends Exception { BotigaException() BotigaException(missatge: String) } Botiga --> BotigaException Entorn --> BotigaException class Exception #lightgrey class BotigaException #yellow Botiga o-- Vi Entorn *-- Botiga Entorn --> Vi hide class circle skinparam classAttributeIconSize 0 skinparam class { BackgroundColor White BorderColor Black ArrowColor Black }

Diagrama de l'aplicació

Aquests són els errors que haurem de controlar amb excepcions a partir d'ara:

    el constructor Botiga(int maxVins), en comptes de posar el valor per defecte, llençarà una excepció IllegalArgumentException quan se li passi un valor menor que 1.

    El missatge que inclourà a l'excepció serà: "No es pot crear una botiga amb menys d'un vi".

    el mètode Botiga.cerca(String) llençarà l'excepció IllegalArgumentException quan rebi el valor null com a valor. El missatge serà "La referència no pot ser null".

    el mètode Botiga.cerca(Vi) llençarà l'excepció IllegalArgumentException quan rebi el valor null com a plantilla. El missatge serà "La plantilla no pot ser null".

    el mètode Botiga.afegeix() llençarà l'excepció IllegalArgumentException quan rebi el valor null com a vi a afegir. El missatge serà "El vi no pot ser null".

    el mètode Botiga.afegeix() llençarà l'excepció IllegalArgumentException quan rebi un vi no vàlid. El missatge serà "El vi ha de ser vàlid".

    el mètode Botiga.afegeix() llençarà l'excepció IllegalArgumentException quan rebi una instància de vi amb una referència que ja existeixi a la botiga. El missatge serà "Referència de vi repetida".

    el mètode Botiga.afegeix() llençarà l'excepció BotigaException quan la botiga estigui plena. Es tracta d'una nova excepció que hem de crear, que heretarà directament de Exception i que oferirà un constructor específic per determinar el missatge, i un per defecte que establirà com a missatge "Botiga plena".

    el mètode Botiga.elimina() llençarà l'excepció IllegalArgumentException quan rebi el valor null, amb el missatge "La referència no pot ser null".

    el mètode Botiga.elimina() llençarà l'excepció IllegalArgumentException quan es demani un vi que no sigui a la botiga, amb el missatge "La instància a eliminar ha d'estar present".

    el mètode Botiga.elimina() llençarà l'excepció IllegalArgumentException quan es demani un vi que tingui estoc, amb el missatge "El vi a eliminar no pot tenir estoc".

Com que alguns d'aquests mètodes generaran excepcions gestionades, caldrà modificar el codi de Entorn.

En carregar els vins guardats a botiga.csv, si es troba que hi ha massa, Entorn mostrarà el missatge "ERROR: massa entrades a botiga.csv" i permetrà treballar amb els vins que s'hagin pogut carregar.

De moment ens quedarem aquí, doncs l'objectiu no és tant ser exhaustius com començar a introduir el mecanisme d'excepcions a la nostra aplicació.
*/

public class Vi {
    private final String nom;
    private int preu;
    private int estoc = 0;

    public Vi(String nom, int preu) {
        this.nom = normalitzaNom(nom);
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.setPreu(preu);
        }
    }

    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.setPreu(preu);
        }
        if (estoc < 0) {
            this.estoc = -1;
        } else {
            this.setEstoc(estoc);
        }
    }

    public String getNom() { return this.nom; }

    public int getPreu() { return this.preu; }

    public void setPreu(int preu) { 
        if (preu >= 0) { this.preu = preu; }
    }

    public int getEstoc() { return this.estoc; }

    public void setEstoc(int estoc) { 
        if (estoc >= 0) { this.estoc = estoc; }
    } 

    public boolean esValid() {
        if (this.getNom().equals("NOM NO VÀLID!")) { return false; }
        if (this.getPreu() < 0) { return false; }
        if (this.getEstoc() < 0) { return false; }
        return true;
    }

    public String[] aArrayString() {
        String[] viArray = new String[3];
        String nom = this.getNom();
        int preu = this.getPreu();
        int estoc = this.getEstoc();
        
        viArray[0] = nom;
        viArray[1] = "" + preu;
        viArray[2] = "" + estoc;
        return viArray;
    }

    @Override
    public String toString() {
        return String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n", this.getNom(), this.getPreu(), this.getEstoc());
    }

    public static String normalitzaNom(String nom) {
        if (nom.isBlank()) {
            return "NOM NO VÀLID!";
        }

        nom = nom.strip();
        String nomNormalitzat = "";
        boolean espai = false;

        for (int i = 0; i < nom.length(); i++) {
            char c = nom.charAt(i);

            if (!Character.isWhitespace(c)) {
                nomNormalitzat += c;
                espai = false;
            } else {
                if (!espai) {
                    nomNormalitzat += " ";
                }
                espai = true;
            }
        }
        return nomNormalitzat;
    }

    public static Vi deArrayString(String[] atributsVi) {
        if (atributsVi.length < 3 || atributsVi.length > 3) {
            return null;
        }
        if (!UtilString.esEnter(atributsVi[1]) || !UtilString.esEnter(atributsVi[2])) {
            return null;
        }
        String nom = atributsVi[0];
        int preu = UtilString.aEnter(atributsVi[1]);
        int estoc = UtilString.aEnter(atributsVi[2]);
        
        Vi vi = new Vi(nom, preu, estoc);
        
        if (!vi.esValid()) { return null; }
        return vi;
    }
}