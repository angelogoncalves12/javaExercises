package atividadeSwitch;
import java.util.Scanner;
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
public class Q3_gasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Qual o tipo de combustível utilizado? (A - ÁLCOOL / G - GASOLINA) ");
        char combustivel = sc.nextLine().toUpperCase().charAt(0);

        System.out.print("Número de litros vendidos: ");
        double litros = sc.nextDouble();

        switch (combustivel){
            case 'a': 
                
        }
    }
    
}
