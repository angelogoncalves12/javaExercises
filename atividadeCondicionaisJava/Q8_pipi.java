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

    if (nota1 >= 0 && nota1 <= 10){
        System.out.println("Essa nota é válida ") : System.out.println("Easa nota não é válida");
    }

}

}
