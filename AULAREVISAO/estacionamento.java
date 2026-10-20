package AULAREVISAO;
import java.util.Scanner;

public class estacionamento {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(""" 
            Qual o tipo do seu veículo? 
            [1] Motocicleta
            [2] Carro
            [3] Utilitário
            SELECIONE UM DOS NÚMEROS DO CATALÓGO PARA DEFINIR O TIPO: 
        """);
        if (!sc.hasNextInt()){
            System.out.println("SELECIONE APENAS NÚMEROS INTEIROS QUE COMPREENDAM AOS TIPOS!");
            sc.close();
            return;
        }
        int veiculo = sc.nextInt();

        System.out.print("Quantas horas foram passadas no estacionamento? \n Digite um número INTEIRO que compreenda ao número de horas: ");
        if (!sc.hasNextInt()){
            System.out.println("\n O valor deve ser inteiro, aproximado para cima, ex: 2,2 -> 3");
            sc.close();
            return;
        }
        int horas = sc.nextInt();

        System.out.print("""
            O usuário possui desconto?
            Responda 'S' para Sim (+15% desconto)
            Responda 'N' para Não
        """);
        char desconto = sc.next().toUpperCase().charAt(0);
        
        double valorFinal = 0;
        
        switch (veiculo) {
            case 1:
                valorFinal += 4.0;
                break;

            case 2:
                valorFinal += 8.0;
                break;  

            case 3:
                valorFinal += 12.0;
                break;

            default: System.out.print("Esse valor não está catalogado, use 1, 2 ou 3");
                sc.close();
                return;       
        }

        valorFinal *= horas;


        if (horas > 5){
            valorFinal += 10.0;
        }

         if (desconto == 'S'){
            valorFinal -= valorFinal * 0.15;
        } else if (desconto == 'N'){
            System.out.println("Você não possui desconto");
        } else {
            System.out.print ("0 valor inserido é inválido. Digite S ou N");
            sc.close();
            return;
        }

        System.out.printf("O valor que deverá ser pago é de %.2f \n", valorFinal);

        sc.close();
    }
}
