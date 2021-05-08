package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.MateriaProfesor;

public interface IMateriaProfesorDao {
public void insert(MateriaProfesor m);
public List<MateriaProfesor> list();
}