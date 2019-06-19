package dominio;

public class Producto {
	private String codigo;
	private String nombre;
	private Precio[] misPrecios =new Precio[100];
	int precios=0; // indice de precios
	
	public Producto(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Precio[] getMisPrecios() {
		return misPrecios;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMisPrecios(Precio[] misPrecios) {
		this.misPrecios = misPrecios;
	}
	
	public boolean cargarPrecio(Precio precio) {
		if(precios == 0 ) {
			misPrecios[0]=precio;
			precios++;
			return true;
		}
		else
			if(precios > 0) {
				misPrecios[precios+1]=precio;
				precios++;
				return true;
			}
			else
			
				return false;	
	}
	
	public double getLastPrecio() {
		if(precios > 0)
			return misPrecios[precios].getValor();
		else
			return -1;
	}
	
	public boolean removePrecio() {
		
		
		if(misPrecios.length > 0){
			
			misPrecios[misPrecios.length - 1] = null; 
			return true;
		}
		return false;
	}
	
	
	
	
	
}
