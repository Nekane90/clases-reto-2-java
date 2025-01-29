package clases;

import java.util.Objects;

public class Biblioteca {
	
	private String nombre;



	
	/////////////CONSTRUCTORES//////////////////
	
	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
	}


	public Biblioteca() {
		super();
	}


	
	//////////GETTERS Y SETTERS////////////////

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	
	///////////TO STRINGS///////////////
	

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + "]";
	}


	
	
	////////////HASHCODE Y EQUALS/////////
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biblioteca other = (Biblioteca) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
	
	
}
