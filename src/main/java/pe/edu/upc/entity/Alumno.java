package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlumno;
	
	@ManyToOne
	@JoinColumn(name = "idPersona")
	private Persona persona;
	
	@Column(name = "Tarjeta", nullable = true, length=16)
	private int nrotarjeta;
	
	@Column(name = "propietario", length = 40, nullable = false)
	private String propietario;
	
	@Column(name = "ccv", columnDefinition = "NUMERIC(3)")
	private int ccv;

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(int idAlumno, Persona persona, int nrotarjeta, String propietario, int ccv) {
		super();
		this.idAlumno = idAlumno;
		this.persona = persona;
		this.nrotarjeta = nrotarjeta;
		this.propietario = propietario;
		this.ccv = ccv;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int getNrotarjeta() {
		return nrotarjeta;
	}

	public void setNrotarjeta(int nrotarjeta) {
		this.nrotarjeta = nrotarjeta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getCcv() {
		return ccv;
	}

	public void setCcv(int ccv) {
		this.ccv = ccv;
	}

	
	
}
