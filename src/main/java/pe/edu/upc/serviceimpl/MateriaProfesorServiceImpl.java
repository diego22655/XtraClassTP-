package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMateriaProfesorDao;
import pe.edu.upc.entity.MateriaProfesor;
import pe.edu.upc.service.IMateriaProfesorService;

@Named
@RequestScoped
public class MateriaProfesorServiceImpl implements IMateriaProfesorService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMateriaProfesorDao mD;
	
	@Override
	public void insert(MateriaProfesor m) {
		mD.insert(m);
	}
	
	@Override
	public List<MateriaProfesor>list(){
		return mD.list();
	}
}
