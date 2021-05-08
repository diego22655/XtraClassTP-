package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Materia;
import pe.edu.upc.service.IMateriaService;

@Named
@RequestScoped
public class MateriaController implements Serializable{

    private static final long serialVersionUID = 1L;

    @Inject
    private IMateriaService mS;

    private Materia materia;
    List<Materia>listaMaterias;

    @PostConstruct
    public void init() {
        this.listaMaterias=new ArrayList<Materia>();
        this.materia=new Materia();
        this.list();
    }

    public void insert() {
        mS.insert(materia);
        this.clean();
        this.list();
    }

    public void list() {
        listaMaterias=mS.list();
    }

    public void clean() {
        this.init();
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }


}
