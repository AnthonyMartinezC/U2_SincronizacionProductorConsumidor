# Detalles sobre la App

Este proyecto implementa el clásico problema de sincronización **Productor-Consumidor** utilizando el lenguaje Java. 

El programa simula la gestión de un restaurante exclusivo que cuenta con un espacio reservado de 3 mesas para atender a sus clientes más selectos.

## **Descripción del problema**
El restaurante tiene un empleado que realiza dos tareas principales:
1. **Sentar a los clientes en las mesas y atenderlos.**
2. **Cobrar las cuentas y despedir a los clientes con amabilidad.**

Para garantizar un funcionamiento adecuado, el programa utiliza técnicas de sincronización para evitar condiciones de carrera y asegurar que las mesas sean gestionadas de forma eficiente.

## **Características principales**
- **Productor:** Representa al empleado que sienta a los clientes en las mesas.
- **Consumidor:** Representa al empleado que cobra las cuentas y libera las mesas.
- **Monitor (clase `Reservado`):** Controla el acceso al recurso compartido (lista de mesas) y sincroniza las acciones del productor y el consumidor.
- **Estructura de datos:** Las mesas se gestionan mediante una lista enlazada (`LinkedList`).
- **Capacidad máxima:** 3 mesas.

## **Requisitos**
- **Java 8** o superior.
- Un entorno de desarrollo compatible con Java (como IntelliJ IDEA o Eclipse).
- Gradle (opcional, si deseas compilar y ejecutar el proyecto con él).

## **Tecnologías/herramientas utilizadas y conocimientos profundizados**

### **Tecnologías y herramientas utilizadas:**
- **Java Threads:** Para implementar hilos concurrentes que representan al productor y al consumidor.
- **Monitor en Java (`synchronized`):** Para coordinar el acceso al recurso compartido.(evita la condición de carrera)
- **Logger (`java.util.logging`):** Para registrar mensajes de depuración y manejo de errores.
- **Estructura de datos (`LinkedList`):** Para gestionar dinámicamente las mesas ocupadas.
- **IntelliJ IDEA:** El IDE donde se desarrolló y compiló el programa.

### **Conocimientos profundizados:**
- **Problemas de concurrencia:** Cómo evitar condiciones de carrera mediante sincronización.
- **Programación concurrente:** Uso de `wait()` y `notifyAll()` para gestionar la interacción entre hilos.
- **Sincronización en Java:** Diseño de un monitor para controlar el acceso a un recurso compartido.
- **Buena organización del código:** Separación en clases claras y reutilizables.
- **Manejo de excepciones con Logging :** Uso de logging para registrar errores en lugar de imprimir directamente en consola.

## **Para la ejecución del programa**
1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/AnthonyMartinezC/U2_SincronizacionProductorConsumidor
## **Foto de salida de consola**

![Imagen de WhatsApp 2024-11-28 a las 16 20 11_5d9c57f5](https://github.com/user-attachments/assets/38a299de-5322-41a8-965f-57b99505daf2)

