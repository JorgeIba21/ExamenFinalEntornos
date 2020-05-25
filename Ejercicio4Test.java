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
	}

}
