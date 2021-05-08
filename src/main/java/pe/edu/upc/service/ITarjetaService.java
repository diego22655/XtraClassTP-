package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tarjeta;

public interface ITarjetaService {
	public void insert(Tarjeta t);
	public List<Tarjeta> list();
}
