import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {

		/* URI Online Judge | 1067 - Dividindo X por Y - OK
		 * 
		 * Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. 
		 * Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.
		 * 
		 * ENTRADA
		 * 
		 * A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.
		 * 
		 * SAÍDA
		 * 
		 * Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.
		 * 
		 * Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
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