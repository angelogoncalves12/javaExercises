package revisaoBimestre;
import java.util.Scanner;
/*Questão 02. Crie um programa que calcule o valor total da conta de energia elétrica de um
usuário. O programa deve ler a quantidade de kWh consumidos no mês e calcular o valor final,
seguindo as regras abaixo:
● Até 150 kWh: R$ 0,90 por kWh
● Acima de 150 kWh: R$ 0,60 por kWh e deve ser informado por uma mensagem que foi
aplicada tarifa reduzida.
O programa deve exibir ao final uma mensagem com o valor a pagar com duas casas decimais */
public class Q2_energia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o gasto de kWh informado no contador: ");
        double kwh = sc.nextDouble();

        double preco = 0; 
        if (kwh <= 150){
            preco = kwh * 0.90;
        }
        else {
            preco = kwh * 0.60;
            System.out.println("Foi aplicada a tarifa reduzida");
        }

        System.out.printf("O preço que deverá ser pago é de  %.2f %n", preco);
        sc.close();
    }   
}
