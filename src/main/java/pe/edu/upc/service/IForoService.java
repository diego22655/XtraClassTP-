package pe.edu.upc.service;
import java.util.List;

import pe.edu.upc.entity.Foro;
public interface IForoService {
	public void insert(Foro f);

	public List<Foro> list();
	public void eliminar(int idForo);
}
