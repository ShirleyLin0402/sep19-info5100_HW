
public class Q5 {
	public int[] diStringMatch(String S) {
        int n = S.length();
        int lower = 0, higher = n;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lower++;
            else
                ans[i] = higher--;
        }

        ans[n] = lower;
        return ans;
    }

}
