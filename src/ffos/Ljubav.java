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

	private static final String KALKULIRAM = "Kalkuliram ljubav (tražim osobu)";
	private static final String REZULTAT = "Pronašao 1 rezultat: Marija Zimska <mzimska@ffos.hr>";
	private static final char TRAZENJE = '.';
	private static final int BROJ_PONAVLJANJA = 7;

	/**
	 * Ovo je metoda koju poziva operativni sustav
	 * @param args ne koristim.
	 * @return tipa void pa ne vraća vrijednost.
	 */
	public static void main(String[] args) {
		System.out.println(KALKULIRAM);
		for (int i = 0; i < BROJ_PONAVLJANJA; i++) {
			System.out.print(TRAZENJE + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n" + REZULTAT);
	}

}


