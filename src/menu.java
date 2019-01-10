import java.util.Scanner;

public class menu {
	
	/*MÉTODO JUGAR
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int opc;
		Scanner t = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.println("------PIEDRA----- ");
		System.out.println("------PAPEL------ ");
		System.out.println("------TIJERA----- ");
		System.out.println("THE GAME OF WORLD");
		System.out.println("-----------------");
		System.out.println("");
		do {
			try {
				System.out.println("0. Salir ");
				System.out.println("1. JUGADOR 1: ");
				System.out.println("2. JUGADOR 1 VS JUGADOR 2: ");
				System.out.println("3. OPCIONES: ");
				System.out.print("Opción: ");
				System.out.println("");
				opc = t.nextInt();

			} catch (Exception e) {
				t.next();
				opc = 4;

			}

			switch (opc) {
			case 0:
				System.out.println("GAME OVER");
				break;
			case 1:
				System.out.println("JUGAR");				//LLAMAMOS AL METODO JUGAR 1 JUGADOR
				break;
			case 2:
				System.out.println("JUGAR");					//LLAMAMOS AL METODO JUGAR 2 JUGADORES
				break;
			case 3:
				System.out.println("OPCIONES");					//LLAMAMOS AL METODO OPCIONES
				break;
			}

		} while (opc != 0);
	}
}
