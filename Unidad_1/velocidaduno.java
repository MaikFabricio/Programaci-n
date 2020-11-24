import java.util.Scanner;

public class velocidaduno {

	public static void main(String[] args) {
		//tres numero distintos y cual es el mayor
			
		int n1, n2, n3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println ("Introduce un mumero");
		n1= sc.nextInt();
		
		System.out.println ("Introduce otro numero ");
		n2= sc.nextInt();
		
		System.out.println("Introduce el tercer numero");
		n3= sc.nextInt();
		
		if (n1>n2) 
			System.out.println("El valor mayor es:  "+ n1);
		
		else if (n1<n3) 
			System.out.println("El valor mayor es:  "+n3);
		
	}

}
