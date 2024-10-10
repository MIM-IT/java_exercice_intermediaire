package exercice_intermediaire;
import java.util.Scanner; 


public class Intermediaire {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parfait();

	}
	
	public static void parfait () {
		int nbr=0;
		int reste = 0; 
		int somme = 0;
	
		Scanner console = new Scanner(System.in);
		System.out.println("Essayez un nombre :");
		nbr = console.nextInt(); //nextInt: saisie d'un entier au clavier
		
		for( int i = 1; i <= (nbr / 2);i++){
			reste = nbr % i;
			if ( reste == 0) {	
				somme = somme + i; 
			}
		}
		if (somme == nbr) {
			System.out.println("Le nombre est parfait");
		}else {
			System.out.println("Le nombre n'est pas parfait");
		}
		
		
	}
	
	public static void  minMax(int[] tab) {
		int maxVal = Integer.MAX_VALUE;
		int minVal = Integer.MIN_VALUE;
	
		for(int i=0; i < tab.length; i++) {
			if (tab[i]< maxVal) {
				maxVal = tab[i];
			}else {
				minVal=tab[i];
			}
		System.out.println("\nValeur minimale ="+maxVal);
		System.out.println("\nValeur maximale ="+minVal);
		}
	}
		
	// pour cet exercice on pourrait utiliser la class .math avec ses méthodes 
	public static void temperature() {
		String[] ville = {"Berlin","Bar-surLoup","Bracelone"};
		int[][] temperature= {{12,-8,23,0},{19,22,30,-1},{31,34,27,18}};
		for (int i = 0; i < temperature.length; i++) {
			for(int j = 0; j < temperature[i].length; j++) {
				System.out.println(minMax(int[][]));
			}
 		}
	}
}
