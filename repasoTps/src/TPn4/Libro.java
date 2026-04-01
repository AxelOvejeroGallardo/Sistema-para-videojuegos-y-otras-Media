package TPn4;

public class Libro {
    public static int idContador = 0;
    public int id;
    public String titulo;
    public String autor;
    public double precio;
    public int cantidadDisponible;

    public Libro(String titulo, String autor, double precio, int cantidadDisponible) {
        idContador++;
        this.id = idContador;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    public String vender(int cantPedido){
        String mensaje;

        if(cantidadDisponible<cantPedido){
            mensaje = "No hay suficientes libros";
        }else {
            mensaje = "Venta exitosa";
            cantidadDisponible--;
        }
        return mensaje;
    }

    public void aumentarCantidadCopias(int cantidadAumentar){
        cantidadDisponible = cantidadDisponible + cantidadAumentar;
    }

    public String caractristicasLibro() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}
