/*
 *   Aluno: Phillipe Tibúrcio Ferreira da Silva
 */
package lab3;
import java.util.Scanner;
public class JogoDaVelhaModularizado {

	public static void main(String args[]){
		//Declaração de variaveis
		final char O='O';
		final char X='X';
	    int jogada=0,j,i;
	    Scanner sc = new Scanner(System.in);
	    Verifica r = new Verifica();
	    char tabuleiro [][] = new char [3][3];
	    //faz o jogo rodar
    	Tabuleiro tabuleiro1 = new Tabuleiro(); 
		while(jogada<=9) {
	    	tabuleiro = tabuleiro1.Mostrar();
	        //Jogadas do Jogador
	        System.out.println("\nINSIRA AS COORDENADAS");
	        if((jogada%2)==1)System.out.print("PLAYER 2\nLINHA: ");
	        else System.out.print("PLAYER 1\nLINHA: ");

	        i = sc.nextInt();
	        System.out.print("COLUNA: ");
	        j = sc.nextInt();
	        //Se o tabuleiro estiver vazio preenche com O ou X(verifica)
	        if(tabuleiro[i-1][j-1]==' ')
	        {
	            if((jogada%2)==1)tabuleiro[i-1][j-1]=X;
	            else tabuleiro[i-1][j-1]=O;
	            jogada++;
	        }
	        //Verifica Vencedor
		    int resultado = r.Vencedor(tabuleiro);
		    if (resultado == 1) {
		    	System.out.printf("Jogador 1 Venceu!");
		    	break;
		    }
		    else if (resultado == 2) {
		    	System.out.printf("Jogador 2 Venceu!");
		    	break;
		    }
	        //condição de empate
	        if(jogada==9)
	        {
	        	for(i=0;i<3;i++)
		        {
		        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
		            if(i<3-1)
		            {
		            	System.out.print("\n------\n");
		            }
		        }
	        	System.out.print("\nPARTIDA EMPATADA");
	            break;
	        }
	    }
	sc.close(); //fecha o objeto Scanner	
	}
}
