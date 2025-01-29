package clases;

import java.util.Date;
import java.util.Objects;

public class Prestamos {

	private int id_prestamo;
	private Date fecha_prestamo;
	private Date fecha_Devolucion;
	private int id_usuario;
	private int id_ejemplar;
	
	
	
	
	//////CONSTRUCTORES///////
	
	
	public Prestamos(int id_prestamo, Date fecha_prestamo, Date fecha_Devolucion, int id_usuario, int id_ejemplar) {
		super();
		this.id_prestamo = id_prestamo;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_Devolucion = fecha_Devolucion;
		this.id_usuario = id_usuario;
		this.id_ejemplar = id_ejemplar;
	}




	public Prestamos(Date fecha_prestamo, Date fecha_Devolucion, int id_usuario) {
		super();
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_Devolucion = fecha_Devolucion;
		this.id_usuario = id_usuario;
	}


	public Prestamos() {
		super();
	}



	////////////GETTERS Y SETTERS/////////
	
	public int getId_prestamo() {
		return id_prestamo;
	}




	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}




	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}




	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}




	public Date getFecha_Devolucion() {
		return fecha_Devolucion;
	}




	public void setFecha_Devolucion(Date fecha_Devolucion) {
		this.fecha_Devolucion = fecha_Devolucion;
	}




	public int getId_usuario() {
		return id_usuario;
	}




	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}




	public int getId_ejemplar() {
		return id_ejemplar;
	}




	public void setId_ejemplar(int id_ejemplar) {
		this.id_ejemplar = id_ejemplar;
	}




	
	////////////TO STRING/////////

	@Override
	public String toString() {
		return "Prestamos [id_prestamo=" + id_prestamo + ", fecha_prestamo=" + fecha_prestamo + ", fecha_Devolucion="
				+ fecha_Devolucion + ", id_usuario=" + id_usuario + ", id_ejemplar=" + id_ejemplar + "]";
	}




	
	////////////HASHCODE Y EQUALS/////////
	
	@Override
	public int hashCode() {
		return Objects.hash(fecha_Devolucion, fecha_prestamo, id_ejemplar, id_prestamo, id_usuario);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamos other = (Prestamos) obj;
		return Objects.equals(fecha_Devolucion, other.fecha_Devolucion)
				&& Objects.equals(fecha_prestamo, other.fecha_prestamo) && id_ejemplar == other.id_ejemplar
				&& id_prestamo == other.id_prestamo && id_usuario == other.id_usuario;
	}
	
	
	
	
}
