/*Questão 06. Elabore um programa que calcule o valor que deve ser pago por um produto,
considerando o preço normal de etiqueta que será fornecido pelo usuário. Em seguida
pergunte ao usuário se o pagamento será à vista. Caso o valor seja pago à vista deve ser
dado um desconto de 10%. Caso contrário, o pagamento será parcelado,assim, solicite a
quantidade de parcelas e mostre o valor da parcela.*/
package atividadeCondicionaisJava;
import java.util.Scanner;

public class Q6_produto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor de etiqueta do produto?  ");
        double produto = sc.nextDouble();

        System.out.print("Será pago à vista (s/n)? ");
        char vista = sc.next().charAt(0);

        if (vista == 's'){
            produto -= produto * 0.1;
            System.out.printf("O valor à vista é de %.2f %n", produto );
        }
        else {
            System.out.print("Irá parcelar em quantas parcelas? ");
            int parcela = sc.nextInt();

            produto = produto/parcela;
            System.out.printf("Serão %d parcelas de %.2f R$ %n", parcela, produto);
        }
        sc.close();
    }
}