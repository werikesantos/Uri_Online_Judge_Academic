import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {

		/* URI Online Judge | 1067 - Intervalo 2 - OK
		 * 
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
		 * 
		 * ENTRADA
		 * 
		 * A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste. 
		 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
		 * 
		 * SAÍDA
		 * 
		 * Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
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