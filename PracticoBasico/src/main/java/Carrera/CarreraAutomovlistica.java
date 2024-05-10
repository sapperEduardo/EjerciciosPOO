package Carrera;

import javax.swing.*;
import java.util.Scanner;

public class CarreraAutomovlistica {

    private int cantPilotos;
    private int[] numeros;
    private double[] tiempos;
    private int masRapido = 0;

    public CarreraAutomovlistica(int cantPilotos) {
        this.cantPilotos = cantPilotos;
        this.numeros = new int[this.cantPilotos];
        this.tiempos = new double[this.cantPilotos];
    }

    public void carcarPilotos(Scanner in){
        for (int i = 0; i < this.cantPilotos; i++){

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero del piloto N° "+(i+1)+": "));
            double tiempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Tiempo del piloto N° "+(i+1)+": "));

            this.numeros[i] = numero;
            this.tiempos[i] = tiempo;

            if (i > 0){
                if (tiempo < this.tiempos[this.masRapido]){
                    this.masRapido = i;
                }
            }

        }
        System.out.println("");
        System.out.println("---PILOTO MAS RAPIDO---");
        System.out.println("-Numero: "+this.numeros[masRapido]);
        System.out.println("-Tiempo: "+this.tiempos[masRapido]);

    }





}
