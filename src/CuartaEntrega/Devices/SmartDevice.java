package CuartaEntrega.Devices;

public class SmartDevice {


    public String marcaDevice;
    public String tipoDevice;
    public String ModeloDevice;
    SmartPhone SmartPhone;
    SmartWatch SmartWatch;




    public SmartDevice() {

    }

    public SmartDevice(String marcaDevice, String tipoDevice, String modeloDevice) {
        this.marcaDevice = marcaDevice;
        this.tipoDevice = tipoDevice;
        this.ModeloDevice = modeloDevice;
    }

}
