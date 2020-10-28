import java.util.Scanner;

public class Uri1154 {

	public static void main(String[] args) {

		/* URI Online Judge | 1154 - Idades - OK
		 * 
		 * Fa�a um algoritmo para ler um n�mero indeterminado de dados, contendo cada um, a idade de um indiv�duo. 
		 * O �ltimo dado, que n�o entrar� nos c�lculos, cont�m o valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo de indiv�duos.
		 * 
		 * ENTRADA
		 * 
		 * A entrada cont�m um n�mero indeterminado de inteiros. A entrada ser� encerrada quando um valor negativo for lido.
		 * 
		 * SA�DA
		 * 
		 * A sa�da cont�m um valor correspondente � m�dia de idade dos indiv�duos. A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.
		 * 
		 * Obs.: Cuide que a divis�o entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Sa�da:
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