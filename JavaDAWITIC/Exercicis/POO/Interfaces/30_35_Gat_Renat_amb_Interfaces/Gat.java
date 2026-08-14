/* Enunciat

Considera aquesta nova jerarquia de classes:

A aquesta jerarquia, els gats són éssers vius i, per tant, tenen vides, poden morir i (recorda que és un exercici) ressuscitar.

Tota instància de gat ha de tenir un nom i no es pot canviar. En cas que el nom que reben els constructors no sigui vàlid (null o buit o tot d'espais blancs) es posarà com a nom per defecte "anònim".

Els gat Renat i els gats Garfield són gats i animals de companyia. Els gats salvatges són també gats però no animals de companyia. A banda, els Renats són també ensinistrables.

Els mètodes a implementar presenten les següents sortides:

Classe
	

mètode
	

Sortida

GatRenat
	

aixecat()
	

"ja m'aixeco" si no estava dret, "passo de fer res" altrament

GatRenat
	

seu()
	

"ja m'assec" si no estava assegut, "passo de fer res" altrament

GatRenat
	

estirat()
	

"ja m'estiro" si estava estirat, "passo de fer res" altrament

GatRenat
	

deixatEstimar()
	

"em deixo estimar"

Garfield
	

deixatEstimar()
	

"em deixo estimar, però només una mica"

Gat
	

mor()
	

"adéu món cruel" si estava viu, "ja l'he espifiada" altrament

Gat
	

reviu()
	

"encara miolo" si estava viu, "guai!" altrament

Per provar el funcionament de tot el conjunt, hauràs de poder executar el següent codi:

Els noms dels tres gats concretats són:

    GatRenat: "Renat"

    Garfield: "Garfield"

    GatSalvatge: "Gat Salvatge"

Considera la següent plantilla per comprovar que la teva implementació disposa dels mínims:

public class UsaInterfagats {

    public static void main(String[] args) {

        GatRenat renat = new GatRenat();

        Garfield garfield = new Garfield();

        GatSalvatge gatSalvatge = new GatSalvatge();

        Gat gargamel = new Gat("Gargamel");

        Gat[] gats = { renat, garfield, gatSalvatge, gargamel };

        AnimalDeCompanyia[] animalsDeCompanyia = { renat, garfield };

        Ensinistrable[] ensinistrables = { renat };

        EsserViu[] essersVius = {renat, garfield, gatSalvatge, gargamel };


        System.out.println("Comprovem els mètodes de ensinistrable");

        System.out.println("======================================");

        // XXX per cada element de l'array ensinistrable crida els

        // serveis següents en l'ordre indicat i mostra el seu resultat:

        for (Ensinistrable ensinistrable: ensinistrables) {

            // 1. demana que s'aixequi

            // 2. demana si està dret

            // 3. demana que segui

            // 4. demana si està assegut

            // 5. demana que s'estiri

            // 6. demana si està estirat

        }



        System.out.println();

        System.out.println("Comprovem els mètodes d'AnimalDeCompanyia");

        System.out.println("=========================================");

        // XXX per cada element de l'array animalsDeCompanyia crida els

        // serveis següents en l'ordre indicat i mostra el seu resultat:

        // 1. demana que es deuxi estimar


        System.out.println();

        System.out.println("Comprovem els mètodes d'Esser viu");

        System.out.println("=================================");

        // XXX per cada element de l'array essersVius crida els

        // serveis següents en l'ordre indicat i mostra el seu resultat:

        // 1. demana si està viu

        // 2. demana que mori

        // 3. demana que revisqui


        System.out.println();

        System.out.println("Comprovem els mètodes de Gat");

        System.out.println("============================");

        // XXX per cada element de l'array gats crida els

        // serveis següents en l'ordre indicat i mostra el seu resultat:

        // 1. demana el nom

        // 2. assigna-li una única vida

        // 3. demana que revisqui

        // 4. demana que mori

        // 5. demana que mori un altre cop

        // 6. demana si està viu

        // 7. demana que revisqui

        // 8. demana quantes vides li queden


    }

}

La sortida esperada és:

Comprovem els mètodes de ensinistrable
======================================
ja m'aixeco
true
ja m'assec
true
ja m'estiro
true

Comprovem els mètodes d'AnimalDeCompanyia
=========================================
em deixo estimar
em deixo estimar, però només una mica

Comprovem els mètodes d'Esser viu
=================================
true
adéu món cruel
encara miolo
true
adéu món cruel
encara miolo
true
adéu món cruel
encara miolo
true
adéu món cruel
encara miolo

Comprovem els mètodes de Gat
============================
Renat
encara miolo
adéu món cruel
ja l'he espifiada
false
guai!
1
Garfield
encara miolo
adéu món cruel
ja l'he espifiada
false
guai!
1
Gat Salvatge
encara miolo
adéu món cruel
ja l'he espifiada
false
guai!
1
Gargamel
encara miolo
adéu món cruel
ja l'he espifiada
false
guai!
1

Important

per què prgtest et digui que tot està correcte, caldrà que implementis exactament els elements indicats al diagrama. La meva recomanació és que comencis a fer-ho de zero i no reaprofitis codis anteriors.
*/

class Gat implements EsserViu {
    private int vides = 7;
    private String nom = "anònim";

    public Gat(String nom) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;
        }
    }

    public Gat(String nom, int vides) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;
        }
        this.setVides(vides);
    }

    public String getNom() { return this.nom; }

    public int getVides() { return this.vides; }

    public void setVides(int vides) {
        if (vides >= 0 && vides <= 9) {
            this.vides = vides;
        }
    }

    @Override
    public boolean esViu() {
        return this.vides > 0;
    }
    
    @Override
    public String mor() {
        if (esViu()) { 
            setVides(getVides() - 1);
            return "adéu món cruel"; 
        }
        return "ja l'he espifiada";
    }
    
    @Override
    public String reviu() {
        if (!esViu()) {
            setVides(getVides() + 1);
            return "guai!";
        }
        return "encara miola";
    }
}