package list;

public class LinkedList {

	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void AppendNode(Node newNode) { // ���� ����߰�
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

	public void InsertNode(int index, Node NewNode) {// index: ������ ��ġ
		Node cur = new Node();
		if (index == 0) { // ��忡 �����Ҷ�
			if (head == null) { // ��ũ�� ����Ʈ�� ��尡 ������
				head = NewNode;
			} else { // ��ũ�� ����Ʈ�� ��尡 ������
				NewNode.nextNode = head;
				head = NewNode;
			}
		} else { // �߰��� �����Ҷ�
			cur = head;
			for (int i = 0; i < index-1; i++) {
				if(cur.nextNode==null) {
					System.out.println(index+"�̻��� ��尡 �������� �ʽ��ϴ�.");
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
