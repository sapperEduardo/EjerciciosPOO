package ISP;

public class Servicio {

    private double costo;
    private double descuento = 0;
    private int megas;
    private int tipo;

    public Servicio(int tipo) {
        this.tipo = tipo;
        switch (this.tipo){
            case 1:{
                this.megas = 30;
                this.costo = 750;
            }break;
            case 2:{
                this.megas = 50;
                this.costo = 1100;
            }break;
            case 3:{
                this.megas = 100;
                this.costo = 1500;
                this.descuento = .05;
            }break;
        }
    }

    public int getMegas() {
        return megas;
    }
    public int getTipo() {
        return tipo;
    }
    public double getCosto() {
        return costo;
    }
    public double getDescuento() {
        return descuento;
    }



}
