package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Docente;
import pe.edu.upc.entity.Materia;
import pe.edu.upc.entity.MateriaProfesor;
import pe.edu.upc.service.IDocenteService;
import pe.edu.upc.service.IMateriaProfesorService;
import pe.edu.upc.service.IMateriaService;

@Named
@RequestScoped
public class MateriaProfesorController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IMateriaProfesorService mpS;
	@Inject
	private IDocenteService dS;
	@Inject
	private IMateriaService mS;

	private MateriaProfesor materiaprofesor;
	private Docente docente;
	private Materia materia;

	List<MateriaProfesor> listaMateriasProfesores;
	List<Docente> listaDocentes;
	List<Materia> listaMaterias;

	@PostConstruct
	public void init() {
		this.listaMateriasProfesores = new ArrayList<MateriaProfesor>();
		this.listaDocentes = new ArrayList<Docente>();
		this.listaMaterias = new ArrayList<Materia>();
		this.materiaprofesor = new MateriaProfesor();
		this.docente = new Docente();
		this.materia = new Materia();
		this.list();
		this.listarMateria();
		this.listarDocente();
	}

	public String newMateriaProfesor() {
		this.setMateriaprofesor(new MateriaProfesor());
		return "MateriaProfesor.xhtml";
	}

	public void insert() {
		mpS.insert(materiaprofesor);
		this.clean();
		this.list();
	}

	public void list() {
		listaMateriasProfesores = mpS.list();
	}

	public void listarDocente() {
		listaDocentes = dS.list();
	}

	public void listarMateria() {
		listaMaterias = mS.list();
	}

	public void clean() {
		this.init();
	}

	public MateriaProfesor getMateriaprofesor() {
		return materiaprofesor;
	}

	public void setMateriaprofesor(MateriaProfesor materiaprofesor) {
		this.materiaprofesor = materiaprofesor;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public List<MateriaProfesor> getListaMateriasProfesores() {
		return listaMateriasProfesores;
	}

	public void setListaMateriasProfesores(List<MateriaProfesor> listaMateriasProfesores) {
		this.listaMateriasProfesores = listaMateriasProfesores;
	}

	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}

	public List<Materia> getListaMaterias() {
		return listaMaterias;
	}

	public void setListaMaterias(List<Materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}

	
}
