import java.util.Scanner;

public class Uri1115 {

	public static void main(String[] args) {

		/* URI Online Judge | 1114 - Quadrante - OK
		 * 
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
		 * Para cada ponto escrever o quadrante a que ele pertence. 
		 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). 
		 * 
		 * ENTRADA
		 * 
		 * A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.
		 * 
		 * SAÍDA
		 * 
		 * Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
		 * 
		 * Exemplo de Entrada:	    Exemplo de Saída:
		 * 2 2                      primeiro
		 * 3 -2                     quarto 	
		 * -8 -1                    terceiro
		 * -7 1                     segundo
		 * 0 2
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		Integer x = imprimir.nextInt();
		Integer y = imprimir.nextInt();
		
		while((x != null) && (y != null)) {
		
			if((x > 0) && (y > 0)) {
				System.out.println("primeiro");
			}else if((x < 0) && (y > 0)) {
				System.out.println("segundo");
			}else if((x < 0) && (y < 0)) {
				System.out.println("terceiro");
			}else if((x > 0) && (y < 0)) {
				System.out.println("quarto");
			}else {
				imprimir.close();
				System.exit(0);
			}
			
			x = imprimir.nextInt();
			y = imprimir.nextInt();
		}		
	}
}