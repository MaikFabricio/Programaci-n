import java.util.Scanner;
public class EjercicioTres {

	public static void main(String[] args) {
		int x;
		int y;
		
		x=144;
		y=999;
		
		System.out.println(x+y); 
		
		System.out.println(x-y);
		
		System.out.println(x/y);
		
		System.out.println(x*y);
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Digite el valor de x: ");
		
		x= teclado.nextInt();
		System.out.println("El valor de x es: " +x);
		
		
		System.out.println("Digite el valor de y : ");
		
		y= teclado.nextInt();
		System.out.println("El valor de y es: " +y);
				

	}

}
