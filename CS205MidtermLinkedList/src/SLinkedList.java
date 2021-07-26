
public class SLinkedList {

	private Node head;
	
	public SLinkedList(){
		head = null;
	}

	public void changeList() {

		if (head == null) {
			return;
		}
		else if(head.getNext() == null) {
			return;
		}

		Node oldHead = head;

		head = head.getNext();

		oldHead.setNext(null);


		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(oldHead);
		oldHead.setNext(null);

	}
	
	//imported addFirst(), addAfterHead(), and display() to help with testing.
	public void addFirst(int s){
		Node n = new Node(s);
		
		if (head == null) {
			head = n;
			head.setNext(null);
			return;
		}

		n.setNext(head); // equals n.next = head;

		head = n;

	}

	public void addAfterHead(int s) {

		Node n = new Node(s);

		if (head == null) {
			head = n;
			return;
		}

		Node secondNode = head.getNext();

		head.setNext(n);

		n.setNext(secondNode);


	}
	
	public void display() {
		Node temp = head; 
		

		while (temp != null) {
			System.out.println(temp.getElement()); 
			temp = temp.getNext();
		}
	}
}
