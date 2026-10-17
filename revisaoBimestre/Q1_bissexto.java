package revisaoBimestre;
import java.util.Scanner;
/*Questão 01. Determine se um determinado ano lido é bissexto. Regra: um ano é bissexto se for
divisível por 400 ou, se for divisível por 4 e não for divisível por 100. */
public class Q1_bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um ano do calendário: ");
        int ano = sc.nextInt();
        
        if (ano % 400 == 0|| (ano % 4 == 0 && ano % 100 != 0)){
            System.out.print("Esse ano é bissexto. "); 
        }
        else {
            System.out.print("Esse ano não é bissexto.");
        }
        sc.close();
    }
}
