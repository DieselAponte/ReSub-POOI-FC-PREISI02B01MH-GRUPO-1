package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona {

    private ArrayList<Pedido> historialPedidos;

    public Cliente(ArrayList<Pedido> historialPedidos, String Nombre, String Apellido, String email, int edad, int DocumentoDeIdentidad, String Direccion, int NumeroTelefonico) {
        super(Nombre, Apellido, email, edad, DocumentoDeIdentidad, Direccion, NumeroTelefonico);
        this.historialPedidos = historialPedidos;
    }

    public void mostrarRepartidoresDisponibles(ArrayList<Repartidor> repartidores) {
        System.out.println("Repartidores disponibles:");
        for (Repartidor repartidor : repartidores) {
            System.out.println("Nombre: " + repartidor.getNombre() + ", DNI: " + repartidor.getDocumentoDeIdentidad());
        }
    }

    public void seleccionarRepartidor(ArrayList<Repartidor> repartidores) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la posición del repartidor que desea seleccionar:");
        int posicionSeleccionar = scanner.nextInt();

        if (posicionSeleccionar >= 0 && posicionSeleccionar < repartidores.size()) {
            Repartidor repartidorSeleccionado = repartidores.get(posicionSeleccionar);

            System.out.println("Datos actuales del repartidor seleccionado:");
            System.out.println("Nombre: " + repartidorSeleccionado.getNombre());
            System.out.println("DNI: " + repartidorSeleccionado.getDocumentoDeIdentidad());
        }
    }

    public void reportarRepartidor(ArrayList<Repartidor> repartidores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, escriba su comentario sobre la experiencia con el repartidor:");
        String comentario = scanner.nextLine();

        System.out.println("Se ha reportado la experiencia con el repartidor. ");
        System.out.println("Descripcion: " + comentario);
    }

    public void gestionarIncidente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, describa el incidente o problema:");
        String comentario = scanner.nextLine();
        System.out.println("El incidente ha sido registrado: " + comentario);
    }

    public void CalificarRepartidor(ArrayList<Repartidor> repartidores) {
        Scanner scanner = new Scanner(System.in);

        int calificacion;

        do {
            System.out.println("Ingrese el número de estrellas que merece el repartidor (1-5):");
            calificacion = scanner.nextInt();

            if (calificacion >= 1 && calificacion <= 5) {
                System.out.print("Calificación del repartidor: ");
                for (int i = 0; i < calificacion; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("La calificación debe estar en el rango de 1 a 5. Inténtelo nuevamente.");
            }
        } while (calificacion < 1 || calificacion > 5);
    }
}

