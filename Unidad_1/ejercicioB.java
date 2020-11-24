import java.util.Scanner;
public class ejercicioB {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce valor 1");
		
		n1= sc.nextInt();
		
		System.out.println("Introduce valor 2");
		n2= sc.nextInt();
		
		System.out.println("Introduce valor 3");
		n3=sc.nextInt();
		
		if (n1>=n2 && n3<n2 )
			System.out.println("El orden es:  " +n1);
		
			if (n1<n3)
				System.out.println("El orden es:  " + n3);
			
			else if (n2<n3)
				System.out.println("El orden es: "+n3);

	}

}
