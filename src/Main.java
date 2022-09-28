import java.util.Scanner;

public class Main {
	
		private static char[][] mapa = new char[3][3];
		private static String torn = "J1";
		private static char J1 = 'X', J2 = 'O';
		private static int fila=0, columna=0, winner=0, i = 0;
		private static String[] historial = new String[9];
		
	public static void main(String[] args) {

		jugar();

	}
	
	public static void preguntarJugador() {
		System.out.println("Hola Jugador " + torn + ", on vols colocar la fitxa?");
		System.out.println("Fila: ");
		Scanner entrada1 = new Scanner(System.in);
		String filaString = entrada1.nextLine();
		fila = Integer.parseInt(filaString);
		
		System.out.println("Columna: ");
		Scanner entrada2 = new Scanner(System.in);
		String columnaString = entrada2.nextLine();
		columna = Integer.parseInt(columnaString);
		
		historial[i] = ("El Jugador " + torn + " ha colucat una fitza a [" + fila + "] [" + columna + "]");
	}
	
	public static void taulerBuit() {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mapa[i][j] = '#';
			}
		}
	}
	
	public static void taulerActualitzat() {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(mapa[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void torn() {
		if(torn.equals("J1")) {
			torn = "J2";
			
		}else if(torn.equals("J2")){
			torn = "J1";
			
		}else {
			System.out.println("Error al indicar el jugador");
		}
	}
	
	public static void tirar(int fila, int columna) {
		if(torn.equals("J1")) {
			mapa[fila][columna] = J1;
		}else if(torn.equals("J2")) {
			mapa[fila][columna] = J2;
		}else {
			System.out.println("Error al assignar X o O a la seva posició");
		}
	}
	
	public static void coincidenciaFila() {
		if(mapa[0][0]==J1 && mapa[0][1]==J1 && mapa[0][2]==J1) {
			winner = 1;
		}else if(mapa[0][0]==J2 && mapa[0][1]==J2 && mapa[0][2]==J2) {
			winner = 2;
			
		}else if(mapa[1][0]==J1 && mapa[1][1]==J1 && mapa[1][2]==J1) {
			winner = 1;
		}else if(mapa[1][0]==J2 && mapa[1][1]==J2 && mapa[1][2]==J2) {
			winner = 2;
			
		}else if(mapa[2][0]==J1 && mapa[2][1]==J1 && mapa[2][2]==J1) {
			winner = 1;
		}else if(mapa[2][0]==J2 && mapa[2][1]==J2 && mapa[2][2]==J2) {
			winner = 2;
		}
		
	}
	
	public static void coincidenciaColumna() {
		if(mapa[0][0]==J1 && mapa[1][0]==J1 && mapa[2][0]==J1) {
			winner = 1;
		}else if(mapa[0][0]==J2 && mapa[1][0]==J2 && mapa[2][0]==J2) {
			winner = 2;
			
		}else if(mapa[0][1]==J1 && mapa[1][1]==J1 && mapa[2][1]==J1) {
			winner = 1;
		}else if(mapa[0][1]==J2 && mapa[1][1]==J2 && mapa[2][1]==J2) {
			winner = 2;
			
		}else if(mapa[0][2]==J1 && mapa[1][2]==J1 && mapa[2][2]==J1) {
			winner = 1;
		}else if(mapa[0][2]==J2 && mapa[1][2]==J2 && mapa[2][2]==J2) {
			winner = 2;
		}
		
	}
	
	public static void coincidenciaDiagonal() {
		if(mapa[0][0]==J1 && mapa[1][1]==J1 && mapa[2][2]==J1) {
			winner = 1;
		}else if(mapa[0][0]==J2 && mapa[1][1]==J2 && mapa[2][2]==J2) {
			winner = 2;
			
		}else if(mapa[2][0]==J1 && mapa[1][1]==J1 && mapa[0][2]==J1) {
			winner = 1;
		}else if(mapa[2][0]==J2 && mapa[1][1]==J2 && mapa[0][2]==J2) {
			winner = 2;
			
		}
		
	}

	public static void iniciPartida() {
		i=0;
		winner=0;
		
		taulerBuit();
		do {
		
		taulerActualitzat();	
		preguntarJugador();
		torn();
		tirar(fila,columna);
		
		coincidenciaFila();
		coincidenciaColumna();
		coincidenciaDiagonal();
		
		i++;
		
		System.out.println("\n--------");
		
		}while(winner!=1 && winner!=2 && i!=9);
		if(winner==1) {
			System.out.println("Ha guanyat el jugador 1");
		}else if(winner==2){
			System.out.println("Ha guanyat el jugador 2");
		}else {
			System.out.println("Empat");
		}
		
	}

	public static void jugar() {
		
		String tornarAJugar;
		do{
		iniciPartida();
		
		System.out.println("Vols tornar a jugar? (S/N)");
		Scanner entrada = new Scanner(System.in);
		tornarAJugar = entrada.nextLine();
		
		}while(tornarAJugar.equals("N") && !tornarAJugar.equals("n"));
		
		for(int j=0;j==i;j++) {
			System.out.println(historial[j]);
		}
	}
}