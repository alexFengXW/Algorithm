
public class mergeLinkedList<G> {
	
	// list1: 1 -> 2 -> 3 -> 4
	// list2: 3 -> 4 -> 5 -> 6
	public LinearNode<G> merging(LinearNode<G> list1, LinearNode<G> list2){
		 LinearNode<G> start;
	        if(list1 == null && list2 == null)
	            return null;
	        if(list1 == null)
	            return list2;
	        if(list2 == null)
	            return list1;
	        
	        if(list1.getDataItem() < list2.getDataItem()){
	            start = list1;
	            start.setNext(merging(list1.getNext(),list2)); 
	        } else {
	            start = list2;
	            start.setNext(merging(list1,list2.getNext()));
	        }

	        return start;
	    }
}
