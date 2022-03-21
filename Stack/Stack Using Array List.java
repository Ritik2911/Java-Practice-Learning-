import java.util.*;

public class StackUsingAL {

    static class Stack{
        ArrayList<Integer> list = new ArrayList();

        public void push(int data){
            list.add(data);
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String arga[]){
        Stack s = new Stack();
        s.push(4);
        s.push(34);
        s.push(12);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
