package Q4;

@SuppressWarnings("serial")
public class MyIndexOutOfBoundException extends IndexOutOfBoundsException{
	
	
	int lowerBound;
    int upperBound;
    int index;
    
    public MyIndexOutOfBoundException(int lowerBound,int upperBound,int index){
        this.lowerBound=lowerBound;
        this.upperBound=upperBound;
        this.index=index;
    }
    @Override
    public String toString() {
        return "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound;
    }

}
