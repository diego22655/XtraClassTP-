package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Asunto;

public interface IAsuntoDao {
	public void insert(Asunto a);
	public List<Asunto>list();
}
