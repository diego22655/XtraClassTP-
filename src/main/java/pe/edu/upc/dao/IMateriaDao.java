package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Materia;

public interface IMateriaDao {
	public void insert(Materia m);
	public List<Materia>list();
}
