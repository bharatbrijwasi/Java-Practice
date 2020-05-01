package sorting;

public class LinkedList 
{
	Node head;
	int count;
	LinkedList()
	{
		head = null;
		count = 0;
	}
	
	boolean isListEmpty()
	{
		return (head == null);
		
	}
	
	void insertNode(int val)
	{
		Node newnode = new Node(val);
		
		if(isListEmpty())
		{
			head = newnode;
			count++;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
			count++;
		}
		System.out.println("Node is inserted...." +count);
	}
	
	void displayNodes()
	{
		
	}
}
