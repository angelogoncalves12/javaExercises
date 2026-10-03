package aula4;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        float salario = sc.nextFloat();

        if (salario > 300){
            salario += salario * 15/100;
            System.out.printf("Seu novo salário é de: %.2f", salario);
        }
        else {
            salario += salario * 35/100;
            System.out.printf("Seu novo salário é de: %.2f", salario);
        }
        sc.close();
    }    
}
