package clases;

import java.util.Date;
import java.util.Objects;

public class Penalizaciones extends Usuarios {

	private Date fechaInicioPenalizacion;
	private Date fechaFinPenalizacion;
	
	
	
	//////CONSTRUCTORES///////
	
	public Penalizaciones(int id_usuario, int dNI, String nombre_usuario, int tlf, String correo_electronico,
			String contraseña, Date fechaInicioPenalizacion, Date fechaFinPenalizacion) {
		super(id_usuario, dNI, nombre_usuario, tlf, correo_electronico, contraseña);
		this.fechaInicioPenalizacion = fechaInicioPenalizacion;
		this.fechaFinPenalizacion = fechaFinPenalizacion;
	}



	public Penalizaciones(Date fechaInicioPenalizacion, Date fechaFinPenalizacion) {
		super();
		this.fechaInicioPenalizacion = fechaInicioPenalizacion;
		this.fechaFinPenalizacion = fechaFinPenalizacion;
	}



	public Penalizaciones(int id_usuario, String correo_electronico, Date fechaInicioPenalizacion,
			Date fechaFinPenalizacion) {
		super(id_usuario, correo_electronico);
		this.fechaInicioPenalizacion = fechaInicioPenalizacion;
		this.fechaFinPenalizacion = fechaFinPenalizacion;
	}



	
	////////////GETTERS Y SETTERS/////////
	

	public Date getFechaInicioPenalizacion() {
		return fechaInicioPenalizacion;
	}



	public void setFechaInicioPenalizacion(Date fechaInicioPenalizacion) {
		this.fechaInicioPenalizacion = fechaInicioPenalizacion;
	}



	public Date getFechaFinPenalizacion() {
		return fechaFinPenalizacion;
	}



	public void setFechaFinPenalizacion(Date fechaFinPenalizacion) {
		this.fechaFinPenalizacion = fechaFinPenalizacion;
	}



	////////////TO STRING/////////
	
	@Override
	public String toString() {
		return "Penalizaciones [fechaInicioPenalizacion=" + fechaInicioPenalizacion + ", fechaFinPenalizacion="
				+ fechaFinPenalizacion + "]";
	}



	

	////////////HASHCODE Y EQUALS/////////
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fechaFinPenalizacion, fechaInicioPenalizacion);
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
		Penalizaciones other = (Penalizaciones) obj;
		return Objects.equals(fechaFinPenalizacion, other.fechaFinPenalizacion)
				&& Objects.equals(fechaInicioPenalizacion, other.fechaInicioPenalizacion);
	}
	
	
	
	
	
}
