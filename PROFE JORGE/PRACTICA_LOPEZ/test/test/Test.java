package test;

import static org.junit.jupiter.api.Assertions.*;

import dominio.Arbitro;
import dominio.Jugador;
import dominio.Persona;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		
		Persona p1=new Persona();
		
		String nombre=p1.getNombre();
		String apellido=p1.getApellido();
		
		
		assertEquals("",nombre);
		assertEquals("",apellido);
		
	}
	@org.junit.jupiter.api.Test
	void test02() {
		
		Persona p1=new Persona();
		
		p1.setNombre("Juan");
		p1.setApellido("Gonzalez");
		
		String nombre=p1.getNombre();
		String apellido=p1.getApellido();
		
		
		assertEquals("Juan",nombre);
		assertEquals("Gonzalez",apellido);
		
	}
	@org.junit.jupiter.api.Test
	void test03() {
		
		Persona p1=new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Gonzalez");
		///
		Persona p2=new Persona();
		p2.setNombre("Juan");
		p2.setApellido("Gonzalez");
		

		assertEquals(false,p1==p2); // porque las direcciones de memoria son diferentes
		
		
	}
	@org.junit.jupiter.api.Test
	void test04() {
		
		Persona p1=new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Gonzalez");
		///
		Persona p2=new Persona();
		p2.setNombre("Juan");
		p2.setApellido("Gonzalez");
		

		assertEquals(true,p1.equals(p2)); 
	}
	@org.junit.jupiter.api.Test
	void test05() {
		
		Persona p1=new Jugador();
		Jugador p2= (Jugador) p1;
		p2.setPuesto("Defensor"); 
			
	}
	@org.junit.jupiter.api.Test
	void test06() {
		
		Persona p1=new Arbitro();
		Arbitro p2= (Arbitro) p1;
		p2.setApellido("Rojas"); 
		assertEquals("Arbitro Rojas",p2.getApellido());	
	}
	
}
