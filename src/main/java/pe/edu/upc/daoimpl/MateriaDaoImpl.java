package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMateriaDao;
import pe.edu.upc.entity.Materia;

public class MateriaDaoImpl implements IMateriaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="XtraClassPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Materia m) {
		em.persist(m);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Materia>list(){
		List<Materia> lista =new ArrayList<Materia>();
		Query q=em.createQuery("from Materia m");
		lista=(List<Materia>)q.getResultList();
		return lista;
	}

}
