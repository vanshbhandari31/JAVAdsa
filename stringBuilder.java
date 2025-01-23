public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
        for (int i = 0; i <sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;
            char ch = sb.charAt(front);
            char ch2 = sb.charAt(back);
            sb.setCharAt(front , ch2);
            sb.setCharAt(back , ch);

        }
        System.out.println(sb);


    }
}
