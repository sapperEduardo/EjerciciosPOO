package CensoProvincial;

public class Persona {

    private String dni;
    private String sexo;
    private int edad;


    public Persona(String dni, String sexo, int edad) {
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }
}
