package stack;

import java.util.Stack;

/**
 * pop()方法：用于移除这个堆栈的顶部对象，并将该对象作为这个函数的返回值
 *    返回值：方法调用返回在这个堆栈的顶部的对象
 *
 */
public class Pop {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Java");
        stack.push("Source");
        stack.push("code");

        System.out.println("Removed object is:"+stack.pop());

        System.out.println("Element after remove:"+stack);
    }
}
