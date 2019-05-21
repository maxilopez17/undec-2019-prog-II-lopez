package dominio;

public class Login {
	private String usuario;	
	private String contrasenia;
	
	public Login(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	
	public Login() {
		this.usuario="";
		this.contrasenia="";
	}

	public String getUsuario() {
		return this.usuario;
	}
	public String getContrasenia() {
		return this.contrasenia;
	}
	
	public void setUsuario(String usuario) {
		this.usuario=usuario;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia=contrasenia;
	}

	public static boolean ValidarLongitud(String contraNoValida1) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean ValidarMinusculas(String contraNoValida2) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean ValidarNumeros(String contraNoValida3) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean ValidarContrasenia(String contraValida1) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean validarCaracterEspeciales(String contraValida1) {
		// TODO Auto-generated method stub
		return false;
	}
	





}
