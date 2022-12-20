package POO.Clases;

public class Vehiculo {

    //1 atributos.

     protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;


    //2 constructores

    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
    }

    //3 metodos
    public  void acelerar(int quantity){
        this.speed += quantity;
    }
}
