package clases;

import java.util.Objects;

public class Libros {
	private int cod_libro;
	private String titulo_libro;
	private int isbn;
	private int n_copias;
	
	
	

		/////////////CONSTRUCTORES//////////
	
	public Libros(int cod_libro, String titulo_libro, int isbn, int n_copias) {
		super();
		this.cod_libro = cod_libro;
		this.titulo_libro = titulo_libro;
		this.isbn = isbn;
		this.n_copias = n_copias;
	}

		public Libros(int cod_libro, String titulo_libro) {
			super();
			this.cod_libro = cod_libro;
			this.titulo_libro = titulo_libro;
		}
		public Libros() {
		}
		
	
		//////////GETTERS Y SETTERS////////////////
		
	

		public int getCod_libro() {
			return cod_libro;
		}

		public void setCod_libro(int cod_libro) {
			this.cod_libro = cod_libro;
		}

		public String getTitulo_libro() {
			return titulo_libro;
		}

		public void setTitulo_libro(String titulo_libro) {
			this.titulo_libro = titulo_libro;
		}

		public int getIsbn() {
			return isbn;
		}

		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}

		public int getN_copias() {
			return n_copias;
		}

		public void setN_copias(int n_copias) {
			this.n_copias = n_copias;
		}


		///////////TO STRINGS///////////////

		@Override
		public String toString() {
			return "Libros [cod_libro=" + cod_libro + ", titulo_libro=" + titulo_libro + ", isbn=" + isbn
					+ ", n_copias=" + n_copias + "]";
		}

	
		////////////HASHCODE Y EQUALS/////////
	

		@Override
		public int hashCode() {
			return Objects.hash(cod_libro, isbn, n_copias, titulo_libro);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Libros other = (Libros) obj;
			return cod_libro == other.cod_libro && isbn == other.isbn && n_copias == other.n_copias
					&& Objects.equals(titulo_libro, other.titulo_libro);
		}
	
	
	
	
}
