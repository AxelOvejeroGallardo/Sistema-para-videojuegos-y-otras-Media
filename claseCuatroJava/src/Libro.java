public class Libro {
    private static int contadorId = 0;

    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private int cantCopias;

    public Libro(String titulo, String autor, double precio, int cantCopias) {
        this.id = ++contadorId;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantCopias = cantCopias;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Libro.contadorId = contadorId;
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

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    public int vendiendoLibro(int cantLibros){

        if(cantCopias > cantLibros)
        {
            cantCopias = cantCopias - cantLibros;

        }else{
            System.out.println("cantidad de insuficiente de libros...");
        }
        return cantCopias;
    }

    public int agregandoLibros(int nuevosLibros){

        cantCopias = cantCopias + nuevosLibros;

        return cantCopias;
    }

    public void verDetalleLibro(){
        System.out.println("Libro [id]=" + id + "título =" +titulo+"autor="+autor+"precio=" + precio+"copias disponibles=" + cantCopias);

    }

}
