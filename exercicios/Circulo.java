package exercicios;

import java.util.Scanner;

public class Circulo {
    public static void main(String [] args){
        final double PI = 3.1415;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = entrada.nextDouble();

        double area = PI * raio * raio;

        System.out.printf("A área desse circulo é de: %.2f", area);

        entrada.close();
    }
    
}
