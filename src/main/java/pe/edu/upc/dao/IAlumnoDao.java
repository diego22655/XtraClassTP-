package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Alumno;

public interface IAlumnoDao {
	public void insert(Alumno a);
	public List<Alumno> list();
}
