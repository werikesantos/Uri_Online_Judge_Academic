import java.util.Locale;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		
		/* URI Online Judge | 1046 - Tempo de Jogo - OK
		 * 
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo 
		 * pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 * 
		 * Entrada: 
		 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
		 * 
		 * Saída:
		 * Apresente a duração do jogo conforme exemplo abaixo.
		 * 
		 * Exemplo de Entrada:                     Exemplo de Saída:
		 * 16 2                                    O JOGO DUROU 10 HORA(S)
		 * 
		 * 0 0                                     O JOGO DUROU 24 HORA(S)
		 * 
		 * 2 16                                    O JOGO DUROU 14 HORA(S) 
		 * 
		 */
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		
		if(horaInicial > 0 && horaInicial < 12) {
			int horas = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " +horas+ " HORA(S)");
		}else {
			int horas = (24 - horaInicial) + horaFinal;
			System.out.println("O JOGO DUROU " +horas+ " HORA(S)");
		}
		
		sc.close();

	}

}
