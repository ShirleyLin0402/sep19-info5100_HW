
public class MoodyTest {
	public static void main(String[] args) {
		PsychiatristObject psy = new PsychiatristObject();
		MoodyObject happyObject = new HappyObject();
		SadObject sadObject = new SadObject();
		psy.examine(happyObject);
		psy.observe(happyObject);
		psy.examine(sadObject);
		psy.observe(sadObject);

 }
}
