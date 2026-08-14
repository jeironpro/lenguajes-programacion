/* Enunciat

Afegeix un nou test que comprovi que el mètode Punt.suma(Punt) funciona correctament. Aquest mètode tindrà el següent codi que, per descomptat, afegiràs després de crear el teu test.

public void suma(Punt p) { x+=p.x; y+=p.y; }

Un cop desenvolupat i executat el test, afegeix el mètode suma(Punt) que suma les coordenades de dos punts.

Hauríem de poder fer coses com ara:

Punt p1 = new Punt(2, 3);
Punt p2 = new Punt(4, 5);

p1.suma(p2);
System.out.printf("p1: (%d, %d)", p1.getX(), p1.getY());    // p1: (6, 8)

En passar les teves proves, el prgtest esperarà que també executis correctament el següent codi:

 public class UsaPunt {

     public static void main(String[] args){

         int x1 = // args[0] si hi és i és enter, o 0 altrament

         int y1 = // args[1] si hi és i és enter, o 0 altrament

         int x2 = // args[2] si hi és i és enter, o 0 altrament

         int y2 = // args[3] si hi és i és enter, o 0 altrament

         Punt p1 = new Punt(x1, y1);

         Punt p2 = new Punt(x2, y2);

         System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());

         System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());

         p1.suma(p2);

         System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());

     }

 }

Un exemple d'execució seria:

java UsaPunt 2 3 4 5
p1: (2, 3)
p2: (4, 5)
p1+p2: (6, 8)

Nota

No modifiquis els tests anteriors. Simplement afegeix els nous a TestPunt.java.
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPunt {
	@Test
	void constructor() {
		new Punt();
	}
	
	@Test
	void constructorDefecteXZero() {
		Punt p = new Punt();
		assertEquals(0, p.getX());
	}
	
	@Test
	void constructorDefecteYZero() {
		Punt p = new Punt();
		assertEquals(0, p.getY());
	}
	
	@Test
	void setX42() {
		Punt p = new Punt();
		p.setX(42);
		assertEquals(42, p.getX());
	}
	
	@Test
	void setY42() {
		Punt p = new Punt();
		p.setY(42);
		assertEquals(42, p.getY());
	}
	
	@Test
    void sumaPunts() {
    	Punt p1 = new Punt(5, 8);
    	Punt p2 = new Punt(2, 5);
    	
    	p1.suma(p2);
    	assertAll(
    		() -> assertEquals(7, p1.getX()),
    		() -> assertEquals(13, p1.getY())
    	);
    }
}
