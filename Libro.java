public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    public boolean esAntiguo() {
        int añoActual = 2025;
        return (añoActual - añoPublicacion) > 20;
    }

    public String getInformacion() {
        return "Título: " + titulo + "Autor: " + autor + " Año de publicación: " + añoPublicacion + " Número ISBN: " + isbn;
    }

    public String getTitulo() {
        return titulo;
    }
   
    public String toString() {
        return "Información de tu libro: Título=" + titulo + " Autor=" + autor + " Año de Publicación=" + añoPublicacion + " ISBN=" + isbn;
    }
}
