/*Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra
EMPATE. */
package atividadeSwitch;
import java.util.Scanner;

public class Q2_partida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Digite o nome do primeiro time: ");
        String time1 = sc.next();

        System.out.print ("Digite o número de gols desse time: ");
        int gols1 = sc.nextInt();

        System.out.print ("Digite o nome do segundo time: ");
        String time2 = sc.next();

        System.out.print ("Digite o número de gols desse time: ");
        int gols2 = sc.nextInt();

        if (gols1 > gols2){
            System.out.printf("O time %s é o vencedor da partida %n", time1);
        } else if (gols1 < gols2){
            System.out.printf("O time %s é o vencedor da partida %n", time2);
        } else {
            System.out.printf("Os times %s e %s empataram na partida %n", time1, time2);
        }
        sc.close();
    }
}