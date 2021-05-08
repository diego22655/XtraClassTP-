package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPersonaDao;
import pe.edu.upc.entity.Persona;
import pe.edu.upc.service.IPersonaService;

@Named
@RequestScoped
public class PersonaServiceImpl implements IPersonaService{

	@Inject
	private IPersonaDao pD;
	
	@Override
	public void insert(Persona p) {
		pD.insert(p);
	}

	@Override
	public List<Persona> list() {
		return pD.list();
	}

}
