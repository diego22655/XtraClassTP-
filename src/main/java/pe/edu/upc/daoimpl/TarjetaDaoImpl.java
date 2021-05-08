package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITarjetaDao;
import pe.edu.upc.entity.Tarjeta;

public class TarjetaDaoImpl implements ITarjetaDao, Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "XtraClassPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Tarjeta t) {
		em.persist(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tarjeta> list() {
		List<Tarjeta> lista = new ArrayList<Tarjeta>();
		Query q = em.createQuery("from Tarjeta t");
		lista = (List<Tarjeta>)q.getResultList();
		return lista;
	}
	

}
