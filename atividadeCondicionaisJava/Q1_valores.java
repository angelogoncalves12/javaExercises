package atividadeCondicionaisJava;
import java.util.Scanner;
/*Questão 01. Faça um programa que leia os valores A, B, C e imprima na tela se a soma de
A + B é menor que C*/
public class Q1_valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o valor A:");
        float valorA = sc.nextFloat();

        System.out.print("Escreva o valor B:");
        float valorB = sc.nextFloat();

        System.out.print("Escreva o valor C:");
        float valorC = sc.nextFloat();

        if (valorA + valorB < valorC){
            System.out.println("A soma dos primeiros valores é menor do que o último. ");
        }
        else {
            System.out.println("A soma dos primeiros valores não é menor do que o último. ");
        }
        sc.close();
    }
}