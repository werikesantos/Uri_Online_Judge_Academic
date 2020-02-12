import java.util.Locale;
import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) {

		/* URI Online Judge | 1003 - Soma Simples - OK
		 * 
		 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a
		 * soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta
		 * variável.
		 * 
		 * 
		 * Entrada:
		 * 
		 * O arquivo de entrada contém 2 valores inteiros.
		 * 
		 * Saída:
		 * 
		 * Imprima a variável SOMA com todas as letras maiúsculas, com um espaço em
		 * branco antes e depois da igualdade seguido pelo valor correspondente à soma
		 * de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha
		 * após o resultado, caso contrário, você receberá "Presentation Error".
		 * 
		 * Exemplos de Entrada:                        Exemplos de Saída:
		 * 10                                          SOMA = 40
		 * 30
		 * 
		 * -30                                         SOMA = -20
		 * 10
		 * 
		 * 0                                           SOMA = 0
		 * 0
		 */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int SOMA = (A + B);
		
		System.out.println("SOMA = " + SOMA);
		
		sc.close();
	}

}
