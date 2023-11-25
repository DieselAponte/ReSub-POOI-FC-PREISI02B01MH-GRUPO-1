package programacion;
import java.util.ArrayList;

public class Repartidor extends Persona {
    private String numeroDeVehiculo;
    private ArrayList<Pedido> historialEntregas;
    private int idRepartidor;
    private int estrellas;
    private int reportes;

    public Repartidor(String nombre, int documentoDeIdentidad, int estrellas, int reportes,
                      String numeroDeVehiculo, ArrayList<Pedido> historialEntregas, int idRepartidor) {
        super(nombre, "", "", 0, documentoDeIdentidad, "", 0);
        this.numeroDeVehiculo = numeroDeVehiculo;
        this.historialEntregas = historialEntregas;
        this.idRepartidor = idRepartidor;
        this.estrellas = estrellas;
        this.reportes = reportes;
    }

    public String getNumeroDeVehiculo() {
        return numeroDeVehiculo;
    }

    public void setNumeroDeVehiculo(String numeroDeVehiculo) {
        this.numeroDeVehiculo = numeroDeVehiculo;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getReportes() {
        return reportes;
    }

    public void setReportes(int reportes) {
        this.reportes = reportes;
    }

    public void recibirCalificacion(int calificacion) {
        this.estrellas = (this.estrellas + calificacion) / 2;
    }

    public void aumentarReporte() {
        // Aumentar el contador de reportes
        this.reportes++;
    }

    public ArrayList<Pedido> getHistorialEntregas() {
        return historialEntregas;
    }

    public void entregarPedido() {
        // Implementar lógica para entregar pedido
        if (!historialEntregas.isEmpty()) {
            Pedido pedidoActual = historialEntregas.get(0);
            pedidoActual.cambiarEstado("Entregado");
            historialEntregas.remove(0);
        }
    }
}

