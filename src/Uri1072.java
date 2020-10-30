import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {

		/* URI Online Judge | 1067 - Intervalo 2 - OK
		 * 
		 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		 * Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es.
		 * 
		 * ENTRADA
		 * 
		 * A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste. 
		 * Cada caso de teste a seguir � um valor inteiro X (-107 < X <107).
		 * 
		 * SA�DA
		 * 
		 * Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos valores est�o fora (out) do intervalo.
		 * 
		 * Exemplo de Entrada:	    Exemplo de Sa�da:
		 * 4                        2 in
		 * 14                       2 out
		 * 123                         
		 * 10                                          
		 * -25
		 */
		
		Scanner imprimir = new Scanner(System.in);

		int N = imprimir.nextInt();
		int dentro = 0;
		int fora = 0;
		for (int i = 0; i < N; i++) {
			int x = imprimir.nextInt();
			if (x >= 10 && x <= 20) {
				dentro = dentro + 1;
			} else {
				fora = fora + 1;
			}
		}
		System.out.println(dentro + " in");
		System.out.println(fora + " out");

		imprimir.close();
		System.exit(0);
	}
}