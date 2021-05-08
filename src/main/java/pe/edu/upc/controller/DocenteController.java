package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Docente;
import pe.edu.upc.entity.Persona;
import pe.edu.upc.service.IDocenteService;
import pe.edu.upc.service.IPersonaService;


@Named
@RequestScoped
public class DocenteController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDocenteService dS;
	
	@Inject
	private IPersonaService pS;
	
	private Docente docente;
	private Persona persona;

	List<Docente> listaDocentes;
	List<Persona> listaPersonas;
	
	@PostConstruct
	public void init() {
		this.listaDocentes = new ArrayList<Docente>();
		this.listaPersonas = new ArrayList<Persona>();
		this.docente = new Docente();
		this.persona = new Persona();
		this.list();
		this.listarPersona();
	}
	
	public String newDocente() {
		this.setDocente(new Docente());
		return "docente.xhtml";
	}
	
	public void insert() {
		dS.insert(docente);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaDocentes = dS.list();
	}
	
	public void listarPersona() {
		listaPersonas = pS.list();
	}
	
	public void clean() {
		this.init();
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	
}
