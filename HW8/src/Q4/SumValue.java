package Q4;

import java.util.Random;

public class SumValue {
	 public static void main(String[] args){
	        int[] arr = new int[4000000];
	        generateRandomArray(arr);
	        long sum = sum(arr);
	        System.out.println("Sum: " + sum);
	    }
	 
	  public static void generateRandomArray(int[] arr){
		  Random rd = new Random();
		 for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt();
			}

	    }

	    /*get sum of an array using 4 threads*/
	    static long sum(int[] arr){
	    	int threadCount = 4; 
	    	int len = (int) Math.ceil(1.0 * arr.length / threadCount);
	    	Sum[] summers = new Sum[threadCount];
	    	Thread[] threads = new Thread[threadCount];
	    	for (int i = 0; i < threadCount; i++) {
	    	summers[i] = new Sum(arr, i*len, (i+1)*len);
	    	threads[i] = new Thread(summers[i]);
	    	threads[i].start();
	    	}
	    	try {
	    	for (Thread t : threads) {
	    	t.join();
	    	}
	    	} catch (InterruptedException ie) {}
	    	long total = 0;
	    	for (Sum summer : summers) {
	    	total += summer.getSum();
	    	}
	    	return total;
	    }
	    
	    public static int sumRange(int[] a, int min, int max) {
			int result = 0;
			for (int i = min; i < max; i++) {
				result += a[i];
			}
			return result;
		}

	   

}
