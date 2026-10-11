/*
Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, baseada no
número de horas extras e no número de horas que o funcionário faltou ao trabalho.
O valor do prêmio é obtido pela consulta à tabela que se segue, na qual:
H = número de horas extras – (2/3 * (número de horas falta))
 * Tabela da Questão 7: Gratificação de Natal (Prêmio por Horas)
 * -----------------------------------------
 * | H (MINUTOS)       | PRÊMIO (R$)       |
 * |-------------------|-------------------|
 * | >= 2.400          | 500,00            |
 * | 1.800 •-----o 2.400 | 400,00          |
 * | 1.200 •-----o 1.800 | 300,00          |
 * |   600 •-----o 1.200 | 200,00          |
 * | < 600             | 100,00            |
 * -----------------------------------------
 */
package atividadeSwitch;
import java.util.Scanner;

public class Q7_natal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Insira o número de horas extras realizadas: ");
        double extras = sc.nextDouble();

        System.out.print ("Insira o número de horas faltadas: ");
        double falta = sc.nextDouble();

        double H = extras - (2/3 * (falta));
        double premio = 0;
        if ((H > 0) && (H < 600)){
            premio = 100;
            System.out.println("A empresa agradece o trabalho duro. ");
        }else if ((H >= 600) && (H < 1200)){
            premio = 200;
            System.out.println("A empresa agradece o trabalho duro. ");
        }else if ((H >= 1200) && (H < 1800)){
            premio = 300;
            System.out.println("A empresa agradece o trabalho duro. ");
        }else if ((H >= 1800) && (H < 2400)){
            premio = 400;
            System.out.println("A empresa agradece o trabalho duro. ");
        }else if (H >= 2400){
            premio = 500;
            System.out.println("A empresa agradece o trabalho duro. ");
        }else {
            System.out.println("Nenhum bónus concedido. Funcionário deve horário.");
            System.out.println("Notificado ao RH. ");
            //se fudeu kkkkkkkk
        }

        System.out.printf("A premiação final foi de R$%.2f .%n", premio);
        sc.close();
    }
}