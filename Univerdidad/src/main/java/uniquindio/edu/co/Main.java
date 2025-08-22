package uniquindio.edu.co;

import uniquindio.edu.co.model.Curso;
import uniquindio.edu.co.model.Estudiante;
import uniquindio.edu.co.model.Profesor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación 1", 123);


        Estudiante estudiante = new Estudiante("Raul", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);
        Estudiante estudiante1 = new Estudiante("Maria", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);
        Estudiante estudiante2 = new Estudiante("Carlos", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);
        Estudiante estudiante3 = new Estudiante("Luisa", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);

        Profesor profesor =new Profesor("Raul","Rivera","Masculino","Raul@uniquindio.ecu.co","E123","Programacion",10,true);



        curso.agregarEstudianteCurso(estudiante);
        curso.agregarEstudianteCurso(estudiante1);
        curso.agregarEstudianteCurso(estudiante2);
        curso.agregarEstudianteCurso(estudiante3);
        curso.agregarProfesorCurso(profesor);

        System.out.println(curso.toString());
        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println(profesor);

    }
}