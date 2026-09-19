package variaveisCondicionais;
import java.util.Scanner;

public class AreaTrian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a BASE do triângulo: ");
        double base = input.nextDouble();

        System.out.print("Insira a ALTURA do triângulo: ");
        double altura = input.nextDouble();
        
        double resultado = (base * altura)/2;
        System.out.printf("O restultado da área do triângulo é: %.2f%n",  resultado);
        
        input.close();
    }
}
