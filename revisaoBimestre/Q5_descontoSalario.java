package revisaoBimestre;
import java.util.Scanner;
/* Questão 05. Implementar um programa que calcula o desconto previdenciário de um funcionário a
partir do salário do funcionário. Entretanto, o cálculo de desconto segue a regra: o desconto deve
ser de 11% do valor do salário, entretanto, o valor máximo permitido de desconto é 318,20. */
public class Q5_descontoSalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        double desconto = salario * 0.11;

        if (desconto <= 318.2){
            salario = salario - desconto;
        }
        else {
            salario = salario - 318.2;
        }
        System.out.printf("O salário é de R$ %.2f", salario);
        sc.close();
    }
}