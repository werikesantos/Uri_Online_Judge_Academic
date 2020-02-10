import java.util.Locale;
import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) {
		
		/* URI Online Judge | 1007 - Diferença - OK
		 * 
		 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
		 * diferença do produto de A e B pelo produto de C e D segundo a fórmula:
		 * DIFERENCA = (A * B - C * D).
		 * 
		 * Entrada:
		 * 
		 * O arquivo de entrada contém 4 valores inteiros.
		 * 
		 * Saída:
		 * 
		 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo
		 * abaixo, com um espaço em branco antes e depois da igualdade.
		 * 
		 * Exemplos de Entrada:                            Exemplos de Saída:
		 * 5                                               DIFERENCA = -26
		 * 6 
		 * 7 
		 * 8
		 * 
		 * 0                                               DIFERENCA = -56
		 * 0
		 * 7
		 * 8
		 * 
		 * 5                                               DIFERENCA = 86
		 * 6
		 * -7
		 * 8
		 */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int DIFERENCA = ((A * B) - (C * D));
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
	}

}
