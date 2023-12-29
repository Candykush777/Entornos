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
        char operator;
        operator = scanner.next().charAt(0);

        metodos calculadora = new metodos();

        switch (operator){
            case '+':
                System.out.println("\n Resultado Suma : " + a + "+" + b + "=" + calculadora.suma(a, b));
                break;

            case '-':
                System.out.println("\n Resultado de la Resta : " + a + "-" + b + "=" + calculadora.resta(a, b));
                break;

            case '/':
                System.out.println("\n Resultado de la División : " + a + "/" + b + "=" + calculadora.division(a, b));
                break;

            case '*':
                System.out.println("\n Resultado de la Multiplicación : " + a + "*" + b + "=" + calculadora.multiplicacion(a, b));
                break;

            default:
                System.out.println("No valido");

        }
    }

}
