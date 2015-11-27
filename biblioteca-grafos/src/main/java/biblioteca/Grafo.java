package biblioteca;

import java.util.List;

public class Grafo {

	private List<String> vertices;
	private List<Aresta> arestas;
	private int matAdj[][];
	private boolean ehConexo;
	private boolean temPeso;
	private boolean ehDirecionado;
	


	public Grafo(List<String> vertices, int matAdj[][], List<Aresta> arestas, boolean ehConexo, boolean temPeso, boolean ehDirecionado) {
		this.vertices = vertices;
		this.matAdj = matAdj;
		this.arestas = arestas;
		this.ehConexo = ehConexo;
		this.temPeso = temPeso;
		this.ehDirecionado = ehDirecionado;
	}
	

	public boolean temPeso() {
		return temPeso;
	}

	public List<String> getVertices() {
		return vertices;
	}
	
	public List<Aresta> getArestas() {
		return arestas;
	}

	public int[][] getMatAdj() {
		return matAdj;
	}

	public boolean ehConexo() {
		return ehConexo;
	}
	public boolean ehDirecionado() {
		return ehDirecionado;
	}

}
