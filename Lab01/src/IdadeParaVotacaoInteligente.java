/*
 *   Aluno: Phillipe Tibúrcio Ferreira da Silva
 **/
import java.util.Scanner;
public class IdadeParaVotacaoInteligente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        if (idade >= 16){
            System.out.println("Sua idade é "+idade+", você está apto a votar e exercer sua cidadania!");
        }
        else{
            System.out.println("Sua idade é "+idade+", você não está apto a votar e exercer sua cidadania!");
        }
    }
}
