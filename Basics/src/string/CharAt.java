package string;

/**
 * charAt()方法：用于返回指定索引处的字符。索引范围从0到length()-1。
 *         语法：public char charAt(int index)
 *         参数：index--字符的索引
 *       返回值：返回执行索引处的字符
 */
public class CharAt {
    public static void main(String[] args) {
        String s = "啥时候自己才能成为真正的Java高手呢！";
        char result = s.charAt(14);
        System.out.println(result);
    }
}
