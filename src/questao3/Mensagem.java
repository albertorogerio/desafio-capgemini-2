package questao3;

import java.util.Scanner;

public class Mensagem {
	
	private String texto = "";
	private Scanner scan;

	public Mensagem() {
		
		scan = new Scanner(System.in);
		encriptarMensagem();
		
	}	
	
	/* m�todo para ler e encriptar a mensagem */
	private void encriptarMensagem() {
		
		int totalCaracteres;
		int linhas; 			//n�mero de linhas que o grid conter�
		int colunas;			//n�mero de colunas que o grid conter�
		
		System.out.println("\n\nInforme o mensagem a ser encriptada:");
		texto = scan.nextLine();
		
		/* retirando espa�os em branco da mensagem */
		texto = texto.replace(" ", "");
		
		totalCaracteres = texto.length();
		
		/* raiz(total de caracteres) <= linhas */
		linhas = (int)Math.ceil(Math.sqrt(totalCaracteres));
		
		/* linhas <= colunas */
		colunas = linhas;		
		if(linhas * colunas < totalCaracteres) colunas++;		
		
		System.out.println();
		
		/* escrevendo a mensagem encriptada: os caracteres s�o
		 * exibidos um por linha, desde a primeira coluna (�ndice 0)
		 * at� a �ltima coluna. */		
		for(int i = 0; i < colunas; i++) {
			for(int j = i; j < totalCaracteres; j += linhas) {
				System.out.print(texto.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println("\n\n");
	}	
}