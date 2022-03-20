    // Stack Using LinkedList

public class StackUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack{
        static Node head = null;

        public boolean isEmpty(Node head){
            return head == null;
        }

        public void push(int n){
            Node newNode = new Node(n);
            if(isEmpty(head)){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }

        public int pop(){
            if(isEmpty(head)){
                return -1;
            }else{
                int top = head.data;
                head = head.next;
                return top;
            }
        }

        public int peek(){
            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(6);
        s.push(53);
        s.push(34);
        s.push(8);
        s.pop();
        while(s.head != null){
            System.out.println(s.pop());
        }
    }
}
