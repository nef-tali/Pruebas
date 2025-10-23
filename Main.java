import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d;
        Tablero tab1 = new Tablero(0,0);

        System.out.print(tab1.obtenerPosicion() + "\n");
        do {
        System.out.println("Hacia donde desea mover?");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Derecha");
        System.out.println("4. Izquierda");
        System.out.println("5. Fin");
        d = sc.nextInt();
        
        switch (d) {
            case 1:
                System.out.print("Cuantos pasos desea mover hacia arriba? ");
                int pasosArriba = sc.nextInt();
                tab1.moverArriba(pasosArriba);
                System.out.print(tab1.obtenerPosicion() + "\n");
                break;
            case 2:
                System.out.print("Cuantos pasos desea mover hacia abajo? ");
                int pasosAbajo = sc.nextInt();
                tab1.moverAbajo(pasosAbajo);
                System.out.print(tab1.obtenerPosicion() + "\n");
                break;
            case 3:
                System.out.print("Cuantos pasos desea mover hacia la derecha? ");
                int pasosDerecha = sc.nextInt();
                tab1.moverDerecha(pasosDerecha);
                System.out.print(tab1.obtenerPosicion() + "\n");
                break;
            case 4:
                System.out.print("Cuantos pasos desea mover hacia la izquierda? ");
                int pasosIzquierda = sc.nextInt();
                tab1.moverIzquierda(pasosIzquierda);
                System.out.print(tab1.obtenerPosicion() + "\n");
                break;
            case 5:
                break;
            default:
                System.out.print("Opción no válida.\n");
                break;
        }
    } while (d != 5);
        System.out.print("Programa finalizado.\n");
    sc.close();
    }
}