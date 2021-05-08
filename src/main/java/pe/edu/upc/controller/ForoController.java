package pe.edu.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Foro;

import pe.edu.upc.service.IForoService;

@Named
@RequestScoped
public class ForoController implements Serializable{
	private static final long serialVersionUID = 1L;
	@Inject
	private IForoService fS;
	private Foro foro;
	List<Foro> listaForo;
	@PostConstruct
	public void init() {
		this.listaForo = new ArrayList<Foro>();
		this.foro = new Foro();
		this.list();
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
		public void clean() {
			this.init();
		}
		public Foro getForo() {
			return foro;
		}
		public void setForo(Foro foro) {
			this.foro = foro;
		}
		public List<Foro> getListaForo() {
			return listaForo;
		}
		public void setListaPersonas(List<Foro> listaForo) {
			this.listaForo = listaForo;
		}
		public void eliminar(Foro f) {
			try {
			fS.eliminar(f.getIdForo());
				this.list();
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

}




	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	


	
	
	
	
