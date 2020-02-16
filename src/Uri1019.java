import java.util.Locale;
import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		
		/* URI Online Judge | 1019 - Conversão de Tempo - OK
		 * 
		 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e 
		 * informe-o expresso no formato horas:minutos:segundos.
		 * 
		 * Entrada:
		 * 
		 * O arquivo de entrada contém um valor inteiro N.
		 * 
		 * Saída:
		 * 
		 * Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme 
		 * exemplo fornecido.
		 * 
		 * Exemplo de Entrada:                     Exemplo de Saída:
		 * 556                                     0:9:16
		 * 
		 * 1                                       0:0:1
		 * 
		 * 140153                                  38:55:53
		 */
			
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
	    
		int horas, minutos, segundos;
		
		int total = sc.nextInt();
		
		horas = (total / 3600); 
		minutos = ((total - (horas * 3600)) / 60) ;
		segundos = (total % 60);
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();
		
	}

}
