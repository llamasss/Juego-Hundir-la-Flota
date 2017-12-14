public class batalla {

	public static void main(String[] args) {
		
		char matriz[][] = new char[5][5];		
		matriz[0][0] = ' ';
		matriz[0][1] = ' ';
		matriz[0][2] = ' ';
		matriz[0][3] = ' ';
		matriz[0][4] = ' ';
		
		matriz[1][0] = ' ';
		matriz[1][1] = ' ';
		matriz[1][2] = ' ';
		matriz[1][3] = ' ';
		matriz[1][4] = ' ';
		
		matriz[2][0] = ' ';
		matriz[2][1] = ' ';
		matriz[2][2] = ' ';
		matriz[2][3] = ' ';
		matriz[2][4] = ' ';
		
		matriz[3][0] = ' ';
		matriz[3][1] = ' ';
		matriz[3][2] = ' ';
		matriz[3][3] = ' ';
		matriz[3][4] = ' ';
		
		matriz[4][0] = ' ';
		matriz[4][1] = ' ';
		matriz[4][2] = ' ';
		matriz[4][3] = ' ';
		matriz[4][4] = ' ';

		/* Posición aleatoria del barco horizontal de 2 */
		int x1=(int)Math.floor(Math.random()*4);
		int y1=(int)Math.floor(Math.random()*5);
		/* Posición aleatoria del barco vertical de 2 */
		int x2=(int)Math.floor(Math.random()*5);
		int y2=(int)Math.floor(Math.random()*4);
		/* Posición aleatoria del barco horizontal de 3 */
		int x3=(int)Math.floor(Math.random()*3);
		int y3=(int)Math.floor(Math.random()*5);
		/* Posición aleatoria del barco vertical de 3 */
		int x4=(int)Math.floor(Math.random()*5);
		int y4=(int)Math.floor(Math.random()*3);
		
		/*Barco de 2 horizontal */
		matriz[y1][x1]='a';
		matriz[y1][x1+1]='a';
		
		/*Barco de 2 vertical*/
		do {
			
			x2=(int)Math.floor(Math.random()*5);
			y2=(int)Math.floor(Math.random()*4);
			
	} while(matriz[y2][x2]=='a' || matriz[y2+1][x2]=='a' );
		matriz[y2][x2]='b';
		matriz[y2+1][x2]='b';
	
		/*Barco de 3 horizontal*/
		do {
			x3=(int)Math.floor(Math.random()*3);
			y3=(int)Math.floor(Math.random()*5);
			
	} while(matriz[y3][x3]=='a' || matriz[y3][x3+1]=='a' || matriz[y3][x3+2]=='a' || matriz[y3][x3]=='b' || matriz[y3][x3+1]=='b' || matriz[y3][x3+2]=='b' );
		matriz[y3][x3]='c';
		matriz[y3][x3+1]='c';
		matriz[y3][x3+2]='c';
		
		
		/*Barco de 3 vertical*/
		do {
			x3=(int)Math.floor(Math.random()*5);
			y3=(int)Math.floor(Math.random()*3);
	} while(matriz[y4][x4]=='a' || matriz[y4+1][x4]=='a' || matriz[y4+2][x4]=='a' || matriz[y4][x4]=='b' || matriz[y4+1][x4]=='b'|| matriz[y4+2][x4]=='b' || matriz[y4][x4]=='c' || matriz[y4+1][x4]=='c' || matriz[y4+2][x4]=='c');
		matriz[y4][x4]='d';
		matriz[y4+1][x4]='d';
		matriz[y4+2][x4]='d';
		
	
		
		/*
		 Printear tabla con barcos vistos
		 */
		for (int i=0; i<5; i++) {
			System.out.println();
			for (int j=0; j<5; j++) {
				System.out.print(matriz[i][j] + " ");
}
				
		
		
				
			}
	}}