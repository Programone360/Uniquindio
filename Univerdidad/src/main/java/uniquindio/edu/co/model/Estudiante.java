package uniquindio.edu.co.model;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String email, id, telefono;
    private int edad;

    public Estudiante(String nombre, String apellido, String email, String id, String telefono, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.id=id;
        this.telefono=telefono;
        this.edad=edad;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}
