//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    EstacionMeteorologica estacion = new EstacionMeteorologica();

    Sensor sensor1 = new Sensor("Temperatura");
    Sensor sensor2 = new Sensor("Humedad");
    Sensor sensor3 = new Sensor("Presion");

    estacion.agregarSensor(sensor1);
    estacion.agregarSensor(sensor2);
    estacion.agregarSensor(sensor3);

    estacion.generarReporteClimatico();
}
