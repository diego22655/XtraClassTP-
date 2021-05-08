package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Incidencia;

public interface IIncidenciaService {
	public void insert(Incidencia i);
	public List<Incidencia>list();
}
