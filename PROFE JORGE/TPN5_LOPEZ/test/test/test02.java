package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Carrera;

class test02 {

	@Test
	void test01() { //1.1
		//arrange
		Carrera c01=new Carrera("Licenciatura en Sistemas","Lic.Sist","128/01");
		
		
		String nombreEsperado= "LICENCIATURA EN SISTEMAS";
		
		//act
		
		String actual = c01.getNombreEnMayusculas();
		
		
		//assert
		assertEquals(nombreEsperado, actual);
	}
	
	void test02() { //1.2
		//arrange
		Carrera c01=new Carrera("Licenciatura en Sistemas","Lic.Sist","128/01");
		String nombreEsperado01= "Licenciatura en Sistemas";
		
		
		Carrera c02=new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado02= "Abogacia";
		
		Carrera c03=new Carrera("abogacia","Abog","128/01");
		String nombreEsperado03= "Abogacia";
		
		Carrera c04=new Carrera("aBOGACIA","Abog","128/01");
		String nombreEsperado04= "Abogacia";
		//act
		
		String actual01 = c01.getNombreTipoOracion();
		String actual02 = c02.getNombreTipoOracion();
		String actual03 = c03.getNombreTipoOracion();
		String actual04 = c03.getNombreTipoOracion();
		
		
		//assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);	
	}

	void test04() { //1.4
		//arrange
		Carrera c01=new Carrera("Licenciatura en Sistemas","Lic.Sist","128/01");
		String nombreEsperado01= "Licen. Siste.";
		
		
		Carrera c02=new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado02= "Aboga.";
		
		Carrera c03=new Carrera("Medicina","Abog","128/01");
		String nombreEsperado03= "Medic.";
		
		Carrera c04=new Carrera("Ingenieria en Sistemas","Abog","128/01");
		String nombreEsperado04= "Ingen. Siste.";
		//act
		
		String actual01 = c01.getNombreCorto();
		String actual02 = c02.getNombreCorto();
		String actual03 = c03.getNombreCorto();
		String actual04 = c04.getNombreCorto();
		
		
		//assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);
		
	}
	void test05() { //1.5
		//arrange
		Carrera c01=new Carrera("Licenciatura en Sistemas","Lic.Sist","128/01");
		String nombreEsperado01= "LS";
		
		
		Carrera c02=new Carrera("Abogacia","Abog","128/01");
		String nombreEsperado02= "A";
		
		Carrera c03=new Carrera("Medicina","Abog","128/01");
		String nombreEsperado03= "M";
		
		Carrera c04=new Carrera("Ingenieria en Sistemas","Abog","128/01");
		String nombreEsperado04= "IS";
		//act
		
		String actual01 = c01.getNombreTipoOracion();
		String actual02 = c02.getNombreTipoOracion();
		String actual03 = c03.getNombreTipoOracion();
		String actual04 = c04.getNombreTipoOracion();
		
		
		//assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);
	}
	
	
	
	
	
	
	
	
}
