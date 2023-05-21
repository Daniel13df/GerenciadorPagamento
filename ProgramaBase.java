package GerenciadorPagamentos;
import java.util.Scanner;
public class ProgramaBase {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Taxas pagamento = new Taxas();
        

        System.out.println("Qual foi o valor do produto pago?");
        double valor = input.nextDouble();

        System.out.println("Qual a forma de pagamento?");
        System.out.println(" 1 - Cartão de Crédito");
        System.out.println(" 2 - Cartão de Débito");
        System.out.println(" 3 - Pix");
        System.out.println(" 4 - Dinheiro");
        int opcao = input.nextInt();

        switch(opcao){
            case 1:
            pagamento.Credito(valor);
            break;
            case 2:
            pagamento.Debito(valor);
            break;
            case 3:
            pagamento.Pix(valor);
            break;
            case 4:
            pagamento.Dinheiro(valor);
            break;
            default:
            System.out.println("Desculpe, não entendi. Rode novamente o app");
        }

    }
}
