//AGUARDANDO RETORNO DA VALIDAÇÃO DO URI ONLINE - HOJE (30-09) 09:47h
import java.util.Scanner;

public class Uri1132 {

	public static void main(String[] args) {

		/* URI Online Judge | 1132 - Múltiplos de 13 - OK
		 * 
		 * Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que NÃO são múltiplos de 13 entre X e Y, incluindo ambos.
		 * 
		 * ENTRADA
		 * 
		 * O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
		 * 
		 * SAÍDA
		 * 
		 * Imprima a soma de todos os valores NÃO divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
		 * 100                      13954
		 * 200                     
		 *                                         
		 */
		
		Scanner imprimir = new Scanner(System.in);

		int x = imprimir.nextInt();
		int y = imprimir.nextInt();

		int soma = 0;
		
		int menor = x;
		int maior = y;
		
		if (x > y) {
			menor = y;
			maior = x;
		}
		
		for (int i = menor; i <= maior; i++) {
			
			if(i % 13 != 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);
		imprimir.close();
		System.exit(0);
	}
}