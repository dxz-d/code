package p165;

import java.util.Stack;

public class MinsStack {

    private Stack<Integer> mianStack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    /**
     * 出栈操作
     *
     * @return
     */
    public Integer pop() {
        //如果出栈元素和辅助栈栈顶元素值相等,辅助栈出栈
        if (mianStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        return mianStack.pop();
    }

    /**
     * 获取栈的最小元素
     *
     * @return
     */
    public int getMin() throws Exception {
        if (mianStack.empty()) {
            throw new Exception("stack is empty");
        }
        return minStack.pop();
    }


    /**
     * @param element 入栈的元素
     */
    public void push(int element) {
        mianStack.push(element);
        //如果辅助栈为空,或者新元素小于或等于辅助栈栈顶,则将新元素压入辅助栈
        if (minStack.empty() || element <= minStack.peek()) {
            minStack.push(element);
        }
    }


}
