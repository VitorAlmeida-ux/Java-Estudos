import java.util.Scanner;

public class Calculadora {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Calculadora --------\n");

        System.out.print("Digite um Numero: ");

        double num1;
        double num2;
        double resultado = 0.0;
        String operadores;

        num1 = scanner.nextDouble();

        System.out.print("Digite O Operador: ");

        operadores = scanner.next();

        System.out.print("Digite Outro Numero: ");

        num2 = scanner.nextDouble();

        if (operadores.equals("+")){

            resultado = num1 + num2;

        }

        else if (operadores.equals("-")){

            resultado = num1 - num2;

        }

        else if (operadores.equals("*")){

            resultado = num1 * num2;

        }
        else if (operadores.equals("/")){

            resultado = num1 / num2;

        }

        else {
            System.out.println("Operador Invalido!");
            return;
        }

        System.out.print("Seu Resultado: " + resultado);

    }

}