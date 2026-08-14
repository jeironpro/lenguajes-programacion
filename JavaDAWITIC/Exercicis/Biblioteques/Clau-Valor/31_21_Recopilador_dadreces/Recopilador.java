/* Enunciat

Desenvolupa un programa que rebi un o més camins a fitxers per línia de comandes, i recopili les adreces de correu que hi trobi als fitxers que pugui llegir.

Finalment, el programa mostrarà les diferents adreces de correu recopilades, juntament amb el nom dels fitxers en que s'han trobat. Tan les adreces, com els fitxers apareixeran ordenats alfabèticament de manera creixent.

El programa, en cap moment abortarà per una excepció d'entrada/sortida, tant si un fitxer no existeix, o no es pot llegir.

Per passar les proves, cal que desenvolupis la classe Adressa:

Diagrama de classes

El món dels validadors d'adreces de correu electrònic no és gens fàcil. Hi ha una descripció detallada a RFC 5322, però també hi diuen la seva altres estàndards com RFC 1035, les directius de la IANA i restriccions específiques de proveïdors importants com Gmail i Outlook. Per aquest exercici, delimitarem molt clarament què considerarem una adreça vàlida, acceptant que algunes adreces que per nosaltres són vàlides, no ho seran per alguns d'aquests organismes, i al contrari, hi haurà adreces que rebutjarem que d'altres consideraran vàlides.

Així, per aquest exercici es considera que un correu electrònic és vàlid si:

    No és null

    Està format exclusivament per lletres, números, '-', '_', '.', '@' i '+'.

    Inclou un únic caràcter '@'.

    Abans de '@' hi ha al menys un caràcter.

    Després de '@' hi ha al menys un punt.

    Davant i darrera d'un punt ha d'haver-hi sempre almenys un caràcter que no pot ser punt.

    Després del darrer punt, només poden haver-hi lletres i un mínim de dues.

Adressa guarda el seu valor en forma de dos strings (identificador i domini) Recorda que l'identificador és la part de l'adreça abans de @ i domini és la part de després.

El mètode estàtic Adressa.esValida() ens permetrà saber si text correspon o no a una adreça vàlida. El mètode fromString() ens crearà una instància de Adressa a partir d'un text si aquest correspon a una adreça vàlida. Altrament generarà una IllegalArgumentException.

La classe Recopilador serà l'encarregada d'extreure les adreces dels diferents fitxers. El mètode processa() és clau. Rep un nom i un text, ambdós Strings, que RecopilaAdresses cridarà passant-li el nom de cada fitxer i el seu contingut. Retornarà el nombre d'adreces recopilades dins d'aquell text.

El mètode Recopilador.getAdrecess() retornarà la llista ordenada de les adreces trobades als textos que el recopilador hagi processat fins el moment. Finalment, getNoms() retorna els noms (de fitxers) associats a l'adreça de correu que rebi.

Un exemple d'execució:

cat gamberros.html
<html>
<head> <title>Gamberros de classe</title> </head>
<body>
<p>Llistat de gamberros identificats a classe:</p>
<ul>
    <li><a href="mailto:garfieldmolames@xupimail.com">Gamberfield</a></li>
    <li><a href="mailto:shin-shan@culetculet.com">Shin-shan</a></li>
</ul>
</body>
</html>

cat gats.txt
Gats coneguts:

- Renat: amb els correus renat@hemail.com, renat@renat.cat i supergat@renat.cat
- Garfield: amb els correus garfieldmolames@xupimail.com i poorgarfield@renat.cat

Anirem afegint-ne més.
La direcció: direcció@renat.cat

java RecopilaAdresses gats.txt gamberros.html
direcció@renat.cat
- gats.txt
garfieldmolames@xupimail.com
- gamberros.html
- gats.txt
poorgarfield@renat.cat
- gats.txt
renat@hemail.com
- gats.txt
renat@renat.cat
- gats.txt
shin-shan@culetculet.com
- gamberros.html
supergat@renat.cat
- gats.txt

Consideracions addicionals i pistes:

    El mètode RecopilaAdresses.llegeixFitxer() rep el nom d'un fitxer i retorna el seu contingut. Si el fitxer no existeix o bé no es pot llegir, RecopilaAdresses mostrarà missatges informant. El prgtest et farà saber el missatge exacte que espera. En tots dos casos, el mètode retornarà null. Altrament retornarà el contingut del fitxer on les línies queden separades per n.

    Pots fer servir el següent codi per obtenir el contingut d'un fitxer (la part de control de situacions excepcionals, te la deixo per a tu)

BufferedReader br = new BufferedReader(new FileReader(nomFitxer));

StringBuilder sb = new StringBuilder();

while (true) {

    String line = br.readLine();

    if (line == null) break;

    sb.append(line);

    sb.append('\n');

}

br.close();

String resultat = sb.toString();

Fixa't que aquest usa StringBuilder, una classe que no hem vist fins ara. Es tracta d'una classe que ens permet composar un String de manera més eficient que amb l'habitual concatenació. Si t'agrada més continuar amb la tradicional concatenació, no t'afectarà a les proves.

Si no es troba cap adreça, es mostrarà un missatge indicant-ho. El missatge concret, te l'indicarà el prgtest.

En cas que una adreça es trobi més d'un cop a un mateix fitxer, només es mostrarà un cop.

Potser voldràs fer servir el mètode split() de la classe String passant-li la següent constant:

private static final String SEPARADORS = "[\\s\\[{(<>})\\],;:'\"=|/\\!?]";

Això et permetrà separar les subcadenes que puguin ser adreces de correu.

El mètode split() accepta el que es coneix com expressions regulars. La constant SEPARADORS és una expressió regular que indica tots els caràcters que split() ha de considerar separadors. Es tracta de caràcters que no poden formar part d'una adreça electrònica vàlida però que sí podrien delimitar una d'aquestes. Per exemple el text podria contenir la següent cadena: email:<renat@correu.cat>.

Per cert, si el que vols és separar una cadena per punts, et caldrà fer servir "\\.". Per exemple: "correu.de.gats".split("\\."). generarà les subcadenes: "correu", "de", i "gats".

La ordenació dels noms de fitxer associats a una adreça, es pot realitzar amb

List<String> noms = carregaNoms();
java.util.Collections.sort(noms);

Per la ordenació d'adreces, et serà molt còmode fer Adressa comparable, tot implementant la interfície Comparable, per exemple:

public int compareTo(Adressa altra) {
    return toString().compareTo(altra.toString());
}


Adressa és Comparable

Nota: Per descomptat, si adressa1.compareTo(adressa2) == 0 llavors adressa1.equals(adressa2) serà true.

Per cert, potser vols explorar TreeMap i estalviar-te l'ordenació d'adreces.


*/

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Recopilador {
	private Map<Adressa, List<String>> adreces = new HashMap<>();
	private static final String SEPARADORS = "[\\s\\[{(<>})\\],;:'\"=|/\\!?]";
	
	public int processa(String nom, String text) {
		int comptador = 0;
		String[] adreca = text.split(SEPARADORS);
		
		for (String adrec: adreca) {
			if (adrec.contains("@")) {
				if (Adressa.esValida(adrec)) {
					Adressa adressa = Adressa.fromString(adrec);
					if (adreces.get(adressa) != null) {
						if (!adreces.get(adressa).contains(nom)) {
							adreces.get(adressa).add(nom);
						}
					} else {
						List<String> noms = new ArrayList<>();
						noms.add(nom);
						adreces.put(adressa, noms);
						comptador++;
					}
				}
			}
		} 
		return comptador;
	}
	
	public List<Adressa> getAdreces() {
		List<Adressa> adrecs = new ArrayList<>(adreces.keySet());
		java.util.Collections.sort(adrecs);
		return adrecs;
	}

	public List<String> getNoms(Adressa adressa) {
		List<String> noms = adreces.get(adressa);
		java.util.Collections.sort(noms);
		return noms;
	}
}
