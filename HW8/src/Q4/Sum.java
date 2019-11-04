package Q4;

public class Sum implements Runnable {
	private int[] a;
	private int min, max;
	private int sum;
	
	public Sum(int[] a, int min, int max) {
		this.a = a;
		this.min = min;
		this.max = max;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void run() {
		this.sum = SumValue.sumRange(a, min, max);
	}
}
