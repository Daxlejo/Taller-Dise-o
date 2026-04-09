public class Libro extends Publicacion {
    private int anioPublicacion;
    private int numPaginas;

    public Libro() {
    }

    public Libro(int anioPublicacion, int numPaginas) {
        this.anioPublicacion = anioPublicacion;
        this.numPaginas = numPaginas;
    }

    public Libro(String titulo, double precio, int anioPublicacion, int numPaginas) {
        super(titulo, precio);
        this.anioPublicacion = anioPublicacion;
        this.numPaginas = numPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String toString() {
        return super.toString() + "\nAño de Publicación: " + this.anioPublicacion + "\nNúmero de Páginas: " + this.numPaginas;
    }
}
