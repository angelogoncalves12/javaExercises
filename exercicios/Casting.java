package exercicios;

public class Casting {
  public static void main(String[] args) {
  
    int numerador=11, denominador =10;
    numerador++;
    denominador += numerador;
    
    double resultado; 
    resultado=(double)numerador / denominador;
    System.out.printf("Os números são: %.2f , %.2f", numerador, denominador);
    System.out.printf("Resultado: %.2f%n", resultado);
  }  
} 
