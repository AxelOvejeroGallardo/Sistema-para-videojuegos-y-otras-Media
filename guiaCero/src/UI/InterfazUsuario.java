package UI;

import Excepciones.*;
import Modelo.Expansion;
import Modelo.Juego;
import Modelo.RepositorioImpl;
import Repositorios.Repositorio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InterfazUsuario {

    private Scanner sc;
    private Repositorio repositorio;

    public InterfazUsuario() {
        sc = new Scanner(System.in);
        repositorio = new RepositorioImpl();
    }

    public void iniciar() {

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar Juego");
            System.out.println("2. Agregar Expansion");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Buscar por ID");
            System.out.println("5. Eliminar");
            System.out.println("6. Filtrar por genero");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            try {
                switch (opcion) {
                    case 1 -> agregarJuego();
                    case 2 -> agregarExpansion();
                    case 3 -> mostrarJuego();
                    case 4 -> mostrarExpansion();
                    case 5 -> buscar();
                    case 6 -> eliminar();
                    case 7 -> filtrar();
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opcion invalida");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 0);
    }

    private void validarTitulo(String titulo) throws DatoInvalido {
        if(!titulo.matches("[a-zA-Z0-9 ]+")){
            throw new DatoInvalido("El titulo contiene simbolos no permitidos");
        }
    }
    private void validarNombre(String nombre) throws DatoInvalido {
        if(!nombre.matches("[\\p{L} ]+")){
            throw new DatoInvalido("El nombre solo puede contener letras y espacios");
        }
    }
    private void validarGenero(String genero) throws DatoInvalido {
        if(!genero.matches("[\\p{L} ]+")){
            throw new DatoInvalido("El Genero solo puede contener letras y espacios");
        }
    }
    private void validarVersion(String version) throws DatoInvalido,VersionInvalidaException{
        if (version == null || !version.matches("\\d+(\\.\\d+)*")) {
            throw new DatoInvalido("Formato inválido: use formato tipo 1, 1.2 o 1.2.3");
        }

        // Validar que no sea 0 o 0.0 o 0.0.0
        String[] partes = version.split("\\.");

        boolean esCero = true;

        for (String parte : partes) {
            if (Integer.parseInt(parte) != 0) {
                esCero = false;
                break;
            }
        }

        if (esCero) {
            throw new VersionInvalidaException("La versión no puede ser 0");
        }
    }

    private LocalDate validarFecha(String fecha) throws FechaException{

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate fechaDate;

        try {
            fechaDate = LocalDate.parse(fecha, formatter);
            LocalDate fechaMinima = LocalDate.of(1958, 1, 1);

            // 🔴 Validar que no sea anterior
            if (fechaDate.isBefore(fechaMinima)) {
                throw new FechaException("La fecha no puede ser anterior a 1958");
            }

            return fechaDate;

        } catch (DateTimeParseException e) {
            throw new FechaException("Formato inválido. Use yyyy-MM-dd");
        }

        // 🎮 Primer videojuego funcional (Tennis for Two - 1958)

    }
    private void agregarJuego() throws VersionInvalidaException, IdentificadorDuplicadoException,DatoInvalido {


        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        validarTitulo(titulo);

        System.out.print("Creador: ");
        String creador = sc.nextLine();
        validarNombre(creador);

        System.out.print("Genero: ");
        String genero = sc.nextLine();
        validarGenero(genero);

        System.out.print("Version: ");
        String version = sc.nextLine();
        sc.nextLine();
        validarVersion(version);

        Juego juego = new Juego(titulo, creador, genero, version);
        repositorio.agregar(juego);

        System.out.println("Juego agregado correctamente");
    }

    private void agregarExpansion() throws FechaException, IdentificadorDuplicadoException, DatoInvalido {

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        validarTitulo(titulo);

        System.out.print("Creador: ");
        String creador = sc.nextLine();
        validarNombre(creador);

        System.out.print("Genero: ");
        String genero = sc.nextLine();
        validarGenero(genero);

        System.out.print("Fecha (YYYY-MM-DD): ");
        String fechaStr = sc.nextLine();

        LocalDate fecha = validarFecha(fechaStr);

        Expansion expansion = new Expansion(titulo, creador, genero, fecha);
        repositorio.agregar(expansion);

        System.out.println("Expansion agregada correctamente");
    }

    private void buscar() throws ElementoNoEncontradoException {
        mostrarJuego();
        mostrarExpansion();
        System.out.print("Ingrese ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println(repositorio.buscar(id));
    }

    private void eliminar() throws ElementoNoEncontradoException {
        mostrarExpansion();
        mostrarJuego();
        System.out.print("Ingrese ID a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        repositorio.eliminar(id);
        System.out.println("Eliminado correctamente");
    }

    private void mostrarJuego(){
        repositorio.mostrar();
    }
    private void mostrarExpansion(){
        repositorio.mostrar();
    }
    private void filtrar() {
        System.out.print("Genero: ");
        String genero = sc.nextLine();

        repositorio.filtrarPorGenero(genero)
                .forEach(System.out::println);
    }
}
