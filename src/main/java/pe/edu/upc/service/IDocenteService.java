package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Docente;

public interface IDocenteService {
	public void insert(Docente d);
	public List<Docente> list();
}
