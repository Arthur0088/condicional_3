package primeiraaula;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		double salario, salarioNovo;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o salário atual do funcionário");
		salario=leitor.nextDouble();
		
		
		
		if(salario <=1000) {
			salarioNovo=salario + (salario*0.15);
			
			System.out.println("aumento de 15%");
			System.out.printf("Salário Novo = %.2f %n", salarioNovo);
		
		}
		
		else if(salario >1000 && salario<=2500) {
			salarioNovo=salario + (salario*0.07);
			
			System.out.println("aumento de 7%");
			System.out.printf("Salário Novo = %.2f %n", salarioNovo);
		
		}
		
		else if(salario >2500) {
			System.out.println("sem auamento");
			
		}
	
	
		
		

	}

}
