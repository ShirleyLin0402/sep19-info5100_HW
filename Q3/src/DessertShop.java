
public class DessertShop {
	public static final String NAME = "M & M Dessert Shop";
	public static final float TAXRATE = 0.065f;
	public static final int MAX_SIZEOFNAME = 18;
	public static final int MAX_WIDTHTODISPALY = 18;

	public static String cents2dollarsAndCents(int cents) {
		int dollar = cents / 100;
		double cent = cents % 100 / 100.00;
		return String.valueOf(dollar + cent);
	}

}
