import java.util.Stack;

public class StackReverse {

    static void pushAtLast(int data , Stack<Integer> stack){

        if(stack.size() ==0){
            stack.push(data);
            return;
        }

        int ele = stack.pop();
        pushAtLast(data, stack);
        stack.push(ele);
    }

    public static void stackReverse(Stack<Integer> stack){

        if(stack.size() == 0){
            return;
        }
        int data = stack.pop();

        stackReverse(stack);

        pushAtLast(data, stack);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(56);
        stack.push(2);
        stack.push(43);

        System.out.println(stack);
        stackReverse(stack);
        System.out.println(stack);
        
    }
}
