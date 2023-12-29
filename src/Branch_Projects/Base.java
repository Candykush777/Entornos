package Branch_Projects;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valor A : ");
        int a = scanner.nextInt();
        System.out.println("Ingrese Valor B : ");
        int b = scanner.nextInt();
        System.out.println("Ingresa operador: ");
        int operator = scanner.nextInt();


        switch (operator) {
            case 1:
                int suma = a + b;
                System.out.println("\n Resultado Suma : " + a + " + " + b + " = " + suma);
                break;

            case 2:
                int resta = a - b;
                System.out.println("\n Resultado de la Resta : " + a + " - " + b + " = " + resta);
                break;

            case 3:
                if (b != 0) {
                    double division = (double) a / b;
                    System.out.println("\n Resultado de la División : " + a + " / " + b + " = " + division);
                } else {
                    System.out.println("\n Resultado de la División : " + a + " / " + b + " = 0");
                }
                break;

            case 4:
                int multiplicacion = a * b;
                System.out.println("\n Resultado de la Multiplicación : " + a + " * " + b + " = " + multiplicacion);
                break;

            default:
                System.out.println("Operador no válido");
        }
    }
}

