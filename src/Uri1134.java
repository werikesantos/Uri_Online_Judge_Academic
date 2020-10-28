import java.util.Scanner;

public class Uri1134 {

	public static void main(String[] args) {

		/* URI Online Judge | 1134 - Tipo de Combust�vel - OK
		 * 
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
		 * Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). 
		 * Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). 
		 * O programa ser� encerrado quando o c�digo informado for o n�mero 4.
		 * 
		 * ENTRADA
		 * 
		 * A entrada cont�m apenas valores inteiros e positivos.
		 * 
		 * SA�DA
		 * 
		 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme exemplo.
		 * 
		 * Obs.: Cuide que a divis�o entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
		 * 
		 * Exemplo de Entrada:	    Exemplo de Sa�da:
		 * 8                        MUITO OBRIGADO
		 * 1                        Alcool: 1
		 * 7                        Gasolina: 2
		 * 2                        Diesel: 0
		 * 2
		 * 4                  
		 * 
		 */
		
		Scanner imprimir = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int produto = imprimir.nextInt();		
				
		while(produto != 4) {			
			if(produto == 1) {
				alcool = alcool + 1;
			}else if(produto == 2) {
				gasolina = gasolina + 1;
			}else if(produto == 3) {
				diesel = diesel + 1;
			}			
			produto = imprimir.nextInt();
		}	
		System.out.println("MUITO OBRIGADO\nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
		
		imprimir.close();
		System.exit(0);
	}
}