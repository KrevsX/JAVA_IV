package CuartaEntrega.Devices;

public class SmartPhone extends SmartDevice{


    public boolean camaraSmartPh;



    public String calidadCamSmartPh;
    public boolean huellaSmartPh;
    public double precioSmartPh;
    public double pulgadasSmartPh;
    public int almacenamientoSmartPh;


    public SmartPhone(boolean camaraSmartPh, String calidadCamSmartPh, boolean huellaSmartPh, double precioSmartPh, double pulgadasSmartPh, int almacenamientoSmartPh) {
        this.camaraSmartPh = camaraSmartPh;
        this.calidadCamSmartPh = calidadCamSmartPh;
        this.huellaSmartPh = huellaSmartPh;
        this.precioSmartPh = precioSmartPh;
        this.pulgadasSmartPh = pulgadasSmartPh;
        this.almacenamientoSmartPh = almacenamientoSmartPh;
    }

    public SmartPhone(){

    }

}


