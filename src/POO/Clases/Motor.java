package POO.Clases;

public class Motor {
    String modelo;
    int caballos;
    double parNa;
    int numCilindros;


    public Motor(){

    }
    public Motor(String modelo, int caballos, double parNa, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNa = parNa;
        this.numCilindros = numCilindros;
    }
}
