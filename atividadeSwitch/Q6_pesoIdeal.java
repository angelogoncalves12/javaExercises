package atividadeSwitch;
import java.util.Scanner;
/*Faça um programa que receba a altura(m), o sexo biológico (F- feminino/M-masculino)
de uma pessoa e seu peso (kg) e mostre uma mensagem informando se ela está no
peso ideal, acima ou abaixo. Utilize as fórmulas abaixo para cálculo de peso ideal:
■■ Masculino: (72.7 *altura) – 58.
■■ Feminino: (62.1 *altura) – 44.7. */
public class Q6_pesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua altura (EM METROS): ");
        double altura = sc.nextDouble();

        System.out.print("Informe seu peso (EM KG): ");
        double peso = sc.nextDouble();

        System.out.print("Informe seu Sexo Biológico (F - Feminino / M - Masculino)");
        char sexo = sc.next().toUpperCase().charAt(0);

        double convencao = 0;
        switch (sexo) {
            case 'F':
                convencao = (62.1 * altura) - 44.7;
                if (convencao > peso){
                    System.out.println("Você está abaixo do peso ideal");
                }else if(convencao < peso){
                    System.out.println("Você está acima do peso ideal");
                }else {
                    System.out.println("Você está no peso ideal");
                }
                break;
            
            case 'M':
                convencao = (72.7 * altura) - 58;
                if (convencao > peso){
                    System.out.println("Você está abaixo do peso ideal");
                }else if(convencao < peso){
                    System.out.println("Você está acima do peso ideal");
                }else {
                    System.out.println("Você está no peso ideal");
                }
                break;

            default:
                System.out.println ("O sexo digitado não é válido, digite seu sexo biológico novamente!");
                sc.close();
                return;
        }
        sc.close();
    }
}
