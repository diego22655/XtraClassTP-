package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Asunto;

public interface IAsuntoService {
	public void insert(Asunto a);
	public List<Asunto> list();
}
