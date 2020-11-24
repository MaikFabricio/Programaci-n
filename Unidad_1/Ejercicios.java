import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		int a= 2;
		int b= 7;
		
		int aux;
		aux=a;
		a=b;
		b=aux;
		
		System.out.println("A es:"+a+""+ "B es:"+b);
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número");
		
		b= teclado.nextInt();
		a= teclado.nextInt();
				
		
		
		

	}

}
