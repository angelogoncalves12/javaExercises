package revisaoBimestre;

import java.util.Scanner;
/*
Questão 04. Elabore um algoritmo que receba o valor de um produto e a condição de pagamento.
Em seguida, calcule o valor a ser pago por um cliente ao comprar determinado produto diante das
opções abaixo.
Tabela de condições de pagamento:

Código 1: À vista em dinheiro, 10% de desconto.
Código 2: À vista no cartão, 5% de desconto.
Código 3: Parcelado em duas vezes no cartão, preço normal do produto, sem juros.
Código 4: Entrada (25% do valor) + 2 parcelas, o valor deve ser acrescido de 10% de juros.
 */
public class Q4_produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double produto = sc.nextDouble();

        System.out.println("\n Informe a condição de pagamento: ");
        System.out.println("1: À vista em dinheiro, 10% de desconto.");
        System.out.println("2: À vista no cartão, 5% de desconto.");
        System.out.println("3: Parcelado em duas vezes no cartão, preço normal do produto, sem juros.");
        System.out.println("4: Entrada (25% do valor) + 2 parcelas, o valor deve ser acrescido de 10% de juros.");
        int condition = sc.nextInt();

        if (condition == 1){
            produto -= produto * 0.1;
            System.out.printf("À vista têm 10%% de desconto, totalizando R$ %.2f %n", produto);
        } else if (condition == 2){
            produto -= produto * 0.05;
            System.out.printf("No cartão têm 5%% de desconto, totalizando R$ %.2f %n", produto);
        } else if (condition == 3){
            produto = produto / 2; // declarar dps que sao duas parcelas!!
            System.out.printf("Duas parcelas de R$ %.2f %n", produto);
        } else if (condition == 4){
            produto += produto * 0.1; 
            double entrada = produto * 0.25;
            double parcela = (produto - entrada) / 2;
            System.out.printf("Esse produto tem o valor de R$ %.2f de entrada, com duas parcelas de R$ %.1f", entrada, parcela );
        } else {
            System.out.print("Nenhum valor válido foi fornecido");
        }
    sc.close();
    }
}
