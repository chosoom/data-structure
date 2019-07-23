package stack;

public class LinkedStack {

	Node List;
	Node Top;
	int cnt=0;
	
	public LinkedStack() {
		List = null;
		Top = null;
	}
	
	public void push(Node newNode) {
		if (List == null) {
			List = newNode;
		}
		else {
			Node oldTop = new Node();
			oldTop = List;
			while(oldTop.nextNode != null) {
				oldTop=oldTop.nextNode;
			}
			oldTop.nextNode = newNode;
		}
		Top = newNode;
		cnt++;
	}
	
	public Node pop() {
		Node topNode = new Node();
		topNode = Top;
		
		if (List == Top) {
			List = null;
			Top = null;
		}else {
			Node cur = new Node();
			cur = List;
			while(cur!=null&&cur.nextNode!=Top) {
				cur = cur.nextNode;
			}
			Top = cur;
			cur.nextNode = null;
		}
		cnt--;
		return topNode;
	}
	
	public int getSize() {
		return cnt;
	}
	
	public void prnt() {
		Node n = new Node();
		n = List;
		if(n ==null)
			System.out.print("스택이 비어있어요!!");
		while(n != null) {
			System.out.print(n.getData()+" - ");
			n = n.nextNode;
		}
		System.out.println();
	}
}
