/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;

public class Repartidor extends Persona {
    private String NumeroDeVehiculo;
    private ArrayList<Pedido> historialEntregas;
    private int idRepartidor;
    private int estrellas;
    private int reportes;

    public Repartidor(String NumeroDeVehiculo, ArrayList<Pedido> historialEntregas, int idRepartidor, int reportes, String Nombre, String Apellido, String email, int edad, int DocumentoDeIdentidad, String Direccion, int NumeroTelefonico) {
        super(Nombre, Apellido, email, edad, DocumentoDeIdentidad, Direccion, NumeroTelefonico);
        this.NumeroDeVehiculo = NumeroDeVehiculo;
        this.historialEntregas = historialEntregas;
        this.idRepartidor = idRepartidor;
        this.reportes = reportes;
    }
    
    public String recibirCalificación(int estrellas){
        return "Calificacion del repartidor: " + estrellas;
    }
    
    public void entregarPedido(){
        System.out.println("Entregando pedido ...");
    }

    public String getNumeroDeVehiculo() {
        return NumeroDeVehiculo;
    }

    public void setNumeroDeVehiculo(String NumeroDeVehiculo) {
        this.NumeroDeVehiculo = NumeroDeVehiculo;
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
    
    
}