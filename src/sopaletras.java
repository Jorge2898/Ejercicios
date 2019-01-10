import java.util.Scanner;

public class sopaletras {
	static Scanner t = new Scanner(System.in);
	public static int MAX =10;
	/* 
	 * Nombre: 		 Sopa ()
	 * Entradas:	 char [] [] m -> La matriz para el tablero de juego
	 * Salidas:  	 void
	 * Descripción:	 Método que realiza el tablero de juego (tres en raya)			 	
	 */
	public static void Sopa(char m [] []) {
		int i, j;
		System.out.println("SOPA DE LETRAS");
		System.out.println(" ");
		for (i = 0; i < m.length; i++) { 					// FILA
			System.out.print("  ");
			for (j = 0; j < m[0].length; j++) { 			// COLUMNA
				System.out.print("|" + m[i][j] + "|");
			}
			System.out.println();
		}
	}
	public static void Aleator(char m [] []) {
		int fil;
		int col;
		for (int i = 0; i < 15; i++) {

		}
	}
	
	
	public static void Words() {
		
	}
	public static void main(String[] args) {
		char m[][] = new char[15][15];
		String[] v = new String[MAX];
		
		String word;
		// CREO VECTOR
				for (int i = 0; i < MAX; i++) {
					word = t.next();
					v[i] = word;
					
				}

		Sopa(m);
		Words();
		
	}

}
