package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Persona;
import pe.edu.upc.service.IPersonaService;

@Named
@RequestScoped
public class PersonaController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private IPersonaService pS;
	
	private Persona persona;
	
	List<Persona> listaPersonas;
	
	@PostConstruct
	public void init() {
		this.listaPersonas = new ArrayList<Persona>();
		this.persona = new Persona();
		this.list();
	}

	public String newPersona() {
		this.setPersona(new Persona());
		return "persona.xhtml";
	}
	
	public void insert() {
		pS.insert(persona);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaPersonas = pS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	
	
}
