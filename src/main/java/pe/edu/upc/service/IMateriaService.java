package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Materia;

public interface IMateriaService {
	public void insert(Materia m);
	public List<Materia> list();
}
