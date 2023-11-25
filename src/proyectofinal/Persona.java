package programacion;
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private int documentoDeIdentidad;
    private String direccion;
    private int numeroTelefonico;

    // Constructor
    public Persona(String nombre, String apellido, String email, int edad, int documentoDeIdentidad, String direccion, int numeroTelefonico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public int getDocumentoDeIdentidad() {
        return documentoDeIdentidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumentoDeIdentidad(int documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
}
