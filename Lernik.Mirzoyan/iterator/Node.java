package patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Lernik Mirzoyan.
 */
public class Node implements Iterable<Node> {
    String name;
    private Node child;
	@Override
	public Iterator<Node> iterator() {
		return new Iterator<Node>() {
			Node current = child;
			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Node next() {
				Node temp = current;
				current = current.child;
				return temp;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public String toString() {
		return name;
	}

	public Node(String name) {
	    this.name = name;
	}

	public Node(String name, Node child) {
	    this.name = name;
    	this.child = child;
	}
	
	public static void main(String [] a){
	    System.out.println("Done");
	    
	    Node n4 = new Node("N4");
	    Node n3 = new Node("N3", n4);
	    Node n2 = new Node("N2", n3);
	    Node n1 = new Node("N1", n2);
	    
	    for(Node node: n1){
	        System.out.println(node);
	    }
	}
}
