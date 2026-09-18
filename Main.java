package exercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("A soma é: " + (num1 + num2));
        System.out.println("O módulo é: " + (num1 % num2));

        entrada.close();
    }
}