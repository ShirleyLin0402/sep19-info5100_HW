
public class Q6 {
	public static String reverseWords(String s) {
        s = s.trim();
        String[] stringArray = s.split("\\s+");
        StringBuilder ans = new StringBuilder(stringArray[stringArray.length-1]);
        for(int i = stringArray.length-2; i >= 0; i--)
        {
            ans.append(" "+stringArray[i]);
        }
        return ans.toString();
    }



public static void main (String[] args) {
	System.out.println(reverseWords("Hello World"));

	
}
}