package pe.edu.upc.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "personas")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;
	
	@Column(name = "nombre", length = 20, nullable = true)
	private String nombre;
	
	@Column(name = "apellido", length = 20)
	private String apellido;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "contraseña", length = 12, nullable = true)
	private String contraseña;
	 
	@Column(name = "nacimiento")
	@Temporal(TemporalType.DATE)
	private Date nacimiento;
	
	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Alumno> alumnos;

	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Docente> docentes;
	
	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Perfil> perfiles;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int idPersona, String nombre, String apellido, String email, String contraseña, Date nacimiento,
			List<Alumno> alumnos, List<Docente> docentes, List<Perfil> perfiles) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contraseña = contraseña;
		this.nacimiento = nacimiento;
		this.alumnos = alumnos;
		this.docentes = docentes;
		this.perfiles = perfiles;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}

	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

}