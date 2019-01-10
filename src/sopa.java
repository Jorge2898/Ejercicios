import java.util.Scanner;

public class sopa {
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
		for (int i=0; i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m [i] [j] = (char) (Math.random()*26 + 'A');
			}
		}
		
		
	}
	
	
	public static String[] Words() {
		String word;
		String[] v = new String[MAX];
		// CREO VECTOR
				for (int i = 0; i < MAX; i++) {
					System.out.println("Introduzca la palabra "+(i+1));
					word = t.next();
					word.toUpperCase();
					v[i] = word;
					for(int j = 1; j < i; j++) {
						System.out.println(v[i]);
						System.out.println(v[j]);
						while( v [i].equals(v[j])) {
							System.out.println("Introduzca la palabra "+(j+1));
							word = t.next();
							word.toUpperCase();
							v[i] = word;
						}
						//if para que sea mayor 0
						//do while para que sean 
					}
				}
				return v;
	}
	public static void main(String[] args) {
		char m[][] = new char[15][15];
		
		System.out.println("--------------");
		System.out.println("SOPA DE LETRAS");
		System.out.println("--------------");
		Sopa(m);
		Words();
		Aleator(m);
		Sopa(m);
		
	}

}
