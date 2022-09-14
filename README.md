# AREP_Parcial1T_TrigCalculator

1. Construir una  aplicación web usando sockets que reciba un número y una cadena de tres caracteres. La cadena puede ser una de cuatro opciones: "cos", "sin", "tan", "qck". La aplicación asume que el número que recibe está en radianes y muestra el valor de la función trigonométrica correspondiente. Si la calculadora está en modo "qck" la calculadora recibe una lista de enteros desordenada y los retorna de manera ordenada usando quicksort.
2. Arquitectura:
   1. La aplicación tendrá tres componentes distribuidos: Una fachada de servicios, un servicio de calculadora trigonomética, y un cliente web (html +js).
   2. Los servicios de la fachada y de la calculadora deben estar desplegados en dynos diferentes.
   3. El cliente se descarga desde un servicio en la fachada (Puede entregar el cliente directamente desde un método no es necesario que lo lea desde el disco).
   4. La comunicación se hace usando http y las respuestas de los servicios son en formato JSON.
3. La caculadora trigonométrica (TrigCalculator) es la que hace el computo real de las funciones. La fachada de servicios (ServiceFacade) solo delega el computo al TrigCalculator.
4. Su diseño debe soportar la composición de nuevas operaciones para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre  el API web, es decir,  debe ser fácilmente extensible.
5. El diseño de los servicios WEB debe tener en cuenta buenas prácticas de diseño OO.
6. Despliegue los servicios en Heroku en dynos separados.
7. Los llamados al servicio de calculadora desde el cliente deben ser asíncronos usando el mínimo JS prosible. No actualice la página en cada llamado, solo el resultado.
8. El API de la fachada será
   1. [url de la app en Heroku]/calculadora : Este servicio entrega el cliente web en formato html + js.
   2. [url de la app en Heroku]/[operación de tres letras: cos, sin, tan,qck]?val=[numero o lista de números] : retorna el valor solicitado en formato JSON
9. El API de la calculadora será
   1. [url de la app en Heroku]/[operación de tres letras: cos, sin, tan,qck]?val=[numero o lista de números] : retorna el valor solicitado en formato JSON
10. Asegúrese de retornar los encabezados correctos en HTTP y de responder mensajes válidos de HTTP ante solicitudes inesperadas (Heroku hace algunas solicitudes iniciales al publicar la aplicación)