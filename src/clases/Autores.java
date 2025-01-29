package clases;

import java.util.Objects;

public class Autores {

	private int codigo_autor;
	private String nombre;
	private String apellidos;
	
	
	
	////////////CONSTRUCTORES/////////
	
	public Autores(int codigo_autor, String nombre, String apellidos) {
		super();
		this.codigo_autor = codigo_autor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}



	public Autores() {
		super();
	}



	////////////GETTERS Y SETTERS/////////
	
	public int getCodigo_autor() {
		return codigo_autor;
	}



	public void setCodigo_autor(int codigo_autor) {
		this.codigo_autor = codigo_autor;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	
		////////////TO STRING/////////
	@Override
	public String toString() {
		return "Autores [codigo_autor=" + codigo_autor + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	
	
	////////////HASHCODE Y EQUALS/////////
	
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, codigo_autor, nombre);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autores other = (Autores) obj;
		return Objects.equals(apellidos, other.apellidos) && codigo_autor == other.codigo_autor
				&& Objects.equals(nombre, other.nombre);
	}
	

	
}
