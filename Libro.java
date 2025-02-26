public class Libro {
    private String titulo;
    private Autor autor;
    private int añoPublicacion;
    private String isbn;
    private boolean esPrestado;

    public Libro(String titulo, Autor autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.esPrestado = esPrestado; 
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isPrestado() {
        return esPrestado;
    }

    public void setEsPrestado(boolean prestado) {
        this.esPrestado = prestado;
    }

    public boolean esAntiguo() {
        int añoActual = 2025;
        return (añoActual - añoPublicacion) > 20;
    }

    public String obtenerInformacion() {
        return "Título: " + titulo + " Autor: " + autor.getNombre() + " Año de publicación: " + añoPublicacion + " ISBN: " + isbn + " Está prestado?: " + esPrestado;
    }
}
