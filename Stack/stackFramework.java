package Stack;
import java.util.*;
public class stackFramework {
    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
        ss.push(6);
        System.out.println(ss.peek());
        ss.pop();
        ss.pop();
        ss.pop();
        System.out.println(ss.peek());

    }
}
