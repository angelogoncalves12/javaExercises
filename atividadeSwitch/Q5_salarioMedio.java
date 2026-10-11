package atividadeSwitch;
import java.util.Scanner;
/*5. Um banco concederá um crédito especial aos seus clientes, de acordo com o saldo
médio no último ano. Faça um programa que receba o saldo médio de um cliente e
calcule o valor do crédito, de acordo com a tabela a seguir. Mostre o saldo médio e o
valor do crédito.
 * Tabela da Questão 5: Crédito Especial por Saldo Médio
 * ----------------------------------------------------------------
 * | SALDO MÉDIO                      | PERCENTUAL                |
 * |----------------------------------|---------------------------|
 * | Acima de R$ 400,00               | 30% do saldo médio        |
 * | R$ 400,00 •-----o R$ 300,00      | 25% do saldo médio        |
 * | R$ 300,00 •-----o R$ 200,00      | 20% do saldo médio        |
 * | Até R$ 200,00                    | 10% do saldo médio        |
 * ----------------------------------------------------------------
 * Nota visual: O símbolo "•" representa intervalo fechado (inclusivo) 
 * e o "o" representa intervalo aberto (exclusivo).
 */
public class Q5_salarioMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu Saldo Médio: ");
        double saldo = sc.nextDouble();
        double credito = 0;

        if ((saldo >= 0) && (saldo <= 200)){
            credito = saldo * 0.1;
        }else if ((saldo > 200) && (saldo <= 300)){
            credito = saldo * 0.2;
        }else if ((saldo > 300) && (saldo <= 400)){
            credito = saldo * 0.25;
        }else if (saldo > 400){
            credito = saldo * 0.3;
        }else {
            System.out.println("O saldo inserido é negativo. Não há crédito.");
        }

        System.out.printf("Diante seu saldo médio, o crédito disponível é de %.2f %n", credito);
        sc.close();
    }
}
