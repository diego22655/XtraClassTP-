package pe.edu.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Alumno;
import pe.edu.upc.entity.Foro;
import pe.edu.upc.service.IAlumnoService;
import pe.edu.upc.service.IForoService;

@Named
@RequestScoped
public class ForoController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IForoService fS;
	
	@Inject 
	private IAlumnoService aS;
	
	private Foro foro;
	private Alumno alumno;
	
	List<Foro> listaForo;
	List<Alumno> listaAlumnos;
	
	@PostConstruct
	public void init() {
		this.listaForo = new ArrayList<Foro>();
		this.listaAlumnos = new ArrayList<Alumno>();
		this.alumno = new Alumno();
		this.foro = new Foro();
		this.list();
		this.listaAlumnos();
	}
	
	public String newForo() {
		this.setForo(new Foro());
		return "grabarforo.xhtml";
	}
	
	public void insert() {
		fS.insert(foro);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaForo = fS.list();
	}
	
	public void listaAlumnos() {
		listaAlumnos = aS.list();
	}
	
	public void clean() {
		this.init();
	}

	public Foro getForo() {
		return foro;
	}

	public void setForo(Foro foro) {
		this.foro = foro;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public List<Foro> getListaForo() {
		return listaForo;
	}

	public void setListaForo(List<Foro> listaForo) {
		this.listaForo = listaForo;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
}




	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	


	
	
	
	
