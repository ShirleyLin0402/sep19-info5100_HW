package Q5;

public class Test {
	public static void main(String arg[]) {
		Pet pet =new Pet("Spot", "Mary","Black and White");
		pet.setSex(0);
		System.out.println(pet.toString());
		
		Cat kitty = new Cat("Tom", "Bob", "black", "short");
		kitty.setSex(2);
		System.out.println(kitty.toString());
		
		Dog doggy = new Dog("Spot", "Susan", "white", "medium");
		doggy.setSex(2);
		System.out.println(doggy.toString());
	}

}
