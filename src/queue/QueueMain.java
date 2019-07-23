package queue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedQueue q = new LinkedQueue();
		
		Node[] n = new Node[5];
		
		n[0] = new Node(9);
		n[1] = new Node("hello");
		n[2] = new Node(5.5);
		n[3] = new Node();
		n[4] = new Node("¾È³ç");
		
		System.out.println(q.getSize());
		q.enQueue(n[0]);
		q.enQueue(n[1]);
		q.enQueue(n[2]);
		q.prnt();
		
		n[3] = q.deQueue();
		q.prnt();
		System.out.println(n[3].getData());
		System.out.println(q.getSize());

		q.enQueue(n[4]);

		q.prnt();
	}

}
