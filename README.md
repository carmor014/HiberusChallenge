# Instrucciones para correr el proyecto

Este proyecto tiene un enfoque de microservicios,esta dockerizado y por ende para arrancarlo se necesita tener instalado docker y docker-compose. Se ejecuta  un script de ejecución y listo

## Iniciar

./start.bat (Windows)
./start.sh (Linux)

## Detener

./stop.bat (Windows)
./stop.sh (Linux)

## Notas

La arquitectura de este proyecto consta de tres servicios

checkout (api)
bill
logistic

en el cual el servicio rest-api recibe un evento y de forma asíncrona se comunica con los otros dos servicios mediante un fanout de rabbitmq

Para utilizar el servicio api ver la documentación del archivo swagger.yml que se encuentra en la raíz del repositorio; también puede guiarse de el siguiente curl para su importe en postman

curl --location --request POST 'http://localhost:8080/api/checkout' \
--header 'Content-Type: application/json' \
--data-raw '{
    "clientId" : 1,
    "date" : "2020-06-29T21:31:56.837Z",
    "direction":  "avenida falsa 123",
    "products": [
        {
            "id" : 1,
            "quantity":5 ,
            "cost":1000
        },
        {
            "id" : 2,
            "quantity":2 ,
            "cost":2500.3
        },
        {
            "id" : 3,
            "quantity":5 ,
            "cost":4000.10
        }
    ] 

}'

Podrá ver el gráfico de la arquitectura en el anexo en la raíz Architecture.png

Para validar que los mensajes llegaron a persistencia por favor utilizar un ide cliente de base de datos como dbeaver y ver los registros en las dos bases de datos, ya que para el alcance de la solución no se hizo un servicio de cara a cliente que retorne esta info

Los parámetros de conexión a la Bases de datos estan los en los archivos properties de los dos servicios que tienen persistencia

bill\src\main\resources\application.properties

checkout\src\main\resources\application.properties
 
