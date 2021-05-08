package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Asunto;
import pe.edu.upc.service.IAsuntoService;

@Named
@RequestScoped
public class AsuntoController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IAsuntoService aS;
	
	private Asunto asunto;
	
	List<Asunto> listaAsuntos;
	
	@PostConstruct
	public void init() {
		this.listaAsuntos = new ArrayList<Asunto>();
		this.asunto = new Asunto();
		this.list();
	}
	
	public void insert() {
		aS.insert(asunto);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaAsuntos= aS.list();
	}
	
	public void clean() {
		this.init();
	}

	public Asunto getAsunto() {
		return asunto;
	}

	public void setAsunto(Asunto asunto) {
		this.asunto = asunto;
	}

	public List<Asunto> getListaAsuntos() {
		return listaAsuntos;
	}

	public void setListaAsuntos(List<Asunto> listaAsuntos) {
		this.listaAsuntos = listaAsuntos;
	}
	
	
	
}
