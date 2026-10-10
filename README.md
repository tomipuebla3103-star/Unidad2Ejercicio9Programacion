<img width="490" height="103" alt="WhatsApp Image 2026-09-28 at 23 22 01" src="https://github.com/user-attachments/assets/27f16ba2-dff6-42e8-b06b-82c9db0c8734" />

Estación Meteorológica y Sensores Ambientales

 Descripción
Este proyecto consiste en un sistema en Java que permite simular una estación meteorológica que recopila información de diferentes sensores ambientales, como temperatura, humedad y presión atmosférica, para generar un reporte climático.

Clases
- **Sensor:** contiene el tipo de sensor y el método `obtenerLectura()`, que devuelve un valor numérico simulado.
- **EstacionMeteorologica:** mantiene una lista de sensores y utiliza el método `generarReporteClimatico()` para solicitar y recopilar las lecturas de cada uno.

 Funcionamiento
En el `main` se crea una estación meteorológica y se agregan al menos tres sensores de distintos tipos. Luego, se ejecuta el método `generarReporteClimatico()` para obtener las lecturas y mostrar el reporte por consola.

 Recorrido del mensaje
1. El programa crea la estación meteorológica.
2. Se crean tres sensores de distintos tipos y se agregan a la estación.
3. Se llama al método `generarReporteClimatico()` de la estación.
4. La estación recorre la lista de sensores y solicita una lectura a cada uno mediante el método `obtenerLectura()`.
5. Cada sensor genera y devuelve un valor numérico según su tipo.
6. La estación recibe las lecturas y las reúne para formar el reporte climático.
7. Finalmente, se muestran por consola los datos recopilados.

Objetivo
Practicar la comunicación entre objetos en Java, el uso de listas, las llamadas a métodos, el retorno de valores y la recopilación de información de múltiples objetos para generar un reporte.
