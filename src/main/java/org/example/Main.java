package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Metodos_calcu Metod = new Metodos_calcu();

        System.out.println(" CALCULADORA BASICA JAVA ");
        System.out.println(" seleccione una opción ");
        int opcion = 0;

        do {
            System.out.println(" 1. Sumar ");
            System.out.println(" 2. Restar ");
            System.out.println(" 3. Multiplicar ");
            System.out.println(" 4. Dividir ");
            System.out.println(" 5. Salir ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\n ---- Sumar ---- ");
                    System.out.println(" ingrese el primer numero a sumar ");
                    int a = scanner.nextInt();
                    System.out.println(" ingrese el segundo numero a sumar ");
                    int b = scanner.nextInt();
                    Metod.suma(a,b);
                    break;
                case 2:
                    System.out.println("\n ---- Restar ---- ");
                    System.out.println(" ingrese el primer numero a restar ");
                    int a1 = scanner.nextInt();
                    System.out.println(" ingrese el segundo numero a restar ");
                    int b2 = scanner.nextInt();
                    Metod.resta(a1, b2);
                    break;
                case 3:
                    System.out.println("\n ---- Multiplicar ---- ");
                    System.out.println(" ingrese el primer numero a multiplicar ");
                    int j = scanner.nextInt();
                    System.out.println(" ingrese el segundo numero a multiplicar ");
                    int k = scanner.nextInt();
                    Metod.multiplicacion(j, k);
                    break;
                case 4:
                    System.out.println("\n ---- Dividir ---- ");
                    System.out.println(" ingrese el primer numero a dividir ");
                    int x = scanner.nextInt();
                    System.out.println(" ingrese el segundo numero a dividir ");
                    int y = scanner.nextInt();
                    Metod.division(x, y);
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }
}