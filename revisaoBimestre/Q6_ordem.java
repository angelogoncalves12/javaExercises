package revisaoBimestre;
import java.util.Scanner;
/*Questão 06. Faça um programa que mostre um menu com duas opções: 1 – Ordem crescente; 2 -
Ordem decrescente. Caso seja colocada uma opção diferente informe que a opção é inválida. Em
seguida, solicite ao usuário três números. Para a opção 1, imprima-os em ordem crescente e para a
opção 2, imprima-os em ordem decrescente. */
public class Q6_ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("[1] Ordem Crescente");
        System.out.println("[2] Ordem Descrescente");
        int opcao = sc.nextInt();

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        double auxiliar;

        if (num1 > num2){
            auxiliar = num1; // auxiliar vira o numero 1 
            num1 = num2; /// numero 1 vira o numero 2
            num2 = auxiliar; // o numero 2 vira o auxiliar
        }
        
        if (num1 > num3) {
            auxiliar = num1;
            num1 = num3;
            num3 = auxiliar;
        }

        if (num2 > num3) {
            auxiliar = num2;
            num2 = num3;
            num3 = auxiliar;
        }
     
        
        if (opcao == 1) {
            System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
        } else if (opcao == 2){
            System.out.println("Ordem decrescente: " + num3 + ", " + num2 + ", " + num1);
        } else {
            System.out.println("Opção fora do escopo, digite 1 ou 2");
        }
        sc.close();
    }
}
    

