package lista4vetores;

import java.util.Scanner;

public class Lista4vetoresex1de4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int[] vetor = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número inteiro:");
			vetor[i] = receba.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Os números digitados foram:");
			System.out.println(vetor[i]);

		}
		receba.close();

	}

}
