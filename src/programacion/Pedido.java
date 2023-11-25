package programacion;

public class Pedido {
    private int idPedido;
    private String descripcionDelPedido;
    private String estado;

    public Pedido(int idPedido, String descripcionDelPedido, String estado) {
        this.idPedido = idPedido;
        this.descripcionDelPedido = descripcionDelPedido;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescripcionDelPedido() {
        return descripcionDelPedido;
    }

    public void setDescripcionDelPedido(String descripcionDelPedido) {
        this.descripcionDelPedido = descripcionDelPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String estado) {
           this.estado = estado;
    }
}
