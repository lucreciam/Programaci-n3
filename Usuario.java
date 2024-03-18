public class Usuario {
    // Atributos
    private String nombre;
    private int id;
    private static int contadorID = 1; // Contador estático para asignar ID automáticamente

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = contadorID; // Asigna un ID único automáticamente
        contadorID++; // Incrementa el contador para el próximo usuario
    }

    // Métodos para obtener el nombre y el ID del usuario
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
