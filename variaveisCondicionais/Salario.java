package variaveisCondicionais;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner bosta = new Scanner(System.in);

        System.out.print("Insira o Sálario Bruto: ");
        double salario = bosta.nextDouble();

        double prevSocial = (salario * 0.10);
        double imposto = salario * 0.05;

        double resultado = salario - prevSocial - imposto;
    
        System.out.printf("Seu salário líquido é de: %.2f", resultado);
        
        bosta.close();
    }
}
