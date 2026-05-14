public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
        System.out.println();

        Vehiculo vehiculo = new Vehiculo(85);
        Vehiculo biciVehiculo = new Bicicleta(15);
        vehiculo.mensaje();
        biciVehiculo.mensaje();
    }
}
