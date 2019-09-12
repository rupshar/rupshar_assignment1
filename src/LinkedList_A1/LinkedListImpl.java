/**
 * COMP 410
 *See inline comment descriptions for methods not described in interface.
 *
*/
package LinkedList_A1;

public class LinkedListImpl implements LIST_Interface {
	Node sentinel; //this will be the entry point to your linked list (the head)
	int size;
	  
	public LinkedListImpl(){//this constructor is needed for testing purposes. Please don't modify!
	  sentinel=new Node(0); //Note that the root's data is not a true part of your data set!
	  size = 0;
	}
	  
	//implement all methods in interface, and include the getRoot method we made for testing purposes. Feel free to implement private helper methods!
	  
	public Node getRoot(){ //leave this method as is, used by the grader to grab your linkedList easily.
	  return sentinel;
	}

	public boolean insert(double elt, int index) {
		System.out.println("Insert called with elt: " + elt + " and index: " + index);
		Node new_elt = new Node(elt);
		if(index > size) {
			return false;
		} else if(size == 0) {
			sentinel.next = new_elt;
			sentinel.prev = new_elt;
			new_elt.next = sentinel;
			new_elt.prev = sentinel;
			size++;
		} else if (size > 0){
			Node counter_node = sentinel;
			for(int i = 0; i < index; i++) {
				counter_node = counter_node.next;
			}
			Node next_node = counter_node.next;
			next_node.prev = new_elt;
			new_elt.next = next_node;
			counter_node.next = new_elt;
			new_elt.prev = counter_node;
			size++;
		}
		return true;
	}
	
	public boolean remove(int index) {
		System.out.println("Remove called with index: " + index);
		Node rem_node = sentinel.next;
		if(size == 1) {
			sentinel.next = null;
			sentinel.prev = null;
			size--;
		} else if(size == 0) {
			return false;
		} else if(index > size) {
			return false;
		} else {
			for(int i = 0; i < index; i++) {
				rem_node = rem_node.next;
			}
			Node prev_node = rem_node.prev;
			Node next_node = rem_node.next;
			prev_node.next = next_node;
			next_node.prev = prev_node;
			size--;
		}
		return true;
	}
	
	public double get(int index) {
		if (size == 0) {
			return Double.NaN;
		} else {
			Node counter_node = sentinel.next;
			for(int i = 0; i < index; i++) {
				counter_node = counter_node.next;
			}
			double data = counter_node.data;
			return data;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void clear() {
		sentinel.next = null;
		sentinel.prev = null;
		size = 0;
	}
}