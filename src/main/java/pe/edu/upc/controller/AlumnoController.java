package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Alumno;
import pe.edu.upc.entity.Persona;

import pe.edu.upc.service.IAlumnoService;
import pe.edu.upc.service.IPersonaService;

@Named
@RequestScoped
public class AlumnoController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private IAlumnoService aS;
	
	@Inject
	private IPersonaService pS;
	
	private Alumno alumno;
	private Persona persona;
	
	List<Alumno> listaAlumnos;
	List<Persona> listaPersonas;
	
	@PostConstruct
	public void init() {
		this.listaAlumnos = new ArrayList<Alumno>();
		this.listaPersonas = new ArrayList<Persona>();
		this.alumno = new Alumno();
		this.persona = new Persona();
		this.list();
		this.listarPersona();
	}
	
	public String newAlumno() {
		this.setAlumno(new Alumno());
		return "alumno.xhtml";
	}
	
	public void insert() {
		aS.insert(alumno);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaAlumnos = aS.list();
	}
	
	public void listarPersona() {
		listaPersonas = pS.list();
	}
	
	public void clean() {
		this.init();
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

}
