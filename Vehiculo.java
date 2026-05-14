public class Vehiculo {
    protected int moverse;

    public Vehiculo(int moverse) {
        this.moverse = moverse;
    }

    public void mensaje(){
        System.out.println("Vehiculo se mueve a: "+moverse+" Km/H");
    }
}
