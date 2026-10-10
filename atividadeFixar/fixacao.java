package atividadeFixar;
import java.util.Scanner;

public class fixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        double maior = valor1;

        if (valor2 > maior) {
            maior = valor2;
        }
        
        if (valor3 > maior){
            maior = valor3;
        }
        System.out.printf("O maior valor é %.1f %n", maior);
        sc.close();
    }
}
