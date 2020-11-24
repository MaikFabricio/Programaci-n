import java.util.Scanner;
public class EjercicioSeis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
		double primero;
		double notaDeseada;
		double notaNecesaria;
		
		System.out.print("Nota primer examen: ");
		
		primero= teclado.nextDouble();
		
		System.out.print("Nota deseada: ");
		notaDeseada= teclado.nextDouble();
		
		double notaActual= primero*0.4;
		double puntosNecesarios= notaDeseada-notaActual;
		notaNecesaria= puntosNecesarios/0.6;
		
		if (notaNecesaria>10) {
			System.out.print("No puedes sacar esa nota");
		}
		else {
			System.out.print("Tienes que sacar un  "+ notaNecesaria);}
		}
		
	}

