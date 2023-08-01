
public class reverseLinkedList<T> {
	/*
	 * Given the head of a singly linked list, reverse the list, and return the
	 * reversed list.

	 * Example 1:
	 * Input: head = [1,2,3,4,5] Output: [5,4,3,2,1] 
	 * 
	 * Example 2:
	 * Input: head = [1,2] Output: [2,1] 
	 * 
	 * Example 3:
	 * Input: head = [] Output: []
	 */
	public LinearNode<T> reverseList(LinearNode<T> head) {
		LinearNode<T> prev = null;  
        LinearNode<T> current = head;
    
        
     /*
      * if it was a five-elements list
      * It would be completed after 5 times iterations 
      */
        while(current != null) { 
            LinearNode<T> next = current.getNext();   //Setting next
            current.setNext(prev);			//From here, next points to previous node
            prev = current;					//From here, next points to previous node, prev points to current node itself
            current = next;					//From here, next points to previous node, prev points to current node itself, current points to next node
        }
       return prev; 
    }
 }

