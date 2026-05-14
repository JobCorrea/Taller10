package src.sobreescritura;

public class Tablet extends Computador {
    // MAL: sin @Override el compilador no verifica nada
    public void apagar() {
        System.out.println("Apagando tablet");
    } 
    
}
