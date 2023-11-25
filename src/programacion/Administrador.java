package programacion;


public class Administrador extends Persona {
    private String contraseña;

    public Administrador(String nombre, String apellido, String contraseña) {
        super(nombre, apellido, "", 0, 0, "", 0);
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean iniciarSesion(int id, String contraseña) {
        return this.contraseña.equals(contraseña);
     
    }
}

