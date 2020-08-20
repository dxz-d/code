package Operation;

/**
 * 三元运算符
 * 用来完成简单的选择逻辑，即根据条件判断，从两个选择中选择一种执行
 * 使用格式：(条件表达式)? 表达式1: 表达式2;
 * 运算规则：1.判断条件表达式，结果为一个布尔值
 *          2.true，运算结果为表达式1
 *          3.false，运算结果为表达式2
 */
public class Three {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //结果为20
        System.out.println( a==b?10:20);

        /*char ch = 'a';
        int num = 0;
        boolean bool = true;
        System.out.println(bool ? ch : 0);//这里不是 bool ? ch : num ，那样会打印两个97
        System.out.println(!bool ? num : ch);*/
    }
}
