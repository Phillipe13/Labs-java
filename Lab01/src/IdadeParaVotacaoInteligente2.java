/*
 *   Aluno: Phillipe Tibúrcio Ferreira da Silva
 **/
import java.util.Scanner;
public class IdadeParaVotacaoInteligente2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int anoAtual=2018;
        int anoNasc;
        System.out.print("Digite o ano em que nasceu: ");
        anoNasc = input.nextInt();
        idade = anoAtual-anoNasc;
        if (idade >= 16){
            System.out.println("Sua idade é "+idade+", você está apto a votar e exercer sua cidadania!");
            if (idade <= 18 || idade >= 70){
                System.out.println("Porém, você não tem obrigação de votar.");
            }
        }
        else{
            System.out.println("Sua idade é "+idade+", você não está apto a votar e exercer sua cidadania!");
        }
    }
}
