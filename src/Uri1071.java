import java.util.Scanner;

public class Uri1071 {

	public static void main(String[] args) {

		/* URI Online Judge | 1071 - Soma de Impares Consecutivos I - OK
		 * 
		 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
		 * 
		 * ENTRADA
		 * 
		 * O arquivo de entrada contém dois valores inteiros.
		 * 
		 * SAÍDA
		 * 
		 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
		 * 6                        5
		 * -5                      
		 * 
		 * 15                       13
		 * 12
		 * 
		 * 12                       0
		 * 12                      
		 *                         
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		int x = imprimir.nextInt();
		int y = imprimir.nextInt();
		
		int min, max;
		if (x < y) {
			min = x;
			max = y;
		}else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);
		imprimir.close();
	}
}