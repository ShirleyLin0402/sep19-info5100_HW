package Q4;

public class Test {
	public static void main(String args[]) throws MyIndexOutOfBoundException {
        createArray(10);
    }
    
    public static void createArray(int n) throws MyIndexOutOfBoundException{
        int[] arr=new int[n];
        int i=0;
        while(true){
            arr[i]=i;
            i++;
            if(i>=n)
                throw new MyIndexOutOfBoundException(0,n-1,i);
        }
    }

}

