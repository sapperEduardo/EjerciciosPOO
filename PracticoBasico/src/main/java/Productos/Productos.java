package Productos;

import javax.swing.*;
import java.util.LinkedList;

public class Productos {

    private int cantidad;
    private Producto[] productos;



    public Productos() {
        this.cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de productos: "));
        this.productos = new Producto[this.cantidad];
        cargarProductos();
    }

    public void cargarProductos(){
        for (int i = 0; i < this.cantidad; i++){
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad existente: "));
            double costo = Double.parseDouble(JOptionPane.showInputDialog(null,"Costo del producto: "));

            Producto producto = new Producto(cantidad, costo);
            this.productos[i] = producto;
        }
    }

    public void informar(){
        for (Producto p: this.productos) {
            double total = p.getTotal();
            if (total > 1000){
                System.out.println("Precio total: "+total);
            }
        }
    }






}
