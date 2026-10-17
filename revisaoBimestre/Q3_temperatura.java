package revisaoBimestre;
import java.util.Scanner;
/*Questão 03. Uma estação meteorológica deseja classificar a temperatura ambiente de acordo com
a leitura atual. Crie um programa que leia a temperatura em graus Celsius fornecida pelo usuário e
exiba uma das seguintes mensagens:

● Se a temperatura for abaixo de 10°C → "Temperatura muito baixa."
● Se estiver entre 10°C e 25°C (inclusive) → "Temperatura agradável."
● Se estiver acima de 25°C e abaixo de 35°C → "Temperatura alta."
● Se a temperatura for 35°C ou mais → "Temperatura extrema."

O programa deve exibir também o valor da temperatura informado com uma casa decimal com
uma mensagem como: "Temperatura registrada: 28.0°C" */
public class Q3_temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus celsius: ");
        double temperatura = sc.nextDouble();

        System.out.printf("Temperatura Registrada: %.1f %n", temperatura);
        if (temperatura < 10){
            System.out.print("Temperatura muito baixa");
        } else if (temperatura >=10 || temperatura <= 25){
            System.out.print("Temperatura agradável");
        } else if (temperatura > 25 || temperatura <=35){
            System.out.print("Temperatura alta"); 
        } else {
            System.out.print("Temperatura extrema");
        }
        sc.close();
    }
}