import java.util.UUID;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;
import static java.util.UUID.randomUUID;

public class Main {
    public static void main(String[] args) {

        /*///Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com",'M');
        ///Imprima por pantalla al autor previamente instanciado.
        System.out.println(autor1.viendoAutor());
        ///Inicialice el libro “Efective Java” del Autor “Joshua Bloch” que cuesta 450 pesos con una cantidad de 150 copias.
        Libro libro1 = new Libro("Efective Java",autor1,450,150);
        ///Imprima por pantalla el libro instanciado.
        libro1.viendoLIbro();
        ///Modifique el precio del libro “Efective Java” a 500 pesos y aumente la cantidad en 50 copias.
        libro1.setPrecio(500);
        libro1.aumentandoStock(50);
        ///Imprima por pantalla los atributos del Autor Joshua, accediendo desde el Libro “Efective Java”.
        System.out.println();
        ///Agregue un método a la clase Libro que posibilite imprimir en pantalla el siguiente mensaje:
        libro1.viendoAutor();
        ///“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.
        String presentandoLibro = libro1.librito();
        System.out.println(presentandoLibro);*/


        //---Investigue la clase UUID y sus métodos estáticos para la generación de los ids.
        ///CLASE UUID
        //randomUUID();
        //Genera un UUID tipo 4 (aleatorio).
        //Retorna un objeto UUID.

        //nameUUIDFromBytes(byte[] name);
        //Genera un UUID tipo 3 (basado en nombre) aplicando un hash MD5 al arreglo de bytes.
        //El mismo array de bytes siempre produce el mismo UUID.

        //fromString(String name);
        //Convierte una cadena con formato estándar de UUID (ej: "550e8400-e29b-41d4-a716-446655440000") en un objeto UUID.
        //Lanza IllegalArgumentException si el formato no es válido.

        //---Investigue la clase LocalDateTime y sus métodos estáticos para la generación de la fecha.
        ///Clase LocalDateTime
        //now()
        //Devuelve la fecha y hora actual del sistema.

        //now(ZoneId zone)
        //Devuelve la fecha y hora actual en una zona horaria específica.

        //of(int year, int month, int day, int hour, int minute)
        //Crea un LocalDateTime indicando manualmente año, mes, día, hora y minuto.

        //of(int year, int month, int day, int hour, int minute, int second)
        //Igual que el anterior, pero con segundos.

        //of(int year, int month, int day, int hour, int minute, int second, int nanoOfSecond)
        //Versión más detallada, permite especificar nanosegundos.

        //of(int year, int month, int day, int hour, int minute, int second, int nanoOfSecond)
        //Versión más detallada, permite especificar nanosegundos.

        //of(LocalDate date, LocalTime time)
        //Combina un objeto LocalDate y un LocalTime en un LocalDateTime.

        //parse(CharSequence text)
        //Convierte una cadena en formato ISO-8601 a un LocalDateTime.

        //parse(CharSequence text, DateTimeFormatter formatter)
        //Convierte una cadena en un LocalDateTime usando un formato personalizado.



        ///Cree un objeto de tipo Cliente, imprima sus detalles por pantalla.
        /*
        Cliente clienteA = new Cliente(randomUUID(),"Axel","axelovejerogallardo@gmail.com",15);
        System.out.println("Cliente:");
        clienteA.verCliente();

        //Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        Factura facturaA = new Factura(randomUUID(),3000,now(),clienteA);

        System.out.println("Factura:");
        facturaA.verFactura();

        Estudiante e = new Estudiante("46557186","Axel","Ovejero","axelovejerogallardo@gmail.com","Elisa.A Bosch",2024,80.000);
        Estudiante a = new Estudiante("22059193","Blanca","Gallardo","blancagallardo@gmail.com","Elisa A. de Bosch 1842",2024,80.000);
        Estudiante b = new Estudiante("33020442","Aaron","Gallardo","aarongallardo@gmail.com","Elisa A. de Bosch 1842",2024,80.000);
        Estudiante n = new Estudiante("12334124","plin","plin","plinplin@gmail.com","asdqdaaaaxxxx 1232",2024,80.000);

        Staff s1 = new Staff("40111222", "Ana", "Gómez", "ana@mail.com", "Av. Siempreviva 123", 250000, "mañana");
        Staff s2 = new Staff("40222333", "Carlos", "López", "carlos@mail.com", "Calle 45", 300000, "noche");
        Staff s3 = new Staff("40333444", "María", "Pérez", "maria@mail.com", "Ruta 8 km 20", 270000, "mañana");
        Staff s4 = new Staff("40444555", "Luis", "Martínez", "luis@mail.com", "Barrio Centro", 320000, "noche");

        Persona [] p = new Persona[8];
        p[0]=e;
        p[1]=a;
        p[2]=b;
        p[3]=n;
        p[4]=s1;
        p[5]=s2;
        p[6]=s3;
        p[7]=s4;

        int cantEstudiantes = 0;
        int cantStaff = 0;
        double cuotaTotal = 0;

        for (Persona per : p) {
            if (per instanceof Estudiante) {
                Estudiante est = (Estudiante) per;
                cantEstudiantes++;
                cuotaTotal += est.getCuotaMensual();
            } else if (per instanceof Staff) {
                cantStaff++;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de Estudiantes: " + cantEstudiantes);
        System.out.println("Cantidad de Staff: " + cantStaff);
        */
    }
}