package uniquindio.edu.co;

import uniquindio.edu.co.model.Curso;
import uniquindio.edu.co.model.Estudiante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación 1", 123);
        Estudiante estudiante = new Estudiante("Raul", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);
        Estudiante estudiante1 = new Estudiante("Maria", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);
        Estudiante estudiante2 = new Estudiante("Carlos", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);
        Estudiante estudiante3 = new Estudiante("Luisa", "Rivera", "ryriverauniquindio.edu.co", "ad11", "3100000", 30);

        curso.agregarEstudianteCurso(estudiante);
        curso.agregarEstudianteCurso(estudiante1);
        curso.agregarEstudianteCurso(estudiante2);
        curso.agregarEstudianteCurso(estudiante3);

        System.out.println(curso.toString());

    }
}