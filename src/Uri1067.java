import java.util.Scanner;

public class Uri1067 {

	public static void main(String[] args) {

		/* URI Online Judge | 1067 - Números Ímpares - OK
		 * 
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
		 * 
		 * ENTRADA
		 * 
		 * O arquivo de entrada contém 1 valor inteiro qualquer.
		 * 
		 * SAÍDA
		 * 
		 * Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
		 * 
		 * Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
		 * 8                        1
		 *                          3
		 *                          5
		 *                          7                 
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);

		int x = imprimir.nextInt();

		for(int i = 1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}		
		}
		imprimir.close();
		System.exit(0);
	}
}