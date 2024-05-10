package EmpresaCamiones;

public class Carga {

    private String descripcion;
    private int tipo;

    public Carga(int tipo) {
        this.tipo = tipo;
        switch (this.tipo){
            case 1: this.descripcion = "Madera";
            case 2: this.descripcion = "Yerba";
            case 3: this.descripcion = "Té";
        }
    }

    public String getDescripcion() {
        return descripcion;
    }


}
