package atividadeCondicionaisJava;
import java.util.Scanner;
/*Questão 05. Escreva um programa que pergunte a distância que um passageiro deseja
percorrer em km. Calcule o preço da passagem, cobrando R$ 2,50 por km para viagens até
200 km, e R$ 3,45 para viagens mais longas. */
public class Q5_distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a distância que quer percorrer (em KM): ");
        double distancia = sc.nextDouble();

        if (distancia <= 200){
            double preco = distancia * 2.5;
            System.out.printf("O preço por essa viagem é de %.2f %n", preco);
        }
        else{
            double preco = distancia * 3.45;
            System.out.printf("O preço por essa viagem é de %.2f %n", preco);
        }
        sc.close();
    }
}
