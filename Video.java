public class Video extends Publicacion {

    private float duracionHoras;
    private Idioma idioma;

    public enum Idioma {
        ESPANOL,
        INGLES,
        PORTUGUES
    }

    public Video() {
    }

    public Video(float duracionHoras, Idioma idioma) {
        this.duracionHoras = duracionHoras;
        this.idioma = idioma;
    }

    public Video(String titulo, double precio, float duracionHoras, Idioma idioma) {
        super(titulo, precio);
        this.duracionHoras = duracionHoras;
        this.idioma = idioma;
    }

    public float getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(float duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public String toString() {
        return super.toString() + "\nDuración (horas): " + this.duracionHoras + "\nIdioma: " + this.idioma;
    }
}