package atividadeCondicionaisJava;
import java.util.Scanner;
/*Questão 02. Escreva um programa que pergunte a velocidade do carro de um usuário.
Caso ultrapasse 80 km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse
caso, exiba o valor da multa, cobrando R$ 5,00 por km acima de 80Km/h. */
public class Q2_velocidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a velocidade máxima em Km/h na pista: ");
        float velocidade = sc.nextFloat();

        if (velocidade > 80){
            float excedente = velocidade - 80;
            float multa = excedente * 5;
            System.out.printf ("Você foi multado em %.2f R$", multa);
        }
        else {
            System.out.print ("Dentro do limite de velocidade, não há multas.");
        }
        sc.close();
    }
}