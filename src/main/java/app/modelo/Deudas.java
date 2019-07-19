package app.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="deudas")
public class Deudas {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int iddeuda;	
	  private String fdni;
	  private String fidservicio;
	  private BigDecimal montodeuda;
	public int getIddeuda() {
		return iddeuda;
	}
	public void setIddeuda(int iddeuda) {
		this.iddeuda = iddeuda;
	}
	public String getFdni() {
		return fdni;
	}
	public void setFdni(String fdni) {
		this.fdni = fdni;
	}
	public String getFidservicio() {
		return fidservicio;
	}
	public void setFidservicio(String fidservicio) {
		this.fidservicio = fidservicio;
	}
	public BigDecimal getMontodeuda() {
		return montodeuda;
	}
	public void setMontodeuda(BigDecimal montodeuda) {
		this.montodeuda = montodeuda;
	}
	@Override
	public String toString() {
		return "Deudas [iddeuda=" + iddeuda + ", fdni=" + fdni + ", fidservicio=" + fidservicio + ", montodeuda="
				+ montodeuda + "]";
	}
	  
	  

}
