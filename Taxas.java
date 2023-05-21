package GerenciadorPagamentos;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class Taxas {
    Scanner input = new Scanner(System.in);

    // Taxas
    double resultado, credito = 2.02, debito = 1.02, pix = 0, dinheiro = 0;

    // Data em que os valores caírão na conta
    LocalDate data = LocalDate.now(), 
    dataCredito = data.plusDays(2), 
    dataDebito = data.plusDays(1);

    DayOfWeek diaSemana = data.getDayOfWeek();
    LocalDate semanaCredito = LocalDate.now(),
    quintaC = semanaCredito.plusDays(4),
    sextaC = semanaCredito.plusDays(3),
    sextaD = semanaCredito.plusDays(3),
    sabadoD = semanaCredito.plusDays(2);
    
    
    //Está sendo exportado para a classe ProgramaBase (Main)
    public void Credito(double valor){
        
        System.out.println("Opção crédito selecionada com sucesso!");

        resultado = valor - credito;
        switch(diaSemana){
            case THURSDAY:
            System.out.printf("O resultado foi: %.2f e receberá esse valor no dia %s",resultado, quintaC);
            break;
            case FRIDAY:
            System.out.printf("O resultado foi: %.2f e receberá esse valor no dia %s",resultado, sextaC);
            break;
            default:
            System.out.printf("O resultado foi: %.2f e receberá esse valor no dia %s",resultado, dataCredito);
        }
    }

    public void Debito(double valor){

        System.out.println("Opção débito selecionada com sucesso!");

        resultado = valor - debito;
        
        switch(diaSemana) {
            case FRIDAY:
            System.out.printf("O resultado foi: %.2f e receberá esse valor no dia %s",resultado, sextaD);
            break;
            case SATURDAY:
            System.out.printf("O resultado foi: %.2f e receberá esse valor no dia %s",resultado, sabadoD);
            break;
            default:
            System.out.printf("O resultado foi: %.2f e receberá esse valor no dia %s",resultado, dataDebito);
    }
}

    public void Pix(double valor){

        System.out.println("Opção Pix selecionada com sucesso!");

        resultado = valor - pix;

        System.out.printf("O resultado foi: %.2f e receberá esse valor hoje (%s)",resultado, data);
    }

    public void Dinheiro(double valor){

        System.out.println("Opção Dinheiro selecionada com sucesso!");

        resultado = valor - dinheiro;

        System.out.printf("O resultado foi: %.2f",resultado);
    }
}
