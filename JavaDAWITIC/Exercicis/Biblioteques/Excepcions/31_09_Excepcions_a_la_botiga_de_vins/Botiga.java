/* 
Enunciat

Un cop ja tenim la classe Vi és un bon moment per implementar la classe Botiga.

class Botiga { - DEFAULT_MAX_VINS: int = 10 - vins: Vi[] + Botiga() + Botiga(maxVins: int) + afegeix(Vi): Vi + elimina(String): Vi + cerca(nom: String): Vi } class Botiga #yellow class Vi class Entorn #lightgrey Botiga o-- Vi Entorn *-- Botiga Entorn -- Vi hide class circle skinparam classAttributeIconSize 0 skinparam class { BackgroundColor White BorderColor Black ArrowColor Black }

Diagrama de classes de la botiga de vins

La classe Botiga ens permetrà gestionar la col·lecció de vins de la botiga de la Sra. Estrella.

Donat que necessitarem emmagatzemar vàries instàncies de Vi, en aquesta primera versió farem servir un array de Vi.

Suposarem que la botiga tindrà un nombre màxim de vins. Aquest màxim pot ser indicat amb el constructor específic, o bé pren el valor per defecte indicat per la constant DEFAULT_MAX_VINS, que val 10, en cas que no sigui indicat o que el valor indicat sigui menor que 1.
_images/botigaarray_01.svg

El diagrama anterior representa l'array vins amb un màxim de 8 vins, que de moment només en disposa de dos.

El mètode afegeix() ens permetrà afegir un nou vi a la col·lecció. Per fer-ho, comprovarà que el vi sigui vàlid i no hi hagi cap altre vi amb el mateix nom a la col·lecció. Si troba un altre vi amb el mateix nom, no fa res i retorna null. Un cop comprovar que no hi ha cap altre vi amb el mateix nom, cercarà una entrada de l'array que apunti a null, la ocuparà amb el nou vi i retornarà el vi introduït com a senyal que tot ha anat bé.

En cas que no trobi cap espai buit, retornarà null per indicar que no ha anat bé.

La funcionalitat més important de la botiga és la possibilitat de cercar un vi. De moment només permetrà cercar pel nom. cerca() rebrà un String que cercarà pels vins de la botiga fins a trobar un que tingui aquest valor com a nom. En cas de trobar-lo, el retornarà. Altrament retornarà null. Caldrà normalitzar el nom del vi per cercar-lo.

El mètode elimina() ens permet eliminar un vi de la botiga. El mètode rep el nom d'un vi i intenta trobar una instància de Vi amb aquest nom, dins la coŀlecció. Si no la troba, retorna null per indicar que no ha tingut èxit. En cas de trobar la instància, comprovarà si encara té estoc. Si és així, també retornarà null i no l'eliminarà. Finalment, si la instància no té estoc, marcarà la seva posició a l'array com a null i la retornarà.

Per descomptat, tant cerca() com elimina() normalitzaran el nom a cercar. Altrament, és fàcil que no el trobin!
Què haig de fer?

Implementa la classe Botiga amb la descripció anterior.

Per provar la teva classe, considera UsaBotiga.java:

public class UsaBotiga {

    public static void main(String[] args) {

        System.out.println("Creem uns quants vins");

        Vi[] vins = {

            new Vi("Roura Blanc", 1234, 42),

            new Vi("Cercium", 535, 30),

            new Vi("Llum d'Alba Blanc", 1750, 12)

        };

        for (int i=0; i<vins.length; i++) {

            System.out.println("Creat" + vins[i]);

        }


        Botiga botiga = new Botiga(vins.length - 1);    // no hi cabran tots els vins

        System.out.println("Afegim els vins creats a la botiga");

        for (int i=0; i<vins.length; i++) {

            Vi resposta = botiga.afegeix(vins[i]);

            System.out.println("En afegir" + vins[i] + "la botiga ens respon " + resposta);

        }


        System.out.printf("%nCerquem uns vins%n");

        String nomVi = vins[1].getNom();

        Vi resposta = botiga.cerca(nomVi);

        System.out.println("En cercar " + nomVi + " botiga ens respon " + resposta);


        nomVi = vins[vins.length - 1].getNom();

        resposta = botiga.cerca(nomVi);

        System.out.println("En cercar " + nomVi + " botiga ens respon " + resposta);

    }

}

En breu, UsaBotiga crea uns quants vins, crea una botiga que no té espai per tants vins i li intenta afegir tots els vins creats. Finalment cerca un dels vins que ha d'estar afegit correctament i un altre que no hi cabia.

L'execució haurà de generar la següent sortida:

Creem uns quants vins
Creat
    Vi: Roura Blanc
    Preu: 1234
    Estoc: 42

Creat
    Vi: Cercium
    Preu: 535
    Estoc: 30

Creat
    Vi: Llum d'Alba Blanc
    Preu: 1750
    Estoc: 12

Afegim els vins creats a la botiga
En afegir
    Vi: Roura Blanc
    Preu: 1234
    Estoc: 42
la botiga ens respon
    Vi: Roura Blanc
    Preu: 1234
    Estoc: 42

En afegir
    Vi: Cercium
    Preu: 535
    Estoc: 30
la botiga ens respon
    Vi: Cercium
    Preu: 535
    Estoc: 30

En afegir
    Vi: Llum d'Alba Blanc
    Preu: 1750
    Estoc: 12
la botiga ens respon null

Cerquem uns vins
En cercar Cercium botiga ens respon
    Vi: Cercium
    Preu: 535
    Estoc: 30

En cercar Llum d'Alba Blanc botiga ens respon null
*/

public class Botiga {
    private static int DEFAULT_MAX_VINS = 10;
    private Vi[] vins;
    private static int indexVi;

    public Botiga() {
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }

    public Botiga(int maxVins) {
        if (maxVins > 0) {
            this.vins = new Vi[maxVins];
        } else {
            this.vins = new Vi[DEFAULT_MAX_VINS];
        }
    }

    public Vi afegeix(Vi vi) {
        if (vi.esValid()) {
            if (cerca(vi.getNom()) == null) {
                for (int i = 0; i < vins.length; i++) {
                    if (vins[i] == null) {
                        vins[i] = vi;
                        return vi;
                    }
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom).toLowerCase();
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                String nomVi = vins[i].getNom().toLowerCase();
                if (nomVi.equals(nom)) {
                    if (vins[i].getEstoc() <= 0) {
                        Vi viTmp = vins[i];
                        vins[i] = null;
                        return viTmp;
                    }
                }
            }
        }
        return null;
    }

    public Vi cerca(String nom) {
        nom = Vi.normalitzaNom(nom).toLowerCase();

        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                String nomVi = vins[i].getNom().toLowerCase();
                if (nomVi.equals(nom)) {
                    return vins[i];
                }
            }
        }
        return null;
    }

    public void iniciaRecorregut() {
        indexVi = 0;
    }

    public Vi getSeguent() {
        while (indexVi < vins.length) {
            if (vins[indexVi] == null) {
                indexVi++;
                continue;
            }
            Vi vi = vins[indexVi];
            indexVi++;
            return vi;
        }
        return null;
    }
}