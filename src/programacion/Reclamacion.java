package programacion;

public class Reclamacion {
    private String descripcionDeReclamo;
    private String estado;

    public Reclamacion(String descripcionDeReclamo, String estado) {
        this.descripcionDeReclamo = descripcionDeReclamo;
        this.estado = estado;
    }

    public String getDescripcionDeReclamo() {
        return descripcionDeReclamo;
    }

    public void setDescripcionDeReclamo(String descripcionDeReclamo) {
        this.descripcionDeReclamo = descripcionDeReclamo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void cambiarEstado(String estado) {
        // Implementar lógica para cambiar estado
    }
}
