import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		float[][] h = new float[14][14];

		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h.length; j++) {

				if (i == j) {
					h[i][j] = 0;
				} else {
					h[i][j] = -1;
				}
			}
		}
		// Preenchendo tabela:
		// linha 1
		h[0][1] = 10;
		h[0][2] = 18.5f;
		h[0][3] = 24.8f;
		h[0][4] = 36.4f;
		h[0][5] = 38.8f;
		h[0][6] = 35.8f;
		h[0][7] = 25.4f;
		h[0][8] = 17.6f;
		h[0][9] = 9.1f;
		h[0][10] = 16.7f;
		h[0][11] = 27.3f;
		h[0][12] = 27.6f;
		h[0][13] = 29.8f;
		// linha 2
		h[1][2] = 8.5f;
		h[1][3] = 14.8f;
		h[1][4] = 26.6f;
		h[1][5] = 29.1f;
		h[1][6] = 26.1f;
		h[1][7] = 17.3f;
		h[1][8] = 10f;
		h[1][9] = 3.5f;
		h[1][10] = 15.5f;
		h[1][11] = 20.9f;
		h[1][12] = 19.1f;
		h[1][13] = 21.8f;
		// linha 3
		h[2][3] = 6.3f;
		h[2][4] = 18.2f;
		h[2][5] = 20.6f;
		h[2][6] = 17.6f;
		h[2][7] = 13.6f;
		h[2][8] = 9.4f;
		h[2][9] = 10.3f;
		h[2][10] = 19.5f;
		h[2][11] = 19.1f;
		h[2][12] = 12.1f;
		h[2][13] = 16.6f;
		// linha 4
		h[3][4] = 12f;
		h[3][5] = 14.4f;
		h[3][6] = 11.5f;
		h[3][7] = 12.4f;
		h[3][8] = 12.6f;
		h[3][9] = 16.7f;
		h[3][10] = 23.6f;
		h[3][11] = 18.6f;
		h[3][12] = 10.6f;
		h[3][13] = 15.4f;
		// linha 5
		h[4][5] = 3f;
		h[4][6] = 2.4f;
		h[4][7] = 19.4f;
		h[4][8] = 23.3f;
		h[4][9] = 28.2f;
		h[4][10] = 34.2f;
		h[4][11] = 24.8f;
		h[4][12] = 14.5f;
		h[4][13] = 17.9f;
		// linha 6
		h[5][6] = 3.3f;
		h[5][7] = 22.3f;
		h[5][8] = 25.7f;
		h[5][9] = 30.3f;
		h[5][10] = 36.7f;
		h[5][11] = 27.6f;
		h[5][12] = 15.2f;
		h[5][13] = 18.2f;
		// linha 7
		h[6][7] = 20f;
		h[6][8] = 23f;
		h[6][9] = 27.3f;
		h[6][10] = 34.2f;
		h[6][11] = 25.7f;
		h[6][12] = 12.4f;
		h[6][13] = 15.6f;
		// linha 8
		h[7][8] = 8.2f;
		h[7][9] = 20.3f;
		h[7][10] = 16.1f;
		h[7][11] = 6.4f;
		h[7][12] = 22.7f;
		h[7][13] = 27.6f;
		// linha 9
		h[8][9] = 13.5f;
		h[8][10] = 11.2f;
		h[8][11] = 10.9f;
		h[8][12] = 21.2f;
		h[8][13] = 26.6f;
		// linha 10
		h[9][10] = 17.6f;
		h[9][11] = 24.2f;
		h[9][12] = 18.7f;
		h[9][13] = 21.2f;
		// linha 11
		h[10][11] = 14.2f;
		h[10][12] = 31.5f;
		h[10][13] = 35.5f;
		// linha 12
		h[11][12] = 28.8f;
		h[11][13] = 33.6f;
		// linha 13
		h[12][13] = 5.1f;

		// espelhando valores adicionados

		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h.length; j++) {

				if (h[i][j] == -1) {
					h[i][j] = h[j][i];
				} // poderia colocar um else if para quando chegasse em uma celula
					// diferente de -1 e 0, entao parava esse for (ia para a prox linha)
			}
		}

		// printando
//		for (int i = 0; i < h.length; i++) {
//			for (int j = 0; j < h.length; j++) {
//				System.out.print(h[i][j]+"   	");
//			}System.out.println();
//		}

		// transformando tabela h de distancias ideais entre estações para gasto de
		// tempo ideal (em minuto):

		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h.length; j++) {
				h[i][j] = (h[i][j] / 30) * 60;
			}
		}

		// printando
//		for (int i = 0; i < h.length; i++) {
//			for (int j = 0; j < h.length; j++) {
//				System.out.print(h[i][j] + "   	");
//			}
//			System.out.println();
//		}

		
	System.out.println("Digite o número de sua estação atual");	
		
		
	}

}
