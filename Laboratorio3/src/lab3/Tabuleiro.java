/*
 *   Aluno: Phillipe Tibúrcio Ferreira da Silva
 */
package lab3;

public class Tabuleiro {
	char tabuleiro[][] = {{' ',' ',' '},
						  {' ',' ',' '}
						 ,{' ',' ',' '}};
	int i,j;
	public char[][] Mostrar(){
		System.out.print("  JOGO DA VELHA \n");
        //mostra o tabuleiro
        for(i=0;i<3;i++)
        {
        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
            if(i<3-1)
            {
            	System.out.print("\n------\n");
            }
        }
        return tabuleiro;
	}
	//Não entendo pq n funciona :'(
	public char[][] LimpaTabuleiro(){
		for(i=0;i<3;i++) {
	        for(j=0;j<3;j++) {
	            tabuleiro[i][j]=' ';
	        }
		}
		return tabuleiro;
	}
	
}
	