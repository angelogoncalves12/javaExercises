package revisaoBimestre;
/*Questão 07. A Locadora de Veículos Eudora lançou uma grande promoção esse mês: pagando
apenas R$ 90 por diária, o cliente pode alugar um carro de passeio. Para cada diária, o cliente
recebe uma cota de quilometragem de 100 Km. Cada quilômetro a mais custará uma taxa extra de
R$ 12. Escreva um programa que receba como entrada a quantidade de dias e a quilometragem
total rodada por um cliente dessa locadora e exiba o valor total a ser pago com duas casas
decimais.*/

import java.util.Scanner;

public class Q7_veiculos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Registre a quantidade de dias alugados: ");
        int dias = sc.nextInt();

        System.out.print("Registre a quilometragem total rodada(KM): ");
        double km = sc.nextDouble();

        double valor = dias * 90;
        double limite = dias * 100;
        
         if (km > limite) {
            valor = valor + (km - limite) * 12;
        }

        System.out.printf("Valor total a pagar: R$ %.2f %n", valor);

        sc.close();
    }
}
