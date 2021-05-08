package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IIncidenciaDao;
import pe.edu.upc.entity.Incidencia;
import pe.edu.upc.service.IIncidenciaService;

public class IncidenciaServiceImpl implements IIncidenciaService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IIncidenciaDao aD;
	
	@Override
	public void insert(Incidencia i) {
		aD.insert(i);
	}
	
	@Override
	public List<Incidencia> list(){
		return aD.list();
	}
}
