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
@Table (name = "Docente")
public class Docente implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDocente;

    @Column(name = "NumeroCuenta", length = 20, nullable = false)
    private String numeroCuenta;
    
    @ManyToOne
	@JoinColumn(name = "idPersona")
	private Persona persona;

	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Docente(int idDocente, String numeroCuenta, Persona persona) {
		super();
		this.idDocente = idDocente;
		this.numeroCuenta = numeroCuenta;
		this.persona = persona;
	}

	public int getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
    
    // -- Constructor, Getter, Setter
    

	
}
