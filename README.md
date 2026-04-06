Trabajo practico numero 0 de programación 3 de la Utn
Una tienda necesita un sistema para gestionar distintos métodos de pago. Cada pago
puede realizarse de manera física (por ejemplo, con tarjeta de crédito o efectivo) o virtual
(por ejemplo, con PayPal o criptomonedas).
El sistema debe permitir:
* Registrar pagos con distintos métodos.
* Procesar pagos asegurando que los datos sean correctos.
* Manejar errores si un pago no puede completarse.
Requisitos
Diseño del sistema
Debe haber una estructura que diferencie entre pagos físicos y pagos virtuales.
Todos los pagos deben compartir algún comportamiento en común.
Los métodos de pago pueden incluir: Tarjeta de crédito, PayPal, Criptomonedas y Efectivo.
Gestión de pagos
El sistema debe permitir almacenar y procesar pagos de diferentes tipos.
Debe poder manejar múltiples pagos en una misma ejecución.
Manejo de excepciones
Evitar pagos inválidos, como montos negativos o iguales a cero.
Detectar errores específicos, como el uso de tarjetas de crédito vencidas.
Implementar una excepción personalizada para cuando un pago no pueda realizarse.
Pistas: Piensen en cómo estructurar la relación entre los pagos físicos y virtuales. ¿Sería útil
usar una interfaz? ¿Clases abstractas?
Se evaluará la correcta aplicación de principios de POO (herencia, polimorfismo), uso de
genéricos y manejo de excepciones.
