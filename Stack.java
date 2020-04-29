
class Stack
{
	int arrsize = 100; // Setting max Stack Size
	
	int arr[] = new int[arrsize]; // Declaring a Stack of type Array
	
	int stacktop = -1; // Initialize the stacktop
	
	public void push(int data) //Adding Data to Stack in FIFO Format 
	{
		stacktop++; 
		arr[stacktop] = data;
	}
	
	public int pop()  // Removing Data from Stack in FIFO Format
	{
		int temp = arr[stacktop];
		stacktop--;
		return temp;
	}
	
	public int peek() // Function to just check the top and not to remove the top value
 	{
		return arr[stacktop];
	}
	
	public static void main(String args[])
	{
		Stack stk = new Stack(); // Creating object of the class so it can be used multiple times
		
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		System.out.println("Value Popped is " + stk.pop());
		
		System.out.println("Value Peked is " + stk.peek());
	}
}