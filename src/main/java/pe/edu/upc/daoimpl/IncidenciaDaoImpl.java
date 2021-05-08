package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IIncidenciaDao;
import pe.edu.upc.entity.Incidencia;

public class IncidenciaDaoImpl implements IIncidenciaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="XtraClassPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Incidencia i) {
		em.persist(i);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Incidencia> list(){
		List<Incidencia> lista = new ArrayList<Incidencia>();
		Query q= em.createQuery("from Incidente i");
		lista = (List<Incidencia>)q.getResultList();
		return lista;
	}
}
