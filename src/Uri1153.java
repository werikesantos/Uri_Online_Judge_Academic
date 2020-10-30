//AGUARDANDO RETORNO DA VALIDA��O DO URI ONLINE - HOJE (30-09) 09:47h
import java.util.Scanner;

public class Uri1153 {

	public static void main(String[] args) {

		/* URI Online Judge | 1153 - Fatorial Simples - OK
		 * 
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * 
		 * ENTRADA
		 * 
		 * A entrada cont�m um valor inteiro N (0 < N < 13).
		 * 
		 * SA�DA
		 * 
		 * A sa�da cont�m um valor inteiro, correspondente ao fatorial de N.
		 * 
		 * Exemplo de Entrada:	    Exemplo de Sa�da:
		 * 4                        24
		 *                                         
		 */
		
		Scanner imprimir = new Scanner(System.in);

		int N = imprimir.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= N; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		
		imprimir.close();
		System.exit(0);
	}
}