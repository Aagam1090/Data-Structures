
class DoubleLinkedList
{
	Node start;
	class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			prev = null;
			next = null;
		}
	}
	
	// Insert Functions 
	
	public void insertEnd(int data)
	{
		Node new_Node = new Node(data); //Creating a new Node
		
		if(start == null) // To add the first Node
		{
			start = new_Node;
		}
		else // Add Subsequent Nodes
		{
			Node temp = start;
			while(temp.next != null) // Traverse till last Node 
			{
				temp = temp.next;
			}
			new_Node.prev = temp;
			temp.next = new_Node; // Put the .next value of Last Node to New Node
		}
	}
	
	public void insertBegin(int data)
	{
		Node new_Node = new Node(data);
		if(start == null) // To add the first Node
		{
			start = new_Node;
		}
		else
		{
			new_Node.next = start;
			start.prev = new_Node;
			start =  new_Node;
		}
	}
	
	public void insertAfterValue(int data, int value)
	{
		Node new_Node = new Node(data);
		Node temp = start;
		int flag = 1;
		while(temp != null)
		{
			if(temp.data == value)
			{
				flag = 0;
				break;
			}
			else
			{
				temp = temp.next;
			}
		}
		if(flag == 1)
		{
			System.out.println("No such Value Found");
		}
		else
		{
			new_Node.prev = temp;
			new_Node.next = temp.next;
			
			(temp.next).prev  = new_Node;
			temp.next = new_Node;
		}
		
	}
	
	// Remove Function 
	
	public void removeBegin()
	{
		Node temp = start;
		if(start ==  null)
		{
			System.out.println("List is Empty");
		}
		else if(temp.next == null)
		{
			System.out.println("The Value Removed is " + temp.data);
			start = null;
		}
		else
		{
			System.out.println("The Value Removed is " + temp.data);
			start = temp.next;
			start.prev = null;
			
		}
	}
	
	public void removeEnd()
	{
		Node temp = start;
		while((temp.next).next !=null)
		{
			temp = temp.next;
		}
		System.out.println("The Value removed is" + (temp.next).data);
		temp.next = null;
	}
	
	public void removeAfterValue(int value)
	{
		Node temp = start;
		int flag = 0;
		while(temp != null)
		{
			if(temp.data == value)
			{
				flag = 0;
				break;
			}
			else
			{
				temp = temp.next;
			}
		}
		if(flag == 1)
		{
			System.out.println("No such Value Found");
		}
		else
		{
			System.out.println("The Value Removed is " + temp.next.data);
			temp.next = temp.next.next;
			(temp.next).prev = temp;
		}
	}
	// Display Function
	
	public void displayList()
	{
		Node temp = start; 
		
		if(temp == null) // Empty List 
		{
			System.out.println("List is Empty");
		}
		else if(temp.next == null) // Incase only 1 Element is present
		{
			System.out.println(temp.data);
		}
		else // For other cases 
		{	
			while(temp != null)
			{
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	public static void main(String args[])
	{
		DoubleLinkedList list = new DoubleLinkedList();

		list.insertBegin(40);
		list.insertBegin(30);
		list.insertBegin(20);
		list.insertEnd(50);
	
		list.insertAfterValue(25,20);
		
		list.removeAfterValue(25);
		list.removeBegin();
		list.removeEnd();
		
		list.displayList();
	}
}