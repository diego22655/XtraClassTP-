package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPersonaDao;
import pe.edu.upc.entity.Persona;

public class PersonaDaoImpl implements IPersonaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "XtraClassPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Persona p) {
		em.persist(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> list() {
		List<Persona> lista = new ArrayList<Persona>();
		Query q = em.createQuery("from Persona p");
		lista = (List<Persona>)q.getResultList();
		return lista;
	}

}
