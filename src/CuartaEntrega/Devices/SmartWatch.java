package CuartaEntrega.Devices;

public class SmartWatch extends SmartDevice {

    public boolean camaraSmartWa;
    public  boolean huellaSmartWa;
    public  double precioSmartWa;
    public  double pulgadasSmartWa;
    public int almacenamientoSmartWa;
    public  boolean fitnessSmartWa;

    public SmartWatch(){

    }

    public SmartWatch(boolean camaraSmartWa, boolean huellaSmartWa, double precioSmartWa, double pulgadasSmartWa, int almacenamientoSmartWa, boolean fitnessSmartWa) {
        this.camaraSmartWa = camaraSmartWa;
        this.huellaSmartWa = huellaSmartWa;
        this.precioSmartWa = precioSmartWa;
        this.pulgadasSmartWa = pulgadasSmartWa;
        this.almacenamientoSmartWa = almacenamientoSmartWa;
        this.fitnessSmartWa = fitnessSmartWa;
    }

}
