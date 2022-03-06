package questao3;

import java.util.Scanner;

public class Mensagem {
	
	private String texto = "";
	private Scanner scan;

	public Mensagem() {
		
		scan = new Scanner(System.in);
		encriptarMensagem();
		
	}	
	
	/* método para ler e encriptar a mensagem */
	private void encriptarMensagem() {
		
		int totalCaracteres;
		int linhas; 			//número de linhas que o grid conterá
		int colunas;			//número de colunas que o grid conterá
		
		System.out.println("\n\nInforme o mensagem a ser encriptada:");
		texto = scan.nextLine();
		
		/* retirando espaços em branco da mensagem */
		texto = texto.replace(" ", "");
		
		totalCaracteres = texto.length();
		
		/* raiz(total de caracteres) <= linhas */
		linhas = (int)Math.ceil(Math.sqrt(totalCaracteres));
		
		/* linhas <= colunas */
		colunas = linhas;		
		if(linhas * colunas < totalCaracteres) colunas++;		
		
		System.out.println();
		
		/* escrevendo a mensagem encriptada: os caracteres são
		 * exibidos um por linha, desde a primeira coluna (índice 0)
		 * até a última coluna. */		
		for(int i = 0; i < colunas; i++) {
			for(int j = i; j < totalCaracteres; j += linhas) {
				System.out.print(texto.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println("\n\n");
	}	
}