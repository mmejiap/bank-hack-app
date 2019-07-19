package app.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="pago")
public class Pago {
	private String ftarjeta;
	private String fdeuda;
	private Date fechapago;
	public String getFtarjeta() {
		return ftarjeta;
	}
	public void setFtarjeta(String ftarjeta) {
		this.ftarjeta = ftarjeta;
	}
	public String getFdeuda() {
		return fdeuda;
	}
	public void setFdeuda(String fdeuda) {
		this.fdeuda = fdeuda;
	}
	public Date getFechapago() {
		return fechapago;
	}
	public void setFechapago(Date fechapago) {
		this.fechapago = fechapago;
	}
	@Override
	public String toString() {
		return "Pago [ftarjeta=" + ftarjeta + ", fdeuda=" + fdeuda + ", fechapago=" + fechapago + "]";
	}
	
}
