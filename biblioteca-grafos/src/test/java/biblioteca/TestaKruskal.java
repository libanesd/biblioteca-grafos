package biblioteca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaKruskal {
	
	private Grafo grafo;
	
	@Before
	public void criaGrafo(){
		
		GrafoParaTeste grafoTeste = new GrafoParaTeste();
		grafo = grafoTeste.criaGrafoPonderado();
		
	}
	
	@Test
	public void testeKruskal(){
		String esperado = "Kruskal:\n"
				+ "1 3 6,\n"
				+ "3 2 9,\n"
				+ "0 1 10,\n"
				+ "3 0 12,\n"
				+ "37\n";
		assertEquals(esperado, grafo.kruskal());
	}

}
