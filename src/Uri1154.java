import java.util.Scanner;

public class Uri1154 {

	public static void main(String[] args) {

		/* URI Online Judge | 1154 - Idades - OK
		 * 
		 * Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
		 * O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
		 * 
		 * ENTRADA
		 * 
		 * A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.
		 * 
		 * SAÍDA
		 * 
		 * A saída contém um valor correspondente à média de idade dos indivíduos. A média deve ser impressa com dois dígitos após o ponto decimal.
		 * 
		 * Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
		 * 34                       39.25
		 * 56                       
		 * 44                       
		 * 23                        
		 * -2                  
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		int media = 0;
		int contador = 0;
		
		int idade = imprimir.nextInt();		
				
		while(idade > 0) {
			contador = contador + 1;
			media = media + idade;		
			idade = imprimir.nextInt();
		}
		double resultado = (double) media / contador;
		System.out.printf("%.2f%n",resultado);
		
		imprimir.close();
		System.exit(0);
	}
}