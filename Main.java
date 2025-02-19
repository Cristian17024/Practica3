public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        Libro libro1 = new Libro("1984", "George Orwell", 1949, "9780451524935");
        Libro libro2 = new Libro("Cien años de soledad", "garcia Marquez", 1967, "9780307474728");
        Libro libro3 = new Libro("To Kill a Mockingbird", "Harper Lee", 1960, "9780061120084");
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Estos son tus libros:");
        biblioteca.mostrarLibros();

        String tituloBuscado = "1984";
        System.out.println("Este es tu libro: " + tituloBuscado);
        biblioteca.buscarLibroPorTitulo(tituloBuscado);
    }
}
