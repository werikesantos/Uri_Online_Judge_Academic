import java.util.Scanner;

public class Uri1117 {

	public static void main(String[] args) {

		/* URI Online Judge | 1117 - Validação de Nota - OK
		 * 
		 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. 
		 * Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). 
		 * Cada nota deve ser validada separadamente.
		 * 
		 * ENTRADA
		 * 
		 * A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.
		 * 
		 * SAÍDA
		 * 
		 * Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
		 * Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
		 * O valor deve ser apresentado com duas casas após o ponto decimal.
		 * 
		 * Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
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