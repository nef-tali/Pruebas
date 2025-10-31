package Prueba3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NumerosComp numero[] = new NumerosComp[2];
        for (int i = 0; i < 2; i++) {
            int pReal, pImaginario;
            System.out.println("Ingrese la parte real del numero complejo " + (i + 1) + ": ");
            pReal = sc.nextInt();
            System.out.println("Ingrese la parte imaginaria del numero complejo " + (i + 1) + ": ");
            pImaginario = sc.nextInt();
            numero[i] = new NumerosComp(pReal, pImaginario);
            
        }
        System.out.println("Que desea realizar con los numeros complejos?");
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("3. Comparar");
        System.out.println("4. Multiplicar por un numero entero");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                 System.out.println("La suma de los numeros es: " + numero[0].sumaPReal(numero[1])+", "+ numero[0].sumaPImaginario(numero[1]) + "i");
                break;
            case 2:
                System.out.println("La multiplicacion de los numeros es: " + numero[0].multiplica(numero[1]));
                break;
            case 3:
                 System.out.println(numero[0].compara(numero[1]));
                break;
            case 4:
                System.out.println("Cual de los dos numeros complejos desea multiplicar por un entero? (1 o 2)");
                int opcion = sc.nextInt();
                System.out.println("Ingrese un numero entero para multiplicar el primer numero complejo: ");
                int entero = sc.nextInt();
                String resultado = numero[opcion - 1].multiplicaPEntero(entero);
                System.out.println("La multiplicacion es: "+ resultado); 
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        sc.close();
    }
}
