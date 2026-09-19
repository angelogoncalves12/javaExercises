package variaveisCondicionais;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("INSIRA SEU NOME: ");
        String nome = input.nextLine();

        System.out.print("INSIRA SEU SOBRENOME: ");
        String sobrenome = input.nextLine();

        System.out.print(nome + " " + sobrenome);

        input.close();
    }
}
