package app.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="pago")
public class Pago {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="ftarjeta")
	private String ftarjeta;
	@Column(name="fdeuda")
	private String fdeuda;
	@Column(name="fechapago")
	private Date fechapago;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		return "Pago [id=" + id + ", ftarjeta=" + ftarjeta + ", fdeuda=" + fdeuda + ", fechapago=" + fechapago + "]";
	}
	
	
}

