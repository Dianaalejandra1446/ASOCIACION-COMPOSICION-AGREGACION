public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Calle Principal", 124);
        PersonaAgre personaAgre = new PersonaAgre("Juan", 25, direccion);
        personaAgre.mostrarInformacion();
    }
}
