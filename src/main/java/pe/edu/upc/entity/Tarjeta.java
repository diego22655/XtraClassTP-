package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.FetchType;*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.OneToMany;*/
import javax.persistence.Table;

@Entity
@Table(name = "tarjetas")
public class Tarjeta { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTarjeta;
	
	@Column(name = "nro_Tarjeta", length = 16, nullable = false)
	private String nroTarjeta;
	
	@Column(name = "propietario", length = 40, nullable = false)
	private String propietario;
	
	@Column(name = "ccv", columnDefinition = "NUMERIC(3)")
	private Integer ccv;

	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarjeta(int idTarjeta, String nroTarjeta, String propietario, Integer ccv) {
		super();
		this.idTarjeta = idTarjeta;
		this.nroTarjeta = nroTarjeta;
		this.propietario = propietario;
		this.ccv = ccv;
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public Integer getCcv() {
		return ccv;
	}

	public void setCcv(Integer ccv) {
		this.ccv = ccv;
	}
	
	
	// -- Constructor, Getter, Setter
	
}
