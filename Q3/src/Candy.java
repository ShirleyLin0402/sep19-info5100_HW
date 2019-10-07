public class Candy extends DessertItem {
	private double weight;
	private int pricePerPound;

	public Candy(String name, double weight, int price) {
		this.name = name;
		this.weight = weight;
		this.pricePerPound = price;
	}

	@Override
	public int getCost() {
		return (int) Math.round(this.weight * this.pricePerPound);
	}

	public String getWeight() {
		return String.format("%.2f", weight);
	}

	public int getPricePerPound() {
		return pricePerPound;
	}

}