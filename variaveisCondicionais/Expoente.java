package variaveisCondicionais;

import java.util.Scanner;

public class Expoente {
    public static void main(String [] args){
    
        Scanner bosta = new Scanner(System.in);

        System.out.print("Escreva um valor inteiro: ");
        int valor = bosta.nextInt();

        System.out.println(valor * valor);

        System.out.println(valor * valor * valor);

        bosta.close();
    }
}
