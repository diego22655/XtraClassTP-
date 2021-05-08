package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Tarjeta;

public interface ITarjetaDao {
	public void insert(Tarjeta t);
	public List<Tarjeta> list();
}
