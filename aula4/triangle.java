package aula4;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Determine o valor do lado A: ");
        float ladoA = sc.nextFloat();
        
        System.out.println("Determine o valor do lado B: ");
        float ladoB = sc.nextFloat();

        System.out.println("Determine o valor do lado C: ");
        float ladoC = sc.nextFloat();

        if (ladoA == ladoB && ladoB == ladoC){
            System.out.println ("Esse triãngulo é equilátero. ");
        }
        else {
            System.out.println("Esse triângulo não é equilátero. ");
        }
        sc.close();
    }    
}
