import java.util.Vector;

public class CheckOut {

	public Vector<DessertItem> items;

	public CheckOut() {
		this.items = new Vector<DessertItem>();
		
	}

	public int numberOfItems() {
		return this.items.size();
	}

	public void enterItem(DessertItem item) {
		this.items.add(item);
	}

	public void clear() {
		this.items.clear();
	}

	public int totalCost() {
		int total = 0;
		for (DessertItem item : this.items) {
			total += item.getCost();
		}
		return total;
	}

	public int totalTax() {
		return Math.round(totalCost() * DessertShop.TAXRATE);
	}

	@Override
	public String toString() {
		String str = "     " + DessertShop.NAME + "\n     --------------------\n";
		for (DessertItem item : items) {
			
			if (item instanceof Sundae) {
				str += "\n" + String.format("%-22s", item.getName().split("\\n")[0]) + "\n"
						+ String.format("%-22s", item.getName().split("\\n")[1])
						+ String.format("%10s", DessertShop.cents2dollarsAndCents(item.getCost()));
			}
			
			else if (item instanceof IceCream) {
				str += "\n" + String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShop.cents2dollarsAndCents(item.getCost()));
			}
			
			else if (item instanceof Cookie) {
				str += "\n"
						+ String.format("%-22s", ((Cookie) item).getNumber() + " @ "
								+ DessertShop.cents2dollarsAndCents(((Cookie) item).getPricePerDozen()) + " /dz.")
						+ "\n" + String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShop.cents2dollarsAndCents(item.getCost()));
			}
			
			else {
				str += "\n"
						+ String.format("%-22s", ((Candy) item).getWeight() + " lbs. @ "
								+ DessertShop.cents2dollarsAndCents(((Candy) item).getPricePerPound()) + " /lb.\n")
						+ String.format("%-22s", item.getName())
						+ String.format("%10s", DessertShop.cents2dollarsAndCents(item.getCost()));
			}
		}
		str += "\n\n" + String.format("%-22s", "Tax")
				+ String.format("%10s", DessertShop.cents2dollarsAndCents(totalTax())) + "\n"
				+ String.format("%-22s", "Total Cost")
				+ String.format("%10s", DessertShop.cents2dollarsAndCents(totalCost() + totalTax())) + "\n\n";
		return str;
	}
}