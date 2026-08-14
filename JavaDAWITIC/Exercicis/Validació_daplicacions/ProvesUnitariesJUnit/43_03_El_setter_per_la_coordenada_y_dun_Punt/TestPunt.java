/* Enunciat

En aquesta ocasió, afegirem el mètode setY() a la classe Punt.

És important que ho facis seguint el procediment que hem fet als apunts:

    crea una prova similar a setX42() per la coordenada y.

    comprova que falla

    afegeix els canvis a Punt per què passi totes les proves.

Un cop hagis passat les teves proves, assegura't que passes també prgtest tot afegint la següent classe:

 public class UsaPunt {

     public static void main(String[] args){

         Punt punt = new Punt();

         int x = // args[0] si hi és i és enter, o 0 altrament

         int y = //  args[1] si hi és i és enter, o 0 altrament

         punt.setX(x);

         punt.setY(y);

         System.out.printf("punt.getX() -> %d%n", punt.getX());

         System.out.printf("punt.getY() -> %d%n", punt.getY());

     }

 }

Un exemple d'execució seria:

java UsaPunt 5 7
punt.getX() -> 5
punt.getY() -> 7 
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
        assertEquals(0, p.getX());
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
}
