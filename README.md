# AREP_ParcialT1

##REQUERIMIENTOS

No PUEDE revisar código en internet ni código antiguo que tenga en el computador. Use solo el código especificado en este enunciado.

No saque copias del enunciado.
NO USE SPARK NI SPRING. SOLO PUEDE USAR SOCKETS.

1. Construir una  aplicación web usando sockets que reciba un operación  matemática y una lista de parámetros separados por coma y retorne el valor correspondiente. El comando puede ser cualquiera de la libería clase Math de java o el comando "qck". La aplicación asume que los números que recibe siempre son de tipo Double. El comando se debe invocar usando reflexión. Si la calculadora recibe el comando es "qck" los parámetros serán una a lista de números desordenada y los retorna de manera ordenada usando quicksort.
2. Arquitectura:
  1. La aplicación tendrá tres componentes distribuidos: Una fachada de servicios, un servicio de calculadora, y un cliente web (html +js).
  2. Los servicios de la fachada y de la calculadora deben estar desplegados en máquinas virtuales  diferentes.
  3. El cliente es un cliente web que usa html y js. Se descarga desde un servicio en la fachada (Puede entregar el cliente directamente desde un método no es necesario que lo lea desde el disco).
  4. La comunicación se hace usando http y las respuestas de los servicios son en formato JSON.
3. La caculadora  (ReflexCalculator) es la que hace el computo real de las funciones. La fachada de servicios (ServiceFacade) solo delega el computo al ReflexCalculator.
4. El diseño de los servicios WEB debe tener en cuenta buenas prácticas de diseño OO.
5. Despliegue los servicios en máquinas virtuales separadas.
6. Los llamados al servicio de calculadora desde el cliente deben ser asíncronos usando el mínimo JS prosible. No actualice la página en cada llamado, solo el resultado.
7. El API de la fachada será
  1. [url de la app]/calculadora : Este servicio entrega el cliente web en formato html + js.
  2. [url de la app]/computar?comando=[comando con parámetros separados por coma entre paréntesis] : retorna el valor solicitado en formato JSON
8. El API de la calculadora será
  1. [url de la calculadora]/compreflex =[comando con parámetros separados por coma entre paréntesis] :retorna el valor solicitado en formato JSON
9. Asegúrese de retornar los encabezados correctos en HTTP y de responder mensajes válidos de HTTP ante solicitudes inesperadas
