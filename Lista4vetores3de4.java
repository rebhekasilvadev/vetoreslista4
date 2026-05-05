package lista4vetores;

public class Lista4vetores3de4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
			
				int[] vetor = new int [] {12, 45, 7, 22, 31};
				int maior = vetor[0];
			
				for (int i = 0; i < 5; i++) {
					
				
					if (vetor[i] > maior) {
						maior = vetor[i]; 
					}
				}

			
				System.out.println("O maior número do vetor é: " + maior);
			}
	

	}
