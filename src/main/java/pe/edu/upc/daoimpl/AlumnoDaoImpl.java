package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlumnoDao;
import pe.edu.upc.entity.Alumno;

public class AlumnoDaoImpl implements IAlumnoDao, Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "XtraClassPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Alumno a) {
		em.persist(a);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Alumno> list() {
		List<Alumno> lista = new ArrayList<Alumno>();
		Query q = em.createQuery("from Alumno p");
		lista = (List<Alumno>)q.getResultList();
		return lista;
	}

}
