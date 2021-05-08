package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Docente;

public interface IDocenteDao {
	public void insert(Docente d);
	public List<Docente> list();
}
