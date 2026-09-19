package variaveisCondicionais;

import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {

        Scanner bosta = new Scanner(System.in);
        System.out.print ("Informe a duração da viagem(em hora): ");
        double tempo = bosta.nextDouble();

        System.out.print ("Informe a velocidade média da viagem: ");
        double velocidade = bosta.nextDouble();

        double distancia = tempo * velocidade;

        double litros = distancia/12;

        System.out.printf("A viagem durou %.2f em %.2f velocidade média", tempo, velocidade);
        System.out.printf("Com a distância de %.2f, gastou %.2f litros de gasolina/disel ",distancia , litros );
        
        bosta.close();
    }   

}

