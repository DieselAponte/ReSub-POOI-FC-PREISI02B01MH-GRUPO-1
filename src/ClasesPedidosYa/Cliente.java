package programacion;
import java.util.List;

public class Cliente extends Persona {
    private List<Pedido> historialPedidos;
    private List<Reclamacion> reclamos;

    // Constructor
    public Cliente(String nombre, String apellido, String email, int edad, int documentoDeIdentidad, String direccion, int numeroTelefonico, List<Pedido> historialPedidos, List<Reclamacion> reclamos) {
        super(nombre, apellido, email, edad, documentoDeIdentidad, direccion, numeroTelefonico);
        this.historialPedidos = historialPedidos;
        this.reclamos = reclamos;
    }

    // Métodos para obtener el historial de pedidos y reclamos
    public List<Pedido> getHistorialPedidos() {
        return historialPedidos;
    }

    public List<Reclamacion> getReclamos() {
        return reclamos;
    }
    
    public void addPedido(Pedido pedido) {
        historialPedidos.add(pedido);
    }
    
    public void addReclamo(Reclamacion reclamo) {
        reclamos.add(reclamo);
    }
}
