
package proyectofinal;


public class Persona {
    private String Nombre;
    private String Apellido;
    private String email;
    private int edad;
    private int DocumentoDeIdentidad;
    private String Direccion;
    private int NumeroTelefonico;

    public Persona(String Nombre, String Apellido, String email, int edad, int DocumentoDeIdentidad, String Direccion, int NumeroTelefonico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.email = email;
        this.edad = edad;
        this.DocumentoDeIdentidad = DocumentoDeIdentidad;
        this.Direccion = Direccion;
        this.NumeroTelefonico = NumeroTelefonico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumentoDeIdentidad() {
        return DocumentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(int DocumentoDeIdentidad) {
        this.DocumentoDeIdentidad = DocumentoDeIdentidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNumeroTelefonico() {
        return NumeroTelefonico;
    }

    public void setNumeroTelefonico(int NumeroTelefonico) {
        this.NumeroTelefonico = NumeroTelefonico;
    }
    
}
