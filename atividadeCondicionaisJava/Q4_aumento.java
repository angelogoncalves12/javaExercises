/*Questão 04. Escreva um programa que pergunte o salário de um funcionário. Calcule e
mostre o valor do aumento e o valor do novo salário sabendo que: para salários superiores
a R$ 1500,00 calcule um aumento de 10%. Para inferiores ou iguais, de 15%.*/
package atividadeCondicionaisJava;
import java.util.Scanner;

public class Q4_aumento{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu salário? ");
        double salario = sc.nextDouble();

        //salario = (salario > 1500)? salario + salario * 0.1 : salario + salario * 0.15;
        if (salario > 1500){
            double novoSalario = salario * 0.1;
            System.out.printf("O aumento foi de: %f %n", novoSalario);
            salario += novoSalario;
            System.out.println("Seu aumento é de 10%");
        }
        else {
            double novoSalario = salario * 0.15;
            System.out.printf("O aumento foi de: %f %n", novoSalario);
            salario += novoSalario;
            System.out.println("Seu aumento é de 15%");
        }
        System.out.printf("Seu novo salário é de: %f %n", salario);
        sc.close();
    }

}