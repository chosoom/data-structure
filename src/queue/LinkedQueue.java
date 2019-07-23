package queue;

public class LinkedQueue {

	Node Front;
	Node Rear;
	int cnt;
	
	public LinkedQueue() {
		Front =null;
		Rear = null;
		cnt=0;
	}
	
	public void enQueue(Node newNode) {
		if(Front == null) {
			Front =newNode;
			Rear = newNode;
		}
		else {
			Rear.nextNode = newNode;
			Rear = newNode;
		}
		cnt++;
	}
	
	public Node deQueue(){
		Node Front = new Node();
		Front = this.Front;
		
		if(this.Front.nextNode == null) {
			this.Front =null;
			this.Rear =null;
		}else {
			this.Front = this.Front.nextNode;
		}
		cnt--;
		
		return Front;
	}
	
	public int getSize() {
		return cnt;
	}
	
	public void prnt() {
		Node n =new Node();
		n = Front;
		while(n != null) {
			System.out.print(n.getData());
			if (n.nextNode != null) {
				System.out.print(" - ");
			}
			n = n.nextNode;
		}
		System.out.println();
	}
}
