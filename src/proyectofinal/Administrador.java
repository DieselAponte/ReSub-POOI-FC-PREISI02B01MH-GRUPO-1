package proyectofinal;

import java.util.Scanner;
import java.util.ArrayList;

public class Administrador extends Persona {

    private ArrayList<Repartidor> repartidores;

    public Administrador(ArrayList<Repartidor> repartidores, String Nombre, String Apellido, String email, int edad, int DocumentoDeIdentidad, String Direccion, int NumeroTelefonico) {
        super(Nombre, Apellido, email, edad, DocumentoDeIdentidad, Direccion, NumeroTelefonico);
        this.repartidores = repartidores;
    }

    public void mostrarRepartidores(ArrayList<Repartidor> repartidores) {
        System.out.println("Los repartidores contratados son:");
        for (Repartidor repartidor : repartidores) {
            System.out.println("Nombre: " + repartidor.getNombre() + ", DNI: " + repartidor.getDocumentoDeIdentidad());
        }
    }

    public void eliminarRepartidor(ArrayList<Repartidor> repartidores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la posición que quiere eliminar: ");
        int posicionEliminar = scanner.nextInt();

        if (posicionEliminar >= 0 && posicionEliminar < repartidores.size()) {
            repartidores.remove(posicionEliminar);
            System.out.println("Repartidor eliminado con éxito ");
        } else {
            System.out.println("Repartidor no encontrado");
        }
    }

    public void añadirRepartidor(ArrayList<Repartidor> repartidores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del nuevo repartidor:");

        System.out.print("Número de Vehículo: ");
        String nuevoNumeroDeVehiculo = scanner.next();

        ArrayList<Pedido> nuevoHistorialEntregas = new ArrayList<>();

        System.out.print("ID de Repartidor: ");
        int nuevoIdRepartidor = scanner.nextInt();

        System.out.print("Reportes: ");
        int nuevosReportes = scanner.nextInt();

        System.out.print("Nombre: ");
        String nuevoNombre = scanner.next();

        System.out.print("Apellido: ");
        String nuevoApellido = scanner.next();

        System.out.print("Email: ");
        String nuevoEmail = scanner.next();

        System.out.print("Edad: ");
        int nuevaEdad = scanner.nextInt();

        System.out.print("Documento de Identidad: ");
        int nuevoDocumentoDeIdentidad = scanner.nextInt();

        System.out.print("Dirección: ");
        String nuevaDireccion = scanner.next();

        System.out.print("Número Telefónico: ");
        int nuevoNumeroTelefonico = scanner.nextInt();

        Repartidor nuevoRepartidor = new Repartidor(
                nuevoNumeroDeVehiculo, nuevoHistorialEntregas, nuevoIdRepartidor, nuevosReportes,
                nuevoNombre, nuevoApellido, nuevoEmail, nuevaEdad, nuevoDocumentoDeIdentidad, nuevaDireccion, nuevoNumeroTelefonico
        );

        repartidores.add(nuevoRepartidor);

        System.out.println("Nuevo repartidor registrado con éxito:");
        System.out.println("Nombre: " + nuevoRepartidor.getNombre());
        System.out.println("Número de Vehículo: " + nuevoRepartidor.getNumeroDeVehiculo());
        System.out.println("Numero telefonico: "+ nuevoRepartidor.getNumeroTelefonico());
        System.out.println("Dirección: "+ nuevoRepartidor.getDireccion());
        
    }

}
