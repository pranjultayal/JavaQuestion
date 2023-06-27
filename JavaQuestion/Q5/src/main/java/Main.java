public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top);
        stack.pop();
        System.out.println(stack.top);
        stack.pop();
        System.out.println(stack.top);
        stack.pop();
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.top);
    }
}
