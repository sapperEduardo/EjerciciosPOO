package EmpresaCamiones;

public class Chofer {

    private String nombre;
    private String apellido;
    private String dni;

    public Chofer(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
}
