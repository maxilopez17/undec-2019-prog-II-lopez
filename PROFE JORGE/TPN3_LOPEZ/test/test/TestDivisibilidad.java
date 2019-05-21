package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import dominio.Divisibilidad;

class TestDivisibilidad {
	
// profe yo les cambie los numeros de prueba a muchos test 
//para ver si funcionaban bien
	@Test
	void test01DivisiblePorDos_NoValido() {
		//Arrange
		
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorDos(304470);
		boolean actual02 = Divisibilidad.esDivisiblePorDos(5);
		boolean actual03 = Divisibilidad.esDivisiblePorDos(7);
		boolean actual04 = Divisibilidad.esDivisiblePorDos(9);
		boolean actual05 = Divisibilidad.esDivisiblePorDos(11);
		boolean actual06 = Divisibilidad.esDivisiblePorDos(457);
		boolean actual07 = Divisibilidad.esDivisiblePorDos(895);
		boolean actual08 = Divisibilidad.esDivisiblePorDos(983);
		boolean actual09 = Divisibilidad.esDivisiblePorDos(1297);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(false,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
	@Test
	void test02DivisiblePorTres_NoValido() {
		//Arrange
		
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorTres(3);
		boolean actual02 = Divisibilidad.esDivisiblePorTres(5);
		boolean actual03 = Divisibilidad.esDivisiblePorTres(7);
		boolean actual04 = Divisibilidad.esDivisiblePorTres(934620);
		boolean actual05 = Divisibilidad.esDivisiblePorTres(11);
		boolean actual06 = Divisibilidad.esDivisiblePorTres(457);
		boolean actual07 = Divisibilidad.esDivisiblePorTres(895);
		boolean actual08 = Divisibilidad.esDivisiblePorTres(983);
		boolean actual09 = Divisibilidad.esDivisiblePorTres(1297);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(true,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
	@Test
	void test03DivisiblePorCuatro_NoValido() {
		//Arrange
		
		//Act
		boolean actual01 = Divisibilidad.esDivisiblePorCuatro(60);
		boolean actual02 = Divisibilidad.esDivisiblePorCuatro(5);
		boolean actual03 = Divisibilidad.esDivisiblePorCuatro(7);
		boolean actual04 = Divisibilidad.esDivisiblePorCuatro(934600);
		boolean actual05 = Divisibilidad.esDivisiblePorCuatro(11);
		boolean actual06 = Divisibilidad.esDivisiblePorCuatro(457);
		boolean actual07 = Divisibilidad.esDivisiblePorCuatro(895);
		boolean actual08 = Divisibilidad.esDivisiblePorCuatro(983);
		boolean actual09 = Divisibilidad.esDivisiblePorCuatro(1297);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(true,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
	@Test
	void test05DivisiblePorCinco_NoValido() {
		//Arrange
		
				//Act
				boolean actual01 = Divisibilidad.esDivisiblePorCinco(3);
				boolean actual02 = Divisibilidad.esDivisiblePorCinco(5);
				boolean actual03 = Divisibilidad.esDivisiblePorCinco(73410);
				boolean actual04 = Divisibilidad.esDivisiblePorCinco(9);
				boolean actual05 = Divisibilidad.esDivisiblePorCinco(11);
				boolean actual06 = Divisibilidad.esDivisiblePorCinco(457);
				boolean actual07 = Divisibilidad.esDivisiblePorCinco(895);
				boolean actual08 = Divisibilidad.esDivisiblePorCinco(983);
				boolean actual09 = Divisibilidad.esDivisiblePorCinco(1297);
				
				//Assert
				assertEquals(false,actual01);
				assertEquals(true,actual02);
				assertEquals(true,actual03);
				assertEquals(false,actual04);
				assertEquals(false,actual05);
				assertEquals(false,actual06);
				assertEquals(true,actual07);
				assertEquals(false,actual08);
				assertEquals(false,actual09);
	}
	void test06DivisiblePorSeis_NoValido() {
		//Arrange
		
				//Act
				boolean actual01 = Divisibilidad.esDivisiblePorSeis(304470);
				boolean actual02 = Divisibilidad.esDivisiblePorSeis(5);
				boolean actual03 = Divisibilidad.esDivisiblePorSeis(73410);
				boolean actual04 = Divisibilidad.esDivisiblePorSeis(9);
				boolean actual05 = Divisibilidad.esDivisiblePorSeis(72);
				boolean actual06 = Divisibilidad.esDivisiblePorSeis(457);
				boolean actual07 = Divisibilidad.esDivisiblePorSeis(895);
				boolean actual08 = Divisibilidad.esDivisiblePorSeis(983);
				boolean actual09 = Divisibilidad.esDivisiblePorSeis(1297);
				
				//Assert
				assertEquals(true,actual01);
				assertEquals(false,actual02);
				assertEquals(true,actual03);
				assertEquals(false,actual04);
				assertEquals(true,actual05);
				assertEquals(false,actual06);
				assertEquals(false,actual07);
				assertEquals(false,actual08);
				assertEquals(false,actual09);
	}
	void test07DivisiblePorSiete_NoValido() {
		//Arrange
		
				//Act
				boolean actual01 = Divisibilidad.esDivisiblePorSiete(304470);
				boolean actual02 = Divisibilidad.esDivisiblePorSiete(5);
				boolean actual03 = Divisibilidad.esDivisiblePorSiete(73410);
				boolean actual04 = Divisibilidad.esDivisiblePorSiete(9);
				boolean actual05 = Divisibilidad.esDivisiblePorSiete(11);
				boolean actual06 = Divisibilidad.esDivisiblePorSiete(457);
				boolean actual07 = Divisibilidad.esDivisiblePorSiete(895);
				boolean actual08 = Divisibilidad.esDivisiblePorSiete(983);
				boolean actual09 = Divisibilidad.esDivisiblePorSiete(1297);
				
				//Assert
				assertEquals(true,actual01);
				assertEquals(false,actual02);
				assertEquals(true,actual03);
				assertEquals(false,actual04);
				assertEquals(false,actual05);
				assertEquals(false,actual06);
				assertEquals(false,actual07);
				assertEquals(false,actual08);
				assertEquals(false,actual09);
	}
	@Test
	void test06DivisiblePorOcho_NoValido() {
		//Arrange
		
				//Act
				boolean actual01 = Divisibilidad.esDivisiblePorOcho(304470);
				boolean actual02 = Divisibilidad.esDivisiblePorOcho(5);
				boolean actual03 = Divisibilidad.esDivisiblePorOcho(73410);
				boolean actual04 = Divisibilidad.esDivisiblePorOcho(974208);
				boolean actual05 = Divisibilidad.esDivisiblePorOcho(11);
				boolean actual06 = Divisibilidad.esDivisiblePorOcho(457);
				boolean actual07 = Divisibilidad.esDivisiblePorOcho(895);
				boolean actual08 = Divisibilidad.esDivisiblePorOcho(983);
				boolean actual09 = Divisibilidad.esDivisiblePorOcho(1297);
				
				//Assert
				assertEquals(false,actual01);
				assertEquals(false,actual02);
				assertEquals(false,actual03);
				assertEquals(true,actual04);
				assertEquals(false,actual05);
				assertEquals(false,actual06);
				assertEquals(false,actual07);
				assertEquals(false,actual08);
				assertEquals(false,actual09);
	}
	@Test
	void test09DivisiblePorNueve_NoValido() {
		//Arrange
		
				//Act
				boolean actual01 = Divisibilidad.esDivisiblePorNueve(3);
				boolean actual02 = Divisibilidad.esDivisiblePorNueve(5);
				boolean actual03 = Divisibilidad.esDivisiblePorNueve(7);
				boolean actual04 = Divisibilidad.esDivisiblePorNueve(9);
				boolean actual05 = Divisibilidad.esDivisiblePorNueve(11);
				boolean actual06 = Divisibilidad.esDivisiblePorNueve(457);
				boolean actual07 = Divisibilidad.esDivisiblePorNueve(895);
				boolean actual08 = Divisibilidad.esDivisiblePorNueve(59049);
				boolean actual09 = Divisibilidad.esDivisiblePorNueve(729);
				
				//Assert
				assertEquals(false,actual01);
				assertEquals(false,actual02);
				assertEquals(false,actual03);
				assertEquals(true,actual04);
				assertEquals(false,actual05);
				assertEquals(false,actual06);
				assertEquals(false,actual07);
				assertEquals(true,actual08);
				assertEquals(true,actual09);
	}
	@Test
	void test10DivisiblePorDies_NoValido() {
		//Arrange
		
				//Act
				boolean actual01 = Divisibilidad.esDivisiblePorDies(3);
				boolean actual02 = Divisibilidad.esDivisiblePorDies(5050);
				boolean actual03 = Divisibilidad.esDivisiblePorDies(7);
				boolean actual04 = Divisibilidad.esDivisiblePorDies(9);
				boolean actual05 = Divisibilidad.esDivisiblePorDies(110);
				boolean actual06 = Divisibilidad.esDivisiblePorDies(457);
				boolean actual07 = Divisibilidad.esDivisiblePorDies(895);
				boolean actual08 = Divisibilidad.esDivisiblePorDies(59049);
				boolean actual09 = Divisibilidad.esDivisiblePorDies(729);
				
				//Assert
				assertEquals(false,actual01);
				assertEquals(true,actual02);
				assertEquals(false,actual03);
				assertEquals(false,actual04);
				assertEquals(true,actual05);
				assertEquals(false,actual06);
				assertEquals(false,actual07);
				assertEquals(false,actual08);
				assertEquals(false,actual09);
	}
	@Test
	void test11DivisiblePorOnce_NoValido() {
		//Arrange
		
				//Act
				boolean actual01 = Divisibilidad.esDivisiblePorOnce(3);
				boolean actual02 = Divisibilidad.esDivisiblePorOnce(5050);
				boolean actual03 = Divisibilidad.esDivisiblePorOnce(56716);
				boolean actual04 = Divisibilidad.esDivisiblePorOnce(9);
				boolean actual05 = Divisibilidad.esDivisiblePorOnce(110);
				boolean actual06 = Divisibilidad.esDivisiblePorOnce(457);
				boolean actual07 = Divisibilidad.esDivisiblePorOnce(895);
				boolean actual08 = Divisibilidad.esDivisiblePorOnce(59049);
				boolean actual09 = Divisibilidad.esDivisiblePorOnce(729);
				
				//Assert
				assertEquals(false,actual01);
				assertEquals(false,actual02);
				assertEquals(true,actual03);
				assertEquals(false,actual04);
				assertEquals(true,actual05);
				assertEquals(false,actual06);
				assertEquals(false,actual07);
				assertEquals(false,actual08);
				assertEquals(false,actual09);
	}
}
