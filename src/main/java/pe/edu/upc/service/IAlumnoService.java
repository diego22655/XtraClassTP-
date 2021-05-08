package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Alumno;

public interface IAlumnoService {
	public void insert(Alumno a);
	public List<Alumno> list();
}
