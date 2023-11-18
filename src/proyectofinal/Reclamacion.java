
package proyectofinal;


public class Reclamacion {

    private int idReclamacion;
    private String descripcion;
    private String estado;

    public Reclamacion(int idReclamacion, String descripcion, String estado) {
        this.idReclamacion = idReclamacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public void cambiarEstado(){
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
