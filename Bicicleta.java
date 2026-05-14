public class Bicicleta extends Vehiculo{
    
    public Bicicleta(int moverse) {
        super(moverse);
    }
    @Override
    public void mensaje(){
        System.out.println("Bicicleta se mueve a: "+moverse+" Km/H");
    }
    
}
