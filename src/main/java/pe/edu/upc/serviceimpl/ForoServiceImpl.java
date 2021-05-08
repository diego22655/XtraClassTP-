package pe.edu.upc.serviceimpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IForoDao;
import pe.edu.upc.entity.Foro;
import pe.edu.upc.service.IForoService;


@Named
@RequestScoped

public class ForoServiceImpl implements IForoService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IForoDao fD;
	
	@Override
	public void insert(Foro f) {
		fD.insert(f);
	}
	
	@Override
	public List<Foro> list() {
		return fD.list();
	}
	
	@Override
	public void eliminar(int idForo) {
		fD.eliminar(idForo);
		
	}
	
}
