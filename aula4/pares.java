package aula4;
import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Esse número é par.");
        }
        else {
            System.out.println("Esse número é ímpar.");
        }
        sc.close();
    }    
}
