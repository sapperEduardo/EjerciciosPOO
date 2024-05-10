package NotasAlumno;

import javax.swing.*;

public class Alumno {

    private double[] notas;
    private int cantNotas;
    private int aprobadas = 0;
    private int reprobadas = 0;
    private double notaAlta = 0;
    private double promedio = 0;
    private double totalNotas = 0;

    public Alumno(int cantNotas) {
        this.cantNotas = cantNotas;
        this.notas = new double[this.cantNotas];
        cargarNotas();
    }

    public void cargarNotas(){
        for (int i = 0; i < this.cantNotas; i++){
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota N°"+(i+1)+": "));
            this.notas[i] = nota;
            this.totalNotas += nota;
            if (nota > this.notaAlta){
                this.notaAlta = nota;
            }
            if (nota >= 6){
                this.aprobadas++;
            }else {
                reprobadas++;
            }
        }
    }
    public void mostrarNotaAltaYPromedio(){
        System.out.println("--Resultado--");
        System.out.println("-Nota mas alta: "+this.notaAlta);
        this.promedio = (this.totalNotas / this.cantNotas);
        System.out.println("-Promedio: "+ this.promedio);
    }

    public void mostrarAprobados(){
        System.out.println("--Resultado--");
        System.out.println("-Cantidad de notas aprobadas: "+this.aprobadas);
        System.out.println("-Cantidad de notas reprobadas: "+this.reprobadas);
    }



}
