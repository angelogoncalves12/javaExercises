//Questão 03. Escreva um programa que, dados dois números inteiros, mostre na tela o
//maior deles, assim como a diferença que existente entre ambos.
package atividadeCondicionaisJava;
import java.util.Scanner;

public class Q3_diferenca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Escreva outro número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número é maior. ");
            int diferenca = num1 - num2;
            System.out.printf("A diferença entre eles é de %d %n", diferenca);
        }
        else{
            System.out.println("O Segundo número é maior. ");
            int diferenca = num2 - num1;
            System.out.printf("A diferença entre eles é de %d %n", diferenca);
        }
        sc.close();
    }
}