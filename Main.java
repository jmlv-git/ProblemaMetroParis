import java.util.*;

public class Main {

	public static Node[] adicionar(Node[] a, Node b) {
		Node[] a2 = new Node[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			a2[i + 1] = a[i];
		}
		a2[0] = b;
		return a = a2;
	}

	public static Node[] remover(Node[] a) {
		Node[] a2 = new Node[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			a2[i - 1] = a[i];
		}
		return a = a2;
	}

	public static void append(int[] a, int size, int b) {
		a[size] = b;
	}

	public static Node[] ordenar(Node[] a) {

		Node aux;
		int i = 0;

		for (i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] != null && a[j + 1] != null && a[j].g + a[j].h > a[j + 1].g + a[j + 1].h) {
					aux = a[j];// verificar essa questao do null
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] hAll = new double[14][14];

		for (int i = 0; i < hAll.length; i++) {
			for (int j = 0; j < hAll.length; j++) {

				if (i == j) {
					hAll[i][j] = 0;
				} else {
					hAll[i][j] = -1;
				}
			}
		}

		// Preenchendo tabela:
		// linha 1
		hAll[0][1] = 10;
		hAll[0][2] = 18.5;
		hAll[0][3] = 24.8;
		hAll[0][4] = 36.4;
		hAll[0][5] = 38.8;
		hAll[0][6] = 35.8;
		hAll[0][7] = 25.4;
		hAll[0][8] = 17.6;
		hAll[0][9] = 9.1;
		hAll[0][10] = 16.7;
		hAll[0][11] = 27.3;
		hAll[0][12] = 27.6;
		hAll[0][13] = 29.8;
		// linha 2
		hAll[1][2] = 8.5;
		hAll[1][3] = 14.8;
		hAll[1][4] = 26.6;
		hAll[1][5] = 29.1;
		hAll[1][6] = 26.1;
		hAll[1][7] = 17.3;
		hAll[1][8] = 10;
		hAll[1][9] = 3.5;
		hAll[1][10] = 15.5;
		hAll[1][11] = 20.9;
		hAll[1][12] = 19.1;
		hAll[1][13] = 21.8;
		// linha 3
		hAll[2][3] = 6.3;
		hAll[2][4] = 18.2;
		hAll[2][5] = 20.6;
		hAll[2][6] = 17.6;
		hAll[2][7] = 13.6;
		hAll[2][8] = 9.4;
		hAll[2][9] = 10.3;
		hAll[2][10] = 19.5;
		hAll[2][11] = 19.1;
		hAll[2][12] = 12.1;
		hAll[2][13] = 16.6;
		// linha 4
		hAll[3][4] = 12;
		hAll[3][5] = 14.4;
		hAll[3][6] = 11.5;
		hAll[3][7] = 12.4;
		hAll[3][8] = 12.6;
		hAll[3][9] = 16.7;
		hAll[3][10] = 23.6;
		hAll[3][11] = 18.6;
		hAll[3][12] = 10.6;
		hAll[3][13] = 15.4;
		// linha 5
		hAll[4][5] = 3;
		hAll[4][6] = 2.4;
		hAll[4][7] = 19.4;
		hAll[4][8] = 23.3;
		hAll[4][9] = 28.2;
		hAll[4][10] = 34.2;
		hAll[4][11] = 24.8;
		hAll[4][12] = 14.5;
		hAll[4][13] = 17.9;
		// linha 6
		hAll[5][6] = 3.3;
		hAll[5][7] = 22.3;
		hAll[5][8] = 25.7;
		hAll[5][9] = 30.3;
		hAll[5][10] = 36.7;
		hAll[5][11] = 27.6;
		hAll[5][12] = 15.2;
		hAll[5][13] = 18.2;
		// linha 7
		hAll[6][7] = 20;
		hAll[6][8] = 23;
		hAll[6][9] = 27.3;
		hAll[6][10] = 34.2;
		hAll[6][11] = 25.7;
		hAll[6][12] = 12.4;
		hAll[6][13] = 15.6;
		// linha 8
		hAll[7][8] = 8.2;
		hAll[7][9] = 20.3;
		hAll[7][10] = 16.1;
		hAll[7][11] = 6.4;
		hAll[7][12] = 22.7;
		hAll[7][13] = 27.6;
		// linha 9
		hAll[8][9] = 13.5;
		hAll[8][10] = 11.2;
		hAll[8][11] = 10.9;
		hAll[8][12] = 21.2;
		hAll[8][13] = 26.6;
		// linha 10
		hAll[9][10] = 17.6;
		hAll[9][11] = 24.2;
		hAll[9][12] = 18.7;
		hAll[9][13] = 21.2;
		// linha 11
		hAll[10][11] = 14.2;
		hAll[10][12] = 31.5;
		hAll[10][13] = 35.5;
		// linha 12
		hAll[11][12] = 28.8;
		hAll[11][13] = 33.6;
		// linha 13
		hAll[12][13] = 5.1;

		// espelhando valores adicionados

		for (int i = 0; i < hAll.length; i++) {
			for (int j = 0; j < hAll.length; j++) {

				if (hAll[i][j] == -1) {
					hAll[i][j] = hAll[j][i];
				} // poderia colocar um else if para quando chegasse em uma celula
					// diferente de -1 e 0, entao parava esse for (ia para a prox linha)
			}
		}

		// transformando tabela h de distancias ideais entre estações para gasto de
		// tempo ideal (em minuto):

		for (int i = 0; i < hAll.length; i++) {
			for (int j = 0; j < hAll.length; j++) {
				hAll[i][j] = hAll[i][j] * 2;// / 30) * 60;
			}
		}

		// construindo a tabela de distancias reais
		double[][] distanciaReal = new double[14][14];
		// preenchendo toda tabela com zero. para garantir que sabemos tudo que tem lá
		for (int i = 0; i < distanciaReal.length; i++) {
			for (int j = 0; j < distanciaReal.length; j++) {

				if (i == j) {
					// distanciaReal[i][j] = 0;// talvez tenhamos q colocar -1, pois nao exite
					// aresta do nó x->x
					distanciaReal[i][j] = -1;
				} else {
					distanciaReal[i][j] = -1;
				}
			}
		}

		distanciaReal[0][1] = 10;
		distanciaReal[1][2] = 8.5;
		distanciaReal[1][8] = 10;
		distanciaReal[1][9] = 3.5;
		distanciaReal[2][3] = 6.3;
		distanciaReal[2][8] = 9.4;
		distanciaReal[2][12] = 18.7;
		distanciaReal[3][4] = 13;
		distanciaReal[3][7] = 15.3;
		distanciaReal[3][12] = 12.8;
		distanciaReal[4][5] = 3;
		distanciaReal[4][6] = 2.4;
		distanciaReal[4][7] = 30;
		distanciaReal[7][8] = 9.6;
		distanciaReal[7][11] = 6.4;
		distanciaReal[8][10] = 12.2;
		distanciaReal[12][13] = 5.1;
		// espelhando valore ((x,y)=(y,x))
		for (int i = 0; i < distanciaReal.length; i++) {
			for (int j = 0; j < distanciaReal.length; j++) {

				if (distanciaReal[i][j] == -1) {
					distanciaReal[i][j] = distanciaReal[j][i];
				}
			}
		}

//		for (int i = 0; i < distanciaReal.length; i++) {
//			for (int j = 0; j < distanciaReal.length; j++) {
//				System.out.print(distanciaReal[i][j] + "   	");
//			}
//			System.out.println();
//		}

//		System.out.println();
//		System.out.println();
		// transformando a dist em tempo
		for (int i = 0; i < distanciaReal.length; i++) {
			for (int j = 0; j < distanciaReal.length; j++) {
				distanciaReal[i][j] = distanciaReal[i][j] * 2;// / 30) * 60;
			}
		}
		// printando
//		for (int i = 0; i < distanciaReal.length; i++) {
//			for (int j = 0; j < distanciaReal.length; j++) {
//				System.out.print(distanciaReal[i][j] + "   	");
//			}
//			System.out.println();
//		}

		Edge[][] g = new Edge[14][14];// dist real, matriz de adjacencias (fiz isso pois nome E muito grande)
		// tranformando cada celula da tabela de adjacencias em objetos do tipo Edge
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				g[i][j] = new Edge(i, j, distanciaReal[i][j], null);
			}
		}
		// identificando linhas
		// E1
		g[0][1].linha = "AZ";
		// E2
		g[1][2].linha = "AZ";
		g[1][8].linha = "AM";
		g[1][9].linha = "AM";
		// E3
		g[2][3].linha = "AZ";
		g[2][8].linha = "VM";
		g[2][12].linha = "VM";
		// E4
		g[3][4].linha = "AZ";
		g[3][7].linha = "VD";
		g[3][12].linha = "VD";
		// E5
		g[4][5].linha = "AZ";
		g[4][6].linha = "AM";
		g[4][7].linha = "AM";
		// E6 e E7 nao precisa
		// E8
		g[7][8].linha = "AM";
		g[7][11].linha = "VD";
		// E9
		g[8][10].linha = "VM";
		// E13
		g[12][13].linha = "VD";
		// espelhando valores de linha
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) {
				if (g[i][j].linha != null) {// verificar se o correto é .equals ou ==
					g[j][i].linha = g[i][j].linha;
				}
			}
		}

		System.out.println("Digite o número de sua estação atual");

		int Ei = in.nextInt();
		Ei--; // estacao x fica no indice x-1
		System.out.println("Digite o número da estação final desejada");
		int Ef = in.nextInt();
		Ef--;
		double[] h = hAll[Ef];// função heuristica que vai ser usada

		Node[] front = new Node[0];

		boolean foi = false;
		if (Ei == Ef) {
			foi = true;
		} else {
			for (int i = 0; i < g.length; i++) {
				if (g[Ei][i].peso > 0) {
					Node newNode = new Node(i, h[i], g[Ei][i].peso, g[Ei][i].linha);
					newNode.path.add(Ei);
					front = adicionar(front, newNode);
				}
			}
			front = ordenar(front);
			// Arrays.sort(front);
			for (int i = 0; i < front.length; i++) {
				System.out.print(front[i].id + 1 + " ");
			}
			System.out.println();
		}
		Node Na;
		while (!foi) {
			Na = front[0];
			front = remover(front);
			if (Na.id == Ef) {
				foi = true;
				Na.path.add(Ef);
				System.out.println("Caminho:");
				for (int i = 0; i < Na.path.size(); i++) {
					System.out.print(Na.path.get(i) + 1 + " ");
				}
				System.out.println();
				System.out.println("Tempo:" + Na.g+" minutos");
			} else {

				for (int i = 0; i < g.length; i++) {
					if (g[Na.id][i].peso > 0) {
						Node newNode = new Node(i, h[i], g[Na.id][i].peso + Na.g, g[Na.id][i].linha);
						for (int j = 0; j < Na.path.size(); j++) {
							newNode.path.add(Na.path.get(j));// adicionando todos do caminho de Na
						}
						newNode.path.add(Na.id);// adicionando Na no caminho de newNode
						if (!Na.linhaUsada.equals(newNode.linhaUsada)) {// verificacao de baldeacao, se linha usada para
																		// chegar em Na sera a mesma para ir de Na para
																		// newNode
							newNode.g = newNode.g + 4;
						}
						front = adicionar(front, newNode);
					}
				}
				front = ordenar(front);
				// Arrays.sort(front);
				for (int i = 0; i < front.length; i++) {
					System.out.print(front[i].id + 1 + " ");
				}
				System.out.println();
			}
		}

	}

}

class Node {
	int id;
	double f;
	double g;
	double h;
	String linhaUsada;
	ArrayList<Integer> path;

	public Node(int nDoNode, double h, double g, String linhaUsada) {
		id = nDoNode;
		this.g = g;
		this.h = h;
		this.f = h;// nao está sendo util
		this.linhaUsada = linhaUsada;
		path = new ArrayList<Integer>();
	}
}

class Edge {
	int de;
	int para;
	double peso;
	String linha;

	public Edge(int de, int para, double peso, String linha) {
		this.de = de;
		this.para = para;
		this.peso = peso;
		this.linha = linha;
	}

}