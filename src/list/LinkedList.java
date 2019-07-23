package list;

public class LinkedList {

	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void AppendNode(Node newNode) { // 끝에 노드추가
		Node tail = new Node();
		if (head == null) {
			head = newNode;
		} else {
			tail = head;
			while (tail.nextNode != null) {
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
		}
	}

	public void InsertNode(int index, Node NewNode) {// index: 삽입할 위치
		Node cur = new Node();
		if (index == 0) { // 헤드에 삽일할때
			if (head == null) { // 링크드 리스트에 노드가 없을때
				head = NewNode;
			} else { // 링크드 리스트에 노드가 있을때
				NewNode.nextNode = head;
				head = NewNode;
			}
		} else { // 중간에 삽입할때
			cur = head;
			for (int i = 0; i < index-1; i++) {
				if(cur.nextNode==null) {
					System.out.println(index+"이상의 노드가 존재하지 않습니다.");
					return;
				}
				cur = cur.nextNode;
			}
			NewNode.nextNode = cur.nextNode;
			cur.nextNode = NewNode;
		}
	}

	public void RemoveNode(int index) {
		Node cur = new Node();
		if (index == 0) {
			head = head.nextNode;
		} else {
			cur = head;
			for (int i = 0; i < index - 1 && cur != null; i++) {
				cur = cur.nextNode;
			}
			if (cur != null) {
				cur.nextNode = cur.nextNode.nextNode;
			}
		}
	}

	public void print() {
		Node cur = new Node();
		cur = head;
		while (true) {
			System.out.println(cur.getData());
			cur = cur.nextNode;
			if(cur == null)
				break;
		}
		System.out.println("---------------");
	}

}
