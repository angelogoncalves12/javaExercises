package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Media{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); 
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira sua primeira nota: ");
        double num1 = entrada.nextDouble();

        System.out.print("Insira sua segunda nota: ");
        double num2 = entrada.nextDouble();

        System.out.print("Insira sua terceira nota: ");
        double num3 = entrada.nextDouble();
        
        System.out.printf("Sua média final é: %.2f%n",(num1 + num2 + num3) / 3);
        
        entrada.close();
    }
}