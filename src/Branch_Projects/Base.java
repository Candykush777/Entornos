package Branch_Projects;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;
        System.out.println("Ingrese valor A : ");
        int a = scanner.nextInt();
        System.out.println("Ingrese Valor B : ");
        int b = scanner.nextInt();
        System.out.println("Enter operator: ");
        char operator = (char) scanner.nextInt();

        switch (operator){
            case '+':
                System.out.println("\n Resultado Suma : " + suma);
                break;

            case '-':
                System.out.println("\n Resultado de la Resta : " + resta);
                break;

            case '/':
                System.out.println("\n Resultado de la División : " + division);
                break;

            case '*':
                System.out.println("\n Resultado de la Multiplicación : " + multiplicacion);
                break;

            default:
                System.out.println("No valido");

        }
    }

}
