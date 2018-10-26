/**
 * 
 */
package test_2;

/**
 * @author tsai203m
 *
 */
public class DoubleListElement {

	
	public DoubleListElement next;
	public DoubleListElement previous;
	private int data;
	private DoubleListElement head;
	private DoubleListElement tail;
	
	public DoubleListElement() {
		head = null;
		tail = null;
	}

	public void setData(int data) {
		this.data=data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void addElement1(DoubleListElement le) {
		
		DoubleListElement newone = new DoubleListElement(le);
		
		if(isEmpty()) {
			newone.next = null;
			newone.previous = null;
			head = newone;
			tail = newone;
		}
		else {
			head.previous = newone;
			newone.next = head;
			newone.previous = null;
			head = newone;
		}
	}
	
	public void addElement2(DoubleListElement le) {
		
		DoubleListElement newone2 = new DoubleListElement(le);
		
		if(isEmpty()) {
			newone2.next = null;
			newone2.previous = null;
			head = newone2;
			tail = newone2;
		}
		else {
			tail.previous = newone2;
			newone2.next = tail;
			newone2.previous = null;
			head = newone2;
		}
	}
	
	public void printLinkedListTail() {
		
		DoubleListElement curr = tail;
		while(curr != null) {
			System.out.print(curr.data+" ");  
			curr = curr.previous;
		}
		
	}
	
	public void printLinkedListHead() {
		
		DoubleListElement curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");  
			curr = curr.next;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleListElement le = new DoubleListElement();
		le.setData(5);


	}

}
