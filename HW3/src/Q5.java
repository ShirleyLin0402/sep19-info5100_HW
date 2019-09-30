
public class Q5 {
	 public String countAndSay(int n) {
	        String result = "1";
	        for (int i = 1; i < n; i++) {
	            String previous = result;
	            result = "";
	            int count = 1;
	            char say = previous.charAt(0);

	            for (int j = 1; j < previous.length(); j++) {
	                if (previous.charAt(j) != say) {
	                    result = result + count + say;
	                    count = 1;
	                    say = previous.charAt(j);
	                } else count++;
	            }
	            result = result + count + say;
	        }
	        return result;
	    }

}
