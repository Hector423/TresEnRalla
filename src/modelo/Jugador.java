package modelo;

public class Jugador {
	
	private String nom;
	private String figura;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	
	public Jugador() {

	}
	
	@Override
	public String toString() {
		return "Jugador [nom=" + nom + ", figura=" + figura + "]";
	}
	
	
	

}
