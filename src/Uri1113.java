import java.util.Scanner;

public class Uri1113 {

	public static void main(String[] args) {

		/* URI Online Judge | 1113 - Crescente e Decrescente - OK
		 * 
		 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
		 * Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
		 * 
		 * ENTRADA
		 * 
		 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. 
		 * A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
		 * 
		 * SAÍDA
		 * 
		 * Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, 
		 * caso contrário imprima a mensagem “Decrescente”.
		 * 
		 * Exemplo de Entrada	    Exemplo de Saída
		 * 5 4                      Decrescente
		 * 7 2                      Decrescente
		 * 3 8                      Crescente
		 * 2 2
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		int x = imprimir.nextInt();
		int y = imprimir.nextInt();
		
		while(x != y) {
			
			if(x < y) {
				System.out.println("Crescente");
			}else {
				System.out.println("Decrescente");
			}
			
			x = imprimir.nextInt();
			y = imprimir.nextInt();
			
		}
		
		imprimir.close();
		
	}

}
