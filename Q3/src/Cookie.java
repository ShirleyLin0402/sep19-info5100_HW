public class Cookie extends DessertItem {
	private int number;
	private int pricePerDozen;

	public Cookie(String name, int number, int price) {
		this.name = name;
		this.number = number;
		this.pricePerDozen = price;
	}

	@Override
	public int getCost() {
		return Math.round(this.number * this.pricePerDozen / 12);
	}

	public int getNumber() {
		return number;
	}

	public int getPricePerDozen() {
		return pricePerDozen;
	}

}


