import TPn11.Adicionales.Excepciones;
import TPn13.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        /*
        //TPN1
        //Realizar un programa Java que realice lo siguiente: declarar una variable numN de tipo int,
        //una variable numA de tipo double y una variable numC de tipo char y asigna a cada una un valor.
        int num = 5;
        double numA = 1.5;
        char numC = 'X';
        //A continuación muestra por pantalla: El valor de cada variable, la suma de numN + numA,
        //la diferencia de numA numN, el valor numérico correspondiente al carácter que contiene la variable numC.
        System.out.println("Ejercicio 1:");
        System.out.println("Suma de numN + numA: " + (num + numA));
        System.out.println("Diferencia de numA numN: " + (numA - numA));
        int ascii = (int) numC;
        System.out.println("Valor numérico correspondiente al carácter que contiene la variable numC: " + ascii);

        //Realizar un programa Java que realice lo siguiente: declarar dos variables numX y numY de tipo int,
        //dos variables numN y numM de tipo double y asigna a cada una un valor. A continuación mostrar por pantalla una serie de operaciones entre ellas.
        int numX = 10;
        int numY = 20;
        double numN = 5.5;
        double numM = 3.3;
        System.out.println("Suma numX + numY: " + numX + numY);
        System.out.println("Multiplicacion numN * numM: " + numM*numN);
        System.out.println("Division numX/numM: " + numX/numM);

        //Realizar un programa Java que declare cuatro variables enteras A, B, C y D y se le asigne un valor a cada una.
        //A continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
        int a,b,c,d;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        System.out.println("B: " + b);
        b = c;
        System.out.println("B = C : " + b);
        System.out.println("C: " + c);
        c = a;
        System.out.println("C = A : " + c);
        System.out.println("A: " + a);
        a = d;
        System.out.println("A = D : " + a);
        System.out.println("D: " + d);
        d = b;
        System.out.println("D = B: " + d);

        ///TPN2
        //1. Realizar un programa Java que declare una variable entera N y se le asigne
        //un valor elegido por el usuario. A continuación escribe las instrucciones para que
        //el programa realice lo siguiente: incrementar N en 77, reducir su valor a 3,
        //duplicar su valor. Mostrar por pantalla los tres valores.
         int n = 0;
        System.out.println("Ingrese un valor para N: ");


        while (n < 4){
            n = sk.nextInt();
            if(n < 4){
                System.out.println("Ingrese un valor mayor a 4");
            }
        }

        System.out.println("valor N: " + n);
        n = n * 77;
        System.out.println("Incrementar n en 77: " + n);
        while ( n != 3){
            n = n - 1;
        }
        System.out.println("Reducir valor a 3 :" + n);
        n = n * 2;
        System.out.println("Duplicando su valor: " + n);

        //2. Realizar un programa Java que declare una variable A de tipo entero, y le
        //asigne un valor elegido por el usuario. A continuación mostrar un mensaje
        //indicando si A es par o impar.
        int a;
        System.out.println("Ingrese un valor para A: ");
        a = sk.nextInt();
        if(a % 2 == 0){
            System.out.println("A es par");
        }else{
            System.out.println("A es impar");
        }

        //3.Realizar un programa Java que declare una variable B de tipo entero y
        //asignarle un valor elegido por el usuario. A continuación mostrar un mensaje
        //indicando si el valor de B es positivo o negativo.
        int b;
        System.out.println("Ingrese un valor para B:");
        b = sk.nextInt();
        if (b < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es par");
        }
        //4. Realizar un programa Java que encuentre el valor ASCII de un carácter. Para
        //ello, vamos a pedir un String al usuario y leer solo el primer carácter, esto lo
        //lograremos con: char caracter = scanner.next().charAt(0);
        String a = "";
        System.out.println("Ingrese una palabra: ");
        a = sk.next();
        int  ascii = (int) a.charAt(0);
        System.out.println("Valor ascii: " + ascii);

        //5. Realizar un programa Java que declare una variable C de tipo entero y le
        //asigne un valor elegido por el usuario. A continuación mostrar un mensaje
        //indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de
        //5, si es múltiplo de 10 y si es mayor o menor que 100.
        int c = 0;
        System.out.println("Ingrese un valor entero para C:");
        c = sk.nextInt();

        if(c % 2 == 0){
            System.out.println("A es par");
        }else{
            System.out.println("A es impar");
        }
        if (c < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es positivo");
        }
        if(c % 5 == 0){
            System.out.println("A es multiplo de 5");
        }else{
            System.out.println("A no es multiplo de 5");
        }
        if(c % 10 == 0){
            System.out.println("A es multiplo de 10");
        }else{
            System.out.println("A no es multiplo de 10");
        }
        if(c < 100 ){
            System.out.println("Es menor que 100");
        }else{
            System.out.println("no es menor que 100");
        }


        //6. Realizar un programa Java que lea un nombre y muestre por pantalla:
        //“Buenos días, {NOMBRE}”.
        String  nombre = "";
        System.out.println("Ingres un nombre:");
        nombre = sk.nextLine();
        System.out.println("Buenos días, " + nombre);

        //7. Realizar un programa que pase una velocidad en Km/h a m/s. La velocidad
        //se lee por teclado. Cálculo: velocidadMS = velocidadKm * 1000 / 3600;
        int velocidadKmHr = 0;
        System.out.println("Ingrese un valor de velocidadKm/Hr:");
        velocidadKmHr = sk.nextInt();
        velocidadKmHr = velocidadKmHr * 1000 / 3600;
        System.out.println("Velocidad mtrs/Segs: " + velocidadKmHr);

        //8. Realizar un programa que lea por teclado un número de 3 cifras y muestra
        //sus cifras por separado.
        int num = 0;
        System.out.println("Ingrese un numero de 3 cifras:");
        num = sk.nextInt();
        System.out.println(num);
        num = num/10;
        System.out.println(num);
        num = num/100;
        System.out.println(num);
        //9. Realizar un programa que lea por teclado un número entero N de 5 cifras y
        //muestre las cifras que ocupan posiciones impares.
        int n = 0;
        System.out.println("Ingrese un numero de 5 cifras:");
        n = sk.nextInt();
        String na = String.valueOf(n);
        for (int i = 0; i < na.length(); i++){
            if(na.charAt(i) % 2 != 0){
                System.out.println("Es impar " + na.charAt(i));
            }
        }

        //10. Realizar un programa que lea por teclado tres números enteros H, M, S que
        //contengan hora, minutos y segundos respectivamente, y compruebe si la hora
        //que indican es una hora válida.
        int h,m,s;
        h = 0;
        m = 0;
        s = 0;
        while((h >= 0) && (h <= 23)){
            h = sk.nextInt();
            if((h >= 0) && (h < 23)){
                while((m >= 0) && (m <=59 )){
                    m = sk.nextInt();
                    if((m >= 0) && (m <=59 )){
                        while (((s >= 0) && (s <=59 ))){
                             s = sk.nextInt();
                            if((m >= 0) && (m <=59 )) {
                                System.out.println(h + ":" + m + ":" + s + ":");
                            }
                        }
                    }
                }
            }
        }
        //11. Realizar un programa Java que pida por teclado el nombre, edad y salario
        //de una persona, y muestra el salario dependiendo de:
        //● Si es menor de 16 no tiene edad para trabajar
        //● Entre 19 y 50 años el salario es un 5 por ciento más
        //● Entre 51 y 60 años el salario es un 10 por ciento más
        //● Si es mayor de 60 el salario es un 15 por ciento más

        String nombre = "";
        int edad = 0;
        double salario = 0;

        System.out.println("Ingrese su nombre:");
        nombre = sk.nextLine();
        System.out.println("Ingrese su edad:");
        edad = sk.nextInt();
        System.out.println("Ingrese su salario");
        salario = sk.nextDouble();
        double salarioCinco;
        double salarioDiez;
        double salarioQuince;

        if(edad < 16){
            System.out.println("No puede trabajar");
        }else if(edad >= 19 && edad <= 50){
             salarioCinco = salario * 0.05;
            System.out.println("salario mas 5%: " + salarioCinco);
        }else if(edad >= 51 && edad <= 60){
            salarioDiez = salario * 0.10;
            System.out.println("salario mas 10%:" + salarioDiez);
        }else if(edad >= 60){
            salarioQuince = salario * 0.10;
            System.out.println("salario mas 10%:" + salarioQuince);
        }
        //12. Realizar un programa Java que calcule el promedio de un arreglo de
        //números enteros. Realizar variantes con arreglos ya inicializados e ingreso por
        //teclado.

        int [] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        int size = array.length;
        int suma = 0;
        for(int i = 0; i < size; i++){
            suma  = suma + array[i];
        }
        double promedio = suma / size;
        System.out.println(promedio + "1");
        suma = 0;
        for(int i = 0; i < 5; i++){
            array[i] = sk.nextInt();
            suma = suma + array[i];
        }
        promedio = suma / size;
        System.out.println(promedio+ "2");

        //13. Realizar un programa Java que solicite un número al usuario y calcule la
        //suma de todos los números naturales, hasta el número recibido inclusive.
        int i = 0;
        System.out.println("Ingrese un numero");
        i = sk.nextInt();
        int x = 0;
        for(int a = 0; a < i; a++){
            x = x+1;
            System.out.println(x);
        }
        //14. Realizar un programa Java que lea por teclado 20 temperaturas
        //correspondientes a un mes y calcule el máximo, el mínimo y el promedio. Utilizar
        //un array double.
        double[] temperaturas = new double[20];
        double suma = 0;
        double max, min;

        // Leer las 20 temperaturas
        System.out.println("Ingrese 20 temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = sk.nextDouble();
            suma += temperaturas[i];
        }

        // Inicializamos max y min con la primera temperatura
        max = temperaturas[0];
        min = temperaturas[0];

        // Buscamos el máximo y el mínimo
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
        }
        // Calculamos el promedio
        double promedio = suma / temperaturas.length;
        // Mostramos resultados
        System.out.println("\nResultados:");
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura promedio: " + promedio);
        sk.close();


        ///TPN3
        //1) Modele el objeto Empleado que posee las siguientes características, dni, nombre, apellido y salario. El
        //mismo debe contar con la posibilidad de calcular el salario anual. A su vez se requiere otro método que
        //permita aumentar el salario dependiendo del porcentaje que se le pase por parámetro. Considere crear un
        //método que facilite imprimir por pantalla las características del objeto de la siguiente forma:
        //Empleado[dni=?, nombre=?, apellido=?, salario=?]
        //
        //En el main, realice las siguientes operaciones:
        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
        Empleado empleadoA = new Empleado("23456345","Carlos","Gutiérrez",25000);
        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        Empleado empleadoB = new Empleado("34234123","Ana","Sanchez",27500);
        //c. Imprima ambos objetos por pantalla.
        System.out.println(empleadoA.caracteristicas());
        System.out.println(empleadoB.caracteristicas());
        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
        empleadoA.aumentarSalario(15);
        System.out.println(empleadoA.getSalario());

        //2) Modele el objeto que representa una cuenta en un banco, con identificador, nombre y balance. Considere
        //los getters, setters y constructores necesarios.
        //Luego, realizar los siguientes métodos:
        //a. El método crédito que representa un depósito de dinero en la cuenta. Este método debe devolver el
        //balance luego de la operación.
        //b. El método débito que representa una sustracción de dinero de la cuenta. Este método debe devolver el
        //balance luego de la operación. Si el dinero en la cuenta no es suficiente para cubrir la sustracción, se debe
        //imprimir por pantalla un aviso sin permitir dicha sustracción.
        //c. Un método que imprima por pantalla las características del objeto.
        //
        //En el main, realice las siguientes operaciones:
        //1. Inicialice una cuenta con un monto inicial de 15000.
        CuentaBanco cuenta = new CuentaBanco("Axel",15000);
        //2. Realice una operación de depósito de dinero de 2500.
        cuenta.prestamo(2500);
        //3. Realice una operación de extracción de 1500.
        cuenta.debito(1500);
        //4. Realice una operación de extracción de 30000.
        cuenta.debito(30000);
        //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.
        System.out.println(cuenta.caracteristicas());

        //3) Modela un objeto ItemVenta que representa un ítem de venta en una tienda. Debe permitir realizar
        //varias operaciones relacionadas con la gestión de ítems. La clase ItemVenta deberá tener como atributos:
        //identificador (int), descripcion (String), cantidad (int) y precioUnitario (double). Los métodos a realizar
        //son:
        //● getters y setters para cada atributo.
        //● Un método calcularPrecioTotal() que devuelve el precio total (precio unitario * cantidad).
        //● Un método que devuelva una representación en cadena del ítem de venta en el formato:
        //ItemVenta[id=?, descripcion=?, cantidad=?, pUnitario=?, pTotal=?].
        //
        //En el main, realiza las siguientes operaciones dentro de un switch:
        //

        int opcion = 0;

        ItemVenta itemA = null;

        do {
            System.out.println("//1. Agregar ítem: Inicializa un objeto ItemVenta con valores proporcionados por el usuario." +
                    "        //2. Imprime el objeto usando el método correspondiente.\n" +
                    "        //3. Permite al usuario ingresar una nueva cantidad y actualiza el atributo cantidad del ítem de venta.\n" +
                    "        //4. Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo precioUnitario del ítem de\n" +
                    "        //venta.\n" +
                    "        //5. Imprime el precio total calculado por el método calcularPrecioTotal().\n" +
                    "        //6. Sale del programa.");
            opcion = sk.nextInt();

            switch (opcion){
                case 1:{
                    //1. Agregar ítem: Inicializa un objeto ItemVenta con valores proporcionados por el usuario.
                    System.out.println("Debe ingresar el nombre del producto, la cantidad, y el precio por unidad, todo en ese orden");
                    itemA = new ItemVenta(sk.nextLine(),sk.nextInt(),sk.nextDouble());
                }
                case 2:{
                    //2. Imprime el objeto usando el método correspondiente.
                    System.out.println(itemA.caracteristicas());
                }
                case 3:{
                    //3. Permite al usuario ingresar una nueva cantidad y actualiza el atributo cantidad del ítem de venta.
                    System.out.println("Ingrese la nueva cantidad del producto, actualise el stock:");
                    itemA.setCantidad(sk.nextInt());
                }
                case 4:{
                    //4. Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo precioUnitario del ítem de
                    //venta.
                    System.out.println("Ingrese el nuevo precio unitario, actualise el precio:");
                    itemA.setPrecioUnitario(sk.nextDouble());
                }
                case 5:{
                    //5. Imprime el precio total calculado por el método calcularPrecioTotal().
                    System.out.println(itemA.calcularPrecioTotal());
                }
                case 6:{
                    //6. Sale del programa.
                    System.out.println("Adios");
                }
            }
        }while(opcion != 6);

        ///TPN4
        //Realizar un programa que lee por teclado el valor del radio de una circunferencia, calcula y muestra por pantalla la longitud y el área de la circunferencia. Cálculo de longitud: 2 * PI * radio, cálculo de área: PI * radio^2. Usar la clase Math.
        //
        System.out.println("Ingrese el valor de un radio:");
        double valorRadio = sk.nextDouble();
        double longitud = 2 * Math.PI * valorRadio;
        double area  = Math.PI * Math.pow(valorRadio,2);
        System.out.println("Longitud:" + longitud);
        System.out.println("Longitud:" + area);

        //Realizar un programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras. Usar la clase Math.
        //
        System.out.println("Ingrese catetos 1 y 2:");
        double cateto1 = sk.nextDouble();
        double cateto2 = sk.nextDouble();

        double raizCateto1 = Math.pow(cateto1,2);
        double raizCateto2 = Math.pow(cateto2,2);

        double hipotenusa = Math.sqrt(raizCateto1+raizCateto2);

        System.out.println("Longitud de la hipotenusa: " + hipotenusa);

        // Realizar un programa que calcula el volumen de una esfera. El valor de radio se debe pedir por teclado. Cálculo: volumen = 4/3 * PI * radio^3. Usar la clase Math.
        //
        System.out.println("Ingrese el volumen de una esfera: ");
        double volumenEsfera = sk.nextDouble();
        double volumen = 4/3 * Math.PI * Math.pow(volumenEsfera,3);
        System.out.println("Volumen esfera: " + volumenEsfera);

        //Modela un objeto Libro que tenga las siguientes características: id (único y autoincremental), título, autor, precio y cantidad de copias disponibles.

        //En dicha clase implementa los siguientes métodos:
        //Un constructor que inicialice el Libro con su título, autor, precio y cantidad de copias. El id debe ser asignado automáticamente.
        //Métodos getters y setters para cada atributo, excepto el id, que solo tendrá un getter.
        //Un método que permita vender una cierta cantidad de copias de un libro, disminuyendo la cantidad disponible. Si no hay suficientes copias, debe mostrar un mensaje indicando que la operación no es posible.
        //Un método que permita incrementar la cantidad de copias disponibles en el inventario.
        //Un método que imprima por pantalla los detalles del libro en el siguiente formato: Libro[id=?, título=?, autor=?, precio=?, copias disponibles=?].
        //En el main, realiza las siguientes operaciones:
        //Inicializa un libro con el título "El Quijote", autor "Miguel de Cervantes", precio 500, y 10 copias disponibles.
        Libro libroA = new Libro("El Quijote","Miguel de Cervantes",500,10);
        //Inicializa otro libro con el título "Cien Años de Soledad", autor "Gabriel García Márquez", precio 700, y 5 copias disponibles.
        Libro libroB = new Libro("Cien Años de Soledad","Gabriel Garcia Marquez",700,5);

        // c. Imprime los detalles de ambos libros.
        System.out.println(libroA.caractristicasLibro());
        System.out.println(libroB.caractristicasLibro());

        //Vende 3 copias del primer libro.
        System.out.println(libroA.vender(3));
        //Imprime los detalles del primer libro.
        System.out.println(libroA.caractristicasLibro());
        //Intenta vender 8 copias del segundo libro.
        System.out.println(libroB.vender(8));
        //Incrementa en 5 la cantidad de copias disponibles del segundo libro.
        libroB.aumentarCantidadCopias(5);
        //Imprime los detalles del segundo libro.
        System.out.println(libroB.caractristicasLibro());

        ///TPN5
        //Sobre esta guía
        //Lea atentamente cada uno de los enunciados y antes de llevar a código cada ejercicio realice en papel o con la ayuda de algún software,
        // el correspondiente diagrama de UML, detallando los atributos, métodos y constructores que considere necesarios. Una vez terminado
        // escriba el código y ejecute las pruebas que se detallan.

        //Tener en cuenta que NO TODAS las relaciones entre objetos son herencia.

        //Enunciados:
        //
        //Es necesario modelar el objeto de tipo Libro con las siguientes características: titulo, precio, stock y Autor, este último posee las características de: nombre, apellido, email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un único autor.
        //Ejecute las siguientes instrucciones:
        //Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        Autor autorA = new Autor("Joshua","Bloch","joshua@gmail.com", Genero.MUJER);
        //Imprima por pantalla al autor previamente instanciado.
        autorA.caracteristicas();
        //Inicialice el libro “Efective Java” del Autor “Joshua Bloch” que cuesta 450 pesos con una cantidad de 150 copias.
        LibroCinco libroA = new LibroCinco(autorA,"Efecetive",450,150);
        //Imprima por pantalla el libro instanciado.
        System.out.println(libroA.caractristicasLibroA());
        //Modifique el precio del libro “Efective Java” a 500 pesos y aumente la cantidad en 50 copias.
        libroA.sumandoStock(50);
        System.out.println("nuevo stock: " + libroA.getStock());
        //Imprima por pantalla los atributos del Autor Joshua, accediendo desde el Libro “Efective Java”.
        System.out.println(libroA.autor.caracteristicas());
        //Agregue un método a la clase Libro que posibilite imprimir en pantalla el siguiente mensaje: “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.
        System.out.println(libroA.presentandoLibro());

        //Nos contratan para hacer un programa que lleve el control de las ventas de un local. Para esto es necesario modelar la clase Cliente,
        //que posee un atributo id como identificador del cliente, el mismo debe ser un valor compuesto por letras y números aleatorios que se
        //generan automáticamente al crear un Cliente. El Cliente también posee un nombre, un email y un porcentaje de descuento.

        //Por otro lado vamos a tener el objeto Factura que representa una venta del local, cada Factura posee un identificador de las mismas
        //características usadas en Cliente. A su vez cada factura posee un monto total, una fecha y el Cliente que generó la compra.
        //Para la fecha de la venta se le va a asignar la fecha y hora al momento de creación del objeto Factura.
        //El tipo Factura debe contar con un método que calcule el monto final luego de aplicarle el descuento que posee el cliente.

        //Investigue la clase UUID y sus métodos estáticos para la generación de los ids.
        //        Generar un UUID aleatorio
        //        UUID id1 = UUID.randomUUID();
        //
        //        Generar UUID a partir de un nombre
        //        UUID id2 = UUID.nameUUIDFromBytes("Cliente123".getBytes());
        //
        //        Convertir un String a UUID
        //        UUID id3 = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        //
        //        // Información del UUID
        //           Versión del UUID aleatorio  = id1.version());
        //           Variante del UUID aleatorio = id1.variant());

        ////Investigue la clase LocalDateTime y sus métodos estáticos para la generación de la fecha.
        ////La clase LocalDateTime se encuentra en java.time y representa fecha y hora sin zona horaria.
        //
        //      //Obtener la fecha y hora actual del sistema
        //      //LocalDateTime fecha1 = LocalDateTime.now();
        //
        //      //Crear una fecha y hora específica (año, mes, día, hora, minuto, segundo)
        //      //LocalDateTime fecha2 = LocalDateTime.of(2025, 9, 30, 14, 30, 0);
        //
        //      //Crear a partir de LocalDate y LocalTime
        //      //LocalDate fechaBase = LocalDate.of(2025, 9, 30);
        //      //LocalTime horaBase = LocalTime.of(14, 30, 0);
        //      //LocalDateTime fecha3 = LocalDateTime.of(fechaBase, horaBase);
        //
        //      //Crear a partir de una cadena con formato ISO-8601
        //      //LocalDateTime fecha4 = LocalDateTime.parse("2025-09-30T14:30:00");
        //
        //      //Crear a partir de un número de segundos/nanosegundos desde la época (1970-01-01T00:00:00Z)
        //      //LocalDateTime fecha5 = LocalDateTime.ofEpochSecond(1633012200, 0, ZoneOffset.UTC);
        //
        //      //Información del LocalDateTime
        //      //int year = fecha1.getYear();        // Año actual
        //      //int month = fecha1.getMonthValue(); // Mes actual (1-12)
        //      //int day = fecha1.getDayOfMonth();   // Día del mes
        //      //int hour = fecha1.getHour();        // Hora del día
        //      //int minute = fecha1.getMinute();    // Minuto
        //      //int second = fecha1.getSecond();    // Segundo

        //Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto haga uso de un método que facilite la impresión del mismo.
        //Cliente[id=?, nombre=?, email=?, descuento=?]
        ClienteA clienteA = new ClienteA("Lau","lau@finn.com",15);
        System.out.println(clienteA.detalleCliente());
        //Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el monto total luego de aplicarle el descuento.
        //e. Cree un método que facilite la impresión del objeto de tipo Factura y que siga el siguiente formato: Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?, email=?, descuento=?]]
        Factura facturaA = new Factura(100000,clienteA);
        System.out.println("Monto total factura: " + facturaA.getMontoTotal());
        facturaA.montoFinalConDescuento();
        System.out.println("Monto total factura con descuento: " + facturaA.getMontoTotal());
        System.out.println(facturaA.detalleFctura());

        //Definir la clase Círculo, que posee como atributo un radio cuyo valor por defecto al ser inicializado sin valores es 1.0.

        //Además el tipo Círculo posee un atributo color, por defecto rojo, un método para calcular el área y otro para imprimir sus características.

        //Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por ende se convierte en subclase de Círculo.
        //El Cilindro a diferencia del Círculo posee un atributo altura, que también se inicializa en 1.0 cuando no le pasamos un valor a su constructor.
        //Y un método para calcular el volumen. Codifique ambas clases y realice las siguientes pruebas:

        //Inicializar un Cilindro y debuguear analizando los constructores a los que va llamando para inicializar la cadena de herencia.
        Cilindro cilindro = new Cilindro();
        //Imprimir por pantalla, el radio del cilindro, la altura, el área de la base y el volumen.
        System.out.println("Radio: "+cilindro.getRadio());
        System.out.println("Altura: "+cilindro.getAltura());
        System.out.println("Area: "+cilindro.area());
        System.out.println("Volumen: "+cilindro.volumen());
        //Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        Cilindro cilindroA = new Cilindro(1.2,"Verde",3.2);
        //Imprimir por pantalla el radio, la altura, el área de la base y el volumen.
        System.out.println("Radio: "+cilindroA.getRadio());
        System.out.println("Altura: "+cilindroA.getAltura());
        System.out.println("Area: "+cilindroA.area());
        System.out.println("Volumen: "+cilindroA.volumen());
        //Sobreescribir el método calcular area declarado en Círculo, para que nos permita calcular el área del cilindro (2π×radius×height + 2×areaBase)

        //Imprimir por pantalla el área y el volumen del cilindro.
        System.out.println(cilindroA.calcularArea());
        System.out.println(cilindroA.volumen());
        //Vamos a notar que el cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método calcular área y ahora nos calcula el área de un cilindro.
        //Modificar el método calcular volumen en la clase cilindro para que llame al método de la SUPER clase que calcula el área.
        System.out.println(cilindroA.volumen());
        //Modificar el método correspondiente de la clase cilindro para que imprima por pantalla lo siguiente: Cilindro: subclase de + {método que muestra info de Círculo} +altura= {alturaCilindro};
        System.out.println(cilindroA.detalleCilindro());




        //Vamos a diseñar un programa que nos permita gestionar el personal que concurre a una universidad.
        //Para no hacerlo muy extenso vamos a limitarnos a estudiantes y miembros de staff.
        //Ambos tipos comparten la característica de Persona que posee los atributos de dni, nombre, apellido, email y dirección.
        //El Estudiante posee las características de Persona y las de un estudiante, que en este caso son, año de ingreso, cuota mensual y carrera.
        //Y finalmente tenemos al miembro de Staff, que también es una Persona pero con características propias de alguien que trabaja para una institución, por ejemplo salario y turno (este puede ser mañana o noche).
        //Diagramar el UML identificando superclase y subclases, crear los constructores necesarios, los getters y setters, y los métodos de ayuda que consideres necesarios. Luego, en el main:
        //Inicializar 4 estudiantes diferentes.
        Estudiantes estudianteA = new Estudiantes("46557186","Axel","Ovejero","axelovejerogallardo@gmail.com","Bosch1842",2024,80000,"Tec.Programacion");
        Estudiantes estudianteB = new Estudiantes("42123456","Lucía","Pérez","luciaperez@gmail.com","SanMartin123",2025,75000,"Lic.Informatica");
        Estudiantes estudianteC = new Estudiantes("40356789","Mateo","González","mateog@gmail.com","Belgrano456",2023,82000,"Tec.Mecatronica");
        Estudiantes estudianteD = new Estudiantes("39876543","Sofía","Ramírez","sofiaramirez@gmail.com","Rivadavia789",2024,79000,"Lic.Diseño");
        //Inicializar 4 miembros de staff con características diferentes.
        Staff staffA = new Staff("22059193","Blanca","Gallardo","blancagallardo@gmail.com","Bosch1842",300000, Turno.VESPERTINO);
        Staff staffB = new Staff("23123456","Carlos","Fernández","carlosf@gmail.com","SanMartin123",280000, Turno.NOCTURNO);
        Staff staffC = new Staff("24567890","María","López","marialopez@gmail.com","Belgrano456",320000, Turno.NOCTURNO);
        Staff staffD = new Staff("25987654","Javier","Torres","javiertorres@gmail.com","Rivadavia789",310000, Turno.VESPERTINO);
        //Crear un array que permita almacenar juntos los tipos anteriores y almacenar las 8 instancias creadas anteriormente.
        Persona [] arrayPersonas = new Persona[8];
        arrayPersonas[0]=estudianteA;
        arrayPersonas[1]=estudianteB;
        arrayPersonas[2]=estudianteC;
        arrayPersonas[3]=estudianteD;
        arrayPersonas[4]=staffA;
        arrayPersonas[5]=staffB;
        arrayPersonas[6]=staffC;
        arrayPersonas[7]=staffD;
        //Investigar el uso de la palabra reservada instanceof.

        //La palabra reservada instanceof en Java se utiliza para verificar si un objeto es una instancia de una clase específica o de una subclase de esa clase.

        //Recorrer el array y mostrar por pantalla la cantidad de estudiantes y la cantidad de miembros de staff.
        int alumnos = 0;
        int staff = 0;
        for(int i = 0; i < 8; i++){
            if(arrayPersonas[i]instanceof Estudiantes){
                alumnos++;
            }else{
                staff++;
            }
        }

        System.out.println("Alumnos: " + alumnos);
        System.out.println("Staff: " + staff);
        //Recorrer el array y sumar el total de ingresos que percibe la institución por parte de la cuota de estudiantes.

        double ingresosTotalesInstutucion = 0;

        for(int i = 0; i< 8; i++){
            if(arrayPersonas[i] instanceof Estudiantes){
                ingresosTotalesInstutucion = ingresosTotalesInstutucion + ((Estudiantes) arrayPersonas[i]).getCuotaMensual();
            }
        }

        System.out.println("total ingresos de cuotas de alumnos: " + ingresosTotalesInstutucion);


        ///TPn6
        // Modela un sistema que gestione los datos de los empleados de una empresa.
        //Se contará con una clase padre Empleado de la cual no se podrán crear objetos. Cada empleado tiene un nombre y un método calcularPago() que debe ser implementado de manera específica para cada tipo de empleado (utilizando polimorfismo
        //Implementa las siguientes clases hijas de la clase Empleado: EmpleadoTiempoCompleto, EmpleadoPorHoras, EmpleadoAcomision y EmpleadoContratista
        //Los empleados a tiempo completo tienen años de antigüedad y un sueldo básico. En ellos el método calcularPago() debe retornar ese salario mensual más el monto extra que corresponda por antigüedad, el cual será:
        //menos de dos años salario base;
        //de 2 a 5 años: 5% más;
        //de 6 a 10 años: 10% más;
        //de 11 a 15 años: 15% más;
        //y más de 15 años: 20% más.
        //Para los empleados por horas, el método calcularPago() debe retornar un salario calculado según las horas trabajadas y el precio que se le paga la hora a dicho empleado.
        //Los empleados contratistas  son empleados contratados para proyectos específicos (su trabajo comienza y termina con dicho proyecto). el método calcularPago() debe retornar un salario calculado según el número de horas trabajadas y la tarifa por hora asignada a ese proyecto.
        //El pago de los empleados a comisión se obtiene multiplicando la cantidad de clientes captados por la comisión correspondiente a cada tipo de cliente. Si el monto por los clientes captados no llega a un monto mínimo (que es igual para todos los empleados a comisión y asciende a $800.000), el empleado cobrará esta cantidad mínima.
        //Permite al usuario realizar las operaciones necesarias mediante un menú
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Inicializamos empleados
        empleados.add(new EmpleadoTiempoCompleto("Axel", 3, 800000));
        empleados.add(new EmpleadoPorHoras("Blanca", 10, 20000));
        empleados.add(new EmpleadoContratista("Carlos", 50, 15000));
        empleados.add(new EmpleadoAComision("Daniela", 40, TipoCliente.NUEVO));
        empleados.add(new EmpleadoAComision("Elena", 30, TipoCliente.VIP));

        int opcion;
        do {
            System.out.println("\n--- Menú de empleados ---");
            System.out.println("1. Listar empleados");
            System.out.println("2. Calcular pago de todos los empleados");
            System.out.println("3. Salir");
            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nEmpleados registrados:");
                    for (Empleado e : empleados) {
                        System.out.println("- " + e.getClass().getSimpleName() + ": " + e.getNombre());
                    }
                    break;
                case 2:
                    System.out.println("\nPagos de empleados:");
                    for (Empleado e : empleados) {
                        System.out.println(e.getClass().getSimpleName() + " " + e.getNombre()
                                + " → $" + e.calcularPago());
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);

        sc.close();


        Autobus colectivo = new Autobus(45, 60, TipoTransporte.AUTOBUS);
        colectivo.arrancar();
        colectivo.anunciarParada("Plaza Central");
        System.out.println("Capacidad del autobús: " + colectivo.obtenerCapacidad());
        colectivo.detener();

        System.out.println("----------------------------------");

        // 🚋 Tranvía
        Tranvia tranvia = new Tranvia("Ruta Norte-Sur", 80, TipoTransporte.TRANVIA);
        tranvia.arrancar();
        tranvia.cambiarVia(2);
        System.out.println("Capacidad del tranvía: " + tranvia.obtenerCapacidad());
        tranvia.detener();

        System.out.println("----------------------------------");

        // 🚲 Bicicleta
        Bicicleta bici = new Bicicleta(TipoTransporte.BICICLETA);
        bici.arrancar();
        bici.ajustarAsiento(75);
        System.out.println("Capacidad de la bicicleta: " + bici.obtenerCapacidad());
        bici.detener();


        //Hemos tenido una entrevista con un cliente que desea que diseñemos un videojuego
        //para su empresa y nos ha brindado la siguiente información: “En un lejano reino,
        //existe un bosque mágico habitado por criaturas muy especiales. Cada animal tiene
        //habilidades únicas, y algunos incluso poseen más de una destreza sorprendente. Tu
        //misión es adentrarte en este reino y modelar las clases necesarias para representar a
        //estos fascinantes seres.
        //En el juego, el personaje principal conocerá a un pato, un murciélago y un pez. El pato,
        //por ejemplo, no solo camina como cualquier otro animal, sino que también puede volar
        //sobre el agua y nadar bajo ella. El murciélago, por su parte, vuela en la oscuridad y se
        //cuelga boca abajo en cuevas. El pez, aunque no puede volar ni caminar, se mueve con
        //agilidad en las profundidades del océano.
        //Cada una de estas criaturas realiza actividades esenciales como comer y dormir, pero
        //también despliegan sus habilidades únicas dependiendo de la situación en la que se
        //encuentran.
        //Además, te encontrarás con algunas decisiones interesantes. ¿Cómo se comunican estos
        //animales? ¿Qué sonidos emiten cuando están felices o en peligro? Y lo más importante,
        //¿cómo representarías estas criaturas en un programa de manera que puedan mostrar sus
        //habilidades únicas cuando se les llame a la acción?
        //Tu tarea es crear una simulación en la que puedas modelar a estos animales,
        //permitiéndoles comer, dormir, y desplegar sus habilidades especiales como volar, nadar, o
        //cualquier otra que puedas imaginar. Además, considera cómo podrías organizar tu código
        //para que sea fácil de entender y modificar en el futuro.”

        ArrayList<Libro> inventarioLibros = new ArrayList<Libro>();
        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 18999.99, LocalDate.of(1967, 5, 30));
        Libro l2 = new Libro("El principito", "Antoine de Saint-Exupéry", 8999.50, LocalDate.of(1943, 4, 6));
        Libro l3 = new Libro("1984", "George Orwell", 15200.00, LocalDate.of(1949, 6, 8));
        Libro l4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 21000.00, LocalDate.of(1605, 1, 16));
        Libro l5 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 17500.00, LocalDate.of(1997, 6, 26));
        Libro l6 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 28999.00, LocalDate.of(1954, 7, 29));
        Libro l7 = new Libro("Fahrenheit 451", "Ray Bradbury", 13400.00, LocalDate.of(1953, 10, 19));
        Libro l8 = new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 12500.00, LocalDate.of(1981, 3, 10));
        Libro l9 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 16200.00, LocalDate.of(2001, 6, 17));
        Libro l10 = new Libro("El alquimista", "Paulo Coelho", 11800.00, LocalDate.of(1988, 4, 15));

        inventarioLibros.add(l1);
        inventarioLibros.add(l2);
        inventarioLibros.add(l3);
        inventarioLibros.add(l4);
        inventarioLibros.add(l5);
        inventarioLibros.add(l6);
        inventarioLibros.add(l7);
        inventarioLibros.add(l8);
        inventarioLibros.add(l9);
        inventarioLibros.add(l10);



        ///TP N9
        List<Integer> arrayList = new ArrayList<>();
        int cantNums = 10;
        int limitNum = 20;


        for(int i = 0; i<cantNums; i++){
            arrayList.add(generador.nextInt(limitNum));
        }
        System.out.println("Array A: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Array A ordenado: " + arrayList);
        Set<Integer> hashSetUnique = new HashSet<>(arrayList);
        System.out.println("Array A a HashSet: " + hashSetUnique);
        System.out.println("Se eliminaron los duplicados");
        List<Integer> arrayListB = new ArrayList<>(hashSetUnique);
        System.out.println("Array B sin duplicados: " + arrayListB);
        Collections.sort(arrayListB);
        System.out.println("Array B reordenado: " + arrayListB);

        Random generador = new Random();
        int cantNums = 5;
        int limitNum = 50;
        TreeSet<Integer> list = new TreeSet<>();
        for(int i = 0; i<cantNums; i++){
            list.add(generador.nextInt(limitNum));
        }
        System.out.println("Orden Ascendente: " + list);

        Set<Integer> ordenDescendente = ((TreeSet<Integer>)list).descendingSet();

        System.out.println("Orden Descendiente: " + ordenDescendente);


        Persona persona = new Persona("Axel",20,null,'H',60,1.70);

        Persona persona2 = new Persona(persona.getNombre(), persona.getEdad(),null, persona.getSexo(),0,0);

        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2);


        ///TP11 N4

        System.out.println("Num random");
        Random numRandom = new Random();

        int x  = numRandom.nextInt();


        int scan = 0;
        int intentos = 0;

        while(scan != x){
            try {
                System.out.println("Ingrese un numero para ver si es el correcto:");
                intentos++;
                scan = sk.nextInt();
                if(scan != x){
                    System.out.println("Num incorrecto, intentelo de nuevo");
                    if(scan < x){
                        System.out.println("el valor a adivinar es menor al que ingresó");
                    }else{
                        System.out.println("el valor a adivinar es mayor al que ingreso");
                    }
                }
            }catch (InputMismatchException e){
                sk.nextLine();
                e.printStackTrace();
            }
        }

        Excepciones a = new Excepciones();

        a.ADivideB(1,0);
        a.ADivideB(1,3);
        a.ADivideB(3,0);

        System.out.println(a.difCadenaNum("aaa"));

        a.llenarArray(1);
        a.llenarArray(1);
        a.llenarArray(1);
        a.llenarArray(1);
        a.llenarArray(1);
        a.llenarArray(1);


        Persona p3 = new Persona("Martín Gómez", 32, 39456712, "M");
        Persona p4 = new Persona("Sofía Ramírez", 28, 41234567, "F");
        Persona p5 = new Persona("Tomás Herrera", 22, 45123890, "M");

        // Creamos una persona
        Persona p1 = new Persona("Axel Ovejero", 20, 45876123, "M");

        // Creamos una gestora que maneja el archivo
        GestoraJSON gestora = new GestoraJSON("persona.json");

        // Serializamos (guardamos)
        gestora.serializar(p1);

        // Deserializamos (leemos)
        Persona p2 = gestora.deserializar();

        System.out.println("Persona leída desde JSON:");
        System.out.println(p2);

        Curso curso = new Curso("Programación I");
        curso.agregarPersona(p1);
        curso.agregarPersona(p2);

        // Convertimos a JSON y lo guardamos
        GestoraCursoJson gestoraCurso = new GestoraCursoJson("curso.json");
        gestoraCurso.serializacion(curso);

        // Leemos el archivo y reconstruimos el curso
        Curso cursoLeido = gestoraCurso.deserializar();

        System.out.println("Curso leído desde JSON:");
        System.out.println(cursoLeido);
        */

    }
}