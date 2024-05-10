package Productos;

public class Producto {

    private int cantidad;
    private double costo;
    private double total;


    public Producto(int cantidad, double costo) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.total = this.costo * this.cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
