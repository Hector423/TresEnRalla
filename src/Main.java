
public class Main {

	public static void main(String[] args) {
		char[][] mapa = new char[3][3];
		String torn = "";
		String historial = "";
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mapa[i][j] = '#';
			}
			System.out.println(mapa[i]);
		}

	}

}
