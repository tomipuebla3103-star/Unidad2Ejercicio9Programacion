public class EstacionMeteorologica {
    Sensor[] sensores;
    int cantidadSensores;

    public EstacionMeteorologica() {
        sensores = new Sensor[10];
        cantidadSensores = 0;
    }

    public void agregarSensor(Sensor sensor) {
        sensores[cantidadSensores] = sensor;
        cantidadSensores++;
    }

    public void generarReporteClimatico() {

        System.out.println("REPORTE CLIMATICO");

        for (int i = 0; i < cantidadSensores; i++) {

            double lectura = sensores[i].obtenerLectura();

            System.out.println(sensores[i].tipo + ": " + lectura);
        }
    }
}
