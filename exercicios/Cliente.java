package exercicios;

import java.util.Scanner;

public class Cliente{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o nome do produto: ");
        String produto = entrada.nextLine();

        System.out.print("Insira o valor unitário: ");
        double valor = entrada.nextDouble();

        System.out.print("Insira a quantidade de itens: ");
        int qntd = entrada.nextInt();

        double total = valor * qntd;
        
        System.out.print ("Você comprou " + qntd + " unidades de " + 
        produto + ". O valor total da compra é: " + total);
    
        entrada.close();
    } 
}
