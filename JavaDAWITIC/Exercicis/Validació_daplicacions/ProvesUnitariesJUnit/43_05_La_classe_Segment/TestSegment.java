/* Enunciat

Relació entre les classes Segment i Punt

Crea la classe Segment que contingui dos instàncies de Punt, amb dos constructors, el per defecte i un que defineixi les coordenades dels dos punts. A banda, inclou accessors i el mètode longitud que torna la longitud del segment segons la fórmula:

longitud = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

El teu desenvolupament inclourà la classe TestSegment que prova la classe Segment.

A banda, hauràs de modificar la classe Punt perquè sobreescrigui el mètode toString() de manera que System.out.println(new Punt()) mostri Punt(0, 0).

Els tests que hauràs de desenvolupar, com a mínim, són:

    Segment disposa de constructor per defecte que s'inicialitza amb punts per defecte. Et proposo que ho comprovis amb assertAll() i, que et plantegis sobreescriure equals() de Punt per un resultat més professional. Per descomptat, pots afegir hashCode() malgrat aquí no el farem servir.

    Segment disposa d'un constructor específic que requereix els dos punts que defineixen els extrems del segment.

    El test pot tenir un aspecte similar a l'anterior.

    Segment disposa del mètode longitud() que retorna la longitud del segment.

Com ja imaginaràs, et recomano molt que construeixis la nova classe fent servir TDD.

Un cop passis les teves proves, prgtest voldrà que el teu codi executi correctament el següent:

 public class UsaSegment {

     public static void main(String[] args){

         int x1 = // args[0] si hi és i és enter, o 0 altrament

         int y1 = // args[1] si hi és i és enter, o 0 altrament

         int x2 = // args[2] si hi és i és enter, o 0 altrament

         int y2 = // args[3] si hi és i és enter, o 0 altrament

         Punt punt1 = new Punt(x1, y1);

         Punt punt2 = new Punt(x2, y2);

         Segment segment1 = new Segment(punt1, punt2);

         Segment segment2 = new Segment();

         segment2.setP1(segment1.getP2());

         segment2.setP2(segment1.getP1());

         System.out.printf("p1: %s%n", punt1);

         System.out.printf("p2: %s%n", punt2);

         System.out.printf("s1: %s s1.longitud: %.02f%n", segment1, segment1.longitud());

         System.out.printf("s2: %s s2.longitud: %.02f%n", segment2, segment2.longitud());

     }

 }

Per exemple, considera la següent execució:

java UsaSegment 2 3 4 5
p1: Punt(2, 3)
p2: Punt(4, 5)
s1: Segment(Punt(2, 3), Punt(4, 5)) s1.longitud: 2,83
s2: Segment(Punt(4, 5), Punt(2, 3)) s2.longitud: 2,83

Pots comprovar que dos valors double són iguals, tot indicant a assertEquals() un llindar:

assertEquals(1.2, segment.longitud(), 0.000001d);
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSegment {
	@Test
	void constructor() {
		new Segment();
	}
	
	@Test
	void constructorDefecte() {
		Punt p1 = new Punt(4, 2);
		Punt p2 = new Punt(6, 8);
		
		new Segment(p1, p2);
	}
	
	@Test
	void longitudPunts() {
		Punt p1 = new Punt(4, 2);
		Punt p2 = new Punt(6, 8);
		
		Segment segment = new Segment(p1, p2);
		
		assertEquals(6.0, segment.longitud());
	}
}
