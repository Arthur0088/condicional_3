package primeiraaula;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite um n�mero");
		num=leitor.nextInt();
		
		if(num>=20 && num <=90) {
			System.out.println("seu n�mero est� entre 20 e 90");
			}
		else {
			System.out.println("seu n�mero n�o est� entre 20 e 90");
		}
		

	}

}
