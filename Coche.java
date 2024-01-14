
class Coche {
    private Motor motor;  // Composición: el coche está compuesto por un motor

    Coche(String tipoMotor) {
        this.motor = new Motor(tipoMotor);
    }

    public void conducir() {
        System.out.println("El coche está en movimiento con un motor de tipo " + motor.getTipo());
    }
}
