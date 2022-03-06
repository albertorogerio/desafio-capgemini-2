package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class ParesVetor {
	
	private int tamanhoVetor = 0;
	private int valorDiferenca = 0;
	private ArrayList<Integer> vetor; // lista para armazenar o vetor de inteiros desejado
	private Scanner scan;

	public ParesVetor() {
		vetor = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		
		localizarPares();
	}
	
	/* método para ler o vetor e localizar os pares */
	private void localizarPares() {
		
		int totalPares = 0;
		
		System.out.println("\n\n");
		
		/* aceitando apenas valores positivos para o tamanho do vetor */
		do {
			System.out.print("Informe o tamanho do vetor (o valor deve ser maior que zero): ");
			tamanhoVetor = scan.nextInt();
		}
		while(tamanhoVetor <= 0);
		
		/* lendo dados e alimentando o vetor */
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.print("Digite o valor " + (i + 1) + " do vetor: ");
			vetor.add(scan.nextInt());
		}
		
		/* lendo valor da diferença desejada entre os pares */
		System.out.print("\nInforme um valor inteiro para a diferença: ");
		valorDiferenca = scan.nextInt();
		
		System.out.println("\n\nVetor informado: " + vetor + "\n\n"); 
		
		/* verificando a diferença entre os elementos do vetor, dois
		 * a dois e, caso satisfaçam a valor da diferença dado, 
		 * conta e imprime o par */
		for(int i = 0; i < vetor.size() - 1; i++) {
			for(int j = i + 1; j < vetor.size(); j++) {
				if(Math.abs(vetor.get(i) - vetor.get(j)) == valorDiferenca) {
					totalPares++;
					System.out.print("[" + vetor.get(i) + "," + vetor.get(j) + "] ");
				}
			}
		}
		
		System.out.println("\n\nPares encontrados: " + totalPares + "\n\n");
	}	
}