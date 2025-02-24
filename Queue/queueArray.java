package Queue;
//FIFO DATA STRUCTURE , INSERTION AT THE END , REMOVAL FROM THE TOP / HEAD
//ENQUEUE-ADD
//DEQUEUE-REMOVE
//FRONT- PEEk
public class queueArray {
    static class q{
        static int arr[];
        static int size;
        static int rear=-1;
        q(int size){
            arr=new int[size];
            this.size=size;
        }
    }
    public static boolean isEmpty(){
        return q.rear==-1;
    }
    public static void add(int data){
        if(q.rear==q.size-1){
            System.out.println("QUEUE IS FULL");
        }
        else {
            q.rear = q.rear + 1;
            q.arr[q.rear]=data;
        }

    }
    public static void dequeue(){

        if(q.rear==-1){
            System.out.println("QUEUE IS EMPTY");
        }

        else {
            int lim=q.rear;
            int front=q.arr[0];
            for (int j=0;j<lim;j++){
                q.arr[j]=q.arr[j+1];
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("nice program");
    }

}
