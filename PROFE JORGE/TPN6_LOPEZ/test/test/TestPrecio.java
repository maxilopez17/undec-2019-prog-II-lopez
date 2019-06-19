package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import dominio.Precio;
import dominio.Fecha;

class TestPrecio {
	@Test
	void test01() {
	//Arrange
	double expectedValor = 50;
	Fecha fechaDesde = new Fecha(11, 6, 2019);
	Fecha fechaHasta = new Fecha(30, 6, 2019);
	
	//Act
	Precio p01= new Precio(expectedValor, fechaDesde, fechaHasta);	
		
	//Assert
	assertEquals(expectedValor, p01.getValor());
	assertEquals(fechaDesde, p01.getFechaDesde());
	assertEquals(fechaHasta, p01.getFechaHasta());	
	}
	/**
	 * Validar que el constructor y los getter funcionan corractamente
	 * 
	 */
	@Test
	void test02() {
	Fecha fechaDesde= new Fecha(3,4,2010);
	Fecha fechaHasta= new Fecha(30,4,2010);
	
	Fecha fechaDesde01= new Fecha(13,6,2011);
	Fecha fechaHasta01= new Fecha(30,6,2011);
	
	Precio p01= new Precio(50,fechaDesde,fechaHasta);
	
	Precio p02= new Precio(500,fechaDesde,fechaHasta);	
		
	Precio p03= new Precio(200,fechaDesde01,fechaHasta01);
	
	assertEquals(true,p01.equals(p02));
	assertEquals(false,p02.equals(p03));
		
	}

	/**
	 * Validar dos precios son iguales solamente si
	 *  se solapan sus intervalos desde hasta 
	 * 
	 */
	
}