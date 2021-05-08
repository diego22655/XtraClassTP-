package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tarjeta;
import pe.edu.upc.service.ITarjetaService;

@Named
@RequestScoped
public class TarjetaController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITarjetaService tS;
	
	private Tarjeta tarjeta;
	
	List<Tarjeta> listaTarjetas;
	
	@PostConstruct
	public void init() {
		this.listaTarjetas = new ArrayList<Tarjeta>();
		this.tarjeta = new Tarjeta();
		this.list();
	}
	
	public String newTarjeta() {
		this.setTarjeta(new Tarjeta());
		return "tarjeta.xhtml";
	}
	
	public void insert() {
		tS.insert(tarjeta);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaTarjetas = tS.list();
	}

	public void clean() {
		this.init();
	}
	
	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	
}
