package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import dominio.Fecha;
import dominio.Precio;
import dominio.Producto;

class TestProducto {
	@Test
	void test01() {
		//Arrange
		String expectedCodigo ="0001";
		String expectedNombre= "Azucar";
	
		
		//Act
		Producto p01= new Producto(expectedCodigo,expectedNombre);	
		
		//Assert
		assertEquals(expectedCodigo,p01.getCodigo());
		assertEquals(expectedNombre, p01.getNombre());
	}
	/**}
	 * Validar el constructor de producto junto con los getter de nombre y codigo.
	 * 
	 */
	@Test
	void test02() {
		//Arrange
		String expectedCodigo ="0001";
		String expectedNombre= "Azucar";
		//Act
		
		Producto p01= new Producto(expectedCodigo,expectedNombre);	
		double precio1= p01.getLastPrecio();
		//Assert
		assertEquals(-1,precio1);// tiene que ser -1

	}
	
	/**}
	 * Validar que un producto devuelva como precio -1 cuando 
	 * no tiene cargado ningun precio.
	 * 
	 */
	@Test
	void test03() {
		Fecha fechaDesde01 = new Fecha(1, 6, 2019);
		Fecha fechaHasta01 = new Fecha(30, 6, 2019);
		
		Fecha fechaDesde02 = new Fecha(1, 7, 2019);
		Fecha fechaHasta02 = new Fecha(31, 7, 2019);
		
		Fecha fechaDesde03 = new Fecha(1, 8, 2019);
		Fecha fechaHasta03 = new Fecha(31, 8, 2019);
		
		Precio p01= new Precio(20,fechaDesde01,fechaHasta01);
		Precio p02= new Precio(25,fechaDesde02,fechaHasta02);
		Precio p03= new Precio(35,fechaDesde03,fechaHasta03);
		
		Producto pp01= new Producto("0001","azucar");
		
		boolean actualpp01=pp01.cargarPrecio(p01);
		boolean actualpp02=pp01.cargarPrecio(p02);
		boolean actualpp03=pp01.cargarPrecio(p03);
		
		//Assert
		assertEquals(true, actualpp01);
		assertEquals(true, actualpp02);
		assertEquals(true, actualpp03);
		// para cargar uno herroneo hacer de nuevo de fechas y precio
	}
	/**}
	 * Validar que un producto cargue adecuadamente varios precio 
	 * (con fechas distintas pero siemre progresivas)
	 * y en medio de cada carga que el metodo getLastPrecio
	 *  funcione adecuadamente.
	 * 
	 */
	@Test
	void test04() {
		Fecha fechaDesde01 = new Fecha(1, 6, 2019);
		Fecha fechaHasta01 = new Fecha(30, 6, 2019);
		
		Fecha fechaDesde02 = new Fecha(1, 6, 2019);
		Fecha fechaHasta02 = new Fecha(30, 6, 2019);
		
		Precio p01= new Precio(20,fechaDesde01,fechaHasta01);
		Precio p02= new Precio(25,fechaDesde02,fechaHasta02);

		
		Producto pp01= new Producto("0001","azucar");
		
		boolean actualpp01=pp01.cargarPrecio(p01);
		boolean actualpp02=pp01.cargarPrecio(p02);
		
		
		//Assert
		assertEquals(true, actualpp01);
		assertEquals(true, actualpp02);
		
	}
	
	/**}
	 * Validar que un producto no cargue un nuevo precio 
	 * cuando la fecha se solapen.
	 * 
	 */
	@Test
	void test05() {
		Fecha fechaDesde01 = new Fecha(1, 6, 2019);
		Fecha fechaHasta01 = new Fecha(30, 6, 2019);
		
		Fecha fechaDesde02 = new Fecha(1, 7, 2019);
		Fecha fechaHasta02 = new Fecha(31, 7, 2019);
		
		Fecha fechaDesde03 = new Fecha(1, 8, 2019);
		Fecha fechaHasta03 = new Fecha(31, 8, 2019);
		
		Precio p01= new Precio(20,fechaDesde01,fechaHasta01);
		Precio p02= new Precio(25,fechaDesde02,fechaHasta02);
		Precio p03= new Precio(35,fechaDesde03,fechaHasta03);
		
		Producto pp01= new Producto("0001","azucar");
		
		pp01.cargarPrecio(p01);
		pp01.cargarPrecio(p02);
		pp01.cargarPrecio(p03);
		
		//Assert
		assertEquals(true, pp01.removePrecio());
		assertEquals(true, pp01.removePrecio());
		assertEquals(true, pp01.removePrecio());
	}
	
	/**}
	 * Validar que el método removePrecio (removelasprecio) elimine 
	 * adecuadamente los precios.
	 * 
	 */
	
}
