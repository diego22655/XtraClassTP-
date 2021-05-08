package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITarjetaDao;
import pe.edu.upc.entity.Tarjeta;
import pe.edu.upc.service.ITarjetaService;

@Named
@RequestScoped
public class TarjetaServiceImpl implements ITarjetaService{

	@Inject
	private ITarjetaDao tD;

	@Override
	public void insert(Tarjeta t) {
		tD.insert(t);
	}

	@Override
	public List<Tarjeta> list() {
		return tD.list();
	}
}
