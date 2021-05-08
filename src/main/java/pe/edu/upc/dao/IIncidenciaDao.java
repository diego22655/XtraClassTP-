package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Incidencia;

public interface IIncidenciaDao {
	public void insert(Incidencia i);
	public List<Incidencia> list();
}
