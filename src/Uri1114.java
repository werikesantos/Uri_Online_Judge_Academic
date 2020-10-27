import java.util.Scanner;

public class Uri1114 {

	public static void main(String[] args) {

		/* URI Online Judge | 1114 - Senha Fixa - OK
		 * 
		 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
		 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
		 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
		 * Considere que a senha correta é o valor 2002. 
		 * 
		 * ENTRADA
		 * 
		 * A entrada é composta por vários casos de testes contendo valores inteiros.
		 * 
		 * SAÍDA
		 * 
		 * Para cada valor lido mostre a mensagem correspondente à descrição do problema.
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
		 * 2200                     Senha Invalida
		 * 1020                     Senha Invalida
		 * 2022                     Senha Invalida
		 * 2002                     Acesso Permitido
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		String senha = "2002";
		String tentativaAcesso = imprimir.next();
		
		while(tentativaAcesso != null) {
			
			if(tentativaAcesso.equals(senha)) {
				System.out.println("Acesso Permitido");	
				imprimir.close();
				System.exit(0);
			}else {
				System.out.println("Senha Invalida");
			}
			tentativaAcesso = imprimir.next();
		}	
	}
}
