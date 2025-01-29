package clases;

import java.util.Objects;

public class Empleados extends Usuarios {

	private String seguridadSocial;

	
	
	
	//////CONSTRUCTORES///////
	
	public Empleados(int id_usuario, int dNI, String nombre_usuario, int tlf, String correo_electronico,
			String contraseña, String seguridadSocial) {
		super(id_usuario, dNI, nombre_usuario, tlf, correo_electronico, contraseña);
		this.seguridadSocial = seguridadSocial;
	}



	public Empleados(String seguridadSocial) {
		super();
		this.seguridadSocial = seguridadSocial;
	}



	public Empleados(int id_usuario, String correo_electronico, String seguridadSocial) {
		super(id_usuario, correo_electronico);
		this.seguridadSocial = seguridadSocial;
	}



	
	////////////GETTERS Y SETTERS/////////
	
	public String getSeguridadSocial() {
		return seguridadSocial;
	}



	public void setSeguridadSocial(String seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}



	
	
	
	////////////TO STRING/////////
	
	@Override
	public String toString() {
		return "Empleados [seguridadSocial=" + seguridadSocial + "]";
	}



	
	

	////////////HASHCODE Y EQUALS/////////
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(seguridadSocial);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return Objects.equals(seguridadSocial, other.seguridadSocial);
	}
	
	

}
