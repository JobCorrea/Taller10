package src.sobreescritura;

public class Laptop extends Computador {
    // ERROR: se quito el parametro, firma diferente
    @Override
    public void encender() {
        System.out.println("Encendiendo laptop");
    }
}
//"message": "encender() in Laptop does not override or implement a method from a supertype",