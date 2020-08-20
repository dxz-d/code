package p165;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * 问题描述:实现一个栈,该栈带有出栈(pop),入栈(push),取最小元素(getMin)3个
 * 方法.要保证这3个方法的时间复杂度都是O(1).
 */
public class StackTest {
    public static void main(String[] args) throws Exception {
        MinsStack stack = new MinsStack();
        stack.push(4);
        stack.push(9);
        stack.push(7);
        stack.push(3);
        stack.push(8);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
    }

}
