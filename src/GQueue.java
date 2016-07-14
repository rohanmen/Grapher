import java.util.LinkedList;
import java.util.ListIterator;


public class GQueue<E> extends LinkedList {

	private final int LIMIT = 5;
	private ListIterator<E> iterator;
	
	
	
	public void addElem(E e)
	{
		addLast(e);
		
		if(this.size() > LIMIT)
		{
			removeFirst();
		}
	}
	
	public E getNext()
	{
		return iterator.next();
	}
	
	public boolean hasNext()
	{
		if (iterator == null)
		{
			iterator = this.listIterator(0);
		}
		
		boolean temp = iterator.hasNext();
		
		if(temp == false)
		{
			iterator = null;
		}
		
		return temp;
	}
	
	
}
