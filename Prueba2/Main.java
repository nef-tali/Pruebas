
import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, tiempo;
        String nombre;

        
        System.out.print("Ingrese la cantidad de atletas: ");
        int cantidadAtletas = sc.nextInt();
        Atleta[] atletas = new Atleta[cantidadAtletas];

        for (int i = 0; i < cantidadAtletas; i++){
            System.out.print("Ingrese datos del atleta " + (i + 1) + ":\n");
            System.out.print("Número: ");
            num = sc.nextInt();
            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.print("Tiempo (en segundos): ");
            tiempo = sc.nextInt();
            atletas[i] = new Atleta(num, nombre, tiempo);
        }
        int indiceAtletaRapido = atletaMRapido(atletas);
        System.out.print("El atleta más rápido es:\n" + atletas[indiceAtletaRapido].mostrarDatos() + "\n");
        sc.close();
    }
        public static int atletaMRapido(Atleta atletas[]) {
            int masRapido = atletas[0].getTiempo();
            int indiceMin = 0;
            for (int i = 1; i < atletas.length; i++) {
                if (atletas[i].getTiempo() < masRapido) {
                    masRapido = atletas[i].getTiempo();
                    indiceMin = i;
                }
            }
            return indiceMin;
        }
        

    }

