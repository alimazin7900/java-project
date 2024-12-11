package java_programs;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList<String> linkedList= new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("D");
	    linkedList.add("O");
	    System.out.println(linkedList);
	    linkedList.add(4,"B");
	    linkedList.add(5,"B");
	    System.out.println(linkedList);
	    linkedList.remove("B");
	    linkedList.remove("O");
	    System.out.println(linkedList);
	    Listlterator<String>iterator = linkedList.listIterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }

	}
}
