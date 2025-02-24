package Queue;

public class circularQueue {
    static class q{
        static int arr[];
        static int size;
        static int rear;
        static int front=-1;

        q(int size){
            arr=new int[size];
            this.size=size;
            q.rear=-1;
        }
    }


    public static boolean cisEmpty(){
        return q.front==-1;
    }


    public static void cadd(int data){
        if((q.rear+1)%q.size==q.front){
            System.out.println("CQUEUE IS FULL");
            return;
        }
        else{
            if (q.front == -1) {
                q.front = q.rear = 0;
            } else {
                q.rear = (q.rear + 1) % q.size;

            }
            q.arr[q.rear] = data;
        }
    }


    public static int cpeek(){
        return q.arr[q.front];
    }


    public static void cdequeue(){
        if(cisEmpty()){
            System.out.println("CQUEUE IS EMPTY");
            return;
        }
        else{
            if(q.rear==q.front){
                q.rear=q.front=-1;
            }
            else {
                int pop = q.arr[q.front];
                System.out.println(pop);
                if (q.front == q.rear) {
                    q.front = q.rear = -1;
                } else {
                    q.front = (q.front + 1) % q.size;
                }
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
        q ob = new q(10);
        circularQueue.cadd(1);
        circularQueue.cadd(2);
        circularQueue.cadd(3);
        circularQueue.cadd(4);
        circularQueue.cadd(5);
        System.out.println(circularQueue.cpeek());
        for (int i = 0; i <6 ; i++) {
            System.out.println(q.arr[i]);

        }
        System.out.println(q.front);
        System.out.println(q.rear);
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("   ");
        circularQueue.cdequeue();
        System.out.println(circularQueue.cpeek());
        for (int i = 0; i <6 ; i++) {
            System.out.println(q.arr[i]);

        }
        System.out.println(q.front);
        System.out.println(q.rear);

    }


}
