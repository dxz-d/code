package string;

/**
 * substring()方法：返回字符串的子字符串
 *            语法：public String substring(int beginIndex)
 *              或 public String substring(int beginIndex,int endIndex)
 *            参数：beginIndex--起始索引(包括)，索引从0开始
 *                 endIndex--结束索引(不包括)
 *           返回值：字符串
 *
 */
public class Substring {
    public static void main(String[] args) {
        String str = new String("真厉害，我去");
        System.out.println("返回值："+str.substring(3));
        System.out.println("返回值："+str.substring(4));
        System.out.println("返回值："+str.substring(4,5));
    }
}
