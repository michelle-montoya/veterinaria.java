import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Mascota> mascotas = new ArrayList<>();
        ArrayList<Cita> citas = new ArrayList<>();

        System.out.print("Cuantas mascotas desea registrar");
        Integer nMascotas = sc.nextInt();
        sc.nextLine();

        for (Integer i = 0; i < nMascotas; i++) {
            System.out.println("/nRegitro de mascota " + (i+1));
            System.out.print("Fecha (dd-mm-aaaa):");
            String fecha = sc.nextLine();
            System.out.print("Hora: ");
            String hora = sc.nextLine();
            System.out.print("Motivo: ");
            String motivo = sc.nextLine();

            System.out.println("Seleccione la mascota registrada");
            for (Integer j = 0;j < mascotas.size(); j++){
                Mascota m = mascotas.get(j);
                System.out.println((j+1) + "." + m.nombre + "(" + m.tipoAnimal + ")");
            }

            Integer opcion = sc.nextInt();
            sc.nextLine();

            Mascota mascotaSeleccionada = mascotas.get(opcion - 1);
            citas.add(new Cita (fecha, hora, motivo, mascotaSeleccionada ));
            }

            System.out.println("/n=== Listado de citas ===");
            for (Cita c : citas) {
                System.out.println("Cita para" + c.mascota.nombre + "(" + c.mascota.tipoAnimal + ") el" + c.fecha + "a las " + c.hora + "por" + c.motivo + ".");
            }
        }
    }
