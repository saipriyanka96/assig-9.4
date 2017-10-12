package myPack;
/*

 * Created a class named as VariableStack it implements the interface Stack

 */

public class VariableStack implements Stack {

	 int arr[];

	    int size;

	    int top;

	    public VariableStack(int size) {

	        this.size = size;

	        arr = new int[size];

	        top = -1;

	    }

	    /**

		 * These are the two methods from the interface Stack

		 */

	    

	    @Override

	    public void push(int i) {

	        if (top == size - 1) {

	            realloc();

	        }

	        arr[++top] = i;

	    }

	    @Override

	    public int pop() {

	        if (top < 0) {

	            System.out.println("Stack underflow");

	            //throw new UnsupportedOperationException();

	            return -999;

	        }

	        return arr[top --];

	    }

	    private void realloc() {
//sees the realocation
	        int tmpArr[] = new int[size*2];
// The java.lang.System.arraycopy() method copies an array from the specified source array,
//beginning at the specified position, to the specified position of the destination array.

	        System.arraycopy(arr, 0, tmpArr, 0, size);


//The System class has an arraycopy method that you can use to efficiently copy data from one array into another
	        size *= 2;

	        arr = tmpArr;

	    }

	    

	}



