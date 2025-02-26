public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        Autor autor1 = new Autor(1, "George Orwell", "GeorgeORwell@gmail.com");
        Autor autor2 = new Autor(2, "Gabriel García Márquez", "GarciaMarquez@gmail.com");
        Autor autor3 = new Autor(3, "Harper Lee", "ToKill@uabc.edu.mx");
        /*
         libro1.setEsPrestado(true);
        libro2.setEsPrestado(true);
        libro3.setEsPrestado(false);
         */
        Libro libro1 = new Libro("1984", autor1, 1949, "9780451524935");
        Libro libro2 = new Libro("Cien años de soledad", autor2, 1967, "9780307474728");
        Libro libro3 = new Libro("To Kill a Mockingbird", autor3, 1960, "9780061120084");
        /*
        libro1.setEsPrestado(true);
        libro2.setEsPrestado(true);
        libro3.setEsPrestado(false);
        */
       
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        
        libro1.setEsPrestado(true);
        libro2.setEsPrestado(true);
        libro3.setEsPrestado(false);

        System.out.println("Lista");
        for (Libro libro : biblioteca.obtenerLibros()) {
            System.out.println(libro.obtenerInformacion());
        }

        String tituloBuscado = "1984";
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscado);
        if (libroEncontrado == null) {
            System.out.println("\nEse libro no existe");
        } else {
            System.out.println(libroEncontrado.obtenerInformacion());
        }
        /*
        System.out.println("\nLibros prestados");
        for (Libro libro : biblioteca.obtenerLibrosPrestados()) {
            System.out.println(libro.obtenerInformacion());
        }
        */
        System.out.println("\nLibros no prestados");
        for (Libro libro : biblioteca.obtenerLibrosNoPrestados()) {
            System.out.println(libro.obtenerInformacion());
        }
    }
}
