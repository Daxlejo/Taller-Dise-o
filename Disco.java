public class Disco extends Publicacion {
    private float duracionMinutos;

    public Disco() {
    }

    public Disco(float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Disco(String titulo, double precio, float duracionMinutos) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public float getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String toString() {
        return super.toString() + "\nDuración (minutos): " + this.duracionMinutos;
    }
    
}
