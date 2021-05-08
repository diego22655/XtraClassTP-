package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asunto")
public class Asunto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAsunto;
	
	@Column(name = "nomAsunto",length = 15, nullable = false)
	private String nomAsunto;
	
	@Column(name = "descripcion",length = 120)
	private String descripcion;

	public Asunto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asunto(int idAsunto, String nomAsunto, String descripcion) {
		super();
		this.idAsunto = idAsunto;
		this.nomAsunto = nomAsunto;
		this.descripcion = descripcion;
	}

	public int getIdAsunto() {
		return idAsunto;
	}

	public void setIdAsunto(int idAsunto) {
		this.idAsunto = idAsunto;
	}

	public String getNomAsunto() {
		return nomAsunto;
	}

	public void setNomAsunto(String nomAsunto) {
		this.nomAsunto = nomAsunto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
