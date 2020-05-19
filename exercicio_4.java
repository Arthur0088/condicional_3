package primeiraaula;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
		float lado1,lado2,lado3;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite o primeiro lado ");
		lado1=leitor.nextFloat();
		System.out.println("digite o segundo lado");
		lado2=leitor.nextFloat();
		System.out.println("digite o terceiro lado");
		lado3=leitor.nextFloat();
		
		if(lado1 == lado2 && lado2==lado3) {
			System.out.println("equilátero");
		}
		
		else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
			System.out.println("isósceles");
		}
		
		else {
			System.out.println("escaleno");
		}
	}

}
