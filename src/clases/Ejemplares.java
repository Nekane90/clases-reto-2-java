package clases;

import java.util.Objects;

public class Ejemplares extends Libros {
	
	private int id_ejemplar;
	private String estado_fisico;
	


	
	//////CONSTRUCTORES///////
	
	public Ejemplares(int cod_libro, String titulo_libro, int isbn, int n_copias, int id_ejemplar, String estado_fisico,
			int codigo_libro) {
		super(cod_libro, titulo_libro, isbn, n_copias);
		this.id_ejemplar = id_ejemplar;
		this.estado_fisico = estado_fisico;
	}


	public Ejemplares() {
		super();
	}


	public Ejemplares(int cod_libro, String titulo_libro, int isbn, int n_copias, int id_ejemplar) {
		super(cod_libro, titulo_libro, isbn, n_copias);
		this.id_ejemplar = id_ejemplar;
	}


	
	
	////////////GETTERS Y SETTERS/////////
	
	public int getId_ejemplar() {
		return id_ejemplar;
	}


	public void setId_ejemplar(int id_ejemplar) {
		this.id_ejemplar = id_ejemplar;
	}


	public String getEstado_fisico() {
		return estado_fisico;
	}


	public void setEstado_fisico(String estado_fisico) {
		this.estado_fisico = estado_fisico;
	}



	////////////TO STRING/////////
	

	@Override
	public String toString() {
		return "Ejemplares [id_ejemplar=" + id_ejemplar + ", estado_fisico=" + estado_fisico + "]";
	}



	////////////HASHCODE Y EQUALS/////////
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(estado_fisico, id_ejemplar);
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
		Ejemplares other = (Ejemplares) obj;
		return Objects.equals(estado_fisico, other.estado_fisico) && id_ejemplar == other.id_ejemplar;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
