package TPn5.n1;

import TPn5.n1.Autor;

public class LibroCinco{
    public String titulo;
    public double precio;
    public int stock;
    public Autor autor;

    public LibroCinco(Autor autor, String titulo, double precio, int stock) {
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
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

    public void sumandoStock(int num){
        stock = stock + num;
    }
    public String caractristicasLibroA() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

    public String presentandoLibro(){
        return "El libro {título}" + titulo +
                " de {nombre del autor} " + autor.getNombre() + autor.getApellido() +
                " se vende a {precio} " + precio;
    }
}
