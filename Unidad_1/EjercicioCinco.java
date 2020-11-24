  import java.util.Scanner;

  public class EjercicioCinco {
    public static void main( String[] args ) {
    	double conversor = 166.386;
    	double resultado;
    	double valor;
    	
    	Scanner teclado= new Scanner (System.in);
    	
    	System.out.println("Introduza valor en Euros");
    	
    	valor= teclado.nextDouble();
    	
    	System.out.println("El resultado es:  "+ conversor*valor);
    	
    }
   }
 