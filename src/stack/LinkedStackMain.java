package stack;

public class LinkedStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node[] n = new Node[5];
		
		LinkedStack stack = new LinkedStack();
		
		n[0] = new Node("안녕!");
		n[1] = new Node(5);
		n[2] = new Node(7.7);
		n[3] = new Node("hello world");
		n[4] = new Node(1000);
		
		
		stack.prnt();
		System.out.println("스택의 크기: "+stack.getSize());
		stack.push(n[0]);
		stack.push(n[1]);
		stack.push(n[2]);
		System.out.println("스택의 크기: "+stack.getSize());
		stack.prnt();
		System.out.println("노드의 값 "+stack.pop().getData());
		System.out.println("스택의 크기: "+stack.getSize());
		stack.prnt();
		stack.push(n[3]);
		stack.push(n[4]);
		System.out.println("스택의 크기: "+stack.getSize());
		stack.prnt();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.prnt();
	}

}
