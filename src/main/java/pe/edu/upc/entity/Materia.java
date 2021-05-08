package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "Materias")	
public class Materia implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMateria;
	
	@Column(name = "country_name", length = 20)
	private String nombre;

	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Materia(Integer idMateria, String nombre) {
		super();
		this.idMateria = idMateria;
		this.nombre = nombre;
	}

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// -- Constructor, Getter, Setter
	
	
	
}
