package atividadeFixar;
import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra efetuada: ");
        float compra = sc.nextFloat();

        System.out.println("Digite: ");
        System.out.println("[1] CLIENTE COMUM");
        System.out.println("[2] FUNCIONÁRIO ");
        System.out.println("[3] CLIENTE VIP ");
        int cliente = sc.nextInt();

        switch (cliente) {
            case 1:
                System.out.printf("Nenhum desconto aplicado. O valor é fixo de %.2f", compra);
                break;
            case 2:
            double novaCompra = compra * 0.10;    
            compra -= novaCompra;

            System.out.printf("O desconto de 10%% foi aplicado. O valor da sua compra foi de %.2f", compra);
            break;
            case 3:
            novaCompra = compra * 0.05;    
            compra -= novaCompra;

            System.out.printf("O desconto de 5%% foi aplicado. O valor da sua compra foi de %.2f", compra);

            default:
                break;
        }
        sc.close();
        
    }
}
