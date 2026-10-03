package atividadeCondicionaisJava;
import java.util.Scanner;
/*Questão 07. Escreva um programa que leia um número inteiro e mostre na tela, a soma de
todos os seus algarismos. Por exemplo, ao número 251 corresponderia ao valor 8 (2 + 5 +
1). Se o número lido não for maior do que zero, o programa terminará com a mensagem
“Número inválido”. */
public class Q7_somaAlgarismo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Digite um número inteiro com 3 algarismos: ");
        int numero = sc.nextInt();

        int alg1 = numero / 100;
        int alg2 = (numero % 100)/10;
        int alg3 = (numero % 100) % 10;

        int soma = alg1 + alg2 + alg3;
        if (soma < 0 ){
            System.out.printf("")
        }
        System.out.printf("O valor da soma é ", args)
        
    }
}
