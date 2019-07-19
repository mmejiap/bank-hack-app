package app.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // This tells Hibernate to make a table out of this class
@Table(name="pago")
public class Servicios {
	@Id
	private String idServicio;
	private String nombreservicio;
	public String getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(String idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombreservicio() {
		return nombreservicio;
	}
	public void setNombreservicio(String nombreservicio) {
		this.nombreservicio = nombreservicio;
	}
	@Override
	public String toString() {
		return "Servicios [idServicio=" + idServicio + ", nombreservicio=" + nombreservicio + "]";
	}
	

}
