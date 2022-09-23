package modelo;

import java.util.Arrays;

public class Taulell {
	
	protected char[][] mapa = new char[3][3]; //Canviar el diagrama
	private String torn = "";
	private String historial = "";
	
	public char[][] getMapa() {
		return mapa;
	}
	public void setMapa(char[][] mapa) {
		this.mapa = mapa;
	}
	public String getTorn() {
		return torn;
	}
	public void setTorn(String torn) {
		this.torn = torn;
	}
	public String getHistorial() {
		return historial;
	}
	public void setHistorial(String historial) {
		this.historial = historial;
	}
	
	public Taulell() {

	}
	
	@Override
	public String toString() {
		return "Taulell [mapa=" + Arrays.toString(mapa) + ", torn=" + torn + ", historial=" + historial + "]";
	}
	
	
	
	
	
	

}

