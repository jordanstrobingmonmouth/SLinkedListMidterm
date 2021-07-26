
public class Test {

	public static void main(String[] args) {
		SLinkedList n = new SLinkedList();
		
		System.out.println("Before changeList()");
		n.addFirst(3);
		n.addAfterHead(2);
		n.addAfterHead(4);
		n.addAfterHead(8);
		n.addAfterHead(5);
		
		n.display();
		
		System.out.println();
		
		System.out.println("After changeList()");
		
		n.changeList();
		n.display();

	}

}
