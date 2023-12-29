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
        System.out.println("Ingresa operador: ");
        char operator = (char) scanner.nextInt();
         suma = a+b;
         resta = a-b;
         division = a/b;
         multiplicacion = a*b;

        switch (operator){
            case 1 :
                System.out.println("\n Resultado Suma : " + a + "+" + b + "=" + suma);
                break;

            case '-':
                System.out.println("\n Resultado de la Resta : " + a + "-" + b + "=" + resta);
                break;

            case '/':
                System.out.println("\n Resultado de la División : " + a + "/" + b + "=" + division);
                break;

            case '*':
                System.out.println("\n Resultado de la Multiplicación : " + a + "*" + b + "=" + multiplicacion);
                break;

            default:
                System.out.println("No valido");

        }
    }

}
