public class Sundae extends IceCream {

	public Sundae(String iceCreamName, int iceCreamPrice, String name, int price) {
		super(name + "Sundae with\n" + iceCreamName, iceCreamPrice + price);
	}

	@Override
	public int getCost() {
		return Math.round(super.getCost());
	}

}
