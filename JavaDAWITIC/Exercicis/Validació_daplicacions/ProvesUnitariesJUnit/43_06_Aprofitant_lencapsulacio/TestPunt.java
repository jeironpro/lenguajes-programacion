/* Enunciat

Modifica la classe Punt de manera que ara la implementació de les coordenades sigui

int[] coord = new int[2];

on coord[0] correspon a la coordenada x i coord[1] correspon a la y.

Aconsegueix que passi TestPunt i TestSegment dels exercicis previs, sense haver de modificar cap test.
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
