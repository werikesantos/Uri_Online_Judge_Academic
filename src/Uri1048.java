import java.util.Locale;

import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {
			
		/* URI Online Judge | 1048 - Aumento de Salário - OK
		 * 
		 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
		 * 
		 * Sálario                       Percentual de Reajuste
		 * 0 - 400.00                              15%
		 * 400.01 - 800.00                         12%
		 * 800.01 - 1200.00                        10%
		 * 1200.01 - 2000.00                        7%
		 * Acima de 2000.00                         4%
		 * 
		 * Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o
		 * índice reajustado, em percentual.
		 * 
		 * Entrada:
		 * A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
		 * 
		 * Saída:
		 * Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho,
		 * conforme exemplo abaixo.
		 * 
		 * Exemplo de Entrada:                       Exemplo de Saída:
		 * 400.00	                                 Novo salario: 460.00
		 *                                           Reajuste ganho: 60.00
		 *                                           Em percentual: 15 %
		 *                                           
		 * 800.01									 Novo salario: 880.01
		 *                                           Reajuste ganho: 80.00
		 *                                           Em percentual: 10 %
		 *                                           
		 * 2000.00                                   Novo salario: 2140.00
		 *                                           Reajuste ganho: 140.00
		 *                                           Em percentual: 7 %
		 *                                           
		 */
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double salarioFuncionario = sc.nextDouble();
		
		if(salarioFuncionario >= 0 && salarioFuncionario <= 400.00) {
			double reajuste = salarioFuncionario * 15/100;
			double novoSalario = (reajuste + salarioFuncionario);
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 15 %%%n",novoSalario,reajuste);
		}else if(salarioFuncionario >= 400.01 && salarioFuncionario <= 800.00) {
			double reajuste = salarioFuncionario * 12/100;
			double novoSalario = (reajuste + salarioFuncionario);
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 12 %%%n",novoSalario,reajuste);
		}else if(salarioFuncionario >= 800.01 && salarioFuncionario <= 1200.00) {
			double reajuste = salarioFuncionario * 10/100;
			double novoSalario = (reajuste + salarioFuncionario);
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 10 %%%n",novoSalario,reajuste);
		}else if (salarioFuncionario >= 1200.01 && salarioFuncionario <= 2000.00) {
			double reajuste = salarioFuncionario * 7/100;
			double novoSalario = (reajuste + salarioFuncionario);
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 7 %%%n",novoSalario,reajuste);
		}else {
			double reajuste = salarioFuncionario * 4/100;
			double novoSalario = (reajuste + salarioFuncionario);
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 4 %%%n",novoSalario,reajuste);
		}
		
		sc.close();
	}

}
