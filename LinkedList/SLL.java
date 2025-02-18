package linkedlistmain;

public class SLL {
    Node head;
    private int size;
    SLL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add at first position
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            size++;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=null;
        size++;
    }

    public void printList(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("null");


    }

    public void deleteFirst(){
        Node currNode=head;
        head=currNode.next;
        size--;
    }

    public void deleteLast(){
        Node currNode=head;
        Node second=currNode.next;
        while(currNode.next!=null){
            second=currNode;
            currNode=currNode.next;

        }
        second.next=null;
        size--;
    }

    public int getSize(){
        return size;
    }

    public void reverseList(){
        Node currNode=head;
        Node prevNode=null;
        Node nextNode=null;
        while(currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head=prevNode;

    }



    public static void main (String[] args) {
        SLL list= new SLL();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addLast("9");
        list.addLast("8");
        list.addLast("7");

        list.printList();
        System.out.println("");
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        System.out.println("");
        list.printList();
        list.deleteLast();
        System.out.println("");
        list.printList();
        System.out.println(list.getSize());
        System.out.println("");
        //addfirst , add wagera wagera can be used by themselves
        list.reverseList();
        list.printList();

    }
}
