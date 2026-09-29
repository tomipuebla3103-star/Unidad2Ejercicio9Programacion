public class Sensor {
    String tipo;

    public Sensor(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerLectura() {

        if (tipo.equals("Temperatura")) {
            return Math.random() * 40;
        }

        if (tipo.equals("Humedad")) {
            return Math.random() * 100;
        }

        if (tipo.equals("Presion")) {
            return 900 + Math.random() * 200;
        }

        return 0;
    }
}
