package aula4;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Leia um valor inteiro: ");
        int valor = sc.nextInt();

        if (valor >= 0){
            System.out.print("Esse número é positivo. ");
        }
        else {
            System.out.print("Esse número é negativo. ");
        }
        sc.close();
}       
}