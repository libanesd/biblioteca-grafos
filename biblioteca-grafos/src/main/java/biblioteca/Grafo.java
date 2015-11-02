package biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Grafo {
		
	private List<Vertice> vertices;
	private List<Aresta> arestas;
	private String matAdj[][];

	public Grafo(ArrayList<Vertice> vertices, ArrayList<Aresta> arestas) {
		this.vertices = vertices;
		this.arestas = arestas;
		//montaMatAdj();
	}
	
	private void montaMatAdj() {
		
		Vertice vertice = new Vertice();
		Aresta aresta = new Aresta();
		
		matAdj = new String[vertices.size()][vertices.size()];
		
		for (int i=0; i< vertices.size(); i++){
			vertice = vertices.get(i);
			
			for (int j=0; j<arestas.size(); i++ ){
				aresta = arestas.get(j);
				
				if (aresta.getVertice1() == vertice){
					
					matAdj[i][j] = "1";
				}
			}
			
		}
	}
	
	
	public String buscaPorProfundidade(Vertice origem, Vertice alvo){
		
		Aresta aresta = new Aresta();
		Vertice verticeAtual = null;
		List<Vertice> lista = new ArrayList<Vertice>();
		String caminho = "", vizinhos = "";
		Set<Vertice> verticesVisitados = new HashSet<Vertice>();
		int cont = 1;
		
		lista.add(origem);
		verticeAtual = origem;
		
		while(!verticeAtual.equals(alvo)){
			verticesVisitados.add(verticeAtual);
			caminho+= verticeAtual.getNome() + " foi visitado.\n";
			
			for (int i = 0; i < arestas.size(); i++){
				aresta = arestas.get(i);
				vizinhos += verificaVertices(aresta, verticeAtual, lista);
			}
			
			if (vizinhos.trim().length() == 1){
				caminho += vizinhos + "é vizinho de " + verticeAtual.getNome() + ".\n";
			}else if (vizinhos.trim().length() > 1){
				caminho += vizinhos +"são vizinhos de " + verticeAtual.getNome() + ".\n";
			}
			
			vizinhos = "";
			verticeAtual = lista.get(cont);
			cont ++;
		}
		
		caminho += verticeAtual.getNome() + " foi visitado.\n";
		if (verticeAtual.equals(alvo)){
			caminho += "Destino " + verticeAtual.getNome() + " foi encontrado.";
		}else{
			caminho += "Destino não encontrado.";
		}
		
		return caminho;

	}


	private String verificaVertices(Aresta aresta, Vertice verticeAtual, List<Vertice> lista) {
		
		String caminho = "";
		
		if(aresta.getVertice1() == verticeAtual){
			caminho += trataVertice(aresta.getVertice1(), aresta.getVertice2(), lista);
		}else if (aresta.getVertice2() == verticeAtual){
			caminho += trataVertice(aresta.getVertice2(), aresta.getVertice1(), lista);

		}		
		
		return caminho;
	}

	private String trataVertice(Vertice analisado, Vertice vizinho, List<Vertice> lista) {
		
		int posNaLista;
		posNaLista = lista.indexOf(analisado);
		posNaLista ++;
		
		String caminho = "";
		caminho += vizinho.getNome() + " ";
		if (!lista.contains(vizinho)) {
			lista.add(posNaLista, vizinho);
		}
		
		return caminho;
	}
	
	public String buscaPorLargura(Vertice origem, Vertice alvo){
		Aresta aresta = new Aresta();
		Vertice verticeAtual = null;
		List<Vertice> lista = new ArrayList<Vertice>();
		String caminho = "";
		List<Vertice> verticesVisitados = new ArrayList<Vertice>();
		int cont = 1;
		int qtdVizinhos = 0;
		
		lista.add(origem);
		verticeAtual = origem;

		while (!verticeAtual.equals(alvo)) {
					
			verticesVisitados.add(verticeAtual);
			caminho += verticeAtual.getNome() + " foi visitado.\n";

			for (int i = 0; i < arestas.size(); i++) {
				aresta = arestas.get(i);

				if (aresta.getVertice1() == verticeAtual) {
					caminho += aresta.getVertice2().getNome() + " ";
					qtdVizinhos ++;
					if (!lista.contains(aresta.getVertice2())) {
						lista.add(aresta.getVertice2());
						
					}
				}else if (aresta.getVertice2() == verticeAtual){
					caminho += aresta.getVertice1().getNome() + " ";
					qtdVizinhos ++;
					if (!lista.contains(aresta.getVertice1())) {
						lista.add(aresta.getVertice1());
						qtdVizinhos ++;
					}
				}
				
			}
			if (qtdVizinhos == 1){
				caminho += "é vizinho de " + verticeAtual.getNome() + ".\n";
			}else if (qtdVizinhos > 1){
				caminho += "são vizinhos de " + verticeAtual.getNome() + ".\n";
			}
			qtdVizinhos = 0;
			verticeAtual = lista.get(cont);
			
			cont++;
			if (cont >= vertices.size())
				break;
			
		}
		caminho += verticeAtual.getNome() + " foi visitado.\n";
		if (verticeAtual.equals(alvo)){
			caminho += "Destino " + verticeAtual.getNome() + " foi encontrado.";
		}else{
			caminho += "Destino não encontrado.";
		}
		
		return caminho;
	}

	public String Dijkstra(Vertice origem, Vertice destino){
		
		Vertice verticeAtual = new Vertice();
		List<Vertice> naoVisitados = new ArrayList<Vertice>();
		List<TabelaDistancia> distancias = new ArrayList<TabelaDistancia>();
		TabelaDistancia distancia = new TabelaDistancia();
		
		for (Vertice vertice : vertices) {
			distancia.setV(vertice);
			distancia.setDistancia(2147483647);
			distancias.add(distancia);
			naoVisitados.add(vertice);
		}
		
		verticeAtual = origem;

		
		return "";
	}

}
