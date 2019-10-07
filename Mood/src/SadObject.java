
public class SadObject extends MoodyObject{
	protected String getMood() {
		return "sad";
	}

	public void expressFeelings() {
		System.out.println("'wah' 'boo boo' 'weep' 'sob' 'weep'");
	}

	public String toString() {
		return " Subject cries a lot\n";
	}

}
