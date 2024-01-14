public class EjemploComposicion {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Gasolina");

        miCoche.conducir();
        // El coche y el motor están fuertemente acoplados. 
        // El motor no puede existir sin el coche en este caso.
    }
}