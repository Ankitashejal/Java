import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.peek());
        System.out.println(stack);
        while(stack.size()>2){
            stack.pop();
        }
        System.out.println(stack.peek());
        System.out.println(stack);


    }
}