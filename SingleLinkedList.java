import java.util.Scanner;

class SingleLinkedList
{
	Node start; // Making the Head of the Linked List  
	
	static class Node
	{
		int data; // Data Field set to Integer
		Node next; // Node ptr to point to next Node
	
		Node(int data) // Constructor to Initialize the Values
		{
			this.data = data;  
			this.next = null;
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
			temp.next = new_Node; // Put the .next value of Last Node to New Node
		}
	}
	
	public void insertBegin(int data)
	{
		Node new_Node = new Node(data); //Creating a new Node
		
		if(start == null) // To add the first Node
		{
			start = new_Node;
		}
		else // Add Subsequent Nodes
		{
			new_Node.next = start;
			start = new_Node;
		}
	}
	
		public void insertAfterValue(int data,int val)
	{
		Node new_Node = new Node(data); //Creating a new Node
		int flag = 0;
		Node temp =start;
		while(temp!=null)
		{
			if(temp.data == val)
			{
				flag = 0;
				break;
			}
			else
			{
				temp = temp.next;
				flag = 1;
			}
		}
		if(flag == 1)
		{
			System.out.println("The Node with Value " + val + " Cannot be Found ");
		}
		else
		{
			new_Node.next = temp.next;
			temp.next = new_Node;
		}
	}
	
	// Remove Element 
	
	public void removeFront()
	{
		if(start == null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("The Value removed is " + start.data);
			start = start.next;
		}
	}
	
	public void removeEnd()
	{
		Node temp = start;
		if(start == null)
		{
			System.out.println("List is Empty");
		}
		else if(temp.next == null)
		{
			System.out.println("Value removed is " + (temp).data);
			start = null;
		}
		else
		{
			
			while((temp.next).next!= null)
			{
				temp = temp.next;
			}
			System.out.println("Value removed is " + (temp.next).data);
			temp.next = null;
		}
	}
	
	public void removeAfterValue(int val)
	{
		int flag = 0;
		Node temp =start;
		while(temp!=null)
		{
			if(temp.data == val)
			{
				flag = 0;
				break;
			}
			else
			{
				temp = temp.next;
				flag = 1;
			}
		}
		if(flag == 1)
		{
			System.out.println("The Node with Value " + val + " Cannot be Found ");
		}
		else
		{
			if(temp.next == null)
			{
				System.out.println("This is the Last Node");
			}
			else
			{
				System.out.println("The Value removed is " + (temp.next).data);
				(temp.next) = (temp.next).next;
			} 
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
		SingleLinkedList list = new SingleLinkedList(); // Creating Objects 
		
		list.insertEnd(20);

		list.insertEnd(30);

		list.insertBegin(10);

		list.insertAfterValue(15,10);
		
		list.displayList();
		
		list.removeFront();
		
		list.removeEnd();

		list.removeAfterValue(15);

		list.displayList();

	
	}
}