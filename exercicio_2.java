package primeiraaula;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite a idade (idade mínima- 5 anos)");
		idade=leitor.nextInt();
		
		if(idade >=5 && idade <=10) {
			System.out.println("infantil");
		}
		
		else if(idade >=11 && idade<=17) {
			System.out.println("juvenil");
		}
		
		else if(idade >=18) {
			System.out.println("adulto");
		}
		
		}
	}


