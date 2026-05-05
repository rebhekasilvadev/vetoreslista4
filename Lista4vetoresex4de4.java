package lista4vetores;

public class Lista4vetoresex4de4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[] vetor = {10, 15, 22, 33, 40, 51, 62, 70};
				int Pares = 0;

			
				for (int i = 0; i < 8; i++) {
					
					
					if (vetor[i] % 2 == 0) {
						Pares++; 
					}
				}

			
				System.out.println("A quantidade de números pares é: " + Pares);
	}}
