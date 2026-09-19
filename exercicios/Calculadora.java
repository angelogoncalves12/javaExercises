package exercicios;
 
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = entrada.next().charAt(0);
    
        System.out.println(
        "Cadastro realizado! O usuário " +
        nome + ", " +
        idade + " anos, " +
        peso + " kg, de sexo " +
        sexo + "."
        );

        entrada.close();
    }
}
