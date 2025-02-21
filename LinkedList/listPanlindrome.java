package linkedlistmain;

public class listPanlindrome {
    public int middle(SLL.Node head) {
        SLL.Node cnode = head;
        int i = 0;
        while (cnode != null) {
            cnode = cnode.next;
            i++;
        }
        return i;
    }

    public void reverse(SLL.Node head, int middle) {
        SLL.Node cNode;
        SLL.Node pNode;
        SLL.Node tNode;
        cNode = head;
        pNode = head;
        tNode = null;
        int i=0;
        while(i<middle && cNode!=null){
            pNode=cNode;
            cNode=cNode.next;
            i++;

        }
        SLL.Node prev=null;

        while (cNode != null) {
            tNode = cNode.next;
            cNode.next = prev;
            prev = cNode;
            cNode = tNode;

        }

        pNode.next=prev;
    }

    public Boolean check(SLL.Node head,int mid) {
        SLL.Node cNode;
        SLL.Node pNode;
        cNode = head;
        pNode = head;
        int i = 0;
        while (i < mid) {
            pNode = pNode.next;
            i++;
        }
        System.out.println(cNode.data);
        System.out.println(pNode.data);
        i = 0;
        while (i < mid && pNode!=null) {
            if (cNode.data != pNode.data) {
                return false;
            } else {
                cNode=cNode.next;
                pNode=pNode.next;
            }


        }
        return true;
    }





    public static void main(String[] args) {
        SLL obj = new SLL();
        obj.addFirst("1");
        obj.addLast("2");
        obj.addLast("3");
        obj.addLast("4");
        obj.addLast("5");
        obj.addLast("4");
        obj.addLast("3");
        obj.addLast("2");
        obj.addLast("1");

        obj.printList();
        listPanlindrome obj1 = new listPanlindrome();
        int result = obj1.middle(obj.head);
        if(result%2==0){
            obj1.reverse(obj.head,result/2);
            obj1.check(obj.head,result/2);
            boolean fin = obj1.check(obj.head,(result/2)+1);
            System.out.println(fin);
        }
        else{
            obj1.reverse(obj.head,(result/2)+1);
            boolean fin = obj1.check(obj.head,(result/2)+1);
            System.out.println(fin);
        }
        obj.printList();




    }
}


