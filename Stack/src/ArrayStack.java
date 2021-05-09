
public class ArrayStack<E> implements Stack<E>{
	//array based stacks will make the stack a fixed size
	
	private final int CAPACITY = 100;
	private int size;
	private Object [] stack;
	private int top;
	
	public ArrayStack() {
		top = -1;
		size = 0;
		stack = new Object [CAPACITY];
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean Empty() {
		return size == 0;
	}

	@Override
	public void push(E item) {
		if(size == CAPACITY)
			throw new IllegalStateException("Stack is full");
		stack[++top] = item;
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		if(Empty())
			return null;
		E result = (E) stack[top];
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E pop() {
		if(Empty())
			return null;
		E result = (E) stack[top];
		stack[top] = null;
		top--;
		size--;
		return result;
	}
	
	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		System.out.println(stack.peek() + " Size: " + stack.size());
		stack.push(1);
		System.out.println(stack.peek() + " Size: " + stack.size());
		stack.push(2);
		System.out.println(stack.peek() + " Size: " + stack.size());
		stack.push(3);
		System.out.println(stack.peek() + " Size: " + stack.size());
		stack.push(4);
		System.out.println(stack.peek() + " Size: " + stack.size());
		stack.push(5);
		System.out.println(stack.peek() + " Size: " + stack.size());
		System.out.println("Removed:" + stack.pop() + " Size: " + stack.size());
		stack.push(6);
		System.out.println(stack.peek() + " Size: " + stack.size());


		
	}
	
}
