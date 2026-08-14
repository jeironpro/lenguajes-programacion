/* Enunciat

Farem que la nostra classe Punt només admeti coordenades positives i que si es troba amb valors negatius, llenci l'excepció IllegalArgumentException.

Amplia les proves unitàries que hem definit abans per aquesta classe, de manera que contemplin aquests nous requisits.

Si no saps per on començat, considera cercar per assertThrows().
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
    
    @Test
    void puntNegatiu() {
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Punt(-10, 8);
    	});
    }
}
