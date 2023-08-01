
public interface QueueADT<T> {
	 //  Adds one element to the front of this queue
	   public void enqueue (T dataItem);
	   //  Removes and returns the rear element of this queue
	   public T dequeue( );
	   //  Returns true if this queue is empty
	   public boolean isEmpty( );
	   //  Returns the number of elements in this stack
	   public int size( );
	   //  Returns the front element of this queue
	   public T peek();
	   
}
