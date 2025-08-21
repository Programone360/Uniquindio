package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private int id;
    private List<Estudiante> listEstudiantes;

    public Curso(String nombre, int id){
        this.nombre=nombre;
        this.id=id;
        this.listEstudiantes = new ArrayList<>();
    }

    public boolean verificarEstudiante(Estudiante estudiante){
        boolean centinela = false;
        for(Estudiante est: listEstudiantes){
            if(est.getId().equals(estudiante.getId())){
                centinela = true; //ya existe un estudiante
            }
        }
        return centinela; //No existe el estudiante con la mismo ID
    }

    public void agregarEstudianteCurso(Estudiante estudiante){
        if(!verificarEstudiante(estudiante)){
            listEstudiantes.add(estudiante);
            System.out.println("Se agrego");
        }else{
            System.out.println("Ya existe");
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}


