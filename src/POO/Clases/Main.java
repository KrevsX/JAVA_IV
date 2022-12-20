package POO.Clases;

import POO.Herencia.Camion;
import POO.Herencia.Coche;
import POO.Herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        // 1-Clases y Objetos
        // clase identificador = new clase();
        // crear un objeto utilizando el constructor sin parametros
        //  Vehiculo toyotaPrius = new Vehiculo();
        // crear un objeto uitilizando el constructor con parametros

        Motor MotorGTI = new Motor("GTO", 190, 459.8, 6);
        Vehiculo fordmodeo = new Vehiculo("Ford", "Modeo", 2.1, 2010, false, 0, MotorGTI);
//        Vehiculo fordmodeo = new Vehiculo("Ford", "Modeo", 2.1, 2010,  false);
        System.out.println(fordmodeo.fabricante);
        System.out.println(fordmodeo.year);
        fordmodeo.acelerar(50);
        System.out.println(fordmodeo.speed);

        //2- Ejemplo de Herencia

        Motocicleta kawasaki = new Motocicleta();
        kawasaki.fabricante = "Kawasaki Ninja";

        System.out.println("Fin del programa");
        System.out.println(kawasaki.fabricante);

        // 3-Polimorfismo

        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(40);

        vehiculo = new Coche();
        vehiculo.acelerar(65);

        vehiculo = new Camion();
        vehiculo.acelerar(70);

        // 4- Clases Abastractas
    }
}
