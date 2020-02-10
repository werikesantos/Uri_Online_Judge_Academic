import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		
		/* URI Online Judge | 1010 - Cálculo Simples - OK
		 * 
		 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
		 * 
		 * Entrada:
		 * 
		 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3
		 * valores, respectivamente dois inteiros e um valor com 2 casas decimais.
		 * 
		 * Saída:
		 * 
		 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
		 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
		 * valor deverá ser apresentado com 2 casas após o ponto.
		 * 
		 * Exemplos de Entrada:                      Exemplos de Saída:
		 * 12 1 5.30                                 VALOR A PAGAR: R$ 15.50
		 * 16 2 5.10
		 * 
		 * 13 2 15.30                                VALOR A PAGAR: R$ 51.40
		 * 161 4 5.20
		 * 
		 * 1 1 15.10                                 VALOR A PAGAR: R$ 30.20
		 * 2 1 15.10
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigo1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		float valorUnidade1 = sc.nextFloat();
		
		int codigo2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		float valorUnidade2 = sc.nextFloat();
		
		float valorAPagar= ((quantidade1 * valorUnidade1) + (quantidade2 * valorUnidade2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();
	}

}
