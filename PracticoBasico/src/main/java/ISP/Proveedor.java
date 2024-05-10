package ISP;

import java.util.LinkedList;
import java.util.Scanner;

public class Proveedor {

    private LinkedList<Factura> facturas = new LinkedList<>();


    public Proveedor() {}

    public void registrarFacturas(Scanner in, int cantidad){
        for (int i = 0; i < cantidad; i++){
            System.out.println("--Cargar--factura--");
            System.out.print("-DNI del cliente: ");
            String dni = in.nextLine();
            System.out.print("-Tipo de servicio (1,2,3): ");
            int tS = in.nextInt();
            in.nextLine();
            Cliente cliente = new Cliente(dni);
            Servicio servicio = new Servicio(tS);

            this.facturas.add(new Factura(cliente, servicio));
        }
    }

    public void mostrarFacturas(){
        for (Factura f: this.facturas) {
            f.mostrarDatos();
        }
    }




}
