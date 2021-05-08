package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMateriaProfesorDao;
import pe.edu.upc.entity.MateriaProfesor;

public class MateriaProfesorDaoImpl implements IMateriaProfesorDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="XtraClassPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(MateriaProfesor m) {
		em.persist(m);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MateriaProfesor>list(){
		List<MateriaProfesor>lista = new ArrayList<MateriaProfesor>();
		Query q = em.createQuery("from MateriaProfesor mp");
		lista = (List<MateriaProfesor>)q.getResultList();
		return lista;
	}

}
