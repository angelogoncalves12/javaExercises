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

        if (opcao == 1){
            switch (num1, num2, num3) {
                case (num1 > num2 > num3):
                    
                    break;
            
                default:
                    break;
            }
            System.out.printf("%.1f %.1f %.1f", num1, num2, num3);
        } else if (opcao == 2){
            System.out.printf("%.1f %.1f %.1f", num3, num2, num1);
        }
    }
    
}
