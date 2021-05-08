package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Foro;


public interface IForoDao {
	public void insert(Foro f);
	public List<Foro> list();
	public void eliminar(int idForo );
}

