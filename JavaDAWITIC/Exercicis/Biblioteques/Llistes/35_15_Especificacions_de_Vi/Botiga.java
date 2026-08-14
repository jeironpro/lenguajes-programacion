/* Enunciat

A Ca l'Estrella els està anant molt bé la nostra aplicació. S'ha reduït força el problema de trobar les ampolles de vi. Com passa amb tot, però, sempre hi ha maneres de millorar-ho i, en aquest cas, la nostra aplicació presenta una limitació molt trista: només permet obtenir un vi per cada cerca, malgrat que, de vegades hi poden haver més d'un vi que compleixi els requeriments dels clients de la Sra. Estrella.

Això ho hem de solucionar. La proposta és que cerca() ara ens retorni una llista de vins.

Aquest serà el nostre nou objectiu: afegir cerques amb múltiples resultats.

A banda, en veure la potència de les llistes, ens toca fer un plantejament amb la manera de guardar els vins de la classe Botiga.

Fins ara hem estat guardat els vins a un array amb una capacitat màxima i un control complex per culpa de que la funcionalitat d'eliminació de vins ens deixava posicions nuŀles. I pensar que, a sobre, momentàniament hem deixat de d'oferir l'opció d'eliminació…

En aquesta nova versió, reemplaçarem l'array de vins a Botiga per una llista. Això també elimina la necessitat del constructor específic Botiga(int), els mètodes iniciaRecorregut() i getSeguent(). Tampoc no llençarem l'excepció BotigaException quan la botiga està plena. Clar, ara ja no tindrem un màxim!.

Aquestes accions de simplificació/neteja solen passar desapercebudes als nostres usuaris però a nosaltres ens faciliten molt la feina futura. Les hem de fer amb compte de no introduir errors, però… qui té por quan disposem de jocs de prova?

D'altra banda, ara que podem tornar més d'un vi, voldrem afegir una mica més de flexibilitat a la cerca, de manera que no calgui especificar completament valors del nom, la denominació d'origen ni el tipus de vi. Per aconseguir-ho, desenvoluparem un nou mètode boolean esPlantillaDeText(String plantilla, String text) que donada una plantilla i un text, ens retorna cert si el text es descriu per la plantilla.

Considerarem que un text es descripu per una plantilla quan, la seva versió normalitzada coincideix amb la plantilla o, com a mínim, comença per aquesta.

Així, en cas que la plantilla sigui null, buida o amb només espais, acceptarà qualsevol valor de text. Altrament acceptarà només els texts que comencin per la plantilla (ambdós normalitzats)

Hem decidit afegir aquest mètode a UtilString.

D'aquesta manera, el mètode cercar(Vi), gràcies a UtilString.esPlantillaDeText(), permetrà cercar parcialment els diferents atributs de tipus string. Per exemple, el vi amb el nom Roura blanc podrà ser trobat amb les plantilles Roura, rou o fins i tot r.

Aprofitant que toquem UtilString, hi mourem també el mètode String normalitzaString(), que actualment tenim a Vi.

El nostre model quedarà de la següent manera:

class Botiga { - vins: List<Vi> + getVins(): List<Vi> + cerca(ref: String): Vi + cerca(plantilla: Vi): List<Vi> + afegeix(Vi): Vi + elimina(String): Vi } class UtilString { + {static} normalitzaString(String): String + {static} esPlantillaDeText(plantilla, text): boolean } Botiga o-- Vi Entorn *-- Botiga Entorn --> Vi Entorn --> UtilString Botiga --> UtilString Vi --> UtilString hide class circle hide enum circle hide enum method skinparam classattributeiconsize 0 skinparam class { backgroundcolor white bordercolor black arrowcolor black }

Cerques amb resultats múltiples

Un parell de consideracions addicionals:

    Quan cerquem un vi a partir d'una plantilla, a partir d'ara cerca(Vi) ja no ens tornarà mai null encara que no es trobi cap vi. retornarà una List<Vi> amb zero o més vins.

    Tenint en comptes que cerca() molt probablement anirà afegint vins al final de la llista i que aquesta serà usada per un recorregut seqüencial, quina creus que seria la implementació més adequada de List?
*/

import java.util.List;
import java.util.LinkedList;

public class Botiga {
	private List<Vi> vins;
	
	public Botiga() {
        this.vins = new LinkedList<Vi>();
    }
    
    public List<Vi> getVins() {
    	return this.vins;
    } 
    
    public Vi afegeix(Vi vi) {
    	if (vi == null) {
    		throw new IllegalArgumentException("El vi no pot ser null");
    	} else if (!Vi.esValid(vi.getRef(), vi.getNom(), vi.getPreu(), vi.getEstoc(), vi.getLloc(), vi.getOrigen(), vi.getTipus(), vi.getCollita())) {
    		throw new IllegalArgumentException("El vi ha de ser vàlid");
    	} else if (cerca(vi.getRef()) != null) {
            throw new IllegalArgumentException("Referència de vi repetida");
        }
        this.vins.add(vi);
        return vi; 
    }
    
    public Vi elimina(String ref) {
    	ref = UtilString.normalitzaString(ref);
    	if (ref == null) {
    		throw new IllegalArgumentException("La referència no pot ser null");
    	}
    	ref = ref.toLowerCase();
	    boolean viEqual = false;
	    for (int i = 0; i < vins.size(); i++) {
	        if (vins.get(i) != null) {
	            String refExistent = vins.get(i).getRef().toLowerCase();
	            if (ref.equals(refExistent)) { 
	            	viEqual = true;
	                if (vins.get(i).getEstoc() > 0) { 
	                    throw new IllegalArgumentException("El vi a eliminar no pot tenir estoc"); 
	                }
	                Vi eliminat = vins.get(i);
	                vins.remove(i);
	                return eliminat;
	            }
	        }
	    }
	    if (!viEqual) {
	    	throw new IllegalArgumentException("La instància a eliminar ha d'estar present");
	    }
    	return null;
    }
    
    public Vi cerca(String ref) {
		ref = UtilString.normalitzaString(ref);
    	if (ref == null) {
    		throw new IllegalArgumentException("La referència no pot ser null");  
    	}
		ref = ref.toLowerCase();
	    for (Vi vi: vins) {
	    	if (vi == null) {
	    		continue;
	    	}
	        String refVi = vi.getRef().toLowerCase();
	        if (ref.equals(refVi)) { 
	            return vi; 
	        }
	    }    	
    	return null;
    }

    public List<Vi> cerca(Especificacio espec) {
    	return cerca(espec, -1, -1);
    }
    
    public List<Vi> cerca(Especificacio espec, int preuMax, int estocMin) {
    	if (espec == null) {
    		throw new IllegalArgumentException("espec no pot ser null");
    	}
    	List<Vi> vinsCercat = new LinkedList<Vi>();
    	
        String nomE = espec.getNom();
        String origenE = espec.getOrigen();
        String tipusE = espec.getTipus();
        String collitaE = espec.getCollita();
        
    	for (Vi vi : this.vins) {
    		boolean cercat = true;
			if (!UtilString.esPlantillaDeText(nomE, vi.getNom())) {
				cercat = false;
			}
			if (preuMax >= 0 && vi.getPreu() > preuMax) {
				cercat = false;
			}
			if (estocMin >= 0 && vi.getEstoc() < estocMin) {
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(origenE, vi.getOrigen())) {
		 		cercat = false;
	 		}
			if (!UtilString.esPlantillaDeText(tipusE, vi.getTipus())) {
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(collitaE, vi.getCollita())) {
				cercat = false;
			}

			if (cercat) {
				vinsCercat.add(vi);
			}
    	}
    	return vinsCercat;
    }
}
