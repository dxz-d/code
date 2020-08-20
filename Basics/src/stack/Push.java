package stack;

import java.util.Stack;

public class Push {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("java");
        stack.push("Source");
        stack.push("code");

        System.out.println("Elements is the stack:"+stack);
    }
}
