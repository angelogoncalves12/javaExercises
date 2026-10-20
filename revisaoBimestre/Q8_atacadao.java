package revisaoBimestre;

import java.util.Scanner;

/*Questão 08. (Adaptado -The Huxley) Sr. João é um churrasqueiro muito famoso e faz churrasco
toda semana, mas toda vez ele precisa calcular a quantidade de carne “na mão”. Além disso, ele
tem regras bem específicas para determinar a quantidade de carne. Também é muito comum que
os clientes de Sr. João tenham solicitações específicas. Em seus churrascos, Sr. João fornece 3 tipos
de carne, pão de alho e bebidas. */ 
public class Q8_atacadao {
    //COMENTARIO ESPECIAL PRA CRIS 
    // MEU DEUS QUE QUESTAO FOI ESSA? FIQUEI 1 HORA TODINHA SÓ RESOLVENDO OS BUGS KKKKKKKK
    public static void main(String[] args) {
/*O cliente tem 3 opções para as carnes:
•Completo (C)
•Bovino e frango (BF)
•Bovino e suíno (BS)
Caso o cliente digite uma opção errada o sistema deve encerrar e emitir uma mensagem de erro:
"Opção inválida."
O cliente também pode optar por não servir pão de alho e terá um desconto de 2% no valor total
do churrasco.
O cliente também pode solicitar bebidas para adultos e/ou crianças, caso deseje. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a carne do churrasco: ");
        System.out.println("Completo (CO)");
        System.out.println("Bovino e frango (BF)");
        System.out.println("Bovino e suíno (BS)");
        System.out.print ("DIGITE APENAS A SIGLA!!: ");
        String sigla = sc.next().toUpperCase();
        
        if (!sigla.equals("CO") && !sigla.equals("BF") && !sigla.equals("BS")) {
            System.out.println("Opção inválida.");
            sc.close();
            return;
        }

        System.out.println("Deseja pão de alho? (S/N)");
        System.out.print("ATENÇÃO - PEQUENO ACRESCIMO DE 2%: ");
        char pao = sc.next().toUpperCase().charAt(0);

        System.out.println("Deseja bebidas?");
        System.out.println("[0] Não desejo bebidas.");
        System.out.println("[1] Sim, para adultos.");
        System.out.println("[2] Sim, para crianças.");
        System.out.println("[3] Sim, para os dois.");
        System.out.print("Selecione a opção pelo número (0,1,2,3): ");
        if (!sc.hasNextInt()) {
            System.out.println("Opção inválida. Digite um número inteiro.");
            sc.close();
            return;
        }
        int bebidas = sc.nextInt();// tavam me enchendo o saco com "ain, e se nao fosse int?"
        
        int adultos = 0;
        int criancas = 0;
/*Seu sistema deve receber as seguintes informações:
•A opção para as carnes
•Se o cliente quer pão de alho
•Se o cliente quer bebidas para adultos

•Se o cliente quer bebidas para crianças
•A quantidade de crianças
•A quantidade de adultos */

/*Em seguida o sistema deve calcular quanto o cliente gastará no churrasco de acordo com os
seguintes parâmetros:
•A carne bovina custa R$ 42,00 por Kg
•Carne de frango custa R$ 28,00 por Kg
•Carne suína custa R$ 25,00 por Kg
•1 garrafa de cerveja custa R$ 12,00
•1 garrafa de refrigerante custa R$ 10,00 */
        double bovina = 42.0;
        double frango = 28.0;
        double suino = 25.0;
        double cerveja = 12.0;
        double refri = 10.0;
        double precoTotal = 0;

                           
        System.out.print("Quantas crianças têm à mesa? ");
        criancas = sc.nextInt();
        System.out.print("Quantos adultos têm à mesa? ");
        adultos = sc.nextInt();
        if (adultos < 0 || criancas < 0) {
            System.out.println("Quantidade inválida.");
            sc.close();
            return;
        }
/*•Se o churrasco for completo:
•200g de carne bovina por adulto
•100g de carne de frango por adulto
•100g de carne suína por adulto
•200g de carne bovina por criança

•Se o churrasco for BF:
•250g de carne bovina por adulto
•150g de carne de frango por adulto
•200g de carne bovina por criança

•Se o churrasco for BS:
•250g de carne bovina por adulto
•150g de carne suína por adulto
•200g de carne bovina por criança */

        if (sigla.equals("CO")){
            precoTotal += ((bovina / 5) * adultos) + ((frango / 10 ) * adultos) + ((suino / 10) * adultos) + ((bovina/5) * criancas);
        } else if (sigla.equals("BF")) {
            precoTotal += ((bovina/4) * adultos) + ((frango * 0.15) * adultos) + ((bovina/5)*criancas); 
        } else if (sigla.equals("BS")){
            precoTotal += ((bovina/4) * adultos) + ((suino * 0.15) * adultos) + ((bovina/5)*criancas);
        }

        switch (bebidas) {
            case 0:
                System.out.println("Nenhuma bebida selecionada.");
                break;
            case 1:
                precoTotal += ((2 * cerveja) *adultos);
                break;
            case 2:
                precoTotal += ((0.5 * refri) * criancas);
                break;

            case 3:
                precoTotal += ((2 * cerveja) *adultos) + ((0.5 * refri) * criancas);
                break;
            
            default: System.out.println("Selecione uma opção do cardápio.");
                sc.close();
                return;
        }
    
        
 /*•Para qualquer tipo de churrasco
•2 garrafas de cerveja por adulto se ele quiser bebidas para adultos
•0,5 garrafas de refrigerante por criança se ele quiser bebidas para crianças */
        if (pao == 'N'){
            precoTotal -= precoTotal * 0.02;
            System.out.printf("""
                \n O valor final com inclusão de:
                \n Churrasco %s,
                \n Bebidas para %d adultos e %d crianças
                \n foi de: %.2f , direcione-se ao caixa para pagamento.""", sigla, adultos, criancas, precoTotal
            );
        } else if (pao == 'S'){
            System.out.printf("""
                \n O valor final com inclusão de:
                \n Churrasco %s,
                \n Pão de Alho,
                \n Bebidas para %d adultos e %d crianças,
                \n foi de: %.2f , direcione-se ao caixa para pagamento.""", sigla, adultos, criancas, precoTotal
            );
        } else {
            System.out.print("O caracter inserido foi errôneo, responda-o corretamente para cálculo final.");
            sc.close();
            return;
        }
        sc.close();
    }
}
