package LinkedList_A1;

public class LinkedListPlayground {

  public static void main(String[] args) { 
    /*
     here you can instantiate your LinkedList and play around with it to check
     correctness. We've graciously also provided you a bit of extra test data for debugging.
     It doesn't matter what you have in here. We will not grade it. This is for your use in testing your implementation.
      */
//	System.out.println("Starting test 1");
//	test1();
//	System.out.println("Ending test 1");
//	System.out.println();
//	System.out.println("Starting test 2");
//	test2();
//	System.out.println("Ending test 2");
//	System.out.println();
//	System.out.println("Starting test 3");
//	test3();
//	System.out.println("Ending test 3");
	  
	//test4();
	  
	test5();

  }
  
  public static void test1(){
    // example test cases
    LinkedListImpl L= new LinkedListImpl();
    System.out.println(L.isEmpty());
    printList(L);
    L.clear();
    System.out.println(L.isEmpty());
    printList(L);
    System.out.println(L.sentinel.toString());
    L.insert(3.3,0);
    System.out.println(L.isEmpty());
    printList(L);
    System.out.println(L.sentinel.next.toString());
    L.insert(3.4, 0);
    L.insert(3.5, 0);
    L.insert(3.67, 1);
    L.insert(3.357, 0);
    L.insert(3.333, 4);
    System.out.println(L.size());
    printList(L);
    L.remove(3);
    System.out.println(L.size());
    printList(L);
    L.clear();
    L.insert(3.4, 0);
    L.insert(3.5, 0);
    L.insert(3.67, 1);
    L.insert(3.357, 0);
    L.insert(3.333, 3);
    System.out.println(L.size());
    printList(L);
    L.remove(0);
    System.out.println(L.size());
    printList(L);
  }

  public static void test2(){
    // example test cases
    LinkedListImpl L= new LinkedListImpl();
    L.insert(3.4,0);
    L.insert(3.5,1);
    L.insert(3.67,2);
    L.remove(0);
    System.out.println(L.size());
    printList(L);
  }
  
  public static void test3() {
	  LinkedListImpl L = new LinkedListImpl();
	  L.insert(3, 0);
	  L.insert(5, 1);
	  L.insert(6, 2);
	  L.insert(4, 1);
	  printList(L);
	  L.remove(7);
	  printList(L);
  }
  
  public static void test4() {
	  //Message:insert(3,0),insert(5,1), get(0) = 3
	  LinkedListImpl L = new LinkedListImpl();
	  L.insert(3, 0);
	  L.insert(5, 1);
	  L.insert(12, 1);
	  printList(L);
	  double i = L.get(2);
	  System.out.println(i);
  }
  
  public static void test5() {
	  LinkedListImpl L = new LinkedListImpl();
	  L.insert(3, 5);
	  printList(L);
  }
  
  public static void printList(LinkedListImpl L){ 
    //note that this is a good example of how to iterate through your linked list
    // since we know how many elements are in the list we can use a for loop
    // and not worry about checking the next field to see if we hit the end sentinel
    Node curr=L.sentinel.next; // the first data node in the list is the one after sentinel. 
    System.out.print("sentinel");
    for(int i=0; i<L.size(); i++) { 
      System.out.print(" --> " + curr.data);
      curr=curr.next;
    }
    System.out.println();
  }
}