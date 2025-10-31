package Prueba3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pReal;
        int pImaginario;
        NumerosComp numeros[] = new NumerosComp[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("\nIngrese la parte real y la parte imaginaria del numero complejo " + (i + 1) + ": ");
            pReal = sc.nextInt();
            pImaginario = sc.nextInt();
            numeros[i] = new NumerosComp(pReal, pImaginario);


        }
        fo
        System.out.print("La suma de los numeros complejos es: " + ("(" + numeros[0].sumaPReal() + ") + (" + numeros[0].sumaPImaginario() + "i)"));
        System.out.print("\nLa multiplicacion de los numeros complejos es: " + (numeros[i].multiplica()));
        System.out.print(numeros[i].multiplicaPEntero(2));
    }
}
