package HashSetImplementation;

class Node {
	Object el;
	Node next;
	public Node(Object el) {
		this.el = el;
	}
	public Node(Object el, Node next) {
		this.el = el;
		this.next = next;
	}
}
public class HashSet {
	Node[] a = new Node[10];
	int count = 0;

	public boolean add(Object el) {
		int hc=Math.abs(el.hashCode());
		int index=hc%a.length;
		if(a[index]==null)
		{
			a[index]=new Node(el);
			count++;
			return true;
		}
		Node temp=null;
		Node curr=a[index];
		while(curr!=null)
		{
			if(el.equals(curr.el))return false;
			temp=curr;
			curr=curr.next;
		}
		temp.next=new Node(el);
		count++;
		return true;
	}
	public boolean contains(Object el)
	{
		int index=Math.abs(el.hashCode()%a.length);
		Node curr=a[index];
		while(curr!=null)
		{
			if(curr.el.equals(el))return true;
			curr=curr.next;
		}
		return false;
	}
	public boolean remove(Object el)
	{
		int index=Math.abs(el.hashCode()%a.length);
		Node prev=null;
		Node curr=a[index];
		while(curr!=null)
		{
			if(curr.el.equals(el))
			{
				if(prev==null)
				{
					a[index]=a[index].next;
					count--;
					return true;
				}
				prev.next=prev.next.next;
				count--;
				return true;
			}
			prev=curr;
			curr=curr.next;
		}
		return false;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node curr=a[i];
			while(curr!=null)
			{
				System.out.println(curr.el);
				curr=curr.next;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add("Ram");
		h.add("Laxman");
		h.add("Bharat");
		h.add("Sita");
		h.add("Krishna");
		h.add("Balram");
		h.add("Krishna");
		h.add("Balram");
		System.out.println(h.size());
		h.remove("Balram");
		System.out.println(h.contains("Balram"));
		h.display();
	}
}
