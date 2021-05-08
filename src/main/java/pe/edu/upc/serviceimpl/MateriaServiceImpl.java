package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMateriaDao;
import pe.edu.upc.entity.Materia;
import pe.edu.upc.service.IMateriaService;

@Named
@RequestScoped
public class MateriaServiceImpl implements IMateriaService, Serializable{

    private static final long serialVersionUID = 1L;

    @Inject
    private IMateriaDao mD;

    @Override
    public void insert(Materia m) {
        mD.insert(m);
    }

    @Override
    public List<Materia>list(){
        return mD.list();
    }
}