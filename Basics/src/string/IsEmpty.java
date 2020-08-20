package string;

/**
 * isEmpty()    分配了内存空间，值为空，是一种有值（值==空）
 * “”           分配了内存空间无值，值为空字符串，是相对的空，是一种有值（值=空字串）
 * null         未分配内存空间，无值，是一种无值（值不存在）
 */
public class IsEmpty {
    public static void main(String[] args) {
        String a = new String();
        String b = "";
        String c = null;
        test(a);
        test(b);
        test(c);
    }

    private static void test(String string) {
        if (string.isEmpty()) {
            System.out.println("111is Empty");
        }
        if (string.equals("")) {
            System.out.println("222引号");
        }
        if (string == null) {
            System.out.println("333null");
        }
        System.out.println("========");
    }


}
