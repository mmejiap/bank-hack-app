package app.modelo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="tarjeta")
public class Tarjeta {
	@Id
	@Column(name="ntarjeta")
	private String ntarjeta;
	@Column(name="tipotarjeta")
	private String tipotarjeta;
	@Column(name="fechavencimiento")
	private Date fechavencimiento;
	@Column(name="cvv")
	private Integer cvv;
	@Column(name="ncuenta")
	private String ncuenta;
	@Column(name="montototal")
	private BigDecimal montototal;
	@Column(name="saldo")
	private BigDecimal saldo;
	@Column(name="fdni")	
	private String  fdni;
	public String getNtarjeta() {
		return ntarjeta;
	}
	public void setNtarjeta(String ntarjeta) {
		this.ntarjeta = ntarjeta;
	}
	public String getTipotarjeta() {
		return tipotarjeta;
	}
	public void setTipotarjeta(String tipotarjeta) {
		this.tipotarjeta = tipotarjeta;
	}
	public Date getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public String getNcuenta() {
		return ncuenta;
	}
	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}
	public BigDecimal getMontototal() {
		return montototal;
	}
	public void setMontototal(BigDecimal montototal) {
		this.montototal = montototal;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getFdni() {
		return fdni;
	}
	public void setFdni(String fdni) {
		this.fdni = fdni;
	}
	@Override
	public String toString() {
		return "Tarjeta [ntarjeta=" + ntarjeta + ", tipotarjeta=" + tipotarjeta + ", fechavencimiento="
				+ fechavencimiento + ", cvv=" + cvv + ", ncuenta=" + ncuenta + ", montototal=" + montototal + ", saldo="
				+ saldo + ", fdni=" + fdni + "]";
	}

}
