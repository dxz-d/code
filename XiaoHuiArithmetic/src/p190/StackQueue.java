package p190;

import java.util.Stack;

/**
 * ��ջģ��һ�����У�Ҫ��ʵ�ֶ��е�����������������ӡ����ӡ�
 *
 * isEmpty()    �������ڴ�ռ䣬ֵΪ�գ���һ����ֵ��ֵ==�գ�
 * ����           �������ڴ�ռ���ֵ��ֵΪ���ַ���������ԵĿգ���һ����ֵ��ֵ=���ִ���
 * null         δ�����ڴ�ռ䣬��ֵ����һ����ֵ��ֵ�����ڣ�
 *
 * pop()�����������Ƴ������ջ�Ķ������󣬲����ö�����Ϊ��������ķ���ֵ
 *      ����ֵ���������÷����������ջ�Ķ����Ķ���
 *
 * push()����������ѹ�����ջ�Ķ���
 *     ����ֵ���������÷��ز�����
 *
 * peek()���������ڲ����ڴ˶�ջ�����Ķ�������Ӷ�ջ��ȡ��
 *     ����ֵ���������÷����������ջ�Ķ����Ķ���
 *
 */
public class StackQueue {
    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.enQueue(11);
        stackQueue.enQueue(2);
        stackQueue.enQueue(3);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());

        stackQueue.enQueue(4);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());

    }

    private Stack<Integer> stackA = new Stack<Integer>();
    private Stack<Integer> stackB = new Stack<Integer>();

    /**
     * ���Ӳ���
     *
     * @return
     */
    private Integer deQueue() {
        if (stackB.isEmpty()) {
            if (stackA.isEmpty()){
                return null;
            }
            transfer();
        }
        return stackB.pop();
    }

    /**
     * ջAԪ��ת�Ƶ�ջB
     */
    private void transfer() {
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
    }

    /**
     * ��Ӳ���
     *
     * @param element ��ӵ�Ԫ��
     */
    private void enQueue(int element) {
        stackA.push(element);
    }
}
