package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Persona;

public interface IPersonaService {
	public void insert(Persona p);
	public List<Persona> list();
}
