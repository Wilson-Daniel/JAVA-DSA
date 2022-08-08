package VestorAndStacks;

public class MethodStacks {

	public static void main(String[] args) throws Exception{
		MyStack<Integer> stack = new MyStack<>();
		stack.push(34);
		stack.push(76);
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
	}

}
