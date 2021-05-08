package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAsuntoDao;
import pe.edu.upc.entity.Asunto;
import pe.edu.upc.service.IAsuntoService;

@Named
@RequestScoped
public class AsuntoServiceImpl implements IAsuntoService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IAsuntoDao aD;

	@Override
	public void insert(Asunto a) {
		aD.insert(a);
	}

	@Override
	public List<Asunto> list() {
		return aD.list();
	}
	
	
}
