package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IForoDao;
import pe.edu.upc.entity.Foro;

public class ForoDaolmpl implements IForoDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "XtraClassPU")
	private EntityManager em2;

	@Transactional
	@Override
	public void insert(Foro f) {
		em2.persist(f);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Foro> list() {
		List<Foro> lista2 = new ArrayList<Foro>();
		Query q = em2.createQuery("from Foro f");
		lista2 = (List<Foro>)q.getResultList();
		return lista2;
	
	}
	@Override
	public void eliminar(int idForo) {
		Foro f = new Foro();
		try {
			f = em2.getReference(Foro.class,idForo); 
			em2.remove(f);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
