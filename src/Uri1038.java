import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		
		/* URI Online Judge | 1038 - Lanche - Fazendo!!!
		 * 
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar. 
		 * 
		 * CODIGO     ESPECIFICAÇÃO     PREÇO
         * 1          Cachoro Quente    R$ 4.00
         * 2          X-Salada          R$ 4.50
         * 3          X-Bacon           R$ 5.00
         * 4          Torrada Simples   R$ 2.00
         * 5          Refrigerante      R$ 1.50
         * 
         * Entrada:
         * 
         * O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item 
         * conforme tabela acima.
         * 
         * Saída:
         * 
         * O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após 
         * o ponto decimal.
         * 
         * Exemplo de Entrada:             Exemplo de Saída:
         * 
         * 3 2                             Total: R$ 10.00            
         * 
         * 4 3                             Total: R$ 6.00
         * 
         * 2 3                             Total: R$ 13.50
		 */
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		float preco = 0;
		
		if(codigo == 1) 
			preco = quantidade * 4;	
		else if(codigo == 2) 
			preco = quantidade * 4.50f;
		else if (codigo == 3) 
			preco = quantidade * 5; 
		else if(codigo == 4) 
			preco = quantidade * 2;
		else if (codigo == 5) 
			preco = quantidade * 1.50f;
		System.out.printf("Total: R$ %.2f%n", preco);
		
		sc.close();

	}

}
