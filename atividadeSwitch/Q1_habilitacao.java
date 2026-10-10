package atividadeSwitch;
import java.util.Scanner;
/*Desenvolva um programa que leia o ano de nascimento de uma pessoa e o ano atual,
calcule e mostre sua idade e , também, verifique e mostre se ela já tem idade para
votar (16 anos ou mais) e para conseguir a carteira de habilitação (18 anos ou mais) */
public class Q1_habilitacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe seu ano de nascimento: ");
        int nascimento = sc.nextInt();

        System.out.print("Informe o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - nascimento;

        if (idade >= 16){
            System.out.print("Já pode votar");
        }
        else {
            System.out.print("Ainda não pode votar, mini eleitor do Renan Santos");
        }
        if (idade >= 18){
            System.out.print("Já pode tirar a carteira de habilitação");
        }
        else {
            System.out.print("Sem vrum vrum para você. Complete 18 primeiro!");
        }
        sc.close();
    }
}
