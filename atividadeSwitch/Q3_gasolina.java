
/*
3. Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Escreva um programa que leia o número de litros vendidos e o tipo de combustível (
A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o preço do litro da gasolina é R$ 6,40 e o preço do litro do álcool é R$ 4,20.
 * Tabela da Questão 3: Descontos de Combustíveis
 * -----------------------------------------------------------------
 * | Combustível | Condições e Descontos                           |
 * |-------------|-------------------------------------------------|
 * | Álcool      | até 20 litros, desconto de 3% por litro         |
 * |             | acima de 20 litros, desconto de 5% por litro    |
 * |-------------|-------------------------------------------------|
 * | Gasolina    | até 20 litros, desconto de 4% por litro         |
 * |             | acima de 20 litros, desconto de 6% por litro    |
 * -----------------------------------------------------------------
 */
package atividadeSwitch;

import java.util.Scanner;

public class Q3_gasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tipo de combustível? (A - ÁLCOOL / G - GASOLINA): ");
        char combustivel = sc.next().toUpperCase().charAt(0);

        System.out.print("Número de litros vendidos: ");
        double litros = sc.nextDouble();

        double preco;
        double desconto;

        switch (combustivel) {
            case 'A':
                preco = 4.20;
                
                if (litros <= 20) {
                    desconto = 0.03;
                } else {
                    desconto = 0.05;
                }
                break;

            case 'G':
                preco = 6.40;

                if (litros <= 20) {
                    desconto = 0.04;
                } else {
                    desconto = 0.06;
                }
                break;

            default:
                System.out.println("Combustível inválido! Escolha A ou G.");
                sc.close();
                return;
        }

        double total = preco * litros;
        total -= total * desconto;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
