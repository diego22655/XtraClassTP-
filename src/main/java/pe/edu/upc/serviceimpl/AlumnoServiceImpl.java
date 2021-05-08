package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlumnoDao;
import pe.edu.upc.entity.Alumno;
import pe.edu.upc.service.IAlumnoService;

@Named
@RequestScoped
public class AlumnoServiceImpl implements IAlumnoService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAlumnoDao aD;
	
	@Override
	public void insert(Alumno a) {
		aD.insert(a);
	}

	@Override
	public List<Alumno> list() {
		return aD.list();
	}

}
