package modelo;

public class Resultats {
	
	private String puntuacio; //Revisar utilitat aqui
	private String resultatFinal;
	private String tornarAJugar;
	
	public String getPuntuacio() {
		return puntuacio;
	}
	public void setPuntuacio(String puntuacio) {
		this.puntuacio = puntuacio;
	}
	public String getResultatFinal() {
		return resultatFinal;
	}
	public void setResultatFinal(String resultatFinal) {
		this.resultatFinal = resultatFinal;
	}
	public String getTornarAJugar() {
		return tornarAJugar;
	}
	public void setTornarAJugar(String tornarAJugar) {
		this.tornarAJugar = tornarAJugar;
	}
	public Resultats() {

	}
	
	@Override
	public String toString() {
		return "Resultats [puntuacio=" + puntuacio + ", resultatFinal=" + resultatFinal + ", tornarAJugar="
				+ tornarAJugar + "]";
	}
	
	

}
