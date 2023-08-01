
public class reverseQueueRecursive<T>{
	//Recursive
	public  void reverse(QueueLL<T> Q) {
		if(Q.isEmpty()) return;
		T x = Q.dequeue();
		reverse(Q);
		Q.enqueue(x);
		
	}
}
