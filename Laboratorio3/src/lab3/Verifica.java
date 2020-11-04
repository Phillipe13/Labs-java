package lab3;
/*
 *   Aluno: Phillipe Tibúrcio Ferreira da Silva
 */
public class Verifica {
	//Declaração de variaveis
	final char O='O';
	final char X='X';
    int resultado,j,i;
    
	public int Vencedor(char [][] tabuleiro) {// 0 = jogador1; 1=jogador2;2=empate;
		//Verificando se O ganhou
        if((tabuleiro[0][0]==O && tabuleiro[0][1]==O && tabuleiro[0][2]==O)||
           (tabuleiro[1][0]==O && tabuleiro[1][1]==O && tabuleiro[1][2]==O)||
           (tabuleiro[2][0]==O && tabuleiro[2][1]==O && tabuleiro[2][2]==O)||
           (tabuleiro[0][0]==O && tabuleiro[1][0]==O && tabuleiro[2][0]==O)||
           (tabuleiro[0][1]==O && tabuleiro[1][1]==O && tabuleiro[2][1]==O)||
           (tabuleiro[0][2]==O && tabuleiro[1][2]==O && tabuleiro[2][2]==O)||
           (tabuleiro[0][0]==O && tabuleiro[1][1]==O && tabuleiro[2][2]==O)||
           (tabuleiro[0][2]==O && tabuleiro[1][1]==O && tabuleiro[2][0]==O))
        {
        	for(i=0;i<3;i++)
	        {
	        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
	            if(i<3-1)
	            {
	            	System.out.print("\n------\n");
	            }
	        }
        	resultado = 1;
        }
        //Verificando se X ganhou
        if((tabuleiro[0][0]==X && tabuleiro[0][1]==X && tabuleiro[0][2]==X)||
           (tabuleiro[1][0]==X && tabuleiro[1][1]==X && tabuleiro[1][2]==X)||
           (tabuleiro[2][0]==X && tabuleiro[2][1]==X && tabuleiro[2][2]==X)||
           (tabuleiro[0][0]==X && tabuleiro[1][0]==X && tabuleiro[2][0]==X)||
           (tabuleiro[0][1]==X && tabuleiro[1][1]==X && tabuleiro[2][1]==X)||
           (tabuleiro[0][2]==X && tabuleiro[1][2]==X && tabuleiro[2][2]==X)||
           (tabuleiro[0][0]==X && tabuleiro[1][1]==X && tabuleiro[2][2]==X)||
           (tabuleiro[0][2]==X && tabuleiro[1][1]==X && tabuleiro[2][0]==X))
        {
        	for(i=0;i<3;i++)
	        {
	        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
	            if(i<3-1)
	            {
	            	System.out.print("\n------\n");
	            }
	        }
        	resultado = 2;

        }

        return resultado;
	}

}
