package questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mediana {
	
	private int tamanho = 0;
	private ArrayList<Integer> lista; // lista para armazenar os valores desejados
	private Scanner scan;
	
	public Mediana() {
		
		lista = new ArrayList<Integer>();
		scan = new Scanner(System.in);	
		
		localizarMediana();
		
	}
	
	/* método para ler a lista de valores e encontrar a mediana */
	private void localizarMediana() {
		
		System.out.println("\n\n");
		
		/* aceitando apenas valores positivos e ímpares para o tamanho da lista */
		do {
			System.out.print("Informe o tamanho da lista (o valor deve ser ímpar e positivo): ");
			tamanho = scan.nextInt();
		}
		while((tamanho <= 0) || (tamanho % 2 == 0));
		
		/* lendo dados e alimentando a lista */
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite o valor " + (i + 1) + " da lista: ");
			lista.add(scan.nextInt());
		}
		
		/* ordenando a lista */
		lista.sort(null);		
		
		System.out.println("\n\nLista informada ordenada:");
		System.out.println(lista);
		
		/* exibindo a mediana, elemento central da lista ordenada */
		System.out.println("\nMediana da lista: " + lista.get(tamanho/2) + "\n\n");
		
	}
}
