package primeiraaula;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		float media, n1, n2, n3, n4, matricula;
	
		
		Scanner leitor=new Scanner (System.in);
		
		System.out.println("digite o número da matrícula");
		matricula=leitor.nextFloat();
		System.out.println("digite a primeira nota");
		n1=leitor.nextFloat();
		System.out.println("digite a segunda nota");
		n2=leitor.nextFloat();
		System.out.println("digite a terceira nota");
		n3=leitor.nextFloat();
		System.out.println("digite a quarta nota");
		n4=leitor.nextFloat();
		
		media=(n1+n2+n3+n4)/4;
		System.out.println(media);
		
		if(media >=7.0) {
			System.out.printf("Média:%.1f\n" , media);
			System.out.println("APROVADO");
		}
		
		else if(media >=3.5 && media <7.0) {
			System.out.printf("Média:%.1f\n", media);
			System.out.println("RECUPERAÇÃO");
		}
		
		else if( media <3.5) {
			System.out.printf("Média:%.1f\n", media);
			System.out.println("REPROVADO");
		}
			

	}

}
