package EmpresaCamiones;

import EmpresaCamiones.Chofer;

public class Camion {

    private String patente;
    private Chofer chofer;
    private Carga carga;
    private String horario;

    public Camion(String patente, Chofer chofer, Carga carga, String horario) {
        this.patente = patente;
        this.chofer = chofer;
        this.carga = carga;
        this.horario = horario;
    }

    public void mostrarDatos(){
        System.out.println("");
        System.out.println("---Datos de egreso de camion---");
        System.out.println("-Patente: "+this.patente);
        System.out.println("-Nombre de chofer: "+this.chofer.getNombre());
        System.out.println("-Apellido de chofer: "+this.chofer.getApellido());
        System.out.println("-DNI de chofer: "+this.chofer.getDni());
        System.out.println("-EmpresaCamiones.Carga del camion: "+this.carga.getDescripcion());
        System.out.println("-Horario de sailda: "+this.horario);
    }



}
