package CensoProvincial;

import javax.swing.*;
import java.util.LinkedList;

public class Censo {

    private LinkedList<Persona> personas = new LinkedList<>();
    private Persona mayor;
    private int totalPersonas = 0;
    private int cantVarones = 0;
    private int cantVaronesEntre = 0;
    private int cantMujeres = 0;

    public Censo() {}


    public void carcarPersonas() {

        int respuesta;
        do {
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de la persona N°" + (this.totalPersonas + 1) + ": "));
            String sexo = JOptionPane.showInputDialog(null, "Sexo la persona N°" + (this.totalPersonas + 1) + ": ");
            String dni = JOptionPane.showInputDialog(null, "DNI la persona N°" + (this.totalPersonas + 1) + ": ");

            Persona persona = new Persona(dni, sexo, edad);
            this.personas.add(persona);

            if (sexo.equals("F") || sexo.equals("f")) {
                this.cantMujeres++;
            } else if (sexo.equals("m") || sexo.equals("M")){
                if (edad <= 65 && edad >= 16) {
                    this.cantVarones++;
                    this.cantVaronesEntre++;
                } else {
                    this.cantVarones++;
                }
            }

            if (this.totalPersonas == 0) {
                this.mayor = persona;
            } else {
                if (edad > this.mayor.getEdad()) {
                    this.mayor = persona;
                }
            }

            this.totalPersonas++;

            respuesta = JOptionPane.showInternalConfirmDialog(null, "", "Confirmacion", JOptionPane.OK_OPTION);
            System.out.println(respuesta);

        } while (respuesta == 0);

        System.out.println("Cantidad de personas totales: "+this.totalPersonas);
        System.out.println("Cantidad de varones: "+this.cantVarones);
        System.out.println("Cantidad de mujeres: "+this.cantMujeres);
        System.out.println("Cantidad de varones entres 16-65 años: "+ (this.cantVaronesEntre / this.cantVarones ) * 100 +"%");
        System.out.println("-Datos de la persona mayor: ");
        System.out.println("-DNI: "+this.mayor.getDni());
        System.out.println("-Sexo: "+this.mayor.getSexo());
        System.out.println("-Edad: "+this.mayor.getEdad());

    }



}
