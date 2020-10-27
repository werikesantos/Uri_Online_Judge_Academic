import java.util.Scanner;

public class Uri1117 {

	public static void main(String[] args) {

		/* URI Online Judge | 1117 - Valida��o de Nota - OK
		 * 
		 * Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno. Calcule e imprima a m�dia semestral. 
		 * Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]). 
		 * Cada nota deve ser validada separadamente.
		 * 
		 * ENTRADA
		 * 
		 * A entrada cont�m v�rios valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas v�lidas.
		 * 
		 * SA�DA
		 * 
		 * Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
		 * Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do c�lculo. 
		 * O valor deve ser apresentado com duas casas ap�s o ponto decimal.
		 * 
		 * Obs.: Cuide que a divis�o entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Sa�da:
		 * -3.5                     nota invalida
		 * 3.5                      nota invalida 	
		 * 11.0                     media = 6.75
		 * 10.0                      
		 *  
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		double nota01 = imprimir.nextDouble();
				
		while((nota01 < 0) || (nota01 > 10.0)) {
			System.out.printf("nota invalida\n");
			nota01 = imprimir.nextDouble();
		}	
		
		double nota02 = imprimir.nextDouble();
		
		while((nota02 < 0) || (nota02 > 10.0)) {
			System.out.printf("nota invalida\n");
			nota02 = imprimir.nextDouble();
		}	
		
		double mediaSemestral = ((nota01 + nota02) / 2.0);
		System.out.printf("media = %.2f%n", mediaSemestral);
		
		imprimir.close();
		System.exit(0);
	}
}