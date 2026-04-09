public class Publicacion {
    private String titulo;
    private double precio;

    public Publicacion() {
    }

    public Publicacion(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Titulo: " + this.titulo + "\nPrecio: " + String.format("%.3f", this.precio);
    }

}