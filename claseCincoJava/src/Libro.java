import javax.lang.model.element.NestingKind;

public class Libro {
    private String titulo;
    private Autor autor;
    private double precio;
    private int stock;


    public Libro(String titulo, Autor autor, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void viendoLIbro(){
        System.out.println("libro: "+ titulo +
                "autor: " + autor.viendoAutor() +
                "stock: " + stock +
                "precio: " + precio);
    }

    public int aumentandoStock(int newStock){
        stock =+ newStock;
        return  stock;
    }

    public void viendoAutor(){
        System.out.println(autor.viendoAutor());
    }

    public String librito(){
           return("El libro" + titulo + " de " + autor.getNombre() + ". Se vende a " + precio + " pesos.");
    }
}
