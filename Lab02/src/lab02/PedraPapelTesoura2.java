package lab02;
/*
 * Aluno: Phillipe Tib�rcio Ferreira da Silva 
 */
import java.util.Scanner;

class PedraPapelTesoura2 {
	public static void main(String[] args) {
	int res;
	final int n = 3;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Pedra(1), Papel(2) e Tesoura(3)");
	System.out.println("Para finalizar o jogo digite -1 em qualquer uma das entradas");
	
	while(true) 
	{
    System.out.print("Jogador 1: ");
    int j1 = entrada.nextInt();
    while (j1 < -1 || j1 > 3) {
    	System.out.println("Op��o inv�lida digite um numero entre 1 e 3");
    	j1 = entrada.nextInt();}
    System.out.print("Jogador 2: ");
    int j2 = entrada.nextInt();
    while (j2 < -1 || j2 > 3) {
    	System.out.println("Op��o inv�lida digite um numero entre 1 e 3");
    	j2 = entrada.nextInt();}
    if(j1 == -1 || j2 == -1)
    	break;
    res = (n+j1-j2)%n;
    System.out.println(Objeto.palavra(j1)+" - "+Objeto.palavra(j2));
    if (0 < res && res <= n/2){
      System.out.println("O jogador 1 ganhou!");
    }
    else if(res > n/2){
      System.out.println("O jogador 2 ganhou!");
    }
    else if(res == 0){
      System.out.println("Empate!");
    }
    }
	entrada.close();
	System.out.printf("Fim de jogo!");
 }
}