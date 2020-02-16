import java.util.Locale;
import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {
		
		/* URI Online Judge | 1018 - Cédulas - OK
		 * 
		 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode 
		 * ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a 
		 * relação de notas necessárias.
		 * 
		 * Entrada:
		 * 
		 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
		 * 
		 * Saída:
		 * 
		 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o 
		 * exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa 
		 * apresentará a mensagem: “Presentation Error”.
		 * 
		 * Exemplo de Entrada:                          Exemplo de Saída:
		 * 576                                          576
		 * 												5 nota(s) de R$ 100,00
		 *												1 nota(s) de R$ 50,00
		 *												1 nota(s) de R$ 20,00
		 *												0 nota(s) de R$ 10,00
		 *												1 nota(s) de R$ 5,00
		 *												0 nota(s) de R$ 2,00
		 *												1 nota(s) de R$ 1,00
		 * 
		 * 11257                                        11257
		 * 												112 nota(s) de R$ 100,00
		 *												1 nota(s) de R$ 50,00
		 *												0 nota(s) de R$ 20,00
		 *												0 nota(s) de R$ 10,00
		 *												1 nota(s) de R$ 5,00
		 *												1 nota(s) de R$ 2,00
		 *												0 nota(s) de R$ 1,00
		 *  
		 * 503                                          503
		 * 												5 nota(s) de R$ 100,00
		 *												0 nota(s) de R$ 50,00
		 *												0 nota(s) de R$ 20,00
		 *												0 nota(s) de R$ 10,00
		 *												0 nota(s) de R$ 5,00
		 *												1 nota(s) de R$ 2,00
		 *												1 nota(s) de R$ 1,00
		 * 
		 */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int cedulas100, cedulas50, cedulas20, cedulas10, cedulas5, cedulas2, cedulas1, sobras;
		int N = sc.nextInt();
		
		cedulas100 = (N / 100); sobras = (N % 100);	
		cedulas50 = (sobras / 50); sobras = (sobras % 50);
		cedulas20 = (sobras / 20); sobras = (sobras % 20);
		cedulas10 = (sobras / 10); sobras = (sobras % 10);	
		cedulas5 = (sobras / 5); sobras = (sobras % 5);
		cedulas2 = (sobras / 2); sobras = (sobras % 2);
		cedulas1 = (sobras / 1);
		
		System.out.printf("%d%n%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n",N,cedulas100,cedulas50,cedulas20,cedulas10,cedulas5,cedulas2,cedulas1);
			
		sc.close();
	}

}
