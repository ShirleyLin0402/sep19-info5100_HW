import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q4 {
	 public static boolean uniqueOccurrences(int[] arr) {
		 Map<Integer, Integer> uniqueO = new HashMap<>();
	        for (int num : arr) {
	        	uniqueO.put(num, uniqueO.getOrDefault(num, 0) + 1);
	        }
	        Set<Integer> set = new HashSet<>(uniqueO.values());
	        return uniqueO.size() == set.size();
	 }
	 



public static void main(String arg[]) {
	int[] arr = new int[]{1,2,2,1,1,3};
	
	System.out.println(uniqueOccurrences(arr));
	

}
}