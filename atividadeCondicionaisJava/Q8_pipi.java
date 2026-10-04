package atividadeCondicionaisJava;
import java.util.Scanner;
/*Questão 08. Faça um programa que leia 2 notas de um aluno, verifique se as notas são
válidas. Uma nota válida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, onde caso a
nota não possua um valor válido, este fato deve ser informado ao usuário e o programa
termina. Caso as notas sejam válidas, calcule e mostre a média destas notas */
public class Q8_pipi {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print ("Qual a primeira nota do aluno? ");
    double nota1 = sc.nextDouble();

    System.out.print("Qual a segunda nota do aluno? ");
    double nota2 = sc.nextDouble();
    
    
    if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <=10){
        double media = (nota1 + nota2) / 2;
        System.out.printf("A média final foi de %.2f %n", media);
    }
    else {
        System.out.println("Essa nota não é válida");
    }
    sc.close();
}
}
