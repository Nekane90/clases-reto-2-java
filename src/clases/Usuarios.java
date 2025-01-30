package clases;

import java.util.Objects;

public class Usuarios {

	private int id_usuario;
	private int DNI ;
	private String nombre_usuario;
	private int tlf;
	private String correo_electronico;
	private String contraseña;
	private boolean seguridadSocial;
	
	
	
	/////////////CONSTRUCTORES//////////
	
	public Usuarios(int id_usuario, int dNI, String nombre_usuario, int tlf, String correo_electronico,
			String contraseña, boolean seguridadSocial) {
		super();
		this.id_usuario = id_usuario;
		DNI = dNI;
		this.nombre_usuario = nombre_usuario;
		this.tlf = tlf;
		this.correo_electronico = correo_electronico;
		this.contraseña = contraseña;
		this.setSeguridadSocial(seguridadSocial);
	}

	
	
	public Usuarios(int dNI, String nombre_usuario, String correo_electronico, String contraseña) {
		super();
		DNI = dNI;
		this.nombre_usuario = nombre_usuario;
		this.correo_electronico = correo_electronico;
		this.contraseña = contraseña;
	}


	public Usuarios() {
		super();
	}



	//////////GETTERS Y SETTERS////////////////
	
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public void setSeguridadSocial(boolean seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}
	

	
		///////////TO STRINGS///////////////
	@Override
	public String toString() {
		return "Usuarios [id_usuario=" + id_usuario + ", DNI=" + DNI + ", nombre_usuario=" + nombre_usuario + ", tlf="
				+ tlf + ", correo_electronico=" + correo_electronico + ", contraseña=" + contraseña
				+ ", seguridadSocial=" + seguridadSocial + "]";
	}

	
	
	
	////////////HASHCODE Y EQUALS/////////
	
	@Override
	public int hashCode() {
		return Objects.hash(DNI, contraseña, correo_electronico, id_usuario, nombre_usuario, seguridadSocial, tlf);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return DNI == other.DNI && Objects.equals(contraseña, other.contraseña)
				&& Objects.equals(correo_electronico, other.correo_electronico) && id_usuario == other.id_usuario
				&& Objects.equals(nombre_usuario, other.nombre_usuario) && seguridadSocial == other.seguridadSocial
				&& tlf == other.tlf;
	}

	
	/////////// METODOS DE LA CLASE/////////////////
	
	public boolean  esEmpleado() {
		return false;
	}
	



	public boolean estaPenalizado() {
		return false;
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}