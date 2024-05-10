package ISP;

public class Factura {

    private double monto;
    private Cliente cliente;
    private Servicio servicio;


    public Factura( Cliente cliente, Servicio servicio) {
        this.cliente = cliente;
        this.servicio = servicio;
        double costo = servicio.getCosto();
        double descuento = servicio.getDescuento();
        this.monto = costo - (costo * descuento);
    }

    public void mostrarDatos(){
        System.out.println("");
        System.out.println("--Datos---de---Factura--");
        System.out.println("-DNI del cliente: "+this.cliente.getDni());
        System.out.println("-Tipo de Servicio: "+this.servicio.getTipo());
        System.out.println("-Megas del Servicio: "+this.servicio.getMegas());
        System.out.println("-Costo del Servicio: "+this.servicio.getCosto());
        System.out.println("-Descuento: "+this.servicio.getDescuento() * 100+"%");
        System.out.println("");
        System.out.println("--MONTO A PAGAR: "+this.monto);
    }


}
