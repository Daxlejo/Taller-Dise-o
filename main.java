import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el título de la publicación:");
            String titulo = sc.nextLine();

            System.out.println("Ingrese el precio de la publicación:");
            double precio = Double.parseDouble(sc.nextLine().replace(",", "."));
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }

            System.out.println("Seleccione el tipo de publicación (1: Libro, 2: Video, 3: Disco):");
            int tipoPublicacion = sc.nextInt();
            sc.nextLine(); 

            Publicacion publicacion;

            switch (tipoPublicacion) {
                case 1:
                    System.out.println("Ingrese el año de publicación:");
                    int anioPublicacion = sc.nextInt();

                    System.out.println("Ingrese el número de páginas:");
                    int numPaginas = sc.nextInt();
                    sc.nextLine();

                    publicacion = new Libro(titulo, precio, anioPublicacion, numPaginas);
                    break;

                case 2:
                    System.out.println("Ingrese la duración en horas:");
                    float duracionHoras = sc.nextFloat();
                    sc.nextLine(); // Consumir el salto de línea

                    System.out.println("Seleccione el idioma (1: Español, 2: Inglés, 3: Portugués):");
                    int idiomaSeleccionado = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea

                    Video.Idioma idioma;
                    switch (idiomaSeleccionado) {
                        case 1:
                            idioma = Video.Idioma.ESPANOL;
                            break;
                        case 2:
                            idioma = Video.Idioma.INGLES;
                            break;
                        case 3:
                            idioma = Video.Idioma.PORTUGUES;
                            break;
                        default:
                            throw new IllegalArgumentException("Idioma no válido");
                    }

                    publicacion = new Video(titulo, precio, duracionHoras, idioma);
                    break;

                case 3:
                    System.out.println("Ingrese la duración en minutos:");
                    float duracionMinutos = sc.nextFloat();
                    sc.nextLine(); 

                    publicacion = new Disco(titulo, precio, duracionMinutos);
                    break;

                default:
                    throw new IllegalArgumentException("Tipo de publicación no válido");
            }

            System.out.println("\nDetalles de la publicación:");
            System.out.println(publicacion.toString());
            
        } finally {
            sc.close();
        }
    }
}
