
public class QueueLL<T> implements QueueADT<T>{
	public LinearNode<T> myQueue;
	public LinearNode<T> front;
	public LinearNode<T> rear;
	public int counts = 0;
	
	public QueueLL(LinearNode<T> queue) {
		myQueue = queue;
	}
	
	public void enqueue(T dataItem) {
		LinearNode<T> temp = new LinearNode<T>((dataItem));
		temp.setNext(rear);
		rear = temp;
		counts++;
	}
	
	public T dequeue() {
		if (isEmpty())
			return null;
		LinearNode<T> temp = rear;
		while(temp != null) {
				front = temp;	
				temp = temp.getNext();
		}
		T result = front.getDataItem();
		counts--;
		return result;
	}
	
	public boolean isEmpty() {
		return front == null;
	}

	public int size() {
		return counts;
	}
	
	public T peek() {
		return front.getDataItem();
	}
}
