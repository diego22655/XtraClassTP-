package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAsuntoDao;
import pe.edu.upc.entity.Asunto;

public class AsuntoDaoImpl implements IAsuntoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="XtraClassPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Asunto a) {
		em.persist(a);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Asunto> list() {
		List<Asunto>lista=new ArrayList<Asunto>();
		Query q= em.createQuery("from Asunto a");
		lista = (List<Asunto>)q.getResultList();
		return lista;
	}

}








