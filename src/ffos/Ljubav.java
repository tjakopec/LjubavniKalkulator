package ffos;

/**
 * <h1>Ljubavni kalkulator</h1> 
 * Program relevenatnim kalkulacijama
 * pronalazi najbolju osobu za tebe
 * @author Marija Zimska
 * @version 1.0
 * @since 2018-11-21
 */
public class Ljubav {


	/**
	 * Ovo je metoda koju poziva operativni sustav
	 * @param args ne koristim.
	 * @return tipa void pa ne vraća vrijednost.
	 */
	public static void main(String[] args) {
		if (args[0].toLowerCase().equals("marija") && args[1].toLowerCase().equals("zvonko")) {
			System.out.println("Volite se 98 %");
		}else {
			System.out.println("Volite se " + Math.random() + " %");
		}
	}

}




