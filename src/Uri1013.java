import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		
		/* URI Online Judge | 1013 - O Maior - OK
		 * 
		 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh 
		 * o maior”. Utilize a fórmula:
		 * 
		 * 
		 * MaiorAB=(a+b+abs(a-b))
         *         -------------- 
         *               2
		 * 
		 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é 
		 * necessário para chegar no resultado esperado.
		 * 
		 * 
		 * Entrada:
		 * 
		 * O arquivo de entrada contém três valores inteiros.
		 * 
		 * Saída:
		 * 
		 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
		 * 
		 * Exemplos de Entrada:                            Exemplos de Saída: 
		 * 7 14 106                                        106 eh o maior
		 * 
		 * 217 14 6                                        217 eh o maior
		 */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maiorAB = ((A + B + Math.abs(A - B)) / 2);
		int maior = ((maiorAB + C + Math.abs(maiorAB - C)) / 2);
		
		System.out.printf("%d eh o maior%n", maior);
		
		sc.close();
		
	}

}
