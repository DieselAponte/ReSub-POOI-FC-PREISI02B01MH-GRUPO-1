package proyectofinal;

public class Pedido {

    private int idPedido;
    private String descripcion;
    private String estado;

    public Pedido(int idPedido, String descripcion, String estado) {
        this.idPedido = idPedido;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   public void CambiarEstado(){
       
   }
}