package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDocenteDao;
import pe.edu.upc.entity.Docente;

public class DocenteDaoImpl implements IDocenteDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "XtraClassPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Docente d) {
		em.persist(d);
	}

	@SuppressWarnings("unchecked")	
	@Override
	public List<Docente> list() {
		List<Docente> lista = new ArrayList<Docente>();
		Query q = em.createQuery("from Docente p");
		lista = (List<Docente>)q.getResultList();
		return lista;
	}
	
}
