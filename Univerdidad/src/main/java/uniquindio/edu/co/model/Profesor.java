package uniquindio.edu.co.model;

public class Profesor {
    private String nombre,apellido,genero,correo,id,especialidad;
    private int aniosExperiencia;
    private boolean activo;

    public Profesor(
            String nombre,
            String apellido,
            String genero,
            String correo,
            String id,
            String especialidad,
            int aniosExperiencia,
            boolean activo
                   ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.correo = correo;
        this.id = id;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getCorreo() {
        return correo;
    }

    public String getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", correo='" + correo + '\'' +
                ", id='" + id + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", activo=" + activo +
                '}';
    }
}
