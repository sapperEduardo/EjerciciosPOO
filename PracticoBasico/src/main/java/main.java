import Carrera.CarreraAutomovlistica;
import CensoProvincial.Censo;
import EmpresaCamiones.Camion;
import EmpresaCamiones.Camiones;
import EmpresaCamiones.Carga;
import EmpresaCamiones.Chofer;
import ISP.Proveedor;
import NotasAlumno.Alumno;
import Productos.Productos;

import java.util.LinkedList;
import java.util.Scanner;

public class main {

    public static void productos(Scanner in){
        int cantidad = 0;
        System.out.print("Cantidad de productos: ");
        cantidad = in.nextInt();

        int[] cantidades = new int[cantidad];
        double[] costos = new double[cantidad];
        double[] totales = new double[cantidad];
        for (int i = 0; i < cantidad; i++){
            System.out.print("Cantidad del producto: ");
            cantidades[i] = in.nextInt();
            System.out.print("Costo del producto: ");
            costos[i] = in.nextDouble();
            totales[i] = cantidades[i] * costos[i];
        }
        for (double t: totales) {
            if (t > 1000){
                System.out.println(t);
            }
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Productos productos = new Productos();

        productos.informar();

    }

}
