package CuartaEntrega.Main;

import CuartaEntrega.Devices.SmartDevice;
import CuartaEntrega.Devices.SmartPhone;
import CuartaEntrega.Devices.SmartWatch;

import java.util.Scanner;

public class CuartaEntrega {
    public static void main(String[] args) {

        SmartPhone sPhone = new SmartPhone();
        SmartWatch sWatch = new SmartWatch();


        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("[1] Caracteriscas de SmartPhone" +
                         "\n[2] Caracteriscas de SmartWatch");
        System.out.print("Introduce un número de entradas: ");
        int entrada = scanner.nextInt();
        System.out.println();

        while(true){
            if(entrada == 1){
                SDPhone();
                break;

            }else if(entrada == 2){
                SDWatch();
                break;
            }else{
                System.out.println("Haz Ingresado un Valor Invalido Intentalo Nuevamente");
                break;
            }

        }

    }
    public static void SDPhone(){
        SmartDevice device = new SmartDevice("Samsung", "Smart-Phone", "S22-Ultra-5G");
        SmartPhone phone = new SmartPhone(true, "FHQ-4k", true, 1500.00, 7.5, 1);

        System.out.println("         Marca:  " + device.marcaDevice);
        System.out.println("          Tipo:  " + device.tipoDevice);
        System.out.println("         Model:  " + device.ModeloDevice);

        System.out.println("-------------------------------------");

        System.out.println("        Camara:  " + phone.camaraSmartPh + " " + phone.calidadCamSmartPh);
        System.out.println("Huella Digital:  " + phone.huellaSmartPh);
        System.out.println("        Precio:  " + phone.precioSmartPh + " " + "$$");
        System.out.println("        Tamano:  " + phone.pulgadasSmartPh + " Pulgadas");
        System.out.println("Almacenamiento:  " + phone.almacenamientoSmartPh + " " +"TB");



    }
    
    public static void SDWatch(){

        SmartDevice device = new SmartDevice("Samsung", "Smart-Watch", "Galaxy-Watch-5-Pro");
        SmartWatch watch = new SmartWatch(false, false, 350.00, 45.5, 16, true);


        System.out.println("         Marca:  " + device.marcaDevice);
        System.out.println("          Tipo:  " + device.tipoDevice);
        System.out.println("         Model:  " + device.ModeloDevice);

        System.out.println("-------------------------------------");

        System.out.println("        Camara:  " + watch.camaraSmartWa);
        System.out.println("Huella Digital:  " + watch.huellaSmartWa);
        System.out.println("        Precio:  " + watch.precioSmartWa + " " + "$$");
        System.out.println("        Tamano:  " + watch.pulgadasSmartWa +" x "+ watch.pulgadasSmartWa + " mm");
        System.out.println("Almacenamiento:  " + watch.almacenamientoSmartWa + " " +"GB");
        System.out.println("Fitness System:  " + watch.fitnessSmartWa);
    }
}
