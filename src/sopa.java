/***
		 * PROGRAMA DE SOPA DE LETRAS
		 *** 
		 * AUTOR: Jorge Castilla García
		 *** 
		 * FECHA: 11/01/2019
		 * VERSION: 1.0
		 *** 
		 * CURSO: DM1B
		 * DESCRIPCION: Programa de realización de la sopa de letras donde el usuario 
		 * introduce 10 palabras que serán colocadas aleatoriamente en el tablero. 
		 ***/


import java.util.Scanner;

public class sopa {
	static Scanner t = new Scanner(System.in);
	public static int MAX =10;
	
	
	/* 
	 * Nombre: 		 Sopa ()
	 * Entradas:	 char [] [] m -> La matriz para el tablero de juego
	 * Salidas:  	 void
	 * Descripción:	 Método que realiza el tablero de juego (sopa de letras)			 	
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
	
	
	/* 
	 * Nombre: 		 Aleator ()
	 * Entradas:	 char [] [] m -> La matriz para el tablero de juego
	 * Salidas:  	 void
	 * Descripción:	 Método que realiza la introducción de las palabras aleatorias en la sopa			 	
	 */
	public static void Aleator(char m [] []) {
		/*int med=0;
		for (int i = 0; i < MAX; i++) {
			med=v[i].length();		
			}*/
		
		for (int i=0; i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m [i] [j] = (char) (Math.random()*26 + 'A');
			}
		}
		
		
	}
	
	/* 
	 * Nombre: 		 Words ()
	 * Entradas:	 nada
	 * Salidas:  	 String
	 * Descripción:	 Método que realiza la introducción de las palabras con sus respectivas comprobaciones		 	
	 */
	public static String[] Words() {
		String word = null;
		String[] v = new String[MAX];
		
		boolean flag = true;
		
		// CREO VECTOR
		for (int i = 0; i < MAX; i++) {
			
			do {
				System.out.println("Introduzca la palabra " + (i + 1));
				word = t.next();
				word = word.toUpperCase();
				v[i] = word;
				
				flag= true;
				
				for(int j=0;j<v[i].length();j++) {
					if(v[i].charAt(j)<'A'||v[i].charAt(j)>'Z'){
						if(v[i].charAt(j) !='Ñ') {
							flag = false;
						}
						
					}
				}
			} while (word.length() > 15 || word.length() < 3 || flag==false);
			
			if (i > 0) {
				for (int j = 0; j < i; j++) {

					if (v[i].equals(v[j])) {
						do {
							System.out.println("Introduzca la palabra " + (i + 1));
							word = t.next();
							word = word.toUpperCase();
							v[j] = word;
						} while (word.length() > 15 || word.length() < 3 ||v[i].equals(v[j]));
					}
				}
			}

		}
			
		
		
		return v;
	}

	public static void Orden(String v[]) {
		char[][] x = new char[MAX][MAX];
		int med;
		String change;
		for (int i = 0; i < MAX; i++) {
			for (int j = i; j < MAX; j++) {
				if (v[i].length() < v[j].length()) {
					change = v[i];
					v[i] = v[j];
					v[j] = change;
				}
			}
			
		}
		for(int i = 0; i < MAX; i++){
		med = v [i].length();
		for (int j = 0; j <= med - 1; j++) {
			x[i][j]= v[i].charAt(j);
			System.out.print(x[i][j]+" ");
		}
		System.out.println();
	}

	}
	public static void main(String[] args) {
		char m[][] = new char[15][15];
		System.out.println("--------------");
		System.out.println("SOPA DE LETRAS");
		System.out.println("--------------");
		Sopa(m);
		String[] v = Words();
		System.out.println();
		Orden(v);
		System.out.println();
		Aleator(m);
		Sopa(m);
		
	}

}
