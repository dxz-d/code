package stack;

import java.util.Stack;

/**
 * peek() 方法：用于查找再次堆栈顶部的对象，无须从堆栈中取出
 *      返回值：方法调用返回在这个堆栈的顶部的对象
 */
public class Peek {
    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push("java");
        stack.push("Source");
        stack.push("code");

        System.out.println("Top object is:"+stack.peek());
        System.out.println("Top object is:"+stack.peek());
        System.out.println("Top object is:"+stack.peek());
        System.out.println("Top object is:"+stack.peek());

        System.out.println(stack);
    }
}
