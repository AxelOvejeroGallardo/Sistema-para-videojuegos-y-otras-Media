import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        /*///Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
        Empleado empleadoA = new Empleado(25000,"Gutiérrez","Carlos","23456345 ");
        ///Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        Empleado empleadoB = new Empleado(27500,"Sánchez","Ana","34234123");

        ///Imprima ambos objetos por pantalla.
        String emplA = empleadoA.verEmpleado();
        System.out.println(emplA);
        String emplB = empleadoB.verEmpleado();
        System.out.println(emplB);

        ///Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
        double aumento = 15;

        empleadoA.aumentoSalario(aumento);

        String emplc= empleadoA.verEmpleado();
        System.out.println(emplc);


        //Inicialice una cuenta con un monto inicial de 15000.
        CuentaBanco cuentaA = new CuentaBanco(1,"Axel",15000);
        //Realice una operación de crédito de 2500.
        cuentaA.depositarDinero(2500);
        cuentaA.viendoCuentaBanco();
        System.out.println("...");
        cuentaA.extraccionDinero(1500);
        cuentaA.viendoCuentaBanco();
        System.out.println("...");
        cuentaA.extraccionDinero(30000);
        cuentaA.viendoCuentaBanco();
        System.out.println("...");

        int opcion = 0;
        int i = 1;
        ItemVenta itemVenta = null;
        do{
            System.out.println("1.Agregar Item");
            System.out.println("2.Ver Item");
            System.out.println("3.Actualizar Cantidad Item");
            System.out.println("4.Actualizar Precio Unidad");
            System.out.println("5.Ver Precio Total");
            System.out.println("6.Salir");
            opcion = sk.nextInt();

            switch (opcion){
                case 1:
                        ///Agregar ítem: Inicializa un objeto ItemVenta con valores proporcionados por el usuario.
                        System.out.println("Ingrese la descripcion del item:");
                        sk.nextLine();
                        String descripcion = sk.nextLine();
                        System.out.println("Ingrese la cantidad del item:");
                        int cantidadItem = sk.nextInt();
                        System.out.println("Precio unitario:");
                        double precioUnidad = sk.nextDouble();
                        itemVenta = new ItemVenta(i,descripcion,cantidadItem,precioUnidad);
                        i++;
                    break;
                case 2: ///Imprime el objeto usando el método correspondiente.
                        if (itemVenta != null) {
                            String ver  = itemVenta.verItem();
                            System.out.println(ver);
                        } else {
                            System.out.println("Primero debe agregar un ítem.");
                        }
                    break;
                case 3: ///Permite al usuario ingresar una nueva cantidad y actualiza el atributo cantidad del ítem de venta.
                        System.out.println("Ingrese una nueva cantidad de unidades del item:");
                        itemVenta.setCantidad(sk.nextInt());
                    break;
                case 4: //Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo precioUnitario del ítem de venta.
                        System.out.println("Ingrese el nuevo precio por unidad:");
                        itemVenta.setPrecioUnidtario(sk.nextDouble());
                    break;
                case 5: ///Imprime el precio total calculado por el método calcularPrecioTotal().
                        double precioTotal = itemVenta.calcularPrecioTotal();
                        System.out.println("Precio Total:" + precioTotal);
                    break;
                case 6:
                        System.out.println("Adios...");
                    break;
                default:
                        System.out.println("Opcion Incorrecta, intente de nuevo");
                    break;
            }
        }while(opcion != 6);
        */
    }
}