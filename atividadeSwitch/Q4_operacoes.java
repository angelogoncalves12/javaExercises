package atividadeSwitch;
import java.util.Scanner;
/*4. Faça um programa que receba dois números reais e execute as operações listadas no
menu de opções abaixo.

Se a opção digitada for inválida, mostre uma mensagem de erro e termine a execução do
programa. Lembre-se de que, na operação 4, o segundo número deve ser diferente de
zero.
 * Tabela da Questão 4: Menu de Operações
 * -----------------------------------------------------------
 * | ESCOLHA DO USUÁRIO | OPERAÇÃO                           |
 * |--------------------|------------------------------------|
 * | 1                  | Média entre os números digitados.  |
 * | 2                  | Diferença do maior pelo menor.     |
 * | 3                  | Produto entre os números digitados.|
 * | 4                  | Divisão do primeiro pelo segundo.  |
 * -----------------------------------------------------------
 */
public class Q4_operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = sc.nextDouble();
         // não tem bloco de print nessa budega de java 1.8 linux :( 
        System.out.println("Escolha uma operação para ser realizada: ");
        System.out.println("[1] Média entre os números digitados. ");
        System.out.println("[2] Diferença do maior pelo menor. ");
        System.out.println("[3] Produto entre os números digitados. ");
        System.out.println("[4] Divisão do primeiro pelo segundo. ");
        int operacao = sc.nextInt();

        double resultado;
        switch (operacao) {
            case 1:
                resultado = (num1 + num2)/2;
                System.out.printf("O resultado da média entre os números %.1f e %.1f é de %.1f %n", num1, num2, resultado);   
                break;
        
            case 2:
                if (num1 > num2){
                resultado = num1 - num2;
               }
               else {
                resultado = num2 - num1;
               }
                System.out.printf("O resultado da diferença entre os números %.1f e %.1f é de %.1f %n", num1, num2, resultado);   
               break;

            case 3:
                resultado = num1 * num2;

                System.out.printf(
                "O produto entre %.1f e %.1f é %.1f%n",
                num1, num2, resultado
                );
                break;

            case 4:
                if (num2 != 0){
                    resultado = num1 / num2;
                    System.out.printf("O resultado da divisão entre os números %.1f e %.1f é de %.1f %n", num1, num2, resultado);   

                } else{
                    System.out.print(" Não é possivel dividir por zero, insira outro valor. %n ");
                }
                break;

            default:
                System.out.print("Essa operação não está listada %n");
                sc.close();
                return;
        }
        sc.close();
    }
}
