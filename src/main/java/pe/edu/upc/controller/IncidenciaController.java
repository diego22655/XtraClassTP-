package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Alumno;
import pe.edu.upc.entity.Asunto;
import pe.edu.upc.entity.Incidencia;
import pe.edu.upc.service.IAlumnoService;
import pe.edu.upc.service.IAsuntoService;
import pe.edu.upc.service.IIncidenciaService;

@Named
@RequestScoped
public class IncidenciaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IIncidenciaService iS;
	@Inject
	private IAlumnoService aS;
	@Inject
	private IAsuntoService sS;

	private Incidencia incidencia;
	private Alumno alumno;
	private Asunto asunto;

	List<Incidencia> listaIncidencias;
	List<Alumno> listaAlumnos;
	List<Asunto> listaAsuntos;

	@PostConstruct
	public void init() {
		this.listaIncidencias = new ArrayList<Incidencia>();
		this.listaAlumnos = new ArrayList<Alumno>();
		this.listaAsuntos = new ArrayList<Asunto>();
		this.incidencia = new Incidencia();
		this.alumno = new Alumno();
		this.asunto = new Asunto();
		this.list();
		this.listarAlumno();
		this.listarAsunto();
	}

	public String newIncidencia() {
		this.setIncidencia(new Incidencia());
		return "grabarIncidencia.xhtml";
	}

	public void insert() {
		iS.insert(incidencia);
		this.clean();
		this.list();
	}

	public void list() {
		listaIncidencias = iS.list();
	}

	public void listarAlumno() {
		listaAlumnos = aS.list();
	}

	public void listarAsunto() {
		listaAsuntos = sS.list();
	}

	public void clean() {
		this.init();
	}

	public Incidencia getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(Incidencia incidencia) {
		this.incidencia = incidencia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asunto getAsunto() {
		return asunto;
	}

	public void setAsunto(Asunto asunto) {
		this.asunto = asunto;
	}

	public List<Incidencia> getListaIncidencias() {
		return listaIncidencias;
	}

	public void setListaIncidencias(List<Incidencia> listaIncidencias) {
		this.listaIncidencias = listaIncidencias;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public List<Asunto> getListaAsuntos() {
		return listaAsuntos;
	}

	public void setListaAsuntos(List<Asunto> listaAsuntos) {
		this.listaAsuntos = listaAsuntos;
	}

}
