package EmpresaCamiones;

import java.util.LinkedList;
import java.util.Scanner;

public class Camiones {


    public static String entradaString(Scanner in, String campo){
        System.out.print("Ingrese "+campo+": ");
        String salida = in.nextLine();
        return salida;
    }

    public static int tipoCarga(Scanner in){
        System.out.println("Tipo de carga: ");
        System.out.println("-Madera (1) ");
        System.out.println("-Yerba (2) ");
        System.out.println("-Té (3) ");
        System.out.print("--Opcion: ");
        try {
            int tipo = in.nextInt();
            if (tipo <= 3 && tipo >= 1){
                in.nextLine();
                return tipo;
            }else {
                System.out.println("Opcion fuera del rango!");
                in.nextLine();
                return 404;
            }
        }catch (Exception e){
            System.out.println("Entrada no valida!");
            in.nextLine();
            return 404;
        }
    }

    public static void mostrarDatosCamiones(LinkedList<Camion> camiones){
        for (Camion c: camiones) {
            c.mostrarDatos();
        }
    }
    public static void empresaCamionera(Scanner in){
        LinkedList<Camion> camiones = new LinkedList<>();
        int cargaronTe = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("");
            System.out.println("---CAMION--N°--"+(i+1));
            String nombre = entradaString(in, "nombre del chofer");
            String apellido = entradaString(in, "apellido del chofer");
            String dni = entradaString(in, "DNI del chofer");

            Chofer chofer = new Chofer(nombre, apellido, dni);

            int tipoC = tipoCarga(in);
            while (tipoC == 404){
                tipoC = tipoCarga(in);
            }
            if (tipoC == 1){cargaronTe++;}
            Carga carga = new Carga(tipoC);
            String horario = entradaString(in,"Horario");
            String patente = entradaString(in,"Pantende");

            camiones.add(new Camion(patente, chofer, carga, horario));
        }

        mostrarDatosCamiones(camiones);
        System.out.println("Cargaron te: "+cargaronTe+" camiones");

    }







}
