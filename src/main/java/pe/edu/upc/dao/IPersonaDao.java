package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Persona;

public interface IPersonaDao {
	public void insert(Persona p);
	public List<Persona> list();
}
