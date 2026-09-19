package variaveisCondicionais;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double temperatura = input.nextDouble();

        double Fahre = ( 9 * temperatura + 160)/5;
    
        System.out.printf("O valor em fahrenheit é: %.2f%n20", Fahre);
        
        input.close();
    }   

}
