package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import dominio.Fecha;

class TestFecha {
	@Test
	void test01() {
	/**
	 * Validar que al construir una fecha con datos valido los metodos getDia(),
	 *  getMes() y getAnio() devuelvan los valores adecuados.
	 */
	// Arrange
	int expectedDia=1;
	int expectedMes=2;
	int expectedAnio=2000;
	
	//Act
	Fecha fecha = new Fecha(expectedDia,expectedMes,expectedAnio);	
	int actualDia=fecha.getDia();
	int actualMes=fecha.getMes();
	int actualAnio=fecha.getAnio();
	
	//Assert
	assertEquals(expectedDia, actualDia);
	assertEquals(expectedMes,actualMes);
	assertEquals(expectedAnio, actualAnio);
	
	}
	@Test
	void test02() {
	//Arrange
	Fecha f01= new Fecha(1,2,2000);
	String expectedf01="01-02-2000";
	Fecha f02= new Fecha (2,2,2006);
	String expectedf02="02-02-2006";
	Fecha f03= new Fecha(3,2,2010);
	String expectedf03="03-02-2010";
	
	//Act
	String actual01=f01.getFechaCorta();
	String actual02=f02.getFechaCorta();
	String actual03=f03.getFechaCorta();
	
	
	//Assert
	assertEquals(expectedf01, actual01);	
	assertEquals(expectedf02, actual02);
	assertEquals(expectedf03, actual03);
	}

	/**
	 * Validar que al construir una fecha con datos valido el
	 *  metodo getFechaCorta devuelva con el formato adecuado.
	 * Hacer pruebas con dias de uno y dos digitos,
	 *  con meses de uno y dos digitos.
	 * 
	 */
	@Test
	void test03() {
		Fecha f01= new Fecha(-1,-2,2000);
		String expectedf01="01-01-1900";
		Fecha f02= new Fecha (0,2,2006);
		String expectedf02="01-01-1900";
		Fecha f03= new Fecha(35,4,2010);
		String expectedf03="01-01-1900";
		
		//Act
		String actual01=f01.getFechaCorta();
		String actual02=f02.getFechaCorta();
		String actual03=f03.getFechaCorta();
		
		
		//Assert
		assertEquals(expectedf01, actual01);	
		assertEquals(expectedf02, actual02);
		assertEquals(expectedf03, actual03);	
	}
	/**
	 * Validar que al construir una fecha con valores de dias no 
	 * valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos para cada mes.
	 */
	@Test
	void test04() {
		Fecha f01= new Fecha(1,2,2000);
		String expectedf01="01-01-1900";
		Fecha f02= new Fecha (1,0,2006);
		String expectedf02="01-01-1900";
		Fecha f03= new Fecha(5,0,2010);
		String expectedf03="01-01-1900";
		
		//Act
		String actual01=f01.getFechaCorta();
		String actual02=f02.getFechaCorta();
		String actual03=f03.getFechaCorta();
		System.out.println(actual03);
		
		//Assert
		assertEquals(expectedf01, actual01);	
		assertEquals(expectedf02, actual02);
		assertEquals(expectedf03, actual03);
	}
	
	/**
	 * Validar que al construir una fecha con valores de meses 
	 * no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos 
	 * para todos los meses.
	 * 
	 */
	@Test
	void test05() {
		Fecha f01= new Fecha(1,2,2000);
		
		Fecha f02= new Fecha (1,2,2000);
		
		Fecha f03= new Fecha(5,3,2010);
		
		Fecha f04= new Fecha(6,9,2012);
		
		Fecha f05= new Fecha(28,12,2019);
		
		
		//Assert
		assertEquals(true, f01.equals(f02));	
		assertEquals(false, f03.equals(f01));
		assertEquals(false, f04.equals(f05));
		assertEquals(false, f05.equals(f01));
	}
		
	/**
	 * Validar equals de fecha.
	 * Tanto el true como el false.
	 */
	@Test
	void test06() {
		Fecha f01=new Fecha(13, 1, 2000);
		
		Fecha f02=new Fecha(15, 1, 2000);
		
		Fecha f03=new Fecha(1, 12, 2000);
		
		Fecha f04=new Fecha(1, 1, 2000);
		
		Fecha f05=new Fecha(10, 6, 2019);
		
		Fecha f06=new Fecha(7, 8, 2018);
		
	//Assert
	assertEquals(false,f01.esMayorQue(f02));
	assertEquals(true,f03.esMayorQue(f04));
	assertEquals(false,f01.esMayorQue(f01));
	assertEquals(false,f02.esMayorQue(f03));
	assertEquals(true,f05.esMayorQue(f06));	
	assertEquals(true,f06.esMayorQue(f03));
	}
	
	/**
	 * Validar el metodo esMayorQue(Fecha).
	 * Hacer pruebas con fechas mayores, menores e iguales.
	 * En los primeros dos casos hacer pruebas que difieran solo en el dia,
	 *  luego solo en el mes, luego solo en el anio.
	 * Luego en el dia y anio y finalmente los tres valores.
	 * 
	 */
	
	
	
}


