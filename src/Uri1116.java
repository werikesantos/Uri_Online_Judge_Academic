import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {

		/* URI Online Judge | 1067 - Dividindo X por Y - OK
		 * 
		 * Escreva um algoritmo que leia 2 n�meros e imprima o resultado da divis�o do primeiro pelo segundo. 
		 * Caso n�o for poss�vel mostre a mensagem �divisao impossivel� para os valores em quest�o.
		 * 
		 * ENTRADA
		 * 
		 * A entrada cont�m um n�mero inteiro N. Este N ser� a quantidade de pares de valores inteiros (X e Y) que ser�o lidos em seguida.
		 * 
		 * SA�DA
		 * 
		 * Para cada caso mostre o resultado da divis�o com um d�gito ap�s o ponto decimal, ou �divisao impossivel� caso n�o seja poss�vel efetuar o c�lculo.
		 * 
		 * Obs.: Cuide que a divis�o entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Sa�da:
		 * 3                        -1.5
		 * 3 -2                     divisao impossivel
		 * -8 0                     0.0    
		 * 0 8                                        
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);

		int N = imprimir.nextInt();
		double divisao = 0;

		for (int i = 0; i < N; i++) {
			int x = imprimir.nextInt();
			int y = imprimir.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				divisao = (double) x / y;
				System.out.printf("%.1f%n", divisao);
			}
		}
		imprimir.close();
		System.exit(0);
	}
}