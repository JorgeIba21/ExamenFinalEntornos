package Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio4Test {

	@Test
	void testIPAdress() {
		assertEquals("a", Ejercicio4.ipAdressType("10.0.100.23", ""));
		assertEquals("b", Ejercicio4.ipAdressType("10.0.100.23", "255.255.0.0"));
		assertEquals("a", Ejercicio4.ipAdressType("10.0.100.23", null));
		assertEquals("c", Ejercicio4.ipAdressType("200.30.110.5", null));
		assertEquals("c", Ejercicio4.ipAdressType("200.30.110.5", ""));
		assertEquals("c", Ejercicio4.ipAdressType("200.30.110.5", "255.255.255.0"));
		assertTrue(Ejercicio4.ipAdressType("200.30.110.5/24", "") == "c");
	}
	
	@Test
	void testGetArea() {
		assertEquals(10.825317547305483, Ejercicio4.getArea(5, 5, 5));
		assertEquals(84, Ejercicio4.getArea(13, 15, 14));
		assertThrows(RuntimeException.class, () -> {
		      Ejercicio4.getArea(2, 2, 4);
		    });
		assertThrows(RuntimeException.class, () -> {
			Ejercicio4.getArea(-5, -2, -4);
		});
		assertThrows(RuntimeException.class, () -> {
			Ejercicio4.getArea(7, 2, 4);
		});
		assertThrows(RuntimeException.class, () -> {
			Ejercicio4.getArea(2, 0, 4);
		});
		
	}
	
	@Test
	void testTriangle() {
		assertEquals("Triangular Taper", Ejercicio4.triangle(5, 6, 7));
		assertEquals("Right Triangle", Ejercicio4.triangle(3, 4, 5));
		assertEquals("Blunt Triangle", Ejercicio4.triangle(3, 4, 6));
		assertThrows(RuntimeException.class, () -> {
			Ejercicio4.triangle(2, 2, 2);
		});
		assertThrows(RuntimeException.class, () -> {
			Ejercicio4.triangle(-2, 5, 2);
		});
		assertThrows(RuntimeException.class, () -> {
			Ejercicio4.triangle(2, 0, 8);
		});
		
	}

}
