package controlador;

import modelo.Resultats;

public interface InterficieResultat {

	Resultats MostrarResultat(Resultats resultatFinal);
	
	Resultats SeguentPartida(Resultats tornarAJugar);
	
}
