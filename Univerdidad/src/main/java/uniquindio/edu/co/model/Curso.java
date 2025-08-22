package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private int id;
    private List<Estudiante> listEstudiantes;
    private List<Profesor> listProfesores;

    public Curso(String nombre, int id){
        this.nombre=nombre;
        this.id=id;
        this.listEstudiantes = new ArrayList<>();
        this.listProfesores= new ArrayList<>();
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
    public boolean verificarProfesor(Profesor profesor){
        boolean centinela =false;
        for (Profesor pro: listProfesores){
            if (pro.getId().equals(profesor.getId())){
                centinela=true;
            }
        }
        return centinela;
    }

    public void agregarEstudianteCurso(Estudiante estudiante){
        if(!verificarEstudiante(estudiante)){
            listEstudiantes.add(estudiante);
            System.out.println("Se agrego");
        }else{
            System.out.println("Ya existe");
        }

    }
        public void agregarProfesorCurso(Profesor profesor){
        if (!verificarProfesor(profesor)){
            listProfesores.add(profesor);
            System.out.println("Se agrego con exito");
        }else {
            System.out.println("Profesor ya existe");
        }
        }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", listEstudiantes=" + listEstudiantes +
                '}'+"listProfesores="+ listProfesores;
    }
}


