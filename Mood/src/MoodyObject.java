

public abstract class MoodyObject {
	protected abstract String getMood();
	
	protected abstract void expressFeelings();
	
	public void queryMood() {
		if (this.getMood() == "happy") {
			System.out.println("I feel happy today!\n");
		}
		// sad
		else {
			System.out.println("I feel sad today!\n");
		}
	}

}
