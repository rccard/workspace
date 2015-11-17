//double linked list
//STEPS
//1. Create Node with an object
//2. New Node.next = first
//3. first.previous = newNode
//4. first = newNode
public class CarLinkedList 
{
	private Node first;
	private Node last;
	private int size;
	
	private Node nextNode;
	
	public CarLinkedList()
	{
		first = null;
		last = null;
		size = 0;
		
		nextNode = null;
	}
	
	public int size()
	{
		return size;
	}
	
	public void add(Car c)
	{
		if(size == 0)
		{
			Node newNode = new Node();
			newNode.value = c;
			newNode.prev = null;
			newNode.next = null;
			
			first = newNode;
			last = newNode;
			size++;
		}
		else
		{
			Node newNode = new Node();
			newNode.value = c;
			newNode.next = first;
			
			first.prev = newNode;
			first = newNode;
			size++;
		}
		
		nextNode = first;
		
	}
	
	public Car next()
	{
		if(nextNode !=null)
		{
			Car retValue = nextNode.value;
			
			nextNode = nextNode.next;
			
			return retValue;
			
		}
		else
			return null;
	}
	
	public void resetIteratorFirst()
	{
		nextNode = first;
	}
	
	public boolean hasNext()
	{
		if(nextNode==null)
			return false;
		else
			return true;
	}
	
	public void addFirst(Car c)
	{
		add(c);
	}
	
	public void addLast(Car c)
	{
		if(size == 0)
		{
			Node newNode = new Node();
			newNode.value = c;
			newNode.prev = null;
			newNode.next = null;
			
			first = newNode;
			last = newNode;
			size++;
		}
		else
		{	
			Node newNode = new Node();
			
			newNode.value = c;
			
			newNode.prev=last;
			
			last.prev= last.next;
			last.next= newNode;
			last= newNode;
			size++;
		}
		
		nextNode = last;
	}
	public void add(Car c, int index)
	{
		if(size == 0)
		{
			Node newNode = new Node();
			newNode.value = c;
			newNode.prev = null;
			newNode.next = null;
			
			first = newNode;
			last = newNode;
			size++;
		}
		else
		{
			if(index==0)
			{
				addFirst(c);
			}
			else
			{
			if(index>=size)
			{
				addLast(c);
			}
			else
			{
				Node before = new Node();
				before.next = null;
				before.prev = null;
				
				Node after = new Node();
				after.next=null;
				after.prev=null;
				
				Node newNode = new Node();
				newNode.prev = null;
				newNode.next = null;
				newNode.value = c;
				
				before = first;
	
				for(int i = 0; i<index-1; i++)
				{
					before=before.next;
					//System.out.println(before.value);
				}
				
				after = before.next;
				
				newNode.prev=before;
				newNode.next=after;
				
				before.next = newNode;
				after.prev = newNode;
	
				size++;
			}
			}
		}
		
		//nextNode = first;
	}
	public Car removeFirst()
	{
		if(size == 0)
		{
			return null;
		}
		else
		{
			Car temp = first.value;
			first = first.next;
			first.prev = null;
			size--;
			return temp;
		}
	}
	public Car removeLast()
	{
		if(size == 0)
		{
			return null;
		}
		else
		{
			Car temp = last.value;
			last = last.prev;
			last.next = null;
			size--;
			return temp;
		}
	}
	
	public Car remove(int index)
	{
		if(size == 0)
		{
			return null;
		}
		else
		{
			Node before = new Node();
			before.next = null;
			before.prev = null;
			
			Node after = new Node();
			after.next=null;
			after.prev=null;
			
			
			Node newNode = new Node();
			newNode.prev = null;
			newNode.next = null;
//			newNode.value = c;
			
			before = first;

			for(int i = 0; i<index-1; i++)
			{
				before=before.next;
				//System.out.println(before.value);
			}
			
			
			Car temp = before.value;
			
			//found before
			//and after
			after = before.next;
			
			before.prev.next = before.next;
			
			after.prev = before.prev;
			
			

			size--;
			return temp;
		}
		
		//nextNode = first;
	}
	
	public Car remove(Car c)
	{
		if(size == 0)
		{
			return null;
		}
		else
		{
			
			Node before = new Node();
			before.next = null;
			before.prev = null;
			
			Node after = new Node();
			after.next=null;
			after.prev=null;
			
			
//			Node newNode = new Node();
//			newNode.prev = null;
//			newNode.next = null;
//			newNode.value = c;
			
			before = first;
			
			//before = first;

			int i = 0;
			
			while(!(before.value.getName()).equals(c.getName()) && i<size)
			{
				//System.out.println(before.value);
				before=before.next;
			}
			
			
			Car temp = before.value;
			
			//found before
			//and after
			after = before.next;
			
			before.prev.next = before.next;
			
			after.prev = before.prev;
			
			

			size--;
			return temp;
		}
		
		//nextNode = first;
	}
	
	public Car get(int index)
	{
		if(size == 0)
		{
			return null;
		}
		else
		{
			Node before = new Node();
			before.next = null;
			before.prev = null;
			
			
			before = first;

			for(int i = 0; i<index-1; i++)
			{
				before=before.next;
				//System.out.println(before.value);
			}
			
			
			Car temp = before.value;
			
			return temp;
	}
	}
	public boolean set(int index, Car c)
	{
		if(size == 0)
		{
			return false;
		}
		else
		{
			Node before = new Node();
			before.next = null;
			before.prev = null;
			
			
			before = first;

			for(int i = 0; i<index-1; i++)
			{
				before=before.next;
				//System.out.println(before.value);
			}
			
			before.value = c;
//			Car temp = before.value;
			
			return true;
		}
	}
	
	public boolean hasPrevious()
	{
		if(nextNode.prev==null)
			return false;
		else
			return true;
	}
	
	public Car previous()
	{
		
		return (nextNode.prev).value;
	}
	
	public void resetIteratorLast()
	{
		nextNode = last;
	}
	
	private class Node
	{
		public Car value;
		public Node prev;
		public Node next;
	}
	
	public static void main(String[] args) 
	{
		CarLinkedList list = new CarLinkedList();
		
		list.add(new Car("Club"));
		list.add(new Car("Ace"));
		list.add(new Car("Queen"));
		list.add(new Car("King"));
		list.add(new Car("Jack"));
		
		list.resetIteratorFirst();
		
//		System.out.println(list.next());
//		System.out.println("/////");
//		while(list.hasNext() )
//		{
//			System.out.println(list.next());
//		}
//		
		System.out.println("======SIZE=====");
		System.out.println(list.size());
		
		System.out.println("======List=====");
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======addFirst(Heart)====");
		list.addFirst(new Car("Heart"));
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======addLast(Spade)====");
		list.addLast(new Car("Spade"));
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}

		System.out.println("======add3rd(diamond)====");
		list.add(new Car("diamond"), 3);
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======removeFirst====");
		list.removeFirst();
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======removeLast====");
		list.removeLast();
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======remove3rd(diamond)====");
		list.remove(3);
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======removeSearch(Ace)====");
		list.remove(new Car("Ace"));
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======get(3 Queen)====");
		System.out.println(list.get(3));
		System.out.println("======get(3 Queen)====");
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		
		System.out.println("======set(3 Nine)====");
		System.out.println(list.set(3, new Car("Nine")));
		System.out.println("======set(3 Nine)====");
		list.resetIteratorFirst();
		while(list.hasNext() )
		{
			System.out.println(list.next());
		}
		

		System.out.println("======resetIteratorLast====");
		list.resetIteratorLast();
//		while(list.hasNext() )
//		{
//			System.out.println(list.next());
//		}
		
		System.out.println("======hasPrevious====");
		System.out.println(list.hasPrevious());
//		while(list.hasNext() )
//		{
//			System.out.println(list.next());
//		}
		
		
		list.resetIteratorFirst();
		list.resetIteratorLast();
		System.out.println("======previous====");
		System.out.println(list.previous());

	}
	
	

}
