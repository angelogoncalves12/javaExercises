package AULAREVISAO;
import java.util.Scanner;

public class revisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha seu lanche: ");
        System.out.println("[1] Hambúrger ");
        System.out.println("[2] Sanduíche natural");
        System.out.println("[3] Cachorro-quente");
        System.out.print("ESCOLHA SEU PEDIDO PELO NÚMERO: ");
        if (!sc.hasNextInt()) {
            System.out.println("Opção inválida. Digite um número inteiro.");
            sc.close();
            return;
        }
        int lanche = sc.nextInt();
        
        if (lanche != 1 && lanche != 2 && lanche != 3){
            System.out.println("Valor inválido, insira algum dos números informados.");
            sc.close();
            return;
        }

        System.out.println("Escolha sua bebida: ");
        System.out.println("[0] Sem bebida");
        System.out.println("[1] Refrigerante ");
        System.out.println("[2] Suco ");
        System.out.print("ESCOLHA SUA BEBIDA PELO NÚMERO: ");
        if (!sc.hasNextInt()) {
            System.out.println("Opção inválida. Digite um número inteiro.");
            sc.close();
            return;
        }
        int bebida = sc.nextInt();
        

        if (bebida != 0 && bebida != 1 && bebida != 2){
            System.out.println("Valor inválido, insira algum dos números informados.");
            sc.close();
            return;
        }

        System.out.println("Sobremesa adicional? +R$ 7,00 ");
        System.out.println("S - Sim, adicionar.");
        System.out.println("N - Não adicionar.");
        System.out.print("ESCOLHA 'S' ou 'N': ");
        char sobremesa = sc.next().toUpperCase().charAt(0);

        double precoTotal = 0;

        switch (lanche) {
            case 1:
                precoTotal += 15;
                break;
        
            case 2:
                precoTotal +=12;
                break;
            
            case 3:
                precoTotal += 10;
                break;

            default: System.out.println("Esse valor não está catalogado, retorne com outro valor informado. ");
                sc.close();
                return;
        }


        switch (bebida) {
            case 0:
                System.out.println("Você selecionou não optar por bebida, tenha uma ótima refeição!");
                break;
            case 1:
                precoTotal += 6;
                break;
            case 2:
                precoTotal += 5;
                break;

            default: System.out.println("Esse valor não está catalogado, retorne com outro valor informado. ");
                sc.close();
                return;
        }

    
        if (sobremesa == 'S'){
            precoTotal += 7;
        } else if (sobremesa == 'N'){
            System.out.println("Você optou por não ter sobremesa! Boa refeição");
        } else {
            System.out.println("Você selecionou uma escolha fora do escopo, retorne e escolha 'S' ou 'N' ");
            sc.close();
            return;
        }

        System.out.print("Quantos lanches serão comprados? Digite apenas o número de lanches: ");
        int qntLanche = sc.nextInt();

        if (qntLanche > 0){
            precoTotal *= qntLanche;
        } else {
            System.out.println("O valor inserido foi menor que zero. Escolha uma quantidade válida de lanches.");
            sc.close();
            return;
        }
        
        System.out.printf("O valor final foi de %.2f %n", precoTotal);

        sc.close();
    }
}
