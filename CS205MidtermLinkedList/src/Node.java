
public class Node {
	//Given the following Node class definition: class Node {
	private int element;

	private Node next;

	public Node(int e) {
		element = e;
		next = null; 
	}
	public void setElement(int e) {
		element = e; 
	}
	public int getElement() {
		return element; 
	}
	public void setNext(Node n) {
		next = n; 
	}
	public Node getNext() { 
		return next;
	} 

}
