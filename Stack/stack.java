package Stack;
//STACK CAN BE IMPLEMENTED BY 1. ARRAY , 2. ARRAYLIST , 3. LINKED LIST
//IMPLEMENTATION IS DONE ON TOP , LINKED LIST MOST EASY AS HEAD IS MOVED ON THE LAST ELEMENT EVERYTIME UPDATED
public class stack {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            else {
                return false;
            }
        }

        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){

                head=newNode;
                return;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            else{
                int res=head.data;
                head=head.next;
                return res;
            }
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                int pk=head.data;
                return pk;
            }
        }

    }
    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.peek());

    }
}
