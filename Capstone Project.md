
# Capstone Project
<!-- TOC -->

- [Capstone Project](#capstone-project)
- [Definición del Proyecto](#definici%C3%B3n-del-proyecto)
- [Entregables](#entregables)
    - [Fechas de Entrega](#fechas-de-entrega)
    - [Entregable 1](#entregable-1)
        - [Requerimientos y Criterio de Evaluación](#requerimientos-y-criterio-de-evaluaci%C3%B3n)
    - [Entregable 2](#entregable-2)
        - [Requerimientos y Criterio de Evaluación](#requerimientos-y-criterio-de-evaluaci%C3%B3n)
    - [Entregable 3](#entregable-3)
        - [Para poder considerar completadas las semanas 5 y 6 de entrenamiento debe contemplar lo siguiente:](#para-poder-considerar-completadas-las-semanas-5-y-6-de-entrenamiento-debe-contemplar-lo-siguiente)
        - [Criterio de Evaluación](#criterio-de-evaluaci%C3%B3n)

<!-- /TOC -->

# Definición del Proyecto
El proyecto está conformado de ejercicios y tareas que se van realizando en las sesiones impartidas a lo largo del curso. Cada cierto tiempo se debera realizar un entregable abarcando las semanas:
  - Entregable 1 - Semanas 1 y 2
  - Entregable 2 - Semanas 3, 4 y 5
  - Entregable 3 - Semana 6 

Se debera enviar cada Entregable en las fechas indicadas en la sig. sección y para poder tener una `revisión` y `retro-alimentación` se debera enviar la url/liga de tu `Pull Request` a traves del siguiente [formulario](https://forms.gle/tWhu7DGAU3B6GVmU6) lo cual nos indicara que esta listo tu entregable para revisión.

# Entregables
## Fechas de Entrega
 - Entregable 1: Miercoles 2 de Noviembre - 2:00pm
 - Entregable 2: Miercoles 9 de Noviembre - 2:00pm
 - Entregable 3 (final): Lunes 14 de Noviembre - 2:00pm

## Entregable 1

- **Objetivo** 

- **Temas relacionados**: Semana 1 y 2
  - Github
  - Microservicios
  - RestAPIs
  - Kafka
  - MongoDB
  - Serverless

### Requerimientos y Criterio de Evaluación


| **Tópico**                                                                                                                                                 | **Puntaje** |
|------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Screenshots para el flujo commit y push: `git branch`, `git add`, `git commit` y `git push`                                                                                                                    | 10          |
| Pull Request para el `Entregable 1`                                   y archivo `README.md` en el directorio `Entregable 1     `                                                                        | 10          |
| Dockerfile ejecutable                                                                                                                                      | 10          |
| Archivo de Docker Compose que permita levantar el contendor                                                                                                | 10          |
| Colección de Postman realizando una petición de cada tipo a una API pública                                                                                | 10          |
| Función Lambda creada en la cuenta que permita la ejecución de código                                                                                      | 10          |
| Captura de pantalla de logs en Cloudwatch                                                                                                                  | 10          |
| Captura de pantalla de productor a consumidor en Kafka  (con sus particiones)                                                                                                   | 10          |
| Base de datos de MongoDB exportada                                                                                                                         | 10          |
| Impresión de pantalla de operaciones CRUD en datos reales de MongoDB                                                                                       | 10          |
| **Total**                                                                                                                                                  | **100**     |
| **Mínimo Aprobatorio**                                                                                                                                     | **70**      |


## Entregable 2

- **Objetivo** 

- **Temas relacionados**: Semana 3 y 4
  - Java

### Requerimientos y Criterio de Evaluación 
Para poder considerar completadas las semanas 3 y 4 de entrenamiento debe contemplar lo siguiente:

| **Tópico**                                                                                  | **Puntaje** |
|---------------------------------------------------------------------------------------------|-------------|
| Usar Java 11 como versión del proyecto                                                      | 5           |
| Herencia en una de sus clases                                                               | 5           |
| Sobrecarga de al menos uno de los métodos de alguna clase                                   | 5           |
| Sobrecarga de al menos uno de los constructores de alguna clase                             | 5           |
| Encapsulamiento de al menos una clase                                                       | 5           |
| Clase interna dentro de al menos una clase                                                  | 5           |
| Uso de por lo menos una interfaz de creación propia                                         | 10          |
| Uso de por lo menos dos tipos de datos primitivos                                           | 5           |
| Uso de dos tipos de datos encapsulados                                                      | 5           |
| Uso de un tipo de dato abstracto                                                            | 5           |
| Uso de por lo menos una expresión regular                                                   | 5          |
| Uso de por lo menos un arreglo                                                              | 5           |
| Uso de por lo menos un mapa                                                                 | 5           |
| Uso de por lo menos una lista                                                               | 5           |
| Uso de API de Fechas y Tiempos en un método                                                 | 10          |
| Implementación de concurrencia arrancando por lo menos tres hilos y utilizando su ejecución | 20          |
| Uso de por lo menos una excepción de creación propia                                        | 20          |
| Uso de al menos tres anotaciones                                                            | 5           |
| Uso de por lo menos 1 Interfaz Funcional                                                    | 10          |
| Uso de por lo menos 1 función Lambda y asignada a una Interfaz Funcional                    | 10          |
| Uso de por lo menos 1 Stream de datos                                                       | 5           |
| Uso de por lo menos 2 operaciones intermedias y 2 tipos de colectores                       | 10          |
| Uso de por lo menos dos patrones de diseño creacionales                                     | 30          |
| Hacer uso de `.gitignore` (ver [Nota 1])                                      | 5          |
**Total**                                                                                   | **200**     |
| **Mínimo aprobatorio**                                                                      | **160**     |

[Nota 1] 
Se evaluara no tener `archivos basura y directorios inecesarios` como archivos compilados de Java (`bin/`) o archivos de configuración de editor de texto `.vscode` o `.idea`

## Entregable 3

- **Objetivo** 

- **Temas relacionados**: Semana 5 y 6
  - Spring Boot
  - JUnit

### Para poder considerar completadas las semanas 5 y 6 de entrenamiento debe contemplar lo siguiente:
- Proyecto generado por Spring Initializr y desplegable en el contenedor creado en el primer entregable
- Todas sus propiedades deben estar descritas en el archivo “application.properties” con el formato de nombre correcto
- Construirse mediante su manejador de dependencias (Gradle o Maven)
- La estructura del proyecto debe ser coherente y acorde a buenas prácticas
- Debe utilizar RestTemplate para consumir por lo menos una API pública y convertir el resultado a un POJO utilizando JAXB o Jackson
- Generar una API utilizando Spring MVC y debe tener por lo menos un endpoint de cada tipo (GET, POST, PUT, DELETE); este debe ser consumible por medio de Postman y la colección para ello debe proveerse en el entregable final
- Comunicarse con la base de datos de MongoDB creada en el primer entregable a través de Spring Data JPA con MongoTemplate y poder realizar operaciones CRUD (creación, lectura, actualización y borrado de registros)
- Crear por lo menos una prueba unitaria de cada endpoint generado con Spring MVC, de cada operación realizada con Spring Data JPA y de cada integración empleando Mockito generando logs en la ejecución de cada una y contemplar Happy Path y Edge Cases, usando JaCoCo o SonarCloud como herramientas de cobertura de pruebas

### Criterio de Evaluación

| **Tópico**                                                        | **Puntaje** |
|-------------------------------------------------------------------|-------------|
| Captura de pantalla de proyecto generado por Spring Initializr    | 5           |
| Dockerfile desplegando en el contenedor                           | 10          |
| Archivo application.properties con el formato correcto            | 5           |
| Archivo desplegable usando Gradle o Maven                         | 5           |
| Estructura del proyecto correcta                                  | 5           |
| Consumo de API pública usando RestTemplate                        | 5           |
| Conversión del contenido consumido usando JAXB o Jackson          | 5           |
| API generada por Spring MVC con un endpoint de cada tipo          | 10          |
| Colección de Postman para consumir la API generada                | 5           |
| Creación de enlace con MongoDB usando Spring Data JPA             | 10          |
| Uso de MongoTemplate                                              | 5           |
| Lectura de MongoDB usando MongoTemplate                           | 10          |
| Escritura en MongoDB usando MongoTemplate                         | 10          |
| Actualización en MongoDB usando MongoTemplate                     | 10          |
| Borrado en MongoDB usando MongoTemplate                           | 10          |
| Prueba unitaria de cada endpoint de la API                        | 20          |
| Prueba unitaria de cada operación CRUD                            | 20          |
| Uso de Mockito en cada prueba                                     | 10          |
| Generación de logs por prueba                                     | 10          |
| Pruebas para Happy Path                                           | 10          |
| Pruebas para cada Edge Case                                       | 10          |
| Implementación de JaCoCo o SonarCloud (mínimo 70% de cobertura)   | 10          |
| **Total**                                                         | **200**     |
| **Mínimo aprobatorio**                                            | **160**     |
