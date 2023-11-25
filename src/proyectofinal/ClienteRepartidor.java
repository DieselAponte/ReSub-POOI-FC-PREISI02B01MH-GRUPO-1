package programacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteRepartidor {
    private Cliente cliente;
    private Repartidor repartidor;
    private ArrayList<Repartidor> repartidoresDisponibles;

    public ClienteRepartidor(Cliente cliente, Repartidor repartidor) {
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.repartidoresDisponibles = cargarRepartidoresDesdeArchivo("Repartidores.txt");
    }
    
    private ArrayList<Repartidor> cargarRepartidoresDesdeArchivo(String nombreArchivo) {

        ArrayList<Repartidor> repartidores = new ArrayList<>();

        try {
            // Crear un objeto Scanner para leer el archivo
            Scanner scanner = new Scanner(new File(nombreArchivo));

            // Ignorar la primera línea (encabezados)
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Leer cada línea del archivo
            while (scanner.hasNextLine()) {
                // Obtener la línea actual
                String linea = scanner.nextLine();

                // Dividir la línea en campos utilizando la coma como separador
                String[] campos = linea.split(",");

                // Crear un objeto Repartidor con la información de la línea
                String nombre = campos[0];
                int documentoDeIdentidad = Integer.parseInt(campos[1]);
                int edad = Integer.parseInt(campos[2]);
                String numeroDeVehiculo = campos[3];

                // Crear el objeto Repartidor y agregarlo a la lista
                Repartidor repartidor = new Repartidor(nombre, documentoDeIdentidad, 0, 0, numeroDeVehiculo, new ArrayList<>(), 0);
                repartidores.add(repartidor);
            }

            // Cerrar el Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado");
            e.printStackTrace();
        }

        return repartidores;
    }

    public void mostrarRepartidores() {

        for (Repartidor repartidor : repartidoresDisponibles) {
            System.out.println("Repartidor: " + repartidor.getNombre() +
                    ", Estrellas: " + repartidor.getEstrellas() +
                    ", Reportes: " + repartidor.getReportes());
        }
    }

    public void calificarRepartidor(Repartidor repartidor, int calificacion) {

        repartidor.recibirCalificacion(calificacion);
    }

    public void seleccionarRepartidor() {

        if (!repartidoresDisponibles.isEmpty()) {
            this.repartidor = repartidoresDisponibles.get(0);
        }
    }

    public void añadirRepartidor(Repartidor nuevoRepartidor) {

        repartidoresDisponibles.add(nuevoRepartidor);
    }

    public void eliminarRepartidor(Repartidor repartidorRemovido) {

        repartidoresDisponibles.remove(repartidorRemovido);
    }

    public void limiteReportes(Repartidor repartidor) {

        if (repartidor.getReportes() >= 3) {
            System.out.println("Repartidor con demasiados reportes. Acción tomada: Vetar al repartidor.");


            repartidor.aumentarReporte();
            eliminarRepartidor(repartidor);


        }
    }

    public void comentarioIncidente() {

        System.out.println("Se ha registrado un comentario de incidente por parte del cliente.");
    }
}
